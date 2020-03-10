/*
 * generated by Xtext 2.13.0
 */
package edu.ulibertadores.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import edu.ulibertadores.PyDslRep.Environment
import edu.ulibertadores.PyDslRep.IP
import edu.ulibertadores.PyDslRep.Robot
import edu.ulibertadores.PyDslRep.Move
import edu.ulibertadores.PyDslRep.Turn

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PyDslRepGenerator extends AbstractGenerator {
	@Inject extension IQualifiedNameProvider
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(Environment)) {
            fsa.generateFile(
                e.fullyQualifiedName.toString("/") + ".py",
                e.compile(e.ip))
        }
		
		
	}
	
	
	
	def callModules()'''
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
		
		
	'''
	
	def createHandlers(Robot r)'''
		_, left_motor_«r.name»_handle = vrep.simxGetObjectHandle(client_id_«r.name», 
		                                                        '«r.wheels.get(0).name»_«r.name»',
		                                                        vrep.simx_opmode_oneshot_wait)
		_, right_motor_«r.name»_handle = vrep.simxGetObjectHandle(client_id_«r.name»,
		                                                         '«r.wheels.get(1).name»_«r.name»',
		                                                         vrep.simx_opmode_oneshot_wait)
		_, sensor_handle_«r.name» = vrep.simxGetObjectHandle(client_id_«r.name»,
		                                                    'sensor_collection_«r.name»',
		                                                    vrep.simx_opmode_oneshot_wait)
		_, «r.name»_handle = vrep.simxGetObjectHandle(client_id_«r.name»,
		                                             '«r.name»',
		                                             vrep.simx_opmode_oneshot_wait)
		# Create object «r.name»
		«r.name» = [client_id_«r.name», «r.name»_handle, left_motor_«r.name»_handle, right_motor_«r.name»_handle, «r.wheels.get(0).radius»]
	'''

	def createDefMovements(Environment e)'''
	«var new_e = newHashSet»
	#«new_e.addAll(e.moves)»
	 «IF e.moves !== null»
    	«FOR move : new_e»def «move.name»_«move.robot.name»(robot):
            «FOR m : move.moves»
		    «IF m.eContents.get(0) instanceof Move»
			    «IF (m.eContents.get(0) as Move).velocity !== null»
			        «IF (m.eContents.get(0) as Move).type == 'meters'»    _ = movement_forward(robot, «(m.eContents.get(0) as Move).distance», «(m.eContents.get(0) as Move).velocity»)
			        «ELSE»    _ = movement_forward(robot, «(m.eContents.get(0) as Move).distance»/100.0, «(m.eContents.get(0) as Move).velocity»)
		        	«ENDIF»
		        «ELSE»
			        «IF (m.eContents.get(0) as Move).type == 'meters'»    _ = movement_forward(robot, «(m.eContents.get(0) as Move).distance», 9.0)
			        «ELSE»    _ = movement_forward(robot, «(m.eContents.get(0) as Move).distance»/100.0,  9.0)
			        «ENDIF»
			    «ENDIF»
	        «ELSE»
	            «IF (m.eContents.get(0) as Turn).velocity === null»
		        	«IF (m.eContents.get(0) as Turn).type == 'left'»    movement_left(robot)
		        	«ELSE»    movement_right(robot)
		        	«ENDIF»
		        «ELSE»
		        	«IF (m.eContents.get(0) as Turn).type == 'left'»    movement_left(robot, «(m.eContents.get(0) as Turn).velocity»)
		        	«ELSE»    movement_right(robot, «(m.eContents.get(0) as Turn).velocity»)
		        	«ENDIF»
	        	«ENDIF»
	        «ENDIF»
«ENDFOR»    pass


    	«ENDFOR»
    «ENDIF»
	'''
	
	def compile(Environment e, IP ip)'''
		«callModules()»
		«createDefMovements(e)»
		print ('Program started')
		vrep.simxFinish(-1)  # just in case, close all opened connections
		
		«IF e.robots !== null» 
			«FOR robot : e.robots»
			«IF ip !== null»
				client_id_«robot.name» = vrep.simxStart('«ip.ip»', «robot.port», True, True, 5000, 5)  # Connect to V-REP robot «robot.name»
			«ELSE»
				client_id_«robot.name» = vrep.simxStart('127.0.0.1', «robot.port», True, True, 5000, 5)  # Connect to V-REP robot «robot.name»
			«ENDIF»
			«ENDFOR»
			
			if «e.robots.map["client_id_" + name + " != -1 "].join("and ")»:
			    print ('Connected to remote API server')
			«FOR robot : e.robots»    # Create Handlers for «robot.name»
    «createHandlers(robot)»
				«ENDFOR»
			    # Wait for the connection with the simulator
			    for i in range(3):
			        «FOR robot : e.robots»
			        return_code, position = vrep.simxGetObjectPosition(«robot.name»[0], «robot.name»[1], -1, vrep.simx_opmode_streaming)
			        return_code, orientation = vrep.simxGetObjectOrientation(«robot.name»[0], «robot.name»[1], -1, vrep.simx_opmode_streaming)
			        «ENDFOR»
			        time.sleep(0.5)
			        print "."
			    # Start the movement of the robot(s)
			«IF e.moves !== null»
				«FOR move : e.moves»
				    «IF move.concurrent»    «move.robot.name»_«move.name» = threading.Thread(target=«move.name»_«move.robot.name», args=(«move.robot.name»,))
				    «ENDIF»
				«ENDFOR»
				«FOR move : e.moves»
				    «IF move.concurrent»    «move.robot.name»_«move.name».start()
				    «ENDIF»
				«ENDFOR»
				«FOR move : e.moves»
				    «IF move.concurrent»    «move.robot.name»_«move.name».join()
				    «ENDIF»
				«ENDFOR»
				«FOR move : e.moves»
				    «IF move.concurrent»
				    «ELSE»    «move.name»_«move.robot.name»(«move.robot.name»)
				    «ENDIF»
				«ENDFOR»
			«ENDIF»
			«FOR robot : e.robots»
			
			    # Stop communication «robot.name»
			    vrep.simxGetPingTime(client_id_«robot.name»)
			    vrep.simxFinish(client_id_«robot.name»)
			«ENDFOR»
			else:
			    print ('Failed connecting to remote API server')
			print ('Program ended')
		«ENDIF»
		'''
	
	

}
