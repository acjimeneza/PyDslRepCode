/**
 * generated by Xtext 2.13.0
 */
package edu.ulibertadores.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import edu.ulibertadores.PyDslRep.AbstractDataMove;
import edu.ulibertadores.PyDslRep.Environment;
import edu.ulibertadores.PyDslRep.IP;
import edu.ulibertadores.PyDslRep.Move;
import edu.ulibertadores.PyDslRep.MoveCollection;
import edu.ulibertadores.PyDslRep.Robot;
import edu.ulibertadores.PyDslRep.Turn;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PyDslRepGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Environment> _filter = Iterables.<Environment>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Environment.class);
    for (final Environment e : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
      String _plus = (_string + ".py");
      fsa.generateFile(_plus, 
        this.compile(e, e.getIp()));
    }
  }
  
  public CharSequence callModules() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import vrep");
    _builder.newLine();
    _builder.append("import time");
    _builder.newLine();
    _builder.append("import math");
    _builder.newLine();
    _builder.append("import threading");
    _builder.newLine();
    _builder.append("import numpy as np");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("def movement_forward(robot, distance=0.5, vel=9.0):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("w = vel/robot[4]  # Angular velocity");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("distance_w = distance");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while return_code_pos and return_code_ori:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if 88 <= angle_degrees <= 92:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("plane = 1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if -92 <= angle_degrees <= -88:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("plane = 1");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("distance *= -1");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if -2 <= angle_degrees <= 2:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("plane = 0");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("plane = 0");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("distance *= -1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("position_objective = pos[plane] + distance");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if distance_w > 0:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], w, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], w, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], -w, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], -w, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if distance > 0:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while pos[plane] < position_objective:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("_, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_buffer)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while pos[plane] > position_objective:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("_, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_buffer)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], 0, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], 0, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return pos[0], pos[1]");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("def movement_right(robot, vel=9.0):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("w = vel/robot[4]  # Angular velocity");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while return_code_pos and return_code_ori:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("flag = False");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if 88 <= angle_degrees <= 92:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("angle_objective = 0");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if -92 <= angle_degrees <= -88:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("angle_objective = 180");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("flag = True");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if -2 <= angle_degrees <= 2:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("angle_objective = -90");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("flag = True");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("angle_objective = 90");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], w * .03, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], -w * .03, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if not flag:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while (angle_objective + 2) < abs(angle_degrees):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("_, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while abs(angle_objective) - 2 > abs(angle_degrees):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("_, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], 0, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], 0, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("def movement_left(robot, vel=9.0):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("w = vel/robot[4]  # Angular velocity");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while return_code_pos and return_code_ori:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return_code_pos, pos = vrep.simxGetObjectPosition(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return_code_ori, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("flag = False");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if 88 <= angle_degrees <= 92:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("angle_objective = 180");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if -92 <= angle_degrees <= -88:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("angle_objective = 0");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if -2 <= angle_degrees <= 2:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("angle_objective = 90");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("angle_objective = -90");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("flag = True");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], -w * .03, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], w * .03, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if flag:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while abs(angle_degrees) > abs(angle_objective - 2):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("_, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("while angle_degrees < (angle_objective - 2):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("_, angle = vrep.simxGetObjectOrientation(robot[0], robot[1], -1, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("angle_degrees = math.degrees(angle[2])");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[2], 0, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("vrep.simxSetJointTargetVelocity(robot[0], robot[3], 0, vrep.simx_opmode_streaming)");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createHandlers(final Robot r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("_, left_motor_");
    String _name = r.getName();
    _builder.append(_name);
    _builder.append("_handle = vrep.simxGetObjectHandle(client_id_");
    String _name_1 = r.getName();
    _builder.append(_name_1);
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                        ");
    _builder.append("\'");
    String _name_2 = r.getWheels().get(0).getName();
    _builder.append(_name_2, "                                                        ");
    _builder.append("_");
    String _name_3 = r.getName();
    _builder.append(_name_3, "                                                        ");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                        ");
    _builder.append("vrep.simx_opmode_oneshot_wait)");
    _builder.newLine();
    _builder.append("_, right_motor_");
    String _name_4 = r.getName();
    _builder.append(_name_4);
    _builder.append("_handle = vrep.simxGetObjectHandle(client_id_");
    String _name_5 = r.getName();
    _builder.append(_name_5);
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                         ");
    _builder.append("\'");
    String _name_6 = r.getWheels().get(1).getName();
    _builder.append(_name_6, "                                                         ");
    _builder.append("_");
    String _name_7 = r.getName();
    _builder.append(_name_7, "                                                         ");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                         ");
    _builder.append("vrep.simx_opmode_oneshot_wait)");
    _builder.newLine();
    _builder.append("_, sensor_handle_");
    String _name_8 = r.getName();
    _builder.append(_name_8);
    _builder.append(" = vrep.simxGetObjectHandle(client_id_");
    String _name_9 = r.getName();
    _builder.append(_name_9);
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                    ");
    _builder.append("\'sensor_collection_");
    String _name_10 = r.getName();
    _builder.append(_name_10, "                                                    ");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                    ");
    _builder.append("vrep.simx_opmode_oneshot_wait)");
    _builder.newLine();
    _builder.append("_, ");
    String _name_11 = r.getName();
    _builder.append(_name_11);
    _builder.append("_handle = vrep.simxGetObjectHandle(client_id_");
    String _name_12 = r.getName();
    _builder.append(_name_12);
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("                                             ");
    _builder.append("\'");
    String _name_13 = r.getName();
    _builder.append(_name_13, "                                             ");
    _builder.append("\',");
    _builder.newLineIfNotEmpty();
    _builder.append("                                             ");
    _builder.append("vrep.simx_opmode_oneshot_wait)");
    _builder.newLine();
    _builder.append("# Create object ");
    String _name_14 = r.getName();
    _builder.append(_name_14);
    _builder.newLineIfNotEmpty();
    String _name_15 = r.getName();
    _builder.append(_name_15);
    _builder.append(" = [client_id_");
    String _name_16 = r.getName();
    _builder.append(_name_16);
    _builder.append(", ");
    String _name_17 = r.getName();
    _builder.append(_name_17);
    _builder.append("_handle, left_motor_");
    String _name_18 = r.getName();
    _builder.append(_name_18);
    _builder.append("_handle, right_motor_");
    String _name_19 = r.getName();
    _builder.append(_name_19);
    _builder.append("_handle, ");
    String _radius = r.getWheels().get(0).getRadius();
    _builder.append(_radius);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createDefMovements(final Environment e) {
    StringConcatenation _builder = new StringConcatenation();
    HashSet<MoveCollection> new_e = CollectionLiterals.<MoveCollection>newHashSet();
    _builder.newLineIfNotEmpty();
    _builder.append("#");
    boolean _addAll = new_e.addAll(e.getMoves());
    _builder.append(_addAll);
    _builder.newLineIfNotEmpty();
    {
      EList<MoveCollection> _moves = e.getMoves();
      boolean _tripleNotEquals = (_moves != null);
      if (_tripleNotEquals) {
        {
          for(final MoveCollection move : new_e) {
            _builder.append("def ");
            String _name = move.getName();
            _builder.append(_name);
            _builder.append("_");
            String _name_1 = move.getRobot().getName();
            _builder.append(_name_1);
            _builder.append("(robot):");
            _builder.newLineIfNotEmpty();
            {
              EList<AbstractDataMove> _moves_1 = move.getMoves();
              for(final AbstractDataMove m : _moves_1) {
                {
                  EObject _get = m.eContents().get(0);
                  if ((_get instanceof Move)) {
                    {
                      EObject _get_1 = m.eContents().get(0);
                      String _velocity = ((Move) _get_1).getVelocity();
                      boolean _tripleNotEquals_1 = (_velocity != null);
                      if (_tripleNotEquals_1) {
                        {
                          EObject _get_2 = m.eContents().get(0);
                          String _type = ((Move) _get_2).getType();
                          boolean _equals = Objects.equal(_type, "meters");
                          if (_equals) {
                            _builder.append("    _ = movement_forward(robot, ");
                            EObject _get_3 = m.eContents().get(0);
                            String _distance = ((Move) _get_3).getDistance();
                            _builder.append(_distance);
                            _builder.append(", ");
                            EObject _get_4 = m.eContents().get(0);
                            String _velocity_1 = ((Move) _get_4).getVelocity();
                            _builder.append(_velocity_1);
                            _builder.append(")");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("    _ = movement_forward(robot, ");
                            EObject _get_5 = m.eContents().get(0);
                            String _distance_1 = ((Move) _get_5).getDistance();
                            _builder.append(_distance_1);
                            _builder.append("/100.0, ");
                            EObject _get_6 = m.eContents().get(0);
                            String _velocity_2 = ((Move) _get_6).getVelocity();
                            _builder.append(_velocity_2);
                            _builder.append(")");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      } else {
                        {
                          EObject _get_7 = m.eContents().get(0);
                          String _type_1 = ((Move) _get_7).getType();
                          boolean _equals_1 = Objects.equal(_type_1, "meters");
                          if (_equals_1) {
                            _builder.append("    _ = movement_forward(robot, ");
                            EObject _get_8 = m.eContents().get(0);
                            String _distance_2 = ((Move) _get_8).getDistance();
                            _builder.append(_distance_2);
                            _builder.append(", 9.0)");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("    _ = movement_forward(robot, ");
                            EObject _get_9 = m.eContents().get(0);
                            String _distance_3 = ((Move) _get_9).getDistance();
                            _builder.append(_distance_3);
                            _builder.append("/100.0,  9.0)");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  } else {
                    {
                      EObject _get_10 = m.eContents().get(0);
                      String _velocity_3 = ((Turn) _get_10).getVelocity();
                      boolean _tripleEquals = (_velocity_3 == null);
                      if (_tripleEquals) {
                        {
                          EObject _get_11 = m.eContents().get(0);
                          String _type_2 = ((Turn) _get_11).getType();
                          boolean _equals_2 = Objects.equal(_type_2, "left");
                          if (_equals_2) {
                            _builder.append("    movement_left(robot)");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("    movement_right(robot)");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      } else {
                        {
                          EObject _get_12 = m.eContents().get(0);
                          String _type_3 = ((Turn) _get_12).getType();
                          boolean _equals_3 = Objects.equal(_type_3, "left");
                          if (_equals_3) {
                            _builder.append("    movement_left(robot, ");
                            EObject _get_13 = m.eContents().get(0);
                            String _velocity_4 = ((Turn) _get_13).getVelocity();
                            _builder.append(_velocity_4);
                            _builder.append(")");
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("    movement_right(robot, ");
                            EObject _get_14 = m.eContents().get(0);
                            String _velocity_5 = ((Turn) _get_14).getVelocity();
                            _builder.append(_velocity_5);
                            _builder.append(")");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("    pass");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Environment e, final IP ip) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _callModules = this.callModules();
    _builder.append(_callModules);
    _builder.newLineIfNotEmpty();
    CharSequence _createDefMovements = this.createDefMovements(e);
    _builder.append(_createDefMovements);
    _builder.newLineIfNotEmpty();
    _builder.append("print (\'Program started\')");
    _builder.newLine();
    _builder.append("vrep.simxFinish(-1)  # just in case, close all opened connections");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Robot> _robots = e.getRobots();
      boolean _tripleNotEquals = (_robots != null);
      if (_tripleNotEquals) {
        {
          EList<Robot> _robots_1 = e.getRobots();
          for(final Robot robot : _robots_1) {
            {
              if ((ip != null)) {
                _builder.append("client_id_");
                String _name = robot.getName();
                _builder.append(_name);
                _builder.append(" = vrep.simxStart(\'");
                String _ip = ip.getIp();
                _builder.append(_ip);
                _builder.append("\', ");
                int _port = robot.getPort();
                _builder.append(_port);
                _builder.append(", True, True, 5000, 5)  # Connect to V-REP robot ");
                String _name_1 = robot.getName();
                _builder.append(_name_1);
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("client_id_");
                String _name_2 = robot.getName();
                _builder.append(_name_2);
                _builder.append(" = vrep.simxStart(\'127.0.0.1\', ");
                int _port_1 = robot.getPort();
                _builder.append(_port_1);
                _builder.append(", True, True, 5000, 5)  # Connect to V-REP robot ");
                String _name_3 = robot.getName();
                _builder.append(_name_3);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("if ");
        final Function1<Robot, String> _function = (Robot it) -> {
          String _name_4 = it.getName();
          String _plus = ("client_id_" + _name_4);
          return (_plus + " != -1 ");
        };
        String _join = IterableExtensions.join(ListExtensions.<Robot, String>map(e.getRobots(), _function), "and ");
        _builder.append(_join);
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("print (\'Connected to remote API server\')");
        _builder.newLine();
        {
          EList<Robot> _robots_2 = e.getRobots();
          for(final Robot robot_1 : _robots_2) {
            _builder.append("    # Create Handlers for ");
            String _name_4 = robot_1.getName();
            _builder.append(_name_4);
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            CharSequence _createHandlers = this.createHandlers(robot_1);
            _builder.append(_createHandlers, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.append("# Wait for the connection with the simulator");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("for i in range(3):");
        _builder.newLine();
        {
          EList<Robot> _robots_3 = e.getRobots();
          for(final Robot robot_2 : _robots_3) {
            _builder.append("        ");
            _builder.append("return_code, position = vrep.simxGetObjectPosition(");
            String _name_5 = robot_2.getName();
            _builder.append(_name_5, "        ");
            _builder.append("[0], ");
            String _name_6 = robot_2.getName();
            _builder.append(_name_6, "        ");
            _builder.append("[1], -1, vrep.simx_opmode_streaming)");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("return_code, orientation = vrep.simxGetObjectOrientation(");
            String _name_7 = robot_2.getName();
            _builder.append(_name_7, "        ");
            _builder.append("[0], ");
            String _name_8 = robot_2.getName();
            _builder.append(_name_8, "        ");
            _builder.append("[1], -1, vrep.simx_opmode_streaming)");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("        ");
        _builder.append("time.sleep(0.5)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("print \".\"");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("# Start the movement of the robot(s)");
        _builder.newLine();
        {
          EList<MoveCollection> _moves = e.getMoves();
          boolean _tripleNotEquals_1 = (_moves != null);
          if (_tripleNotEquals_1) {
            {
              EList<MoveCollection> _moves_1 = e.getMoves();
              for(final MoveCollection move : _moves_1) {
                {
                  boolean _isConcurrent = move.isConcurrent();
                  if (_isConcurrent) {
                    _builder.append("    ");
                    String _name_9 = move.getRobot().getName();
                    _builder.append(_name_9);
                    _builder.append("_");
                    String _name_10 = move.getName();
                    _builder.append(_name_10);
                    _builder.append(" = threading.Thread(target=");
                    String _name_11 = move.getName();
                    _builder.append(_name_11);
                    _builder.append("_");
                    String _name_12 = move.getRobot().getName();
                    _builder.append(_name_12);
                    _builder.append(", args=(");
                    String _name_13 = move.getRobot().getName();
                    _builder.append(_name_13);
                    _builder.append(",))");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              EList<MoveCollection> _moves_2 = e.getMoves();
              for(final MoveCollection move_1 : _moves_2) {
                {
                  boolean _isConcurrent_1 = move_1.isConcurrent();
                  if (_isConcurrent_1) {
                    _builder.append("    ");
                    String _name_14 = move_1.getRobot().getName();
                    _builder.append(_name_14);
                    _builder.append("_");
                    String _name_15 = move_1.getName();
                    _builder.append(_name_15);
                    _builder.append(".start()");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              EList<MoveCollection> _moves_3 = e.getMoves();
              for(final MoveCollection move_2 : _moves_3) {
                {
                  boolean _isConcurrent_2 = move_2.isConcurrent();
                  if (_isConcurrent_2) {
                    _builder.append("    ");
                    String _name_16 = move_2.getRobot().getName();
                    _builder.append(_name_16);
                    _builder.append("_");
                    String _name_17 = move_2.getName();
                    _builder.append(_name_17);
                    _builder.append(".join()");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              EList<MoveCollection> _moves_4 = e.getMoves();
              for(final MoveCollection move_3 : _moves_4) {
                {
                  boolean _isConcurrent_3 = move_3.isConcurrent();
                  if (_isConcurrent_3) {
                  } else {
                    _builder.append("    ");
                    String _name_18 = move_3.getName();
                    _builder.append(_name_18);
                    _builder.append("_");
                    String _name_19 = move_3.getRobot().getName();
                    _builder.append(_name_19);
                    _builder.append("(");
                    String _name_20 = move_3.getRobot().getName();
                    _builder.append(_name_20);
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        {
          EList<Robot> _robots_4 = e.getRobots();
          for(final Robot robot_3 : _robots_4) {
            _builder.newLine();
            _builder.append("    ");
            _builder.append("# Stop communication ");
            String _name_21 = robot_3.getName();
            _builder.append(_name_21, "    ");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("vrep.simxGetPingTime(client_id_");
            String _name_22 = robot_3.getName();
            _builder.append(_name_22, "    ");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("vrep.simxFinish(client_id_");
            String _name_23 = robot_3.getName();
            _builder.append(_name_23, "    ");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("else:");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("print (\'Failed connecting to remote API server\')");
        _builder.newLine();
        _builder.append("print (\'Program ended\')");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
