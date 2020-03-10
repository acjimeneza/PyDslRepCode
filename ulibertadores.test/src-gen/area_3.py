import vrep
import time
import math
import threading
import numpy as np


def movement_forward(robot, distance=0.5, vel=9.0):
    w = vel/robot[4]  # Angular velocity
    distance_w = distance
    return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    while return_code_pos and return_code_ori:
        return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
        return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    angle_degrees = math.degrees(angle[2])
    if 88 <= angle_degrees <= 92:
        plane = 1
    else:
        if -92 <= angle_degrees <= -88:
            plane = 1
            distance *= -1
        else:
            if -2 <= angle_degrees <= 2:
                plane = 0
            else:
                plane = 0
                distance *= -1
    position_objective = pos[plane] + distance
    if distance_w > 0:
        vrep.simxSetJointTargetVelocity(robot[0], robot[2], w, vrep.simx_opmode_streaming)
        vrep.simxSetJointTargetVelocity(robot[0], robot[3], w, vrep.simx_opmode_streaming)
    else:
        vrep.simxSetJointTargetVelocity(robot[0], robot[2], -w, vrep.simx_opmode_streaming)
        vrep.simxSetJointTargetVelocity(robot[0], robot[3], -w, vrep.simx_opmode_streaming)
    if distance > 0:
        while pos[plane] < position_objective:
            _, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_buffer)
    else:
        while pos[plane] > position_objective:
            _, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_buffer)

    vrep.simxSetJointTargetVelocity(robot[0], robot[2], 0, vrep.simx_opmode_streaming)
    vrep.simxSetJointTargetVelocity(robot[0], robot[3], 0, vrep.simx_opmode_streaming)
    return pos[0], pos[1]


def movement_right(robot, vel=9.0):
    w = vel/robot[4]  # Angular velocity
    return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    while return_code_pos and return_code_ori:
        return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
        return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    angle_degrees = math.degrees(angle[2])
    flag = False
    if 88 <= angle_degrees <= 92:
        angle_objective = 0
    else:
        if -92 <= angle_degrees <= -88:
            angle_objective = 180
            flag = True
        else:
            if -2 <= angle_degrees <= 2:
                angle_objective = -90
                flag = True
            else:
                angle_objective = 90

    vrep.simxSetJointTargetVelocity(robot[0], robot[2], w * .03, vrep.simx_opmode_streaming)
    vrep.simxSetJointTargetVelocity(robot[0], robot[3], -w * .03, vrep.simx_opmode_streaming)
    if not flag:
        while (angle_objective + 2) < abs(angle_degrees):
            _, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
            angle_degrees = math.degrees(angle[2])
    else:
        while abs(angle_objective) - 2 > abs(angle_degrees):
            _, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
            angle_degrees = math.degrees(angle[2])

    vrep.simxSetJointTargetVelocity(robot[0], robot[2], 0, vrep.simx_opmode_streaming)
    vrep.simxSetJointTargetVelocity(robot[0], robot[3], 0, vrep.simx_opmode_streaming)


def movement_left(robot, vel=9.0):
    w = vel/robot[4]  # Angular velocity
    return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    while return_code_pos and return_code_ori:
        return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
        return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
    angle_degrees = math.degrees(angle[2])
    flag = False
    if 88 <= angle_degrees <= 92:
        angle_objective = 180
    else:
        if -92 <= angle_degrees <= -88:
            angle_objective = 0
        else:
            if -2 <= angle_degrees <= 2:
                angle_objective = 90
            else:
                angle_objective = -90
                flag = True
    vrep.simxSetJointTargetVelocity(robot[0], robot[2], -w * .03, vrep.simx_opmode_streaming)
    vrep.simxSetJointTargetVelocity(robot[0], robot[3], w * .03, vrep.simx_opmode_streaming)
    if flag:
        while abs(angle_degrees) > abs(angle_objective - 2):
            _, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
            angle_degrees = math.degrees(angle[2])
    else:
        while angle_degrees < (angle_objective - 2):
            _, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)
            angle_degrees = math.degrees(angle[2])

    vrep.simxSetJointTargetVelocity(robot[0], robot[2], 0, vrep.simx_opmode_streaming)
    vrep.simxSetJointTargetVelocity(robot[0], robot[3], 0, vrep.simx_opmode_streaming)


