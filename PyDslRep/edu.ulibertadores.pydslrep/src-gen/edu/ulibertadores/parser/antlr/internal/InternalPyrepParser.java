package edu.ulibertadores.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.ulibertadores.services.PyDslRepGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPyDslRepParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'environment'", "'with'", "'ip'", "'has'", "'{'", "'}'", "'robots'", "'moves'", "'robot'", "'port'", "'wheels'", "'.'", "'wheel'", "'radius'", "'movement'", "'of'", "'move'", "'at'", "'parallel'", "'meters'", "'centimeters'", "'turn'", "'left'", "'right'", "'-'", "'sensor'", "':'", "'bumper'", "'distance'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPyDslRepParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPyDslRepParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPyDslRepParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPyDslRep.g"; }



     	private PyDslRepGrammarAccess grammarAccess;

        public InternalPyDslRepParser(TokenStream input, PyDslRepGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PyDslRepGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPyDslRep.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPyDslRep.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPyDslRep.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPyDslRep.g:71:1: ruleModel returns [EObject current=null] : ( (lv_environment_0_0= ruleEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_environment_0_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:77:2: ( ( (lv_environment_0_0= ruleEntity ) )* )
            // InternalPyDslRep.g:78:2: ( (lv_environment_0_0= ruleEntity ) )*
            {
            // InternalPyDslRep.g:78:2: ( (lv_environment_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==19||LA1_0==23||LA1_0==25||LA1_0==27||LA1_0==29||LA1_0==32||LA1_0==36||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPyDslRep.g:79:3: (lv_environment_0_0= ruleEntity )
            	    {
            	    // InternalPyDslRep.g:79:3: (lv_environment_0_0= ruleEntity )
            	    // InternalPyDslRep.g:80:4: lv_environment_0_0= ruleEntity
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEnvironmentEntityParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_environment_0_0=ruleEntity();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"environment",
            	    					lv_environment_0_0,
            	    					"edu.ulibertadores.PyDslRep.Entity");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalPyDslRep.g:100:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalPyDslRep.g:100:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalPyDslRep.g:101:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalPyDslRep.g:107:1: ruleEntity returns [EObject current=null] : (this_Environment_0= ruleEnvironment | this_Robot_1= ruleRobot | this_IP_2= ruleIP | this_Sensor_3= ruleSensor | this_TypeSensor_4= ruleTypeSensor | this_Wheel_5= ruleWheel | this_DataMove_6= ruleDataMove | this_MoveCollection_7= ruleMoveCollection ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Environment_0 = null;

        EObject this_Robot_1 = null;

        EObject this_IP_2 = null;

        EObject this_Sensor_3 = null;

        EObject this_TypeSensor_4 = null;

        EObject this_Wheel_5 = null;

        EObject this_DataMove_6 = null;

        EObject this_MoveCollection_7 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:113:2: ( (this_Environment_0= ruleEnvironment | this_Robot_1= ruleRobot | this_IP_2= ruleIP | this_Sensor_3= ruleSensor | this_TypeSensor_4= ruleTypeSensor | this_Wheel_5= ruleWheel | this_DataMove_6= ruleDataMove | this_MoveCollection_7= ruleMoveCollection ) )
            // InternalPyDslRep.g:114:2: (this_Environment_0= ruleEnvironment | this_Robot_1= ruleRobot | this_IP_2= ruleIP | this_Sensor_3= ruleSensor | this_TypeSensor_4= ruleTypeSensor | this_Wheel_5= ruleWheel | this_DataMove_6= ruleDataMove | this_MoveCollection_7= ruleMoveCollection )
            {
            // InternalPyDslRep.g:114:2: (this_Environment_0= ruleEnvironment | this_Robot_1= ruleRobot | this_IP_2= ruleIP | this_Sensor_3= ruleSensor | this_TypeSensor_4= ruleTypeSensor | this_Wheel_5= ruleWheel | this_DataMove_6= ruleDataMove | this_MoveCollection_7= ruleMoveCollection )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            case 38:
            case 39:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 27:
            case 32:
                {
                alt2=7;
                }
                break;
            case 25:
            case 29:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPyDslRep.g:115:3: this_Environment_0= ruleEnvironment
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getEnvironmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Environment_0=ruleEnvironment();

                    state._fsp--;


                    			current = this_Environment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPyDslRep.g:124:3: this_Robot_1= ruleRobot
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getRobotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Robot_1=ruleRobot();

                    state._fsp--;


                    			current = this_Robot_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPyDslRep.g:133:3: this_IP_2= ruleIP
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getIPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IP_2=ruleIP();

                    state._fsp--;


                    			current = this_IP_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPyDslRep.g:142:3: this_Sensor_3= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getSensorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_3=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPyDslRep.g:151:3: this_TypeSensor_4= ruleTypeSensor
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getTypeSensorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSensor_4=ruleTypeSensor();

                    state._fsp--;


                    			current = this_TypeSensor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPyDslRep.g:160:3: this_Wheel_5= ruleWheel
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getWheelParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wheel_5=ruleWheel();

                    state._fsp--;


                    			current = this_Wheel_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPyDslRep.g:169:3: this_DataMove_6= ruleDataMove
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getDataMoveParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataMove_6=ruleDataMove();

                    state._fsp--;


                    			current = this_DataMove_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPyDslRep.g:178:3: this_MoveCollection_7= ruleMoveCollection
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getMoveCollectionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveCollection_7=ruleMoveCollection();

                    state._fsp--;


                    			current = this_MoveCollection_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEnvironment"
    // InternalPyDslRep.g:190:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalPyDslRep.g:190:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalPyDslRep.g:191:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalPyDslRep.g:197:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' otherlv_9= 'robots' (otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves' )? ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:203:2: ( (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' otherlv_9= 'robots' (otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves' )? ) )
            // InternalPyDslRep.g:204:2: (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' otherlv_9= 'robots' (otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves' )? )
            {
            // InternalPyDslRep.g:204:2: (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' otherlv_9= 'robots' (otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves' )? )
            // InternalPyDslRep.g:205:3: otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )* otherlv_8= '}' otherlv_9= 'robots' (otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalPyDslRep.g:209:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPyDslRep.g:210:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPyDslRep.g:210:4: (lv_name_1_0= RULE_ID )
            // InternalPyDslRep.g:211:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPyDslRep.g:227:3: (otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPyDslRep.g:228:4: otherlv_2= 'with' otherlv_3= 'ip' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getWithKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getIpKeyword_2_1());
                    			
                    // InternalPyDslRep.g:236:4: ( (otherlv_4= RULE_ID ) )
                    // InternalPyDslRep.g:237:5: (otherlv_4= RULE_ID )
                    {
                    // InternalPyDslRep.g:237:5: (otherlv_4= RULE_ID )
                    // InternalPyDslRep.g:238:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getIpIPCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getHasKeyword_3());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPyDslRep.g:258:3: ( (otherlv_7= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPyDslRep.g:259:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalPyDslRep.g:259:4: (otherlv_7= RULE_ID )
            	    // InternalPyDslRep.g:260:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEnvironmentRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getRobotsRobotCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getRobotsKeyword_7());
            		
            // InternalPyDslRep.g:279:3: (otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPyDslRep.g:280:4: otherlv_10= 'with' otherlv_11= '{' ( (otherlv_12= RULE_ID ) )* otherlv_13= '}' otherlv_14= 'moves'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getWithKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalPyDslRep.g:288:4: ( (otherlv_12= RULE_ID ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPyDslRep.g:289:5: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalPyDslRep.g:289:5: (otherlv_12= RULE_ID )
                    	    // InternalPyDslRep.g:290:6: otherlv_12= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEnvironmentRule());
                    	    						}
                    	    					
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getMovesMoveCollectionCrossReference_8_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8_3());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getMovesKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleRobot"
    // InternalPyDslRep.g:314:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalPyDslRep.g:314:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalPyDslRep.g:315:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalPyDslRep.g:321:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' otherlv_9= 'wheels' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:327:2: ( (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' otherlv_9= 'wheels' ) )
            // InternalPyDslRep.g:328:2: (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' otherlv_9= 'wheels' )
            {
            // InternalPyDslRep.g:328:2: (otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' otherlv_9= 'wheels' )
            // InternalPyDslRep.g:329:3: otherlv_0= 'robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'port' ( (lv_port_4_0= RULE_INT ) ) otherlv_5= 'has' otherlv_6= '{' ( (otherlv_7= RULE_ID ) )+ otherlv_8= '}' otherlv_9= 'wheels'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalPyDslRep.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPyDslRep.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPyDslRep.g:334:4: (lv_name_1_0= RULE_ID )
            // InternalPyDslRep.g:335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getPortKeyword_3());
            		
            // InternalPyDslRep.g:359:3: ( (lv_port_4_0= RULE_INT ) )
            // InternalPyDslRep.g:360:4: (lv_port_4_0= RULE_INT )
            {
            // InternalPyDslRep.g:360:4: (lv_port_4_0= RULE_INT )
            // InternalPyDslRep.g:361:5: lv_port_4_0= RULE_INT
            {
            lv_port_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_port_4_0, grammarAccess.getRobotAccess().getPortINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getHasKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalPyDslRep.g:385:3: ( (otherlv_7= RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPyDslRep.g:386:4: (otherlv_7= RULE_ID )
            	    {
            	    // InternalPyDslRep.g:386:4: (otherlv_7= RULE_ID )
            	    // InternalPyDslRep.g:387:5: otherlv_7= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRobotRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getWheelsWheelCrossReference_7_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getWheelsKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleIP"
    // InternalPyDslRep.g:410:1: entryRuleIP returns [EObject current=null] : iv_ruleIP= ruleIP EOF ;
    public final EObject entryRuleIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIP = null;


        try {
            // InternalPyDslRep.g:410:43: (iv_ruleIP= ruleIP EOF )
            // InternalPyDslRep.g:411:2: iv_ruleIP= ruleIP EOF
            {
             newCompositeNode(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIP=ruleIP();

            state._fsp--;

             current =iv_ruleIP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalPyDslRep.g:417:1: ruleIP returns [EObject current=null] : (otherlv_0= 'ip' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ip_2_0= ruleIPA ) ) ) ;
    public final EObject ruleIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_ip_2_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:423:2: ( (otherlv_0= 'ip' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ip_2_0= ruleIPA ) ) ) )
            // InternalPyDslRep.g:424:2: (otherlv_0= 'ip' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ip_2_0= ruleIPA ) ) )
            {
            // InternalPyDslRep.g:424:2: (otherlv_0= 'ip' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ip_2_0= ruleIPA ) ) )
            // InternalPyDslRep.g:425:3: otherlv_0= 'ip' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ip_2_0= ruleIPA ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIPAccess().getIpKeyword_0());
            		
            // InternalPyDslRep.g:429:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPyDslRep.g:430:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPyDslRep.g:430:4: (lv_name_1_0= RULE_ID )
            // InternalPyDslRep.g:431:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIPAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPyDslRep.g:447:3: ( (lv_ip_2_0= ruleIPA ) )
            // InternalPyDslRep.g:448:4: (lv_ip_2_0= ruleIPA )
            {
            // InternalPyDslRep.g:448:4: (lv_ip_2_0= ruleIPA )
            // InternalPyDslRep.g:449:5: lv_ip_2_0= ruleIPA
            {

            					newCompositeNode(grammarAccess.getIPAccess().getIpIPAParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ip_2_0=ruleIPA();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIPRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_2_0,
            						"edu.ulibertadores.PyDslRep.IPA");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIP"


    // $ANTLR start "entryRuleIPA"
    // InternalPyDslRep.g:470:1: entryRuleIPA returns [String current=null] : iv_ruleIPA= ruleIPA EOF ;
    public final String entryRuleIPA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIPA = null;


        try {
            // InternalPyDslRep.g:470:43: (iv_ruleIPA= ruleIPA EOF )
            // InternalPyDslRep.g:471:2: iv_ruleIPA= ruleIPA EOF
            {
             newCompositeNode(grammarAccess.getIPARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIPA=ruleIPA();

            state._fsp--;

             current =iv_ruleIPA.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIPA"


    // $ANTLR start "ruleIPA"
    // InternalPyDslRep.g:477:1: ruleIPA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIPA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:483:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) )
            // InternalPyDslRep.g:484:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
            {
            // InternalPyDslRep.g:484:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
            // InternalPyDslRep.g:485:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getIPAAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,22,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIPAAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getIPAAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,22,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIPAAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getIPAAccess().getINTTerminalRuleCall_4());
            		
            kw=(Token)match(input,22,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIPAAccess().getFullStopKeyword_5());
            		
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_6);
            		

            			newLeafNode(this_INT_6, grammarAccess.getIPAAccess().getINTTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIPA"


    // $ANTLR start "entryRuleWheel"
    // InternalPyDslRep.g:532:1: entryRuleWheel returns [EObject current=null] : iv_ruleWheel= ruleWheel EOF ;
    public final EObject entryRuleWheel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWheel = null;


        try {
            // InternalPyDslRep.g:532:46: (iv_ruleWheel= ruleWheel EOF )
            // InternalPyDslRep.g:533:2: iv_ruleWheel= ruleWheel EOF
            {
             newCompositeNode(grammarAccess.getWheelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWheel=ruleWheel();

            state._fsp--;

             current =iv_ruleWheel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWheel"


    // $ANTLR start "ruleWheel"
    // InternalPyDslRep.g:539:1: ruleWheel returns [EObject current=null] : (otherlv_0= 'wheel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'radius' ( (lv_radius_4_0= ruleFLOAT ) ) ) ;
    public final EObject ruleWheel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_radius_4_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:545:2: ( (otherlv_0= 'wheel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'radius' ( (lv_radius_4_0= ruleFLOAT ) ) ) )
            // InternalPyDslRep.g:546:2: (otherlv_0= 'wheel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'radius' ( (lv_radius_4_0= ruleFLOAT ) ) )
            {
            // InternalPyDslRep.g:546:2: (otherlv_0= 'wheel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'radius' ( (lv_radius_4_0= ruleFLOAT ) ) )
            // InternalPyDslRep.g:547:3: otherlv_0= 'wheel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'radius' ( (lv_radius_4_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWheelAccess().getWheelKeyword_0());
            		
            // InternalPyDslRep.g:551:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPyDslRep.g:552:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPyDslRep.g:552:4: (lv_name_1_0= RULE_ID )
            // InternalPyDslRep.g:553:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWheelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWheelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getWheelAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getWheelAccess().getRadiusKeyword_3());
            		
            // InternalPyDslRep.g:577:3: ( (lv_radius_4_0= ruleFLOAT ) )
            // InternalPyDslRep.g:578:4: (lv_radius_4_0= ruleFLOAT )
            {
            // InternalPyDslRep.g:578:4: (lv_radius_4_0= ruleFLOAT )
            // InternalPyDslRep.g:579:5: lv_radius_4_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getWheelAccess().getRadiusFLOATParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_4_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWheelRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_4_0,
            						"edu.ulibertadores.PyDslRep.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWheel"


    // $ANTLR start "entryRuleMoveCollection"
    // InternalPyDslRep.g:600:1: entryRuleMoveCollection returns [EObject current=null] : iv_ruleMoveCollection= ruleMoveCollection EOF ;
    public final EObject entryRuleMoveCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveCollection = null;


        try {
            // InternalPyDslRep.g:600:55: (iv_ruleMoveCollection= ruleMoveCollection EOF )
            // InternalPyDslRep.g:601:2: iv_ruleMoveCollection= ruleMoveCollection EOF
            {
             newCompositeNode(grammarAccess.getMoveCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveCollection=ruleMoveCollection();

            state._fsp--;

             current =iv_ruleMoveCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveCollection"


    // $ANTLR start "ruleMoveCollection"
    // InternalPyDslRep.g:607:1: ruleMoveCollection returns [EObject current=null] : ( ( (lv_concurrent_0_0= ruleParallel ) )? otherlv_1= 'movement' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_moves_6_0= ruleAbstractDataMove ) )* otherlv_7= '}' ) ;
    public final EObject ruleMoveCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_concurrent_0_0 = null;

        EObject lv_moves_6_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:613:2: ( ( ( (lv_concurrent_0_0= ruleParallel ) )? otherlv_1= 'movement' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_moves_6_0= ruleAbstractDataMove ) )* otherlv_7= '}' ) )
            // InternalPyDslRep.g:614:2: ( ( (lv_concurrent_0_0= ruleParallel ) )? otherlv_1= 'movement' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_moves_6_0= ruleAbstractDataMove ) )* otherlv_7= '}' )
            {
            // InternalPyDslRep.g:614:2: ( ( (lv_concurrent_0_0= ruleParallel ) )? otherlv_1= 'movement' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_moves_6_0= ruleAbstractDataMove ) )* otherlv_7= '}' )
            // InternalPyDslRep.g:615:3: ( (lv_concurrent_0_0= ruleParallel ) )? otherlv_1= 'movement' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) otherlv_5= '{' ( (lv_moves_6_0= ruleAbstractDataMove ) )* otherlv_7= '}'
            {
            // InternalPyDslRep.g:615:3: ( (lv_concurrent_0_0= ruleParallel ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPyDslRep.g:616:4: (lv_concurrent_0_0= ruleParallel )
                    {
                    // InternalPyDslRep.g:616:4: (lv_concurrent_0_0= ruleParallel )
                    // InternalPyDslRep.g:617:5: lv_concurrent_0_0= ruleParallel
                    {

                    					newCompositeNode(grammarAccess.getMoveCollectionAccess().getConcurrentParallelParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_concurrent_0_0=ruleParallel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMoveCollectionRule());
                    					}
                    					set(
                    						current,
                    						"concurrent",
                    						true,
                    						"edu.ulibertadores.PyDslRep.Parallel");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveCollectionAccess().getMovementKeyword_1());
            		
            // InternalPyDslRep.g:638:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPyDslRep.g:639:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPyDslRep.g:639:4: (lv_name_2_0= RULE_ID )
            // InternalPyDslRep.g:640:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMoveCollectionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveCollectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveCollectionAccess().getOfKeyword_3());
            		
            // InternalPyDslRep.g:660:3: ( (otherlv_4= RULE_ID ) )
            // InternalPyDslRep.g:661:4: (otherlv_4= RULE_ID )
            {
            // InternalPyDslRep.g:661:4: (otherlv_4= RULE_ID )
            // InternalPyDslRep.g:662:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveCollectionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_4, grammarAccess.getMoveCollectionAccess().getRobotRobotCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveCollectionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalPyDslRep.g:677:3: ( (lv_moves_6_0= ruleAbstractDataMove ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==27||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPyDslRep.g:678:4: (lv_moves_6_0= ruleAbstractDataMove )
            	    {
            	    // InternalPyDslRep.g:678:4: (lv_moves_6_0= ruleAbstractDataMove )
            	    // InternalPyDslRep.g:679:5: lv_moves_6_0= ruleAbstractDataMove
            	    {

            	    					newCompositeNode(grammarAccess.getMoveCollectionAccess().getMovesAbstractDataMoveParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_moves_6_0=ruleAbstractDataMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveCollectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moves",
            	    						lv_moves_6_0,
            	    						"edu.ulibertadores.PyDslRep.AbstractDataMove");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMoveCollectionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveCollection"


    // $ANTLR start "entryRuleAbstractDataMove"
    // InternalPyDslRep.g:704:1: entryRuleAbstractDataMove returns [EObject current=null] : iv_ruleAbstractDataMove= ruleAbstractDataMove EOF ;
    public final EObject entryRuleAbstractDataMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDataMove = null;


        try {
            // InternalPyDslRep.g:704:57: (iv_ruleAbstractDataMove= ruleAbstractDataMove EOF )
            // InternalPyDslRep.g:705:2: iv_ruleAbstractDataMove= ruleAbstractDataMove EOF
            {
             newCompositeNode(grammarAccess.getAbstractDataMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDataMove=ruleAbstractDataMove();

            state._fsp--;

             current =iv_ruleAbstractDataMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDataMove"


    // $ANTLR start "ruleAbstractDataMove"
    // InternalPyDslRep.g:711:1: ruleAbstractDataMove returns [EObject current=null] : (this_AbstractCrossMove_0= ruleAbstractCrossMove | this_AbstractMove_1= ruleAbstractMove ) ;
    public final EObject ruleAbstractDataMove() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractCrossMove_0 = null;

        EObject this_AbstractMove_1 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:717:2: ( (this_AbstractCrossMove_0= ruleAbstractCrossMove | this_AbstractMove_1= ruleAbstractMove ) )
            // InternalPyDslRep.g:718:2: (this_AbstractCrossMove_0= ruleAbstractCrossMove | this_AbstractMove_1= ruleAbstractMove )
            {
            // InternalPyDslRep.g:718:2: (this_AbstractCrossMove_0= ruleAbstractCrossMove | this_AbstractMove_1= ruleAbstractMove )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==27||LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPyDslRep.g:719:3: this_AbstractCrossMove_0= ruleAbstractCrossMove
                    {

                    			newCompositeNode(grammarAccess.getAbstractDataMoveAccess().getAbstractCrossMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractCrossMove_0=ruleAbstractCrossMove();

                    state._fsp--;


                    			current = this_AbstractCrossMove_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPyDslRep.g:728:3: this_AbstractMove_1= ruleAbstractMove
                    {

                    			newCompositeNode(grammarAccess.getAbstractDataMoveAccess().getAbstractMoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractMove_1=ruleAbstractMove();

                    state._fsp--;


                    			current = this_AbstractMove_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDataMove"


    // $ANTLR start "entryRuleAbstractMove"
    // InternalPyDslRep.g:740:1: entryRuleAbstractMove returns [EObject current=null] : iv_ruleAbstractMove= ruleAbstractMove EOF ;
    public final EObject entryRuleAbstractMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMove = null;


        try {
            // InternalPyDslRep.g:740:53: (iv_ruleAbstractMove= ruleAbstractMove EOF )
            // InternalPyDslRep.g:741:2: iv_ruleAbstractMove= ruleAbstractMove EOF
            {
             newCompositeNode(grammarAccess.getAbstractMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMove=ruleAbstractMove();

            state._fsp--;

             current =iv_ruleAbstractMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractMove"


    // $ANTLR start "ruleAbstractMove"
    // InternalPyDslRep.g:747:1: ruleAbstractMove returns [EObject current=null] : ( (lv_typeM_0_0= ruleDataMove ) ) ;
    public final EObject ruleAbstractMove() throws RecognitionException {
        EObject current = null;

        EObject lv_typeM_0_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:753:2: ( ( (lv_typeM_0_0= ruleDataMove ) ) )
            // InternalPyDslRep.g:754:2: ( (lv_typeM_0_0= ruleDataMove ) )
            {
            // InternalPyDslRep.g:754:2: ( (lv_typeM_0_0= ruleDataMove ) )
            // InternalPyDslRep.g:755:3: (lv_typeM_0_0= ruleDataMove )
            {
            // InternalPyDslRep.g:755:3: (lv_typeM_0_0= ruleDataMove )
            // InternalPyDslRep.g:756:4: lv_typeM_0_0= ruleDataMove
            {

            				newCompositeNode(grammarAccess.getAbstractMoveAccess().getTypeMDataMoveParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_typeM_0_0=ruleDataMove();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAbstractMoveRule());
            				}
            				set(
            					current,
            					"typeM",
            					lv_typeM_0_0,
            					"edu.ulibertadores.PyDslRep.DataMove");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractMove"


    // $ANTLR start "entryRuleAbstractCrossMove"
    // InternalPyDslRep.g:776:1: entryRuleAbstractCrossMove returns [EObject current=null] : iv_ruleAbstractCrossMove= ruleAbstractCrossMove EOF ;
    public final EObject entryRuleAbstractCrossMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCrossMove = null;


        try {
            // InternalPyDslRep.g:776:58: (iv_ruleAbstractCrossMove= ruleAbstractCrossMove EOF )
            // InternalPyDslRep.g:777:2: iv_ruleAbstractCrossMove= ruleAbstractCrossMove EOF
            {
             newCompositeNode(grammarAccess.getAbstractCrossMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCrossMove=ruleAbstractCrossMove();

            state._fsp--;

             current =iv_ruleAbstractCrossMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractCrossMove"


    // $ANTLR start "ruleAbstractCrossMove"
    // InternalPyDslRep.g:783:1: ruleAbstractCrossMove returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAbstractCrossMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:789:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPyDslRep.g:790:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPyDslRep.g:790:2: ( (otherlv_0= RULE_ID ) )
            // InternalPyDslRep.g:791:3: (otherlv_0= RULE_ID )
            {
            // InternalPyDslRep.g:791:3: (otherlv_0= RULE_ID )
            // InternalPyDslRep.g:792:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAbstractCrossMoveRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getAbstractCrossMoveAccess().getTypeMDataMoveCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractCrossMove"


    // $ANTLR start "entryRuleDataMove"
    // InternalPyDslRep.g:806:1: entryRuleDataMove returns [EObject current=null] : iv_ruleDataMove= ruleDataMove EOF ;
    public final EObject entryRuleDataMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMove = null;


        try {
            // InternalPyDslRep.g:806:49: (iv_ruleDataMove= ruleDataMove EOF )
            // InternalPyDslRep.g:807:2: iv_ruleDataMove= ruleDataMove EOF
            {
             newCompositeNode(grammarAccess.getDataMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataMove=ruleDataMove();

            state._fsp--;

             current =iv_ruleDataMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataMove"


    // $ANTLR start "ruleDataMove"
    // InternalPyDslRep.g:813:1: ruleDataMove returns [EObject current=null] : (this_Turn_0= ruleTurn | this_Move_1= ruleMove ) ;
    public final EObject ruleDataMove() throws RecognitionException {
        EObject current = null;

        EObject this_Turn_0 = null;

        EObject this_Move_1 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:819:2: ( (this_Turn_0= ruleTurn | this_Move_1= ruleMove ) )
            // InternalPyDslRep.g:820:2: (this_Turn_0= ruleTurn | this_Move_1= ruleMove )
            {
            // InternalPyDslRep.g:820:2: (this_Turn_0= ruleTurn | this_Move_1= ruleMove )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPyDslRep.g:821:3: this_Turn_0= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getDataMoveAccess().getTurnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_0=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPyDslRep.g:830:3: this_Move_1= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getDataMoveAccess().getMoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_1=ruleMove();

                    state._fsp--;


                    			current = this_Move_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataMove"


    // $ANTLR start "entryRuleMove"
    // InternalPyDslRep.g:842:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalPyDslRep.g:842:45: (iv_ruleMove= ruleMove EOF )
            // InternalPyDslRep.g:843:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalPyDslRep.g:849:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) )? ( (lv_distance_2_0= ruleFLOAT ) ) ( (lv_type_3_0= ruleDistance ) ) (otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_velocity_5_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:855:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) )? ( (lv_distance_2_0= ruleFLOAT ) ) ( (lv_type_3_0= ruleDistance ) ) (otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) ) )? ) )
            // InternalPyDslRep.g:856:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) )? ( (lv_distance_2_0= ruleFLOAT ) ) ( (lv_type_3_0= ruleDistance ) ) (otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) ) )? )
            {
            // InternalPyDslRep.g:856:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) )? ( (lv_distance_2_0= ruleFLOAT ) ) ( (lv_type_3_0= ruleDistance ) ) (otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) ) )? )
            // InternalPyDslRep.g:857:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) )? ( (lv_distance_2_0= ruleFLOAT ) ) ( (lv_type_3_0= ruleDistance ) ) (otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalPyDslRep.g:861:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPyDslRep.g:862:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPyDslRep.g:862:4: (lv_name_1_0= RULE_ID )
                    // InternalPyDslRep.g:863:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoveRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						true,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalPyDslRep.g:879:3: ( (lv_distance_2_0= ruleFLOAT ) )
            // InternalPyDslRep.g:880:4: (lv_distance_2_0= ruleFLOAT )
            {
            // InternalPyDslRep.g:880:4: (lv_distance_2_0= ruleFLOAT )
            // InternalPyDslRep.g:881:5: lv_distance_2_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getDistanceFLOATParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_distance_2_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"edu.ulibertadores.PyDslRep.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyDslRep.g:898:3: ( (lv_type_3_0= ruleDistance ) )
            // InternalPyDslRep.g:899:4: (lv_type_3_0= ruleDistance )
            {
            // InternalPyDslRep.g:899:4: (lv_type_3_0= ruleDistance )
            // InternalPyDslRep.g:900:5: lv_type_3_0= ruleDistance
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getTypeDistanceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_type_3_0=ruleDistance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"edu.ulibertadores.PyDslRep.Distance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyDslRep.g:917:3: (otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPyDslRep.g:918:4: otherlv_4= 'at' ( (lv_velocity_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getAtKeyword_4_0());
                    			
                    // InternalPyDslRep.g:922:4: ( (lv_velocity_5_0= ruleFLOAT ) )
                    // InternalPyDslRep.g:923:5: (lv_velocity_5_0= ruleFLOAT )
                    {
                    // InternalPyDslRep.g:923:5: (lv_velocity_5_0= ruleFLOAT )
                    // InternalPyDslRep.g:924:6: lv_velocity_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMoveAccess().getVelocityFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_velocity_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveRule());
                    						}
                    						set(
                    							current,
                    							"velocity",
                    							lv_velocity_5_0,
                    							"edu.ulibertadores.PyDslRep.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleParallel"
    // InternalPyDslRep.g:946:1: entryRuleParallel returns [String current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final String entryRuleParallel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParallel = null;


        try {
            // InternalPyDslRep.g:946:48: (iv_ruleParallel= ruleParallel EOF )
            // InternalPyDslRep.g:947:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalPyDslRep.g:953:1: ruleParallel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'parallel' ;
    public final AntlrDatatypeRuleToken ruleParallel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:959:2: (kw= 'parallel' )
            // InternalPyDslRep.g:960:2: kw= 'parallel'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getParallelAccess().getParallelKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleDistance"
    // InternalPyDslRep.g:968:1: entryRuleDistance returns [String current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final String entryRuleDistance() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDistance = null;


        try {
            // InternalPyDslRep.g:968:48: (iv_ruleDistance= ruleDistance EOF )
            // InternalPyDslRep.g:969:2: iv_ruleDistance= ruleDistance EOF
            {
             newCompositeNode(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistance=ruleDistance();

            state._fsp--;

             current =iv_ruleDistance.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // InternalPyDslRep.g:975:1: ruleDistance returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'meters' | kw= 'centimeters' ) ;
    public final AntlrDatatypeRuleToken ruleDistance() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:981:2: ( (kw= 'meters' | kw= 'centimeters' ) )
            // InternalPyDslRep.g:982:2: (kw= 'meters' | kw= 'centimeters' )
            {
            // InternalPyDslRep.g:982:2: (kw= 'meters' | kw= 'centimeters' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalPyDslRep.g:983:3: kw= 'meters'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistanceAccess().getMetersKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPyDslRep.g:989:3: kw= 'centimeters'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDistanceAccess().getCentimetersKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleTurn"
    // InternalPyDslRep.g:998:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalPyDslRep.g:998:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalPyDslRep.g:999:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalPyDslRep.g:1005:1: ruleTurn returns [EObject current=null] : (otherlv_0= 'turn' ( (lv_name_1_0= RULE_ID ) )? ( (lv_type_2_0= ruleOrientation ) ) ( (lv_velocity_3_0= ruleFLOAT ) )? ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_velocity_3_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:1011:2: ( (otherlv_0= 'turn' ( (lv_name_1_0= RULE_ID ) )? ( (lv_type_2_0= ruleOrientation ) ) ( (lv_velocity_3_0= ruleFLOAT ) )? ) )
            // InternalPyDslRep.g:1012:2: (otherlv_0= 'turn' ( (lv_name_1_0= RULE_ID ) )? ( (lv_type_2_0= ruleOrientation ) ) ( (lv_velocity_3_0= ruleFLOAT ) )? )
            {
            // InternalPyDslRep.g:1012:2: (otherlv_0= 'turn' ( (lv_name_1_0= RULE_ID ) )? ( (lv_type_2_0= ruleOrientation ) ) ( (lv_velocity_3_0= ruleFLOAT ) )? )
            // InternalPyDslRep.g:1013:3: otherlv_0= 'turn' ( (lv_name_1_0= RULE_ID ) )? ( (lv_type_2_0= ruleOrientation ) ) ( (lv_velocity_3_0= ruleFLOAT ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTurnAccess().getTurnKeyword_0());
            		
            // InternalPyDslRep.g:1017:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPyDslRep.g:1018:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPyDslRep.g:1018:4: (lv_name_1_0= RULE_ID )
                    // InternalPyDslRep.g:1019:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTurnAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTurnRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						true,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalPyDslRep.g:1035:3: ( (lv_type_2_0= ruleOrientation ) )
            // InternalPyDslRep.g:1036:4: (lv_type_2_0= ruleOrientation )
            {
            // InternalPyDslRep.g:1036:4: (lv_type_2_0= ruleOrientation )
            // InternalPyDslRep.g:1037:5: lv_type_2_0= ruleOrientation
            {

            					newCompositeNode(grammarAccess.getTurnAccess().getTypeOrientationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_type_2_0=ruleOrientation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"edu.ulibertadores.PyDslRep.Orientation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyDslRep.g:1054:3: ( (lv_velocity_3_0= ruleFLOAT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPyDslRep.g:1055:4: (lv_velocity_3_0= ruleFLOAT )
                    {
                    // InternalPyDslRep.g:1055:4: (lv_velocity_3_0= ruleFLOAT )
                    // InternalPyDslRep.g:1056:5: lv_velocity_3_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getTurnAccess().getVelocityFLOATParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_velocity_3_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTurnRule());
                    					}
                    					set(
                    						current,
                    						"velocity",
                    						lv_velocity_3_0,
                    						"edu.ulibertadores.PyDslRep.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleOrientation"
    // InternalPyDslRep.g:1077:1: entryRuleOrientation returns [String current=null] : iv_ruleOrientation= ruleOrientation EOF ;
    public final String entryRuleOrientation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrientation = null;


        try {
            // InternalPyDslRep.g:1077:51: (iv_ruleOrientation= ruleOrientation EOF )
            // InternalPyDslRep.g:1078:2: iv_ruleOrientation= ruleOrientation EOF
            {
             newCompositeNode(grammarAccess.getOrientationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrientation=ruleOrientation();

            state._fsp--;

             current =iv_ruleOrientation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrientation"


    // $ANTLR start "ruleOrientation"
    // InternalPyDslRep.g:1084:1: ruleOrientation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'left' | kw= 'right' ) ;
    public final AntlrDatatypeRuleToken ruleOrientation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:1090:2: ( (kw= 'left' | kw= 'right' ) )
            // InternalPyDslRep.g:1091:2: (kw= 'left' | kw= 'right' )
            {
            // InternalPyDslRep.g:1091:2: (kw= 'left' | kw= 'right' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPyDslRep.g:1092:3: kw= 'left'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrientationAccess().getLeftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPyDslRep.g:1098:3: kw= 'right'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrientationAccess().getRightKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "entryRuleFLOAT"
    // InternalPyDslRep.g:1107:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalPyDslRep.g:1107:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalPyDslRep.g:1108:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalPyDslRep.g:1114:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:1120:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalPyDslRep.g:1121:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalPyDslRep.g:1121:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalPyDslRep.g:1122:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalPyDslRep.g:1122:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPyDslRep.g:1123:4: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFLOATAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,22,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSensor"
    // InternalPyDslRep.g:1152:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalPyDslRep.g:1152:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalPyDslRep.g:1153:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalPyDslRep.g:1159:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeSensor ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPyDslRep.g:1165:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeSensor ) ) ) )
            // InternalPyDslRep.g:1166:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeSensor ) ) )
            {
            // InternalPyDslRep.g:1166:2: (otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeSensor ) ) )
            // InternalPyDslRep.g:1167:3: otherlv_0= 'sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeSensor ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalPyDslRep.g:1171:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPyDslRep.g:1172:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPyDslRep.g:1172:4: (lv_name_1_0= RULE_ID )
            // InternalPyDslRep.g:1173:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getColonKeyword_2());
            		
            // InternalPyDslRep.g:1193:3: ( (lv_type_3_0= ruleTypeSensor ) )
            // InternalPyDslRep.g:1194:4: (lv_type_3_0= ruleTypeSensor )
            {
            // InternalPyDslRep.g:1194:4: (lv_type_3_0= ruleTypeSensor )
            // InternalPyDslRep.g:1195:5: lv_type_3_0= ruleTypeSensor
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeTypeSensorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"edu.ulibertadores.PyDslRep.TypeSensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleTypeSensor"
    // InternalPyDslRep.g:1216:1: entryRuleTypeSensor returns [EObject current=null] : iv_ruleTypeSensor= ruleTypeSensor EOF ;
    public final EObject entryRuleTypeSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSensor = null;


        try {
            // InternalPyDslRep.g:1216:51: (iv_ruleTypeSensor= ruleTypeSensor EOF )
            // InternalPyDslRep.g:1217:2: iv_ruleTypeSensor= ruleTypeSensor EOF
            {
             newCompositeNode(grammarAccess.getTypeSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSensor=ruleTypeSensor();

            state._fsp--;

             current =iv_ruleTypeSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSensor"


    // $ANTLR start "ruleTypeSensor"
    // InternalPyDslRep.g:1223:1: ruleTypeSensor returns [EObject current=null] : ( ( (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' ) ) ) ;
    public final EObject ruleTypeSensor() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;


        	enterRule();

        try {
            // InternalPyDslRep.g:1229:2: ( ( ( (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' ) ) ) )
            // InternalPyDslRep.g:1230:2: ( ( (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' ) ) )
            {
            // InternalPyDslRep.g:1230:2: ( ( (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' ) ) )
            // InternalPyDslRep.g:1231:3: ( (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' ) )
            {
            // InternalPyDslRep.g:1231:3: ( (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' ) )
            // InternalPyDslRep.g:1232:4: (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' )
            {
            // InternalPyDslRep.g:1232:4: (lv_typeName_0_1= 'bumper' | lv_typeName_0_2= 'distance' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPyDslRep.g:1233:5: lv_typeName_0_1= 'bumper'
                    {
                    lv_typeName_0_1=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getTypeSensorAccess().getTypeNameBumperKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeSensorRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalPyDslRep.g:1244:5: lv_typeName_0_2= 'distance'
                    {
                    lv_typeName_0_2=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getTypeSensorAccess().getTypeNameDistanceKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeSensorRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSensor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000D12A882802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000108010010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C000000000L});

}