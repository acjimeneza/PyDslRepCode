/*
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.serializer;

import com.google.inject.Inject;
import edu.ulibertadores.PyDslRep.AbstractCrossMove;
import edu.ulibertadores.PyDslRep.AbstractMove;
import edu.ulibertadores.PyDslRep.Environment;
import edu.ulibertadores.PyDslRep.IP;
import edu.ulibertadores.PyDslRep.Model;
import edu.ulibertadores.PyDslRep.Move;
import edu.ulibertadores.PyDslRep.MoveCollection;
import edu.ulibertadores.PyDslRep.PyDslRepPackage;
import edu.ulibertadores.PyDslRep.Robot;
import edu.ulibertadores.PyDslRep.Sensor;
import edu.ulibertadores.PyDslRep.Turn;
import edu.ulibertadores.PyDslRep.TypeSensor;
import edu.ulibertadores.PyDslRep.Wheel;
import edu.ulibertadores.services.PyDslRepGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PyDslRepSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PyDslRepGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PyDslRepPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PyDslRepPackage.ABSTRACT_CROSS_MOVE:
				sequence_AbstractCrossMove(context, (AbstractCrossMove) semanticObject); 
				return; 
			case PyDslRepPackage.ABSTRACT_MOVE:
				sequence_AbstractMove(context, (AbstractMove) semanticObject); 
				return; 
			case PyDslRepPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case PyDslRepPackage.IP:
				sequence_IP(context, (IP) semanticObject); 
				return; 
			case PyDslRepPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case PyDslRepPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case PyDslRepPackage.MOVE_COLLECTION:
				sequence_MoveCollection(context, (MoveCollection) semanticObject); 
				return; 
			case PyDslRepPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case PyDslRepPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case PyDslRepPackage.TURN:
				sequence_Turn(context, (Turn) semanticObject); 
				return; 
			case PyDslRepPackage.TYPE_SENSOR:
				sequence_TypeSensor(context, (TypeSensor) semanticObject); 
				return; 
			case PyDslRepPackage.WHEEL:
				sequence_Wheel(context, (Wheel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractDataMove returns AbstractCrossMove
	 *     AbstractCrossMove returns AbstractCrossMove
	 *
	 * Constraint:
	 *     typeM=[DataMove|ID]
	 */
	protected void sequence_AbstractCrossMove(ISerializationContext context, AbstractCrossMove semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.ABSTRACT_CROSS_MOVE__TYPE_M) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.ABSTRACT_CROSS_MOVE__TYPE_M));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractCrossMoveAccess().getTypeMDataMoveIDTerminalRuleCall_0_1(), semanticObject.eGet(PyDslRepPackage.Literals.ABSTRACT_CROSS_MOVE__TYPE_M, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractDataMove returns AbstractMove
	 *     AbstractMove returns AbstractMove
	 *
	 * Constraint:
	 *     typeM=DataMove
	 */
	protected void sequence_AbstractMove(ISerializationContext context, AbstractMove semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.ABSTRACT_MOVE__TYPE_M) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.ABSTRACT_MOVE__TYPE_M));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractMoveAccess().getTypeMDataMoveParserRuleCall_0(), semanticObject.getTypeM());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Environment
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (name=ID ip=[IP|ID]? robots+=[Robot|ID]* moves+=[MoveCollection|ID]*)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns IP
	 *     IP returns IP
	 *
	 * Constraint:
	 *     (name=ID ip=IPA)
	 */
	protected void sequence_IP(ISerializationContext context, IP semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.IP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.IP__NAME));
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.IP__IP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.IP__IP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIPAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIPAccess().getIpIPAParserRuleCall_2_0(), semanticObject.getIp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     environment+=Entity+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns MoveCollection
	 *     MoveCollection returns MoveCollection
	 *
	 * Constraint:
	 *     (concurrent?=Parallel? name=ID robot=[Robot|ID] moves+=AbstractDataMove*)
	 */
	protected void sequence_MoveCollection(ISerializationContext context, MoveCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Move
	 *     DataMove returns Move
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (name?=ID? distance=FLOAT type=Distance velocity=FLOAT?)
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Robot
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (name=ID port=INT wheels+=[Wheel|ID]+)
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Sensor
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (name=ID type=TypeSensor)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.SENSOR__NAME));
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.SENSOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.SENSOR__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSensorAccess().getTypeTypeSensorParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Turn
	 *     DataMove returns Turn
	 *     Turn returns Turn
	 *
	 * Constraint:
	 *     (name?=ID? type=Orientation velocity=FLOAT?)
	 */
	protected void sequence_Turn(ISerializationContext context, Turn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns TypeSensor
	 *     TypeSensor returns TypeSensor
	 *
	 * Constraint:
	 *     (typeName='bumper' | typeName='distance')
	 */
	protected void sequence_TypeSensor(ISerializationContext context, TypeSensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Wheel
	 *     Wheel returns Wheel
	 *
	 * Constraint:
	 *     (name=ID radius=FLOAT)
	 */
	protected void sequence_Wheel(ISerializationContext context, Wheel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.WHEEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.WHEEL__NAME));
			if (transientValues.isValueTransient(semanticObject, PyDslRepPackage.Literals.WHEEL__RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PyDslRepPackage.Literals.WHEEL__RADIUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWheelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWheelAccess().getRadiusFLOATParserRuleCall_4_0(), semanticObject.getRadius());
		feeder.finish();
	}
	
	
}