#true
def mov_3_robot_3(robot):
    _ = movement_forward(robot, 4.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    pass


def mov_1_robot_1(robot):
    _ = movement_forward(robot, 4.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 4.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    pass


def mov_2_robot_2(robot):
    _ = movement_forward(robot, 1.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    pass


def mov_4_robot_4(robot):
    _ = movement_forward(robot, 2.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 2.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    movement_right(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 1.0, 9.0)
    movement_left(robot)
    _ = movement_forward(robot, 3.0, 9.0)
    pass


print ('Program started')
vrep.simxFinish(-1)  # just in case, close all opened connections

client_id_robot_1 = vrep.simxStart('127.0.0.1', 19999, True, True, 5000, 5)  # Connect to V-REP robot robot_1
client_id_robot_2 = vrep.simxStart('127.0.0.1', 20000, True, True, 5000, 5)  # Connect to V-REP robot robot_2
client_id_robot_3 = vrep.simxStart('127.0.0.1', 20001, True, True, 5000, 5)  # Connect to V-REP robot robot_3
client_id_robot_4 = vrep.simxStart('127.0.0.1', 20002, True, True, 5000, 5)  # Connect to V-REP robot robot_4

if client_id_robot_1 != -1 and client_id_robot_2 != -1 and client_id_robot_3 != -1 and client_id_robot_4 != -1 :
    print ('Connected to remote API server')
    # Create Handlers for robot_1
    _, left_motor_robot_1_handle = vrep.simxGetObjectHandle(client_id_robot_1, 
                                                            'wheelL_robot_1',
                                                            vrep.simx_opmode_oneshot_wait)
    _, right_motor_robot_1_handle = vrep.simxGetObjectHandle(client_id_robot_1,
                                                             'wheelR_robot_1',
                                                             vrep.simx_opmode_oneshot_wait)
    _, sensor_handle_robot_1 = vrep.simxGetObjectHandle(client_id_robot_1,
                                                        'sensor_collection_robot_1',
                                                        vrep.simx_opmode_oneshot_wait)
    _, robot_1_handle = vrep.simxGetObjectHandle(client_id_robot_1,
                                                 'robot_1',
                                                 vrep.simx_opmode_oneshot_wait)
    # Create object robot_1
    robot_1 = [client_id_robot_1, robot_1_handle, left_motor_robot_1_handle, right_motor_robot_1_handle, 4.5]
    # Create Handlers for robot_2
    _, left_motor_robot_2_handle = vrep.simxGetObjectHandle(client_id_robot_2, 
                                                            'wheelL_robot_2',
                                                            vrep.simx_opmode_oneshot_wait)
    _, right_motor_robot_2_handle = vrep.simxGetObjectHandle(client_id_robot_2,
                                                             'wheelR_robot_2',
                                                             vrep.simx_opmode_oneshot_wait)
    _, sensor_handle_robot_2 = vrep.simxGetObjectHandle(client_id_robot_2,
                                                        'sensor_collection_robot_2',
                                                        vrep.simx_opmode_oneshot_wait)
    _, robot_2_handle = vrep.simxGetObjectHandle(client_id_robot_2,
                                                 'robot_2',
                                                 vrep.simx_opmode_oneshot_wait)
    # Create object robot_2
    robot_2 = [client_id_robot_2, robot_2_handle, left_motor_robot_2_handle, right_motor_robot_2_handle, 4.5]
    # Create Handlers for robot_3
    _, left_motor_robot_3_handle = vrep.simxGetObjectHandle(client_id_robot_3, 
                                                            'wheelL_robot_3',
                                                            vrep.simx_opmode_oneshot_wait)
    _, right_motor_robot_3_handle = vrep.simxGetObjectHandle(client_id_robot_3,
                                                             'wheelR_robot_3',
                                                             vrep.simx_opmode_oneshot_wait)
    _, sensor_handle_robot_3 = vrep.simxGetObjectHandle(client_id_robot_3,
                                                        'sensor_collection_robot_3',
                                                        vrep.simx_opmode_oneshot_wait)
    _, robot_3_handle = vrep.simxGetObjectHandle(client_id_robot_3,
                                                 'robot_3',
                                                 vrep.simx_opmode_oneshot_wait)
    # Create object robot_3
    robot_3 = [client_id_robot_3, robot_3_handle, left_motor_robot_3_handle, right_motor_robot_3_handle, 4.5]
    # Create Handlers for robot_4
    _, left_motor_robot_4_handle = vrep.simxGetObjectHandle(client_id_robot_4, 
                                                            'wheelL_robot_4',
                                                            vrep.simx_opmode_oneshot_wait)
    _, right_motor_robot_4_handle = vrep.simxGetObjectHandle(client_id_robot_4,
                                                             'wheelR_robot_4',
                                                             vrep.simx_opmode_oneshot_wait)
    _, sensor_handle_robot_4 = vrep.simxGetObjectHandle(client_id_robot_4,
                                                        'sensor_collection_robot_4',
                                                        vrep.simx_opmode_oneshot_wait)
    _, robot_4_handle = vrep.simxGetObjectHandle(client_id_robot_4,
                                                 'robot_4',
                                                 vrep.simx_opmode_oneshot_wait)
    # Create object robot_4
    robot_4 = [client_id_robot_4, robot_4_handle, left_motor_robot_4_handle, right_motor_robot_4_handle, 4.5]
    # Wait for the connection with the simulator
    for i in range(3):
        return_code, position = vrep.simxGetObjectPosition(robot_1[0], robot_1[1], -1, vrep.simx_opmode_streaming)
        return_code, orientation = vrep.simxGetObjectOrientation(robot_1[0], robot_1[1], -1, vrep.simx_opmode_streaming)
        return_code, position = vrep.simxGetObjectPosition(robot_2[0], robot_2[1], -1, vrep.simx_opmode_streaming)
        return_code, orientation = vrep.simxGetObjectOrientation(robot_2[0], robot_2[1], -1, vrep.simx_opmode_streaming)
        return_code, position = vrep.simxGetObjectPosition(robot_3[0], robot_3[1], -1, vrep.simx_opmode_streaming)
        return_code, orientation = vrep.simxGetObjectOrientation(robot_3[0], robot_3[1], -1, vrep.simx_opmode_streaming)
        return_code, position = vrep.simxGetObjectPosition(robot_4[0], robot_4[1], -1, vrep.simx_opmode_streaming)
        return_code, orientation = vrep.simxGetObjectOrientation(robot_4[0], robot_4[1], -1, vrep.simx_opmode_streaming)
        time.sleep(0.5)
        print "."
    # Start the movement of the robot(s)
    robot_2_mov_2 = threading.Thread(target=mov_2_robot_2, args=(robot_2,))
    robot_1_mov_1 = threading.Thread(target=mov_1_robot_1, args=(robot_1,))
    robot_3_mov_3 = threading.Thread(target=mov_3_robot_3, args=(robot_3,))
    robot_4_mov_4 = threading.Thread(target=mov_4_robot_4, args=(robot_4,))
    robot_2_mov_2.start()
    robot_1_mov_1.start()
    robot_3_mov_3.start()
    robot_4_mov_4.start()
    robot_2_mov_2.join()
    robot_1_mov_1.join()
    robot_3_mov_3.join()
    robot_4_mov_4.join()

    # Stop communication robot_1
    vrep.simxGetPingTime(client_id_robot_1)
    vrep.simxFinish(client_id_robot_1)

    # Stop communication robot_2
    vrep.simxGetPingTime(client_id_robot_2)
    vrep.simxFinish(client_id_robot_2)

    # Stop communication robot_3
    vrep.simxGetPingTime(client_id_robot_3)
    vrep.simxFinish(client_id_robot_3)

    # Stop communication robot_4
    vrep.simxGetPingTime(client_id_robot_4)
    vrep.simxFinish(client_id_robot_4)
else:
    print ('Failed connecting to remote API server')
print ('Program ended')
