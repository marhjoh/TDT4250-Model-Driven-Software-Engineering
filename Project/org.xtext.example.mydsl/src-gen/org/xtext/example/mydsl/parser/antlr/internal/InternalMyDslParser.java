package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Tournament'", "'{'", "'tournamentType'", "'teams'", "','", "'}'", "'tournamentformat'", "'brackets'", "'Team'", "'teamSize'", "'managerName'", "'players'", "'Bracket'", "'rounds'", "'bracketSide'", "'matches'", "'-'", "'Player'", "'position'", "'birthDate'", "'number'", "'playerstatistics'", "'Defender'", "'goals'", "'assists'", "'fouls'", "'yellowCards'", "'redCards'", "'cleansheets'", "'Goalkeeper'", "'saves'", "'Attacker'", "'sprintSpeed'", "'League'", "'maxTeams'", "'minTeams'", "'description'", "'numberOfRounds'", "'finalsFormat'", "'RoundRobin'", "'pointsForWin'", "'pointsForDraw'", "'pointsForLoss'", "'tieBreakerRule'", "'hasThirdPlacePlayoff'", "'Knockout'", "'true'", "'false'", "'Match'", "'scoreTeam1'", "'scoreTeam2'", "'matchResult'", "'day'", "'('", "')'", "'matchrules'", "'tieBreaking'", "'extraTime'", "'penaltyShootouts'", "'Standard'", "'ExtraTime'", "'extraTimeDuration'", "'PenaltyShootout'", "'GroupStage'", "'KNOCKOUT'", "'LEAGUE'", "'ROUND_ROBIN'", "'GOALKEEPER'", "'DEFENDER'", "'MIDFIELDER'", "'ATTACKER'", "'SINGLE_FINAL'", "'BEST_OF_THREE'", "'GOAL_DIFFERENCE'", "'HEAD_TO_HEAD'", "'GOALS_SCORED'", "'UPPER'", "'LOWER'", "'WIN'", "'LOSS'", "'DRAW'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DATE=7;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tournament";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTournament"
    // InternalMyDsl.g:65:1: entryRuleTournament returns [EObject current=null] : iv_ruleTournament= ruleTournament EOF ;
    public final EObject entryRuleTournament() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTournament = null;


        try {
            // InternalMyDsl.g:65:51: (iv_ruleTournament= ruleTournament EOF )
            // InternalMyDsl.g:66:2: iv_ruleTournament= ruleTournament EOF
            {
             newCompositeNode(grammarAccess.getTournamentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTournament=ruleTournament();

            state._fsp--;

             current =iv_ruleTournament; 
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
    // $ANTLR end "entryRuleTournament"


    // $ANTLR start "ruleTournament"
    // InternalMyDsl.g:72:1: ruleTournament returns [EObject current=null] : (otherlv_0= 'Tournament' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) ) )? (otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}' )? otherlv_11= 'tournamentformat' ( (lv_tournamentformat_12_0= ruleTournamentFormat ) ) otherlv_13= 'brackets' otherlv_14= '{' ( (lv_brackets_15_0= ruleBracket ) ) (otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) ) )* otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleTournament() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_tournamentType_4_0 = null;

        EObject lv_teams_7_0 = null;

        EObject lv_teams_9_0 = null;

        EObject lv_tournamentformat_12_0 = null;

        EObject lv_brackets_15_0 = null;

        EObject lv_brackets_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Tournament' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) ) )? (otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}' )? otherlv_11= 'tournamentformat' ( (lv_tournamentformat_12_0= ruleTournamentFormat ) ) otherlv_13= 'brackets' otherlv_14= '{' ( (lv_brackets_15_0= ruleBracket ) ) (otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Tournament' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) ) )? (otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}' )? otherlv_11= 'tournamentformat' ( (lv_tournamentformat_12_0= ruleTournamentFormat ) ) otherlv_13= 'brackets' otherlv_14= '{' ( (lv_brackets_15_0= ruleBracket ) ) (otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Tournament' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) ) )? (otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}' )? otherlv_11= 'tournamentformat' ( (lv_tournamentformat_12_0= ruleTournamentFormat ) ) otherlv_13= 'brackets' otherlv_14= '{' ( (lv_brackets_15_0= ruleBracket ) ) (otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) ) )* otherlv_18= '}' otherlv_19= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Tournament' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) ) )? (otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}' )? otherlv_11= 'tournamentformat' ( (lv_tournamentformat_12_0= ruleTournamentFormat ) ) otherlv_13= 'brackets' otherlv_14= '{' ( (lv_brackets_15_0= ruleBracket ) ) (otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) ) )* otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTournamentAccess().getTournamentKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:107:3: (otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:108:4: otherlv_3= 'tournamentType' ( (lv_tournamentType_4_0= ruleTournamentType ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getTournamentAccess().getTournamentTypeKeyword_3_0());
                    			
                    // InternalMyDsl.g:112:4: ( (lv_tournamentType_4_0= ruleTournamentType ) )
                    // InternalMyDsl.g:113:5: (lv_tournamentType_4_0= ruleTournamentType )
                    {
                    // InternalMyDsl.g:113:5: (lv_tournamentType_4_0= ruleTournamentType )
                    // InternalMyDsl.g:114:6: lv_tournamentType_4_0= ruleTournamentType
                    {

                    						newCompositeNode(grammarAccess.getTournamentAccess().getTournamentTypeTournamentTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tournamentType_4_0=ruleTournamentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTournamentRule());
                    						}
                    						set(
                    							current,
                    							"tournamentType",
                    							lv_tournamentType_4_0,
                    							"org.xtext.example.mydsl.MyDsl.TournamentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:132:3: (otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:133:4: otherlv_5= 'teams' otherlv_6= '{' ( (lv_teams_7_0= ruleTeam ) ) (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTournamentAccess().getTeamsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:141:4: ( (lv_teams_7_0= ruleTeam ) )
                    // InternalMyDsl.g:142:5: (lv_teams_7_0= ruleTeam )
                    {
                    // InternalMyDsl.g:142:5: (lv_teams_7_0= ruleTeam )
                    // InternalMyDsl.g:143:6: lv_teams_7_0= ruleTeam
                    {

                    						newCompositeNode(grammarAccess.getTournamentAccess().getTeamsTeamParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_teams_7_0=ruleTeam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTournamentRule());
                    						}
                    						add(
                    							current,
                    							"teams",
                    							lv_teams_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Team");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:160:4: (otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:161:5: otherlv_8= ',' ( (lv_teams_9_0= ruleTeam ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTournamentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:165:5: ( (lv_teams_9_0= ruleTeam ) )
                    	    // InternalMyDsl.g:166:6: (lv_teams_9_0= ruleTeam )
                    	    {
                    	    // InternalMyDsl.g:166:6: (lv_teams_9_0= ruleTeam )
                    	    // InternalMyDsl.g:167:7: lv_teams_9_0= ruleTeam
                    	    {

                    	    							newCompositeNode(grammarAccess.getTournamentAccess().getTeamsTeamParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_teams_9_0=ruleTeam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTournamentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"teams",
                    	    								lv_teams_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Team");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getTournamentAccess().getTournamentformatKeyword_5());
            		
            // InternalMyDsl.g:194:3: ( (lv_tournamentformat_12_0= ruleTournamentFormat ) )
            // InternalMyDsl.g:195:4: (lv_tournamentformat_12_0= ruleTournamentFormat )
            {
            // InternalMyDsl.g:195:4: (lv_tournamentformat_12_0= ruleTournamentFormat )
            // InternalMyDsl.g:196:5: lv_tournamentformat_12_0= ruleTournamentFormat
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getTournamentformatTournamentFormatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_tournamentformat_12_0=ruleTournamentFormat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					set(
            						current,
            						"tournamentformat",
            						lv_tournamentformat_12_0,
            						"org.xtext.example.mydsl.MyDsl.TournamentFormat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTournamentAccess().getBracketsKeyword_7());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:221:3: ( (lv_brackets_15_0= ruleBracket ) )
            // InternalMyDsl.g:222:4: (lv_brackets_15_0= ruleBracket )
            {
            // InternalMyDsl.g:222:4: (lv_brackets_15_0= ruleBracket )
            // InternalMyDsl.g:223:5: lv_brackets_15_0= ruleBracket
            {

            					newCompositeNode(grammarAccess.getTournamentAccess().getBracketsBracketParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_brackets_15_0=ruleBracket();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTournamentRule());
            					}
            					add(
            						current,
            						"brackets",
            						lv_brackets_15_0,
            						"org.xtext.example.mydsl.MyDsl.Bracket");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:240:3: (otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:241:4: otherlv_16= ',' ( (lv_brackets_17_0= ruleBracket ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_16, grammarAccess.getTournamentAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMyDsl.g:245:4: ( (lv_brackets_17_0= ruleBracket ) )
            	    // InternalMyDsl.g:246:5: (lv_brackets_17_0= ruleBracket )
            	    {
            	    // InternalMyDsl.g:246:5: (lv_brackets_17_0= ruleBracket )
            	    // InternalMyDsl.g:247:6: lv_brackets_17_0= ruleBracket
            	    {

            	    						newCompositeNode(grammarAccess.getTournamentAccess().getBracketsBracketParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_brackets_17_0=ruleBracket();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTournamentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"brackets",
            	    							lv_brackets_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.Bracket");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleTournament"


    // $ANTLR start "entryRuleTournamentFormat"
    // InternalMyDsl.g:277:1: entryRuleTournamentFormat returns [EObject current=null] : iv_ruleTournamentFormat= ruleTournamentFormat EOF ;
    public final EObject entryRuleTournamentFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTournamentFormat = null;


        try {
            // InternalMyDsl.g:277:57: (iv_ruleTournamentFormat= ruleTournamentFormat EOF )
            // InternalMyDsl.g:278:2: iv_ruleTournamentFormat= ruleTournamentFormat EOF
            {
             newCompositeNode(grammarAccess.getTournamentFormatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTournamentFormat=ruleTournamentFormat();

            state._fsp--;

             current =iv_ruleTournamentFormat; 
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
    // $ANTLR end "entryRuleTournamentFormat"


    // $ANTLR start "ruleTournamentFormat"
    // InternalMyDsl.g:284:1: ruleTournamentFormat returns [EObject current=null] : (this_League_0= ruleLeague | this_RoundRobin_1= ruleRoundRobin | this_Knockout_2= ruleKnockout ) ;
    public final EObject ruleTournamentFormat() throws RecognitionException {
        EObject current = null;

        EObject this_League_0 = null;

        EObject this_RoundRobin_1 = null;

        EObject this_Knockout_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:290:2: ( (this_League_0= ruleLeague | this_RoundRobin_1= ruleRoundRobin | this_Knockout_2= ruleKnockout ) )
            // InternalMyDsl.g:291:2: (this_League_0= ruleLeague | this_RoundRobin_1= ruleRoundRobin | this_Knockout_2= ruleKnockout )
            {
            // InternalMyDsl.g:291:2: (this_League_0= ruleLeague | this_RoundRobin_1= ruleRoundRobin | this_Knockout_2= ruleKnockout )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt5=1;
                }
                break;
            case 51:
                {
                alt5=2;
                }
                break;
            case 56:
            case 57:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:292:3: this_League_0= ruleLeague
                    {

                    			newCompositeNode(grammarAccess.getTournamentFormatAccess().getLeagueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_League_0=ruleLeague();

                    state._fsp--;


                    			current = this_League_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:301:3: this_RoundRobin_1= ruleRoundRobin
                    {

                    			newCompositeNode(grammarAccess.getTournamentFormatAccess().getRoundRobinParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoundRobin_1=ruleRoundRobin();

                    state._fsp--;


                    			current = this_RoundRobin_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:310:3: this_Knockout_2= ruleKnockout
                    {

                    			newCompositeNode(grammarAccess.getTournamentFormatAccess().getKnockoutParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Knockout_2=ruleKnockout();

                    state._fsp--;


                    			current = this_Knockout_2;
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
    // $ANTLR end "ruleTournamentFormat"


    // $ANTLR start "entryRulePlayerStatistics"
    // InternalMyDsl.g:322:1: entryRulePlayerStatistics returns [EObject current=null] : iv_rulePlayerStatistics= rulePlayerStatistics EOF ;
    public final EObject entryRulePlayerStatistics() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayerStatistics = null;


        try {
            // InternalMyDsl.g:322:57: (iv_rulePlayerStatistics= rulePlayerStatistics EOF )
            // InternalMyDsl.g:323:2: iv_rulePlayerStatistics= rulePlayerStatistics EOF
            {
             newCompositeNode(grammarAccess.getPlayerStatisticsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayerStatistics=rulePlayerStatistics();

            state._fsp--;

             current =iv_rulePlayerStatistics; 
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
    // $ANTLR end "entryRulePlayerStatistics"


    // $ANTLR start "rulePlayerStatistics"
    // InternalMyDsl.g:329:1: rulePlayerStatistics returns [EObject current=null] : (this_Defender_0= ruleDefender | this_Goalkeeper_1= ruleGoalkeeper | this_Attacker_2= ruleAttacker ) ;
    public final EObject rulePlayerStatistics() throws RecognitionException {
        EObject current = null;

        EObject this_Defender_0 = null;

        EObject this_Goalkeeper_1 = null;

        EObject this_Attacker_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:335:2: ( (this_Defender_0= ruleDefender | this_Goalkeeper_1= ruleGoalkeeper | this_Attacker_2= ruleAttacker ) )
            // InternalMyDsl.g:336:2: (this_Defender_0= ruleDefender | this_Goalkeeper_1= ruleGoalkeeper | this_Attacker_2= ruleAttacker )
            {
            // InternalMyDsl.g:336:2: (this_Defender_0= ruleDefender | this_Goalkeeper_1= ruleGoalkeeper | this_Attacker_2= ruleAttacker )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:337:3: this_Defender_0= ruleDefender
                    {

                    			newCompositeNode(grammarAccess.getPlayerStatisticsAccess().getDefenderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Defender_0=ruleDefender();

                    state._fsp--;


                    			current = this_Defender_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:346:3: this_Goalkeeper_1= ruleGoalkeeper
                    {

                    			newCompositeNode(grammarAccess.getPlayerStatisticsAccess().getGoalkeeperParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goalkeeper_1=ruleGoalkeeper();

                    state._fsp--;


                    			current = this_Goalkeeper_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:355:3: this_Attacker_2= ruleAttacker
                    {

                    			newCompositeNode(grammarAccess.getPlayerStatisticsAccess().getAttackerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attacker_2=ruleAttacker();

                    state._fsp--;


                    			current = this_Attacker_2;
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
    // $ANTLR end "rulePlayerStatistics"


    // $ANTLR start "entryRuleMatchRules"
    // InternalMyDsl.g:367:1: entryRuleMatchRules returns [EObject current=null] : iv_ruleMatchRules= ruleMatchRules EOF ;
    public final EObject entryRuleMatchRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchRules = null;


        try {
            // InternalMyDsl.g:367:51: (iv_ruleMatchRules= ruleMatchRules EOF )
            // InternalMyDsl.g:368:2: iv_ruleMatchRules= ruleMatchRules EOF
            {
             newCompositeNode(grammarAccess.getMatchRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatchRules=ruleMatchRules();

            state._fsp--;

             current =iv_ruleMatchRules; 
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
    // $ANTLR end "entryRuleMatchRules"


    // $ANTLR start "ruleMatchRules"
    // InternalMyDsl.g:374:1: ruleMatchRules returns [EObject current=null] : (this_Standard_0= ruleStandard | this_ExtraTime_1= ruleExtraTime | this_PenaltyShootout_2= rulePenaltyShootout | this_GroupStage_3= ruleGroupStage ) ;
    public final EObject ruleMatchRules() throws RecognitionException {
        EObject current = null;

        EObject this_Standard_0 = null;

        EObject this_ExtraTime_1 = null;

        EObject this_PenaltyShootout_2 = null;

        EObject this_GroupStage_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:380:2: ( (this_Standard_0= ruleStandard | this_ExtraTime_1= ruleExtraTime | this_PenaltyShootout_2= rulePenaltyShootout | this_GroupStage_3= ruleGroupStage ) )
            // InternalMyDsl.g:381:2: (this_Standard_0= ruleStandard | this_ExtraTime_1= ruleExtraTime | this_PenaltyShootout_2= rulePenaltyShootout | this_GroupStage_3= ruleGroupStage )
            {
            // InternalMyDsl.g:381:2: (this_Standard_0= ruleStandard | this_ExtraTime_1= ruleExtraTime | this_PenaltyShootout_2= rulePenaltyShootout | this_GroupStage_3= ruleGroupStage )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt7=1;
                }
                break;
            case 72:
                {
                alt7=2;
                }
                break;
            case 74:
                {
                alt7=3;
                }
                break;
            case 75:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:382:3: this_Standard_0= ruleStandard
                    {

                    			newCompositeNode(grammarAccess.getMatchRulesAccess().getStandardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Standard_0=ruleStandard();

                    state._fsp--;


                    			current = this_Standard_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:391:3: this_ExtraTime_1= ruleExtraTime
                    {

                    			newCompositeNode(grammarAccess.getMatchRulesAccess().getExtraTimeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtraTime_1=ruleExtraTime();

                    state._fsp--;


                    			current = this_ExtraTime_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:400:3: this_PenaltyShootout_2= rulePenaltyShootout
                    {

                    			newCompositeNode(grammarAccess.getMatchRulesAccess().getPenaltyShootoutParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PenaltyShootout_2=rulePenaltyShootout();

                    state._fsp--;


                    			current = this_PenaltyShootout_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:409:3: this_GroupStage_3= ruleGroupStage
                    {

                    			newCompositeNode(grammarAccess.getMatchRulesAccess().getGroupStageParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupStage_3=ruleGroupStage();

                    state._fsp--;


                    			current = this_GroupStage_3;
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
    // $ANTLR end "ruleMatchRules"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:421:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:421:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:422:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:428:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:434:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:435:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:435:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:436:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:444:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTeam"
    // InternalMyDsl.g:455:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalMyDsl.g:455:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalMyDsl.g:456:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalMyDsl.g:462:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'Team' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) ) )? (otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) ) )? otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_teamSize_4_0 = null;

        AntlrDatatypeRuleToken lv_managerName_6_0 = null;

        EObject lv_players_9_0 = null;

        EObject lv_players_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:468:2: ( (otherlv_0= 'Team' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) ) )? (otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) ) )? otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalMyDsl.g:469:2: (otherlv_0= 'Team' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) ) )? (otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) ) )? otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalMyDsl.g:469:2: (otherlv_0= 'Team' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) ) )? (otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) ) )? otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalMyDsl.g:470:3: otherlv_0= 'Team' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) ) )? (otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) ) )? otherlv_7= 'players' otherlv_8= '{' ( (lv_players_9_0= rulePlayer ) ) (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalMyDsl.g:474:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:475:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:475:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:476:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:497:3: (otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:498:4: otherlv_3= 'teamSize' ( (lv_teamSize_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getTeamAccess().getTeamSizeKeyword_3_0());
                    			
                    // InternalMyDsl.g:502:4: ( (lv_teamSize_4_0= ruleEInt ) )
                    // InternalMyDsl.g:503:5: (lv_teamSize_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:503:5: (lv_teamSize_4_0= ruleEInt )
                    // InternalMyDsl.g:504:6: lv_teamSize_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTeamAccess().getTeamSizeEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_teamSize_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeamRule());
                    						}
                    						set(
                    							current,
                    							"teamSize",
                    							lv_teamSize_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:522:3: (otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:523:4: otherlv_5= 'managerName' ( (lv_managerName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeamAccess().getManagerNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:527:4: ( (lv_managerName_6_0= ruleEString ) )
                    // InternalMyDsl.g:528:5: (lv_managerName_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:528:5: (lv_managerName_6_0= ruleEString )
                    // InternalMyDsl.g:529:6: lv_managerName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTeamAccess().getManagerNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_managerName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTeamRule());
                    						}
                    						set(
                    							current,
                    							"managerName",
                    							lv_managerName_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTeamAccess().getPlayersKeyword_5());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:555:3: ( (lv_players_9_0= rulePlayer ) )
            // InternalMyDsl.g:556:4: (lv_players_9_0= rulePlayer )
            {
            // InternalMyDsl.g:556:4: (lv_players_9_0= rulePlayer )
            // InternalMyDsl.g:557:5: lv_players_9_0= rulePlayer
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_players_9_0=rulePlayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					add(
            						current,
            						"players",
            						lv_players_9_0,
            						"org.xtext.example.mydsl.MyDsl.Player");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:574:3: (otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:575:4: otherlv_10= ',' ( (lv_players_11_0= rulePlayer ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTeamAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:579:4: ( (lv_players_11_0= rulePlayer ) )
            	    // InternalMyDsl.g:580:5: (lv_players_11_0= rulePlayer )
            	    {
            	    // InternalMyDsl.g:580:5: (lv_players_11_0= rulePlayer )
            	    // InternalMyDsl.g:581:6: lv_players_11_0= rulePlayer
            	    {

            	    						newCompositeNode(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_players_11_0=rulePlayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTeamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"players",
            	    							lv_players_11_0,
            	    							"org.xtext.example.mydsl.MyDsl.Player");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleBracket"
    // InternalMyDsl.g:611:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalMyDsl.g:611:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalMyDsl.g:612:2: iv_ruleBracket= ruleBracket EOF
            {
             newCompositeNode(grammarAccess.getBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracket=ruleBracket();

            state._fsp--;

             current =iv_ruleBracket; 
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
    // $ANTLR end "entryRuleBracket"


    // $ANTLR start "ruleBracket"
    // InternalMyDsl.g:618:1: ruleBracket returns [EObject current=null] : (otherlv_0= 'Bracket' otherlv_1= '{' (otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) ) )? (otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) ) ) otherlv_6= 'matches' otherlv_7= '{' ( (lv_matches_8_0= ruleMatch ) ) (otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_rounds_3_0 = null;

        Enumerator lv_bracketSide_5_0 = null;

        EObject lv_matches_8_0 = null;

        EObject lv_matches_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:624:2: ( (otherlv_0= 'Bracket' otherlv_1= '{' (otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) ) )? (otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) ) ) otherlv_6= 'matches' otherlv_7= '{' ( (lv_matches_8_0= ruleMatch ) ) (otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalMyDsl.g:625:2: (otherlv_0= 'Bracket' otherlv_1= '{' (otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) ) )? (otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) ) ) otherlv_6= 'matches' otherlv_7= '{' ( (lv_matches_8_0= ruleMatch ) ) (otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalMyDsl.g:625:2: (otherlv_0= 'Bracket' otherlv_1= '{' (otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) ) )? (otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) ) ) otherlv_6= 'matches' otherlv_7= '{' ( (lv_matches_8_0= ruleMatch ) ) (otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalMyDsl.g:626:3: otherlv_0= 'Bracket' otherlv_1= '{' (otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) ) )? (otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) ) ) otherlv_6= 'matches' otherlv_7= '{' ( (lv_matches_8_0= ruleMatch ) ) (otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) ) )* otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBracketAccess().getBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBracketAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:634:3: (otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:635:4: otherlv_2= 'rounds' ( (lv_rounds_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getBracketAccess().getRoundsKeyword_2_0());
                    			
                    // InternalMyDsl.g:639:4: ( (lv_rounds_3_0= ruleEInt ) )
                    // InternalMyDsl.g:640:5: (lv_rounds_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:640:5: (lv_rounds_3_0= ruleEInt )
                    // InternalMyDsl.g:641:6: lv_rounds_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBracketAccess().getRoundsEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_rounds_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBracketRule());
                    						}
                    						set(
                    							current,
                    							"rounds",
                    							lv_rounds_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:659:3: (otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) ) )
            // InternalMyDsl.g:660:4: otherlv_4= 'bracketSide' ( (lv_bracketSide_5_0= ruleBracketSide ) )
            {
            otherlv_4=(Token)match(input,26,FOLLOW_22); 

            				newLeafNode(otherlv_4, grammarAccess.getBracketAccess().getBracketSideKeyword_3_0());
            			
            // InternalMyDsl.g:664:4: ( (lv_bracketSide_5_0= ruleBracketSide ) )
            // InternalMyDsl.g:665:5: (lv_bracketSide_5_0= ruleBracketSide )
            {
            // InternalMyDsl.g:665:5: (lv_bracketSide_5_0= ruleBracketSide )
            // InternalMyDsl.g:666:6: lv_bracketSide_5_0= ruleBracketSide
            {

            						newCompositeNode(grammarAccess.getBracketAccess().getBracketSideBracketSideEnumRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_23);
            lv_bracketSide_5_0=ruleBracketSide();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBracketRule());
            						}
            						set(
            							current,
            							"bracketSide",
            							lv_bracketSide_5_0,
            							"org.xtext.example.mydsl.MyDsl.BracketSide");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getBracketAccess().getMatchesKeyword_4());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getBracketAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:692:3: ( (lv_matches_8_0= ruleMatch ) )
            // InternalMyDsl.g:693:4: (lv_matches_8_0= ruleMatch )
            {
            // InternalMyDsl.g:693:4: (lv_matches_8_0= ruleMatch )
            // InternalMyDsl.g:694:5: lv_matches_8_0= ruleMatch
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getMatchesMatchParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_matches_8_0=ruleMatch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBracketRule());
            					}
            					add(
            						current,
            						"matches",
            						lv_matches_8_0,
            						"org.xtext.example.mydsl.MyDsl.Match");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:711:3: (otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:712:4: otherlv_9= ',' ( (lv_matches_10_0= ruleMatch ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_9, grammarAccess.getBracketAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:716:4: ( (lv_matches_10_0= ruleMatch ) )
            	    // InternalMyDsl.g:717:5: (lv_matches_10_0= ruleMatch )
            	    {
            	    // InternalMyDsl.g:717:5: (lv_matches_10_0= ruleMatch )
            	    // InternalMyDsl.g:718:6: lv_matches_10_0= ruleMatch
            	    {

            	    						newCompositeNode(grammarAccess.getBracketAccess().getMatchesMatchParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_matches_10_0=ruleMatch();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBracketRule());
            	    						}
            	    						add(
            	    							current,
            	    							"matches",
            	    							lv_matches_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.Match");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getBracketAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getBracketAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleBracket"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:748:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:748:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:749:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:755:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:761:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:762:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:762:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:763:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:763:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:764:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePlayer"
    // InternalMyDsl.g:781:1: entryRulePlayer returns [EObject current=null] : iv_rulePlayer= rulePlayer EOF ;
    public final EObject entryRulePlayer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayer = null;


        try {
            // InternalMyDsl.g:781:47: (iv_rulePlayer= rulePlayer EOF )
            // InternalMyDsl.g:782:2: iv_rulePlayer= rulePlayer EOF
            {
             newCompositeNode(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayer=rulePlayer();

            state._fsp--;

             current =iv_rulePlayer; 
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
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalMyDsl.g:788:1: rulePlayer returns [EObject current=null] : (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) ) ) (otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) ) )? (otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) ) ) otherlv_9= 'playerstatistics' ( (lv_playerstatistics_10_0= rulePlayerStatistics ) ) otherlv_11= '}' ) ;
    public final EObject rulePlayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_position_4_0 = null;

        AntlrDatatypeRuleToken lv_birthDate_6_0 = null;

        AntlrDatatypeRuleToken lv_number_8_0 = null;

        EObject lv_playerstatistics_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:794:2: ( (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) ) ) (otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) ) )? (otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) ) ) otherlv_9= 'playerstatistics' ( (lv_playerstatistics_10_0= rulePlayerStatistics ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:795:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) ) ) (otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) ) )? (otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) ) ) otherlv_9= 'playerstatistics' ( (lv_playerstatistics_10_0= rulePlayerStatistics ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:795:2: (otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) ) ) (otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) ) )? (otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) ) ) otherlv_9= 'playerstatistics' ( (lv_playerstatistics_10_0= rulePlayerStatistics ) ) otherlv_11= '}' )
            // InternalMyDsl.g:796:3: otherlv_0= 'Player' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) ) ) (otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) ) )? (otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) ) ) otherlv_9= 'playerstatistics' ( (lv_playerstatistics_10_0= rulePlayerStatistics ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayerAccess().getPlayerKeyword_0());
            		
            // InternalMyDsl.g:800:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:801:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:801:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:802:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:823:3: (otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) ) )
            // InternalMyDsl.g:824:4: otherlv_3= 'position' ( (lv_position_4_0= rulePlayerPosition ) )
            {
            otherlv_3=(Token)match(input,30,FOLLOW_27); 

            				newLeafNode(otherlv_3, grammarAccess.getPlayerAccess().getPositionKeyword_3_0());
            			
            // InternalMyDsl.g:828:4: ( (lv_position_4_0= rulePlayerPosition ) )
            // InternalMyDsl.g:829:5: (lv_position_4_0= rulePlayerPosition )
            {
            // InternalMyDsl.g:829:5: (lv_position_4_0= rulePlayerPosition )
            // InternalMyDsl.g:830:6: lv_position_4_0= rulePlayerPosition
            {

            						newCompositeNode(grammarAccess.getPlayerAccess().getPositionPlayerPositionEnumRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_28);
            lv_position_4_0=rulePlayerPosition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPlayerRule());
            						}
            						set(
            							current,
            							"position",
            							lv_position_4_0,
            							"org.xtext.example.mydsl.MyDsl.PlayerPosition");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:848:3: (otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:849:4: otherlv_5= 'birthDate' ( (lv_birthDate_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getPlayerAccess().getBirthDateKeyword_4_0());
                    			
                    // InternalMyDsl.g:853:4: ( (lv_birthDate_6_0= ruleEDate ) )
                    // InternalMyDsl.g:854:5: (lv_birthDate_6_0= ruleEDate )
                    {
                    // InternalMyDsl.g:854:5: (lv_birthDate_6_0= ruleEDate )
                    // InternalMyDsl.g:855:6: lv_birthDate_6_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getPlayerAccess().getBirthDateEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_birthDate_6_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlayerRule());
                    						}
                    						set(
                    							current,
                    							"birthDate",
                    							lv_birthDate_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:873:3: (otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) ) )
            // InternalMyDsl.g:874:4: otherlv_7= 'number' ( (lv_number_8_0= ruleEInt ) )
            {
            otherlv_7=(Token)match(input,32,FOLLOW_16); 

            				newLeafNode(otherlv_7, grammarAccess.getPlayerAccess().getNumberKeyword_5_0());
            			
            // InternalMyDsl.g:878:4: ( (lv_number_8_0= ruleEInt ) )
            // InternalMyDsl.g:879:5: (lv_number_8_0= ruleEInt )
            {
            // InternalMyDsl.g:879:5: (lv_number_8_0= ruleEInt )
            // InternalMyDsl.g:880:6: lv_number_8_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getPlayerAccess().getNumberEIntParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_31);
            lv_number_8_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPlayerRule());
            						}
            						set(
            							current,
            							"number",
            							lv_number_8_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_9=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_9, grammarAccess.getPlayerAccess().getPlayerstatisticsKeyword_6());
            		
            // InternalMyDsl.g:902:3: ( (lv_playerstatistics_10_0= rulePlayerStatistics ) )
            // InternalMyDsl.g:903:4: (lv_playerstatistics_10_0= rulePlayerStatistics )
            {
            // InternalMyDsl.g:903:4: (lv_playerstatistics_10_0= rulePlayerStatistics )
            // InternalMyDsl.g:904:5: lv_playerstatistics_10_0= rulePlayerStatistics
            {

            					newCompositeNode(grammarAccess.getPlayerAccess().getPlayerstatisticsPlayerStatisticsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_playerstatistics_10_0=rulePlayerStatistics();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlayerRule());
            					}
            					set(
            						current,
            						"playerstatistics",
            						lv_playerstatistics_10_0,
            						"org.xtext.example.mydsl.MyDsl.PlayerStatistics");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:929:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalMyDsl.g:929:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalMyDsl.g:930:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMyDsl.g:936:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_0= RULE_DATE ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:942:2: (this_DATE_0= RULE_DATE )
            // InternalMyDsl.g:943:2: this_DATE_0= RULE_DATE
            {
            this_DATE_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            		current.merge(this_DATE_0);
            	

            		newLeafNode(this_DATE_0, grammarAccess.getEDateAccess().getDATETerminalRuleCall());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleDefender"
    // InternalMyDsl.g:953:1: entryRuleDefender returns [EObject current=null] : iv_ruleDefender= ruleDefender EOF ;
    public final EObject entryRuleDefender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefender = null;


        try {
            // InternalMyDsl.g:953:49: (iv_ruleDefender= ruleDefender EOF )
            // InternalMyDsl.g:954:2: iv_ruleDefender= ruleDefender EOF
            {
             newCompositeNode(grammarAccess.getDefenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefender=ruleDefender();

            state._fsp--;

             current =iv_ruleDefender; 
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
    // $ANTLR end "entryRuleDefender"


    // $ANTLR start "ruleDefender"
    // InternalMyDsl.g:960:1: ruleDefender returns [EObject current=null] : ( () otherlv_1= 'Defender' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleDefender() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_goals_4_0 = null;

        AntlrDatatypeRuleToken lv_assists_6_0 = null;

        AntlrDatatypeRuleToken lv_fouls_8_0 = null;

        AntlrDatatypeRuleToken lv_yellowCards_10_0 = null;

        AntlrDatatypeRuleToken lv_redCards_12_0 = null;

        AntlrDatatypeRuleToken lv_cleansheets_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:966:2: ( ( () otherlv_1= 'Defender' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:967:2: ( () otherlv_1= 'Defender' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:967:2: ( () otherlv_1= 'Defender' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:968:3: () otherlv_1= 'Defender' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:968:3: ()
            // InternalMyDsl.g:969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefenderAccess().getDefenderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefenderAccess().getDefenderKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDefenderAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:983:3: (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:984:4: otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getDefenderAccess().getGoalsKeyword_3_0());
                    			
                    // InternalMyDsl.g:988:4: ( (lv_goals_4_0= ruleEInt ) )
                    // InternalMyDsl.g:989:5: (lv_goals_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:989:5: (lv_goals_4_0= ruleEInt )
                    // InternalMyDsl.g:990:6: lv_goals_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefenderAccess().getGoalsEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_goals_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefenderRule());
                    						}
                    						set(
                    							current,
                    							"goals",
                    							lv_goals_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1008:3: (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1009:4: otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getDefenderAccess().getAssistsKeyword_4_0());
                    			
                    // InternalMyDsl.g:1013:4: ( (lv_assists_6_0= ruleEInt ) )
                    // InternalMyDsl.g:1014:5: (lv_assists_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1014:5: (lv_assists_6_0= ruleEInt )
                    // InternalMyDsl.g:1015:6: lv_assists_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefenderAccess().getAssistsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_assists_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefenderRule());
                    						}
                    						set(
                    							current,
                    							"assists",
                    							lv_assists_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1033:3: (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1034:4: otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getDefenderAccess().getFoulsKeyword_5_0());
                    			
                    // InternalMyDsl.g:1038:4: ( (lv_fouls_8_0= ruleEInt ) )
                    // InternalMyDsl.g:1039:5: (lv_fouls_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1039:5: (lv_fouls_8_0= ruleEInt )
                    // InternalMyDsl.g:1040:6: lv_fouls_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefenderAccess().getFoulsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_fouls_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefenderRule());
                    						}
                    						set(
                    							current,
                    							"fouls",
                    							lv_fouls_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1058:3: (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1059:4: otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getDefenderAccess().getYellowCardsKeyword_6_0());
                    			
                    // InternalMyDsl.g:1063:4: ( (lv_yellowCards_10_0= ruleEInt ) )
                    // InternalMyDsl.g:1064:5: (lv_yellowCards_10_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1064:5: (lv_yellowCards_10_0= ruleEInt )
                    // InternalMyDsl.g:1065:6: lv_yellowCards_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefenderAccess().getYellowCardsEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_yellowCards_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefenderRule());
                    						}
                    						set(
                    							current,
                    							"yellowCards",
                    							lv_yellowCards_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1083:3: (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1084:4: otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getDefenderAccess().getRedCardsKeyword_7_0());
                    			
                    // InternalMyDsl.g:1088:4: ( (lv_redCards_12_0= ruleEInt ) )
                    // InternalMyDsl.g:1089:5: (lv_redCards_12_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1089:5: (lv_redCards_12_0= ruleEInt )
                    // InternalMyDsl.g:1090:6: lv_redCards_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefenderAccess().getRedCardsEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_redCards_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefenderRule());
                    						}
                    						set(
                    							current,
                    							"redCards",
                    							lv_redCards_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1108:3: (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1109:4: otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getDefenderAccess().getCleansheetsKeyword_8_0());
                    			
                    // InternalMyDsl.g:1113:4: ( (lv_cleansheets_14_0= ruleEInt ) )
                    // InternalMyDsl.g:1114:5: (lv_cleansheets_14_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1114:5: (lv_cleansheets_14_0= ruleEInt )
                    // InternalMyDsl.g:1115:6: lv_cleansheets_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDefenderAccess().getCleansheetsEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_cleansheets_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefenderRule());
                    						}
                    						set(
                    							current,
                    							"cleansheets",
                    							lv_cleansheets_14_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDefenderAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleDefender"


    // $ANTLR start "entryRuleGoalkeeper"
    // InternalMyDsl.g:1141:1: entryRuleGoalkeeper returns [EObject current=null] : iv_ruleGoalkeeper= ruleGoalkeeper EOF ;
    public final EObject entryRuleGoalkeeper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalkeeper = null;


        try {
            // InternalMyDsl.g:1141:51: (iv_ruleGoalkeeper= ruleGoalkeeper EOF )
            // InternalMyDsl.g:1142:2: iv_ruleGoalkeeper= ruleGoalkeeper EOF
            {
             newCompositeNode(grammarAccess.getGoalkeeperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalkeeper=ruleGoalkeeper();

            state._fsp--;

             current =iv_ruleGoalkeeper; 
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
    // $ANTLR end "entryRuleGoalkeeper"


    // $ANTLR start "ruleGoalkeeper"
    // InternalMyDsl.g:1148:1: ruleGoalkeeper returns [EObject current=null] : ( () otherlv_1= 'Goalkeeper' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? (otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleGoalkeeper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_goals_4_0 = null;

        AntlrDatatypeRuleToken lv_assists_6_0 = null;

        AntlrDatatypeRuleToken lv_fouls_8_0 = null;

        AntlrDatatypeRuleToken lv_yellowCards_10_0 = null;

        AntlrDatatypeRuleToken lv_redCards_12_0 = null;

        AntlrDatatypeRuleToken lv_cleansheets_14_0 = null;

        AntlrDatatypeRuleToken lv_saves_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1154:2: ( ( () otherlv_1= 'Goalkeeper' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? (otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) ) )? otherlv_17= '}' ) )
            // InternalMyDsl.g:1155:2: ( () otherlv_1= 'Goalkeeper' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? (otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) ) )? otherlv_17= '}' )
            {
            // InternalMyDsl.g:1155:2: ( () otherlv_1= 'Goalkeeper' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? (otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) ) )? otherlv_17= '}' )
            // InternalMyDsl.g:1156:3: () otherlv_1= 'Goalkeeper' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )? (otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) ) )? otherlv_17= '}'
            {
            // InternalMyDsl.g:1156:3: ()
            // InternalMyDsl.g:1157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGoalkeeperAccess().getGoalkeeperAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGoalkeeperAccess().getGoalkeeperKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getGoalkeeperAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1171:3: (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1172:4: otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getGoalkeeperAccess().getGoalsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1176:4: ( (lv_goals_4_0= ruleEInt ) )
                    // InternalMyDsl.g:1177:5: (lv_goals_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1177:5: (lv_goals_4_0= ruleEInt )
                    // InternalMyDsl.g:1178:6: lv_goals_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getGoalsEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_goals_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"goals",
                    							lv_goals_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1196:3: (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1197:4: otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getGoalkeeperAccess().getAssistsKeyword_4_0());
                    			
                    // InternalMyDsl.g:1201:4: ( (lv_assists_6_0= ruleEInt ) )
                    // InternalMyDsl.g:1202:5: (lv_assists_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1202:5: (lv_assists_6_0= ruleEInt )
                    // InternalMyDsl.g:1203:6: lv_assists_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getAssistsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_assists_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"assists",
                    							lv_assists_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1221:3: (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1222:4: otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getGoalkeeperAccess().getFoulsKeyword_5_0());
                    			
                    // InternalMyDsl.g:1226:4: ( (lv_fouls_8_0= ruleEInt ) )
                    // InternalMyDsl.g:1227:5: (lv_fouls_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1227:5: (lv_fouls_8_0= ruleEInt )
                    // InternalMyDsl.g:1228:6: lv_fouls_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getFoulsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_fouls_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"fouls",
                    							lv_fouls_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1246:3: (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1247:4: otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getGoalkeeperAccess().getYellowCardsKeyword_6_0());
                    			
                    // InternalMyDsl.g:1251:4: ( (lv_yellowCards_10_0= ruleEInt ) )
                    // InternalMyDsl.g:1252:5: (lv_yellowCards_10_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1252:5: (lv_yellowCards_10_0= ruleEInt )
                    // InternalMyDsl.g:1253:6: lv_yellowCards_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getYellowCardsEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_yellowCards_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"yellowCards",
                    							lv_yellowCards_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1271:3: (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1272:4: otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getGoalkeeperAccess().getRedCardsKeyword_7_0());
                    			
                    // InternalMyDsl.g:1276:4: ( (lv_redCards_12_0= ruleEInt ) )
                    // InternalMyDsl.g:1277:5: (lv_redCards_12_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1277:5: (lv_redCards_12_0= ruleEInt )
                    // InternalMyDsl.g:1278:6: lv_redCards_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getRedCardsEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_redCards_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"redCards",
                    							lv_redCards_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1296:3: (otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1297:4: otherlv_13= 'cleansheets' ( (lv_cleansheets_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getGoalkeeperAccess().getCleansheetsKeyword_8_0());
                    			
                    // InternalMyDsl.g:1301:4: ( (lv_cleansheets_14_0= ruleEInt ) )
                    // InternalMyDsl.g:1302:5: (lv_cleansheets_14_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1302:5: (lv_cleansheets_14_0= ruleEInt )
                    // InternalMyDsl.g:1303:6: lv_cleansheets_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getCleansheetsEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_cleansheets_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"cleansheets",
                    							lv_cleansheets_14_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1321:3: (otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1322:4: otherlv_15= 'saves' ( (lv_saves_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,42,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getGoalkeeperAccess().getSavesKeyword_9_0());
                    			
                    // InternalMyDsl.g:1326:4: ( (lv_saves_16_0= ruleEInt ) )
                    // InternalMyDsl.g:1327:5: (lv_saves_16_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1327:5: (lv_saves_16_0= ruleEInt )
                    // InternalMyDsl.g:1328:6: lv_saves_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getGoalkeeperAccess().getSavesEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_saves_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGoalkeeperRule());
                    						}
                    						set(
                    							current,
                    							"saves",
                    							lv_saves_16_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getGoalkeeperAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleGoalkeeper"


    // $ANTLR start "entryRuleAttacker"
    // InternalMyDsl.g:1354:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // InternalMyDsl.g:1354:49: (iv_ruleAttacker= ruleAttacker EOF )
            // InternalMyDsl.g:1355:2: iv_ruleAttacker= ruleAttacker EOF
            {
             newCompositeNode(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttacker=ruleAttacker();

            state._fsp--;

             current =iv_ruleAttacker; 
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
    // $ANTLR end "entryRuleAttacker"


    // $ANTLR start "ruleAttacker"
    // InternalMyDsl.g:1361:1: ruleAttacker returns [EObject current=null] : ( () otherlv_1= 'Attacker' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_goals_4_0 = null;

        AntlrDatatypeRuleToken lv_assists_6_0 = null;

        AntlrDatatypeRuleToken lv_fouls_8_0 = null;

        AntlrDatatypeRuleToken lv_yellowCards_10_0 = null;

        AntlrDatatypeRuleToken lv_redCards_12_0 = null;

        AntlrDatatypeRuleToken lv_sprintSpeed_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1367:2: ( ( () otherlv_1= 'Attacker' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:1368:2: ( () otherlv_1= 'Attacker' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:1368:2: ( () otherlv_1= 'Attacker' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:1369:3: () otherlv_1= 'Attacker' otherlv_2= '{' (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )? (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )? (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )? (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )? (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )? (otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:1369:3: ()
            // InternalMyDsl.g:1370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttackerAccess().getAttackerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackerAccess().getAttackerKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getAttackerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1384:3: (otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1385:4: otherlv_3= 'goals' ( (lv_goals_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttackerAccess().getGoalsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1389:4: ( (lv_goals_4_0= ruleEInt ) )
                    // InternalMyDsl.g:1390:5: (lv_goals_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1390:5: (lv_goals_4_0= ruleEInt )
                    // InternalMyDsl.g:1391:6: lv_goals_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAttackerAccess().getGoalsEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_goals_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttackerRule());
                    						}
                    						set(
                    							current,
                    							"goals",
                    							lv_goals_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1409:3: (otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1410:4: otherlv_5= 'assists' ( (lv_assists_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttackerAccess().getAssistsKeyword_4_0());
                    			
                    // InternalMyDsl.g:1414:4: ( (lv_assists_6_0= ruleEInt ) )
                    // InternalMyDsl.g:1415:5: (lv_assists_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1415:5: (lv_assists_6_0= ruleEInt )
                    // InternalMyDsl.g:1416:6: lv_assists_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAttackerAccess().getAssistsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_assists_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttackerRule());
                    						}
                    						set(
                    							current,
                    							"assists",
                    							lv_assists_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1434:3: (otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1435:4: otherlv_7= 'fouls' ( (lv_fouls_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttackerAccess().getFoulsKeyword_5_0());
                    			
                    // InternalMyDsl.g:1439:4: ( (lv_fouls_8_0= ruleEInt ) )
                    // InternalMyDsl.g:1440:5: (lv_fouls_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1440:5: (lv_fouls_8_0= ruleEInt )
                    // InternalMyDsl.g:1441:6: lv_fouls_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAttackerAccess().getFoulsEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_fouls_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttackerRule());
                    						}
                    						set(
                    							current,
                    							"fouls",
                    							lv_fouls_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1459:3: (otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1460:4: otherlv_9= 'yellowCards' ( (lv_yellowCards_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttackerAccess().getYellowCardsKeyword_6_0());
                    			
                    // InternalMyDsl.g:1464:4: ( (lv_yellowCards_10_0= ruleEInt ) )
                    // InternalMyDsl.g:1465:5: (lv_yellowCards_10_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1465:5: (lv_yellowCards_10_0= ruleEInt )
                    // InternalMyDsl.g:1466:6: lv_yellowCards_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAttackerAccess().getYellowCardsEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_yellowCards_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttackerRule());
                    						}
                    						set(
                    							current,
                    							"yellowCards",
                    							lv_yellowCards_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1484:3: (otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1485:4: otherlv_11= 'redCards' ( (lv_redCards_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttackerAccess().getRedCardsKeyword_7_0());
                    			
                    // InternalMyDsl.g:1489:4: ( (lv_redCards_12_0= ruleEInt ) )
                    // InternalMyDsl.g:1490:5: (lv_redCards_12_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1490:5: (lv_redCards_12_0= ruleEInt )
                    // InternalMyDsl.g:1491:6: lv_redCards_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAttackerAccess().getRedCardsEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_redCards_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttackerRule());
                    						}
                    						set(
                    							current,
                    							"redCards",
                    							lv_redCards_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1509:3: (otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1510:4: otherlv_13= 'sprintSpeed' ( (lv_sprintSpeed_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,44,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getAttackerAccess().getSprintSpeedKeyword_8_0());
                    			
                    // InternalMyDsl.g:1514:4: ( (lv_sprintSpeed_14_0= ruleEInt ) )
                    // InternalMyDsl.g:1515:5: (lv_sprintSpeed_14_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1515:5: (lv_sprintSpeed_14_0= ruleEInt )
                    // InternalMyDsl.g:1516:6: lv_sprintSpeed_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAttackerAccess().getSprintSpeedEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_sprintSpeed_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttackerRule());
                    						}
                    						set(
                    							current,
                    							"sprintSpeed",
                    							lv_sprintSpeed_14_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAttackerAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAttacker"


    // $ANTLR start "entryRuleLeague"
    // InternalMyDsl.g:1542:1: entryRuleLeague returns [EObject current=null] : iv_ruleLeague= ruleLeague EOF ;
    public final EObject entryRuleLeague() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeague = null;


        try {
            // InternalMyDsl.g:1542:47: (iv_ruleLeague= ruleLeague EOF )
            // InternalMyDsl.g:1543:2: iv_ruleLeague= ruleLeague EOF
            {
             newCompositeNode(grammarAccess.getLeagueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeague=ruleLeague();

            state._fsp--;

             current =iv_ruleLeague; 
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
    // $ANTLR end "entryRuleLeague"


    // $ANTLR start "ruleLeague"
    // InternalMyDsl.g:1549:1: ruleLeague returns [EObject current=null] : ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) ) )? (otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleLeague() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_maxTeams_5_0 = null;

        AntlrDatatypeRuleToken lv_minTeams_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_numberOfRounds_11_0 = null;

        Enumerator lv_finalsFormat_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1555:2: ( ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) ) )? (otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) ) )? otherlv_14= '}' ) )
            // InternalMyDsl.g:1556:2: ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) ) )? (otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) ) )? otherlv_14= '}' )
            {
            // InternalMyDsl.g:1556:2: ( () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) ) )? (otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) ) )? otherlv_14= '}' )
            // InternalMyDsl.g:1557:3: () otherlv_1= 'League' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) ) )? (otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) ) )? otherlv_14= '}'
            {
            // InternalMyDsl.g:1557:3: ()
            // InternalMyDsl.g:1558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeagueAccess().getLeagueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLeagueAccess().getLeagueKeyword_1());
            		
            // InternalMyDsl.g:1568:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1569:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1569:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1570:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeagueAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeagueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getLeagueAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1591:3: (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) )
            // InternalMyDsl.g:1592:4: otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) )
            {
            otherlv_4=(Token)match(input,46,FOLLOW_16); 

            				newLeafNode(otherlv_4, grammarAccess.getLeagueAccess().getMaxTeamsKeyword_4_0());
            			
            // InternalMyDsl.g:1596:4: ( (lv_maxTeams_5_0= ruleEInt ) )
            // InternalMyDsl.g:1597:5: (lv_maxTeams_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1597:5: (lv_maxTeams_5_0= ruleEInt )
            // InternalMyDsl.g:1598:6: lv_maxTeams_5_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getLeagueAccess().getMaxTeamsEIntParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_53);
            lv_maxTeams_5_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLeagueRule());
            						}
            						set(
            							current,
            							"maxTeams",
            							lv_maxTeams_5_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1616:3: (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) )
            // InternalMyDsl.g:1617:4: otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) )
            {
            otherlv_6=(Token)match(input,47,FOLLOW_16); 

            				newLeafNode(otherlv_6, grammarAccess.getLeagueAccess().getMinTeamsKeyword_5_0());
            			
            // InternalMyDsl.g:1621:4: ( (lv_minTeams_7_0= ruleEInt ) )
            // InternalMyDsl.g:1622:5: (lv_minTeams_7_0= ruleEInt )
            {
            // InternalMyDsl.g:1622:5: (lv_minTeams_7_0= ruleEInt )
            // InternalMyDsl.g:1623:6: lv_minTeams_7_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getLeagueAccess().getMinTeamsEIntParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_54);
            lv_minTeams_7_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLeagueRule());
            						}
            						set(
            							current,
            							"minTeams",
            							lv_minTeams_7_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1641:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1642:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getLeagueAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalMyDsl.g:1646:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalMyDsl.g:1647:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalMyDsl.g:1647:5: (lv_description_9_0= ruleEString )
                    // InternalMyDsl.g:1648:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLeagueAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeagueRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1666:3: (otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1667:4: otherlv_10= 'numberOfRounds' ( (lv_numberOfRounds_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,49,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getLeagueAccess().getNumberOfRoundsKeyword_7_0());
                    			
                    // InternalMyDsl.g:1671:4: ( (lv_numberOfRounds_11_0= ruleEInt ) )
                    // InternalMyDsl.g:1672:5: (lv_numberOfRounds_11_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1672:5: (lv_numberOfRounds_11_0= ruleEInt )
                    // InternalMyDsl.g:1673:6: lv_numberOfRounds_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLeagueAccess().getNumberOfRoundsEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_numberOfRounds_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeagueRule());
                    						}
                    						set(
                    							current,
                    							"numberOfRounds",
                    							lv_numberOfRounds_11_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1691:3: (otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1692:4: otherlv_12= 'finalsFormat' ( (lv_finalsFormat_13_0= ruleFinalsFormat ) )
                    {
                    otherlv_12=(Token)match(input,50,FOLLOW_57); 

                    				newLeafNode(otherlv_12, grammarAccess.getLeagueAccess().getFinalsFormatKeyword_8_0());
                    			
                    // InternalMyDsl.g:1696:4: ( (lv_finalsFormat_13_0= ruleFinalsFormat ) )
                    // InternalMyDsl.g:1697:5: (lv_finalsFormat_13_0= ruleFinalsFormat )
                    {
                    // InternalMyDsl.g:1697:5: (lv_finalsFormat_13_0= ruleFinalsFormat )
                    // InternalMyDsl.g:1698:6: lv_finalsFormat_13_0= ruleFinalsFormat
                    {

                    						newCompositeNode(grammarAccess.getLeagueAccess().getFinalsFormatFinalsFormatEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_finalsFormat_13_0=ruleFinalsFormat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeagueRule());
                    						}
                    						set(
                    							current,
                    							"finalsFormat",
                    							lv_finalsFormat_13_0,
                    							"org.xtext.example.mydsl.MyDsl.FinalsFormat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getLeagueAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleLeague"


    // $ANTLR start "entryRuleRoundRobin"
    // InternalMyDsl.g:1724:1: entryRuleRoundRobin returns [EObject current=null] : iv_ruleRoundRobin= ruleRoundRobin EOF ;
    public final EObject entryRuleRoundRobin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundRobin = null;


        try {
            // InternalMyDsl.g:1724:51: (iv_ruleRoundRobin= ruleRoundRobin EOF )
            // InternalMyDsl.g:1725:2: iv_ruleRoundRobin= ruleRoundRobin EOF
            {
             newCompositeNode(grammarAccess.getRoundRobinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoundRobin=ruleRoundRobin();

            state._fsp--;

             current =iv_ruleRoundRobin; 
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
    // $ANTLR end "entryRuleRoundRobin"


    // $ANTLR start "ruleRoundRobin"
    // InternalMyDsl.g:1731:1: ruleRoundRobin returns [EObject current=null] : ( () otherlv_1= 'RoundRobin' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) ) ) (otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) ) ) (otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) ) ) (otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) ) ) (otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleRoundRobin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_maxTeams_5_0 = null;

        AntlrDatatypeRuleToken lv_minTeams_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_pointsForWin_11_0 = null;

        AntlrDatatypeRuleToken lv_pointsForDraw_13_0 = null;

        AntlrDatatypeRuleToken lv_pointsForLoss_15_0 = null;

        AntlrDatatypeRuleToken lv_numberOfRounds_17_0 = null;

        Enumerator lv_tieBreakerRule_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1737:2: ( ( () otherlv_1= 'RoundRobin' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) ) ) (otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) ) ) (otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) ) ) (otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) ) ) (otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) ) )? otherlv_20= '}' ) )
            // InternalMyDsl.g:1738:2: ( () otherlv_1= 'RoundRobin' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) ) ) (otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) ) ) (otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) ) ) (otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) ) ) (otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) ) )? otherlv_20= '}' )
            {
            // InternalMyDsl.g:1738:2: ( () otherlv_1= 'RoundRobin' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) ) ) (otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) ) ) (otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) ) ) (otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) ) ) (otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) ) )? otherlv_20= '}' )
            // InternalMyDsl.g:1739:3: () otherlv_1= 'RoundRobin' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) ) (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) ) ) (otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) ) ) (otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) ) ) (otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) ) ) (otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) ) )? otherlv_20= '}'
            {
            // InternalMyDsl.g:1739:3: ()
            // InternalMyDsl.g:1740:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoundRobinAccess().getRoundRobinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoundRobinAccess().getRoundRobinKeyword_1());
            		
            // InternalMyDsl.g:1750:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1751:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1751:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1752:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoundRobinAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getRoundRobinAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1773:3: (otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) ) )
            // InternalMyDsl.g:1774:4: otherlv_4= 'maxTeams' ( (lv_maxTeams_5_0= ruleEInt ) )
            {
            otherlv_4=(Token)match(input,46,FOLLOW_16); 

            				newLeafNode(otherlv_4, grammarAccess.getRoundRobinAccess().getMaxTeamsKeyword_4_0());
            			
            // InternalMyDsl.g:1778:4: ( (lv_maxTeams_5_0= ruleEInt ) )
            // InternalMyDsl.g:1779:5: (lv_maxTeams_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1779:5: (lv_maxTeams_5_0= ruleEInt )
            // InternalMyDsl.g:1780:6: lv_maxTeams_5_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getRoundRobinAccess().getMaxTeamsEIntParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_53);
            lv_maxTeams_5_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            						}
            						set(
            							current,
            							"maxTeams",
            							lv_maxTeams_5_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1798:3: (otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) ) )
            // InternalMyDsl.g:1799:4: otherlv_6= 'minTeams' ( (lv_minTeams_7_0= ruleEInt ) )
            {
            otherlv_6=(Token)match(input,47,FOLLOW_16); 

            				newLeafNode(otherlv_6, grammarAccess.getRoundRobinAccess().getMinTeamsKeyword_5_0());
            			
            // InternalMyDsl.g:1803:4: ( (lv_minTeams_7_0= ruleEInt ) )
            // InternalMyDsl.g:1804:5: (lv_minTeams_7_0= ruleEInt )
            {
            // InternalMyDsl.g:1804:5: (lv_minTeams_7_0= ruleEInt )
            // InternalMyDsl.g:1805:6: lv_minTeams_7_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getRoundRobinAccess().getMinTeamsEIntParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_58);
            lv_minTeams_7_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            						}
            						set(
            							current,
            							"minTeams",
            							lv_minTeams_7_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1823:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1824:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoundRobinAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalMyDsl.g:1828:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalMyDsl.g:1829:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalMyDsl.g:1829:5: (lv_description_9_0= ruleEString )
                    // InternalMyDsl.g:1830:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoundRobinAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1848:3: (otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) ) )
            // InternalMyDsl.g:1849:4: otherlv_10= 'pointsForWin' ( (lv_pointsForWin_11_0= ruleEInt ) )
            {
            otherlv_10=(Token)match(input,52,FOLLOW_16); 

            				newLeafNode(otherlv_10, grammarAccess.getRoundRobinAccess().getPointsForWinKeyword_7_0());
            			
            // InternalMyDsl.g:1853:4: ( (lv_pointsForWin_11_0= ruleEInt ) )
            // InternalMyDsl.g:1854:5: (lv_pointsForWin_11_0= ruleEInt )
            {
            // InternalMyDsl.g:1854:5: (lv_pointsForWin_11_0= ruleEInt )
            // InternalMyDsl.g:1855:6: lv_pointsForWin_11_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getRoundRobinAccess().getPointsForWinEIntParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_60);
            lv_pointsForWin_11_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            						}
            						set(
            							current,
            							"pointsForWin",
            							lv_pointsForWin_11_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1873:3: (otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) ) )
            // InternalMyDsl.g:1874:4: otherlv_12= 'pointsForDraw' ( (lv_pointsForDraw_13_0= ruleEInt ) )
            {
            otherlv_12=(Token)match(input,53,FOLLOW_16); 

            				newLeafNode(otherlv_12, grammarAccess.getRoundRobinAccess().getPointsForDrawKeyword_8_0());
            			
            // InternalMyDsl.g:1878:4: ( (lv_pointsForDraw_13_0= ruleEInt ) )
            // InternalMyDsl.g:1879:5: (lv_pointsForDraw_13_0= ruleEInt )
            {
            // InternalMyDsl.g:1879:5: (lv_pointsForDraw_13_0= ruleEInt )
            // InternalMyDsl.g:1880:6: lv_pointsForDraw_13_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getRoundRobinAccess().getPointsForDrawEIntParserRuleCall_8_1_0());
            					
            pushFollow(FOLLOW_61);
            lv_pointsForDraw_13_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            						}
            						set(
            							current,
            							"pointsForDraw",
            							lv_pointsForDraw_13_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1898:3: (otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) ) )
            // InternalMyDsl.g:1899:4: otherlv_14= 'pointsForLoss' ( (lv_pointsForLoss_15_0= ruleEInt ) )
            {
            otherlv_14=(Token)match(input,54,FOLLOW_16); 

            				newLeafNode(otherlv_14, grammarAccess.getRoundRobinAccess().getPointsForLossKeyword_9_0());
            			
            // InternalMyDsl.g:1903:4: ( (lv_pointsForLoss_15_0= ruleEInt ) )
            // InternalMyDsl.g:1904:5: (lv_pointsForLoss_15_0= ruleEInt )
            {
            // InternalMyDsl.g:1904:5: (lv_pointsForLoss_15_0= ruleEInt )
            // InternalMyDsl.g:1905:6: lv_pointsForLoss_15_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getRoundRobinAccess().getPointsForLossEIntParserRuleCall_9_1_0());
            					
            pushFollow(FOLLOW_62);
            lv_pointsForLoss_15_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            						}
            						set(
            							current,
            							"pointsForLoss",
            							lv_pointsForLoss_15_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1923:3: (otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) ) )
            // InternalMyDsl.g:1924:4: otherlv_16= 'numberOfRounds' ( (lv_numberOfRounds_17_0= ruleEInt ) )
            {
            otherlv_16=(Token)match(input,49,FOLLOW_16); 

            				newLeafNode(otherlv_16, grammarAccess.getRoundRobinAccess().getNumberOfRoundsKeyword_10_0());
            			
            // InternalMyDsl.g:1928:4: ( (lv_numberOfRounds_17_0= ruleEInt ) )
            // InternalMyDsl.g:1929:5: (lv_numberOfRounds_17_0= ruleEInt )
            {
            // InternalMyDsl.g:1929:5: (lv_numberOfRounds_17_0= ruleEInt )
            // InternalMyDsl.g:1930:6: lv_numberOfRounds_17_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getRoundRobinAccess().getNumberOfRoundsEIntParserRuleCall_10_1_0());
            					
            pushFollow(FOLLOW_63);
            lv_numberOfRounds_17_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
            						}
            						set(
            							current,
            							"numberOfRounds",
            							lv_numberOfRounds_17_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:1948:3: (otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1949:4: otherlv_18= 'tieBreakerRule' ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) )
                    {
                    otherlv_18=(Token)match(input,55,FOLLOW_64); 

                    				newLeafNode(otherlv_18, grammarAccess.getRoundRobinAccess().getTieBreakerRuleKeyword_11_0());
                    			
                    // InternalMyDsl.g:1953:4: ( (lv_tieBreakerRule_19_0= ruleTieBreakerRule ) )
                    // InternalMyDsl.g:1954:5: (lv_tieBreakerRule_19_0= ruleTieBreakerRule )
                    {
                    // InternalMyDsl.g:1954:5: (lv_tieBreakerRule_19_0= ruleTieBreakerRule )
                    // InternalMyDsl.g:1955:6: lv_tieBreakerRule_19_0= ruleTieBreakerRule
                    {

                    						newCompositeNode(grammarAccess.getRoundRobinAccess().getTieBreakerRuleTieBreakerRuleEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_tieBreakerRule_19_0=ruleTieBreakerRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoundRobinRule());
                    						}
                    						set(
                    							current,
                    							"tieBreakerRule",
                    							lv_tieBreakerRule_19_0,
                    							"org.xtext.example.mydsl.MyDsl.TieBreakerRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRoundRobinAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleRoundRobin"


    // $ANTLR start "entryRuleKnockout"
    // InternalMyDsl.g:1981:1: entryRuleKnockout returns [EObject current=null] : iv_ruleKnockout= ruleKnockout EOF ;
    public final EObject entryRuleKnockout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnockout = null;


        try {
            // InternalMyDsl.g:1981:49: (iv_ruleKnockout= ruleKnockout EOF )
            // InternalMyDsl.g:1982:2: iv_ruleKnockout= ruleKnockout EOF
            {
             newCompositeNode(grammarAccess.getKnockoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnockout=ruleKnockout();

            state._fsp--;

             current =iv_ruleKnockout; 
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
    // $ANTLR end "entryRuleKnockout"


    // $ANTLR start "ruleKnockout"
    // InternalMyDsl.g:1988:1: ruleKnockout returns [EObject current=null] : ( () ( (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' ) )? otherlv_2= 'Knockout' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) ) ) (otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) ) ) (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleKnockout() throws RecognitionException {
        EObject current = null;

        Token lv_hasThirdPlacePlayoff_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_maxTeams_6_0 = null;

        AntlrDatatypeRuleToken lv_minTeams_8_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;

        AntlrDatatypeRuleToken lv_numberOfRounds_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1994:2: ( ( () ( (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' ) )? otherlv_2= 'Knockout' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) ) ) (otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) ) ) (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) ) )? otherlv_13= '}' ) )
            // InternalMyDsl.g:1995:2: ( () ( (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' ) )? otherlv_2= 'Knockout' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) ) ) (otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) ) ) (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            {
            // InternalMyDsl.g:1995:2: ( () ( (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' ) )? otherlv_2= 'Knockout' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) ) ) (otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) ) ) (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) ) )? otherlv_13= '}' )
            // InternalMyDsl.g:1996:3: () ( (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' ) )? otherlv_2= 'Knockout' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) ) ) (otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) ) ) (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )? (otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) ) )? otherlv_13= '}'
            {
            // InternalMyDsl.g:1996:3: ()
            // InternalMyDsl.g:1997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKnockoutAccess().getKnockoutAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2003:3: ( (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2004:4: (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' )
                    {
                    // InternalMyDsl.g:2004:4: (lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff' )
                    // InternalMyDsl.g:2005:5: lv_hasThirdPlacePlayoff_1_0= 'hasThirdPlacePlayoff'
                    {
                    lv_hasThirdPlacePlayoff_1_0=(Token)match(input,56,FOLLOW_65); 

                    					newLeafNode(lv_hasThirdPlacePlayoff_1_0, grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffHasThirdPlacePlayoffKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKnockoutRule());
                    					}
                    					setWithLastConsumed(current, "hasThirdPlacePlayoff", lv_hasThirdPlacePlayoff_1_0 != null, "hasThirdPlacePlayoff");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getKnockoutAccess().getKnockoutKeyword_2());
            		
            // InternalMyDsl.g:2021:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:2022:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:2022:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:2023:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKnockoutAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnockoutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getKnockoutAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:2044:3: (otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) ) )
            // InternalMyDsl.g:2045:4: otherlv_5= 'maxTeams' ( (lv_maxTeams_6_0= ruleEInt ) )
            {
            otherlv_5=(Token)match(input,46,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getKnockoutAccess().getMaxTeamsKeyword_5_0());
            			
            // InternalMyDsl.g:2049:4: ( (lv_maxTeams_6_0= ruleEInt ) )
            // InternalMyDsl.g:2050:5: (lv_maxTeams_6_0= ruleEInt )
            {
            // InternalMyDsl.g:2050:5: (lv_maxTeams_6_0= ruleEInt )
            // InternalMyDsl.g:2051:6: lv_maxTeams_6_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getKnockoutAccess().getMaxTeamsEIntParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_53);
            lv_maxTeams_6_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getKnockoutRule());
            						}
            						set(
            							current,
            							"maxTeams",
            							lv_maxTeams_6_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:2069:3: (otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) ) )
            // InternalMyDsl.g:2070:4: otherlv_7= 'minTeams' ( (lv_minTeams_8_0= ruleEInt ) )
            {
            otherlv_7=(Token)match(input,47,FOLLOW_16); 

            				newLeafNode(otherlv_7, grammarAccess.getKnockoutAccess().getMinTeamsKeyword_6_0());
            			
            // InternalMyDsl.g:2074:4: ( (lv_minTeams_8_0= ruleEInt ) )
            // InternalMyDsl.g:2075:5: (lv_minTeams_8_0= ruleEInt )
            {
            // InternalMyDsl.g:2075:5: (lv_minTeams_8_0= ruleEInt )
            // InternalMyDsl.g:2076:6: lv_minTeams_8_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getKnockoutAccess().getMinTeamsEIntParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_66);
            lv_minTeams_8_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getKnockoutRule());
            						}
            						set(
            							current,
            							"minTeams",
            							lv_minTeams_8_0,
            							"org.xtext.example.mydsl.MyDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:2094:3: (otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2095:4: otherlv_9= 'description' ( (lv_description_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getKnockoutAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalMyDsl.g:2099:4: ( (lv_description_10_0= ruleEString ) )
                    // InternalMyDsl.g:2100:5: (lv_description_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:2100:5: (lv_description_10_0= ruleEString )
                    // InternalMyDsl.g:2101:6: lv_description_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKnockoutAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_description_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnockoutRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2119:3: (otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2120:4: otherlv_11= 'numberOfRounds' ( (lv_numberOfRounds_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,49,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getKnockoutAccess().getNumberOfRoundsKeyword_8_0());
                    			
                    // InternalMyDsl.g:2124:4: ( (lv_numberOfRounds_12_0= ruleEInt ) )
                    // InternalMyDsl.g:2125:5: (lv_numberOfRounds_12_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2125:5: (lv_numberOfRounds_12_0= ruleEInt )
                    // InternalMyDsl.g:2126:6: lv_numberOfRounds_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getKnockoutAccess().getNumberOfRoundsEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_numberOfRounds_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKnockoutRule());
                    						}
                    						set(
                    							current,
                    							"numberOfRounds",
                    							lv_numberOfRounds_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getKnockoutAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleKnockout"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:2152:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:2152:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:2153:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:2159:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2165:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:2166:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:2166:2: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==58) ) {
                alt43=1;
            }
            else if ( (LA43_0==59) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2167:3: kw= 'true'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2173:3: kw= 'false'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleMatch"
    // InternalMyDsl.g:2182:1: entryRuleMatch returns [EObject current=null] : iv_ruleMatch= ruleMatch EOF ;
    public final EObject entryRuleMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatch = null;


        try {
            // InternalMyDsl.g:2182:46: (iv_ruleMatch= ruleMatch EOF )
            // InternalMyDsl.g:2183:2: iv_ruleMatch= ruleMatch EOF
            {
             newCompositeNode(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatch=ruleMatch();

            state._fsp--;

             current =iv_ruleMatch; 
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
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalMyDsl.g:2189:1: ruleMatch returns [EObject current=null] : (otherlv_0= 'Match' otherlv_1= '{' (otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) ) )? (otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) ) )? (otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) ) )? (otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) ) ) otherlv_10= 'teams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'matchrules' ( (lv_matchrules_17_0= ruleMatchRules ) ) otherlv_18= '}' ) ;
    public final EObject ruleMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_scoreTeam1_3_0 = null;

        AntlrDatatypeRuleToken lv_scoreTeam2_5_0 = null;

        Enumerator lv_matchResult_7_0 = null;

        AntlrDatatypeRuleToken lv_day_9_0 = null;

        EObject lv_matchrules_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2195:2: ( (otherlv_0= 'Match' otherlv_1= '{' (otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) ) )? (otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) ) )? (otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) ) )? (otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) ) ) otherlv_10= 'teams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'matchrules' ( (lv_matchrules_17_0= ruleMatchRules ) ) otherlv_18= '}' ) )
            // InternalMyDsl.g:2196:2: (otherlv_0= 'Match' otherlv_1= '{' (otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) ) )? (otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) ) )? (otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) ) )? (otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) ) ) otherlv_10= 'teams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'matchrules' ( (lv_matchrules_17_0= ruleMatchRules ) ) otherlv_18= '}' )
            {
            // InternalMyDsl.g:2196:2: (otherlv_0= 'Match' otherlv_1= '{' (otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) ) )? (otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) ) )? (otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) ) )? (otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) ) ) otherlv_10= 'teams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'matchrules' ( (lv_matchrules_17_0= ruleMatchRules ) ) otherlv_18= '}' )
            // InternalMyDsl.g:2197:3: otherlv_0= 'Match' otherlv_1= '{' (otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) ) )? (otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) ) )? (otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) ) )? (otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) ) ) otherlv_10= 'teams' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'matchrules' ( (lv_matchrules_17_0= ruleMatchRules ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMatchAccess().getMatchKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getMatchAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2205:3: (otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2206:4: otherlv_2= 'scoreTeam1' ( (lv_scoreTeam1_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getMatchAccess().getScoreTeam1Keyword_2_0());
                    			
                    // InternalMyDsl.g:2210:4: ( (lv_scoreTeam1_3_0= ruleEInt ) )
                    // InternalMyDsl.g:2211:5: (lv_scoreTeam1_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2211:5: (lv_scoreTeam1_3_0= ruleEInt )
                    // InternalMyDsl.g:2212:6: lv_scoreTeam1_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMatchAccess().getScoreTeam1EIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_scoreTeam1_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchRule());
                    						}
                    						set(
                    							current,
                    							"scoreTeam1",
                    							lv_scoreTeam1_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2230:3: (otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2231:4: otherlv_4= 'scoreTeam2' ( (lv_scoreTeam2_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,62,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getMatchAccess().getScoreTeam2Keyword_3_0());
                    			
                    // InternalMyDsl.g:2235:4: ( (lv_scoreTeam2_5_0= ruleEInt ) )
                    // InternalMyDsl.g:2236:5: (lv_scoreTeam2_5_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2236:5: (lv_scoreTeam2_5_0= ruleEInt )
                    // InternalMyDsl.g:2237:6: lv_scoreTeam2_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMatchAccess().getScoreTeam2EIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_scoreTeam2_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchRule());
                    						}
                    						set(
                    							current,
                    							"scoreTeam2",
                    							lv_scoreTeam2_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2255:3: (otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2256:4: otherlv_6= 'matchResult' ( (lv_matchResult_7_0= ruleMatchResult ) )
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_71); 

                    				newLeafNode(otherlv_6, grammarAccess.getMatchAccess().getMatchResultKeyword_4_0());
                    			
                    // InternalMyDsl.g:2260:4: ( (lv_matchResult_7_0= ruleMatchResult ) )
                    // InternalMyDsl.g:2261:5: (lv_matchResult_7_0= ruleMatchResult )
                    {
                    // InternalMyDsl.g:2261:5: (lv_matchResult_7_0= ruleMatchResult )
                    // InternalMyDsl.g:2262:6: lv_matchResult_7_0= ruleMatchResult
                    {

                    						newCompositeNode(grammarAccess.getMatchAccess().getMatchResultMatchResultEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_matchResult_7_0=ruleMatchResult();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatchRule());
                    						}
                    						set(
                    							current,
                    							"matchResult",
                    							lv_matchResult_7_0,
                    							"org.xtext.example.mydsl.MyDsl.MatchResult");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2280:3: (otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) ) )
            // InternalMyDsl.g:2281:4: otherlv_8= 'day' ( (lv_day_9_0= ruleEDate ) )
            {
            otherlv_8=(Token)match(input,64,FOLLOW_29); 

            				newLeafNode(otherlv_8, grammarAccess.getMatchAccess().getDayKeyword_5_0());
            			
            // InternalMyDsl.g:2285:4: ( (lv_day_9_0= ruleEDate ) )
            // InternalMyDsl.g:2286:5: (lv_day_9_0= ruleEDate )
            {
            // InternalMyDsl.g:2286:5: (lv_day_9_0= ruleEDate )
            // InternalMyDsl.g:2287:6: lv_day_9_0= ruleEDate
            {

            						newCompositeNode(grammarAccess.getMatchAccess().getDayEDateParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_73);
            lv_day_9_0=ruleEDate();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMatchRule());
            						}
            						set(
            							current,
            							"day",
            							lv_day_9_0,
            							"org.xtext.example.mydsl.MyDsl.EDate");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_74); 

            			newLeafNode(otherlv_10, grammarAccess.getMatchAccess().getTeamsKeyword_6());
            		
            otherlv_11=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getMatchAccess().getLeftParenthesisKeyword_7());
            		
            // InternalMyDsl.g:2313:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2314:4: ( ruleEString )
            {
            // InternalMyDsl.g:2314:4: ( ruleEString )
            // InternalMyDsl.g:2315:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMatchAccess().getTeamsTeamCrossReference_8_0());
            				
            pushFollow(FOLLOW_75);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2329:3: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==16) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:2330:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMatchAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:2334:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2335:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2335:5: ( ruleEString )
            	    // InternalMyDsl.g:2336:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMatchRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMatchAccess().getTeamsTeamCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_75);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_15=(Token)match(input,66,FOLLOW_76); 

            			newLeafNode(otherlv_15, grammarAccess.getMatchAccess().getRightParenthesisKeyword_10());
            		
            otherlv_16=(Token)match(input,67,FOLLOW_77); 

            			newLeafNode(otherlv_16, grammarAccess.getMatchAccess().getMatchrulesKeyword_11());
            		
            // InternalMyDsl.g:2359:3: ( (lv_matchrules_17_0= ruleMatchRules ) )
            // InternalMyDsl.g:2360:4: (lv_matchrules_17_0= ruleMatchRules )
            {
            // InternalMyDsl.g:2360:4: (lv_matchrules_17_0= ruleMatchRules )
            // InternalMyDsl.g:2361:5: lv_matchrules_17_0= ruleMatchRules
            {

            					newCompositeNode(grammarAccess.getMatchAccess().getMatchrulesMatchRulesParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_matchrules_17_0=ruleMatchRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMatchRule());
            					}
            					set(
            						current,
            						"matchrules",
            						lv_matchrules_17_0,
            						"org.xtext.example.mydsl.MyDsl.MatchRules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMatchAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleStandard"
    // InternalMyDsl.g:2386:1: entryRuleStandard returns [EObject current=null] : iv_ruleStandard= ruleStandard EOF ;
    public final EObject entryRuleStandard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandard = null;


        try {
            // InternalMyDsl.g:2386:49: (iv_ruleStandard= ruleStandard EOF )
            // InternalMyDsl.g:2387:2: iv_ruleStandard= ruleStandard EOF
            {
             newCompositeNode(grammarAccess.getStandardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandard=ruleStandard();

            state._fsp--;

             current =iv_ruleStandard; 
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
    // $ANTLR end "entryRuleStandard"


    // $ANTLR start "ruleStandard"
    // InternalMyDsl.g:2393:1: ruleStandard returns [EObject current=null] : ( () ( (lv_tieBreaking_1_0= 'tieBreaking' ) )? ( (lv_extraTime_2_0= 'extraTime' ) )? ( (lv_penaltyShootouts_3_0= 'penaltyShootouts' ) )? otherlv_4= 'Standard' ) ;
    public final EObject ruleStandard() throws RecognitionException {
        EObject current = null;

        Token lv_tieBreaking_1_0=null;
        Token lv_extraTime_2_0=null;
        Token lv_penaltyShootouts_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2399:2: ( ( () ( (lv_tieBreaking_1_0= 'tieBreaking' ) )? ( (lv_extraTime_2_0= 'extraTime' ) )? ( (lv_penaltyShootouts_3_0= 'penaltyShootouts' ) )? otherlv_4= 'Standard' ) )
            // InternalMyDsl.g:2400:2: ( () ( (lv_tieBreaking_1_0= 'tieBreaking' ) )? ( (lv_extraTime_2_0= 'extraTime' ) )? ( (lv_penaltyShootouts_3_0= 'penaltyShootouts' ) )? otherlv_4= 'Standard' )
            {
            // InternalMyDsl.g:2400:2: ( () ( (lv_tieBreaking_1_0= 'tieBreaking' ) )? ( (lv_extraTime_2_0= 'extraTime' ) )? ( (lv_penaltyShootouts_3_0= 'penaltyShootouts' ) )? otherlv_4= 'Standard' )
            // InternalMyDsl.g:2401:3: () ( (lv_tieBreaking_1_0= 'tieBreaking' ) )? ( (lv_extraTime_2_0= 'extraTime' ) )? ( (lv_penaltyShootouts_3_0= 'penaltyShootouts' ) )? otherlv_4= 'Standard'
            {
            // InternalMyDsl.g:2401:3: ()
            // InternalMyDsl.g:2402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStandardAccess().getStandardAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2408:3: ( (lv_tieBreaking_1_0= 'tieBreaking' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2409:4: (lv_tieBreaking_1_0= 'tieBreaking' )
                    {
                    // InternalMyDsl.g:2409:4: (lv_tieBreaking_1_0= 'tieBreaking' )
                    // InternalMyDsl.g:2410:5: lv_tieBreaking_1_0= 'tieBreaking'
                    {
                    lv_tieBreaking_1_0=(Token)match(input,68,FOLLOW_78); 

                    					newLeafNode(lv_tieBreaking_1_0, grammarAccess.getStandardAccess().getTieBreakingTieBreakingKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandardRule());
                    					}
                    					setWithLastConsumed(current, "tieBreaking", lv_tieBreaking_1_0 != null, "tieBreaking");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2422:3: ( (lv_extraTime_2_0= 'extraTime' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==69) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2423:4: (lv_extraTime_2_0= 'extraTime' )
                    {
                    // InternalMyDsl.g:2423:4: (lv_extraTime_2_0= 'extraTime' )
                    // InternalMyDsl.g:2424:5: lv_extraTime_2_0= 'extraTime'
                    {
                    lv_extraTime_2_0=(Token)match(input,69,FOLLOW_79); 

                    					newLeafNode(lv_extraTime_2_0, grammarAccess.getStandardAccess().getExtraTimeExtraTimeKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandardRule());
                    					}
                    					setWithLastConsumed(current, "extraTime", lv_extraTime_2_0 != null, "extraTime");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2436:3: ( (lv_penaltyShootouts_3_0= 'penaltyShootouts' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==70) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2437:4: (lv_penaltyShootouts_3_0= 'penaltyShootouts' )
                    {
                    // InternalMyDsl.g:2437:4: (lv_penaltyShootouts_3_0= 'penaltyShootouts' )
                    // InternalMyDsl.g:2438:5: lv_penaltyShootouts_3_0= 'penaltyShootouts'
                    {
                    lv_penaltyShootouts_3_0=(Token)match(input,70,FOLLOW_80); 

                    					newLeafNode(lv_penaltyShootouts_3_0, grammarAccess.getStandardAccess().getPenaltyShootoutsPenaltyShootoutsKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandardRule());
                    					}
                    					setWithLastConsumed(current, "penaltyShootouts", lv_penaltyShootouts_3_0 != null, "penaltyShootouts");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,71,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardAccess().getStandardKeyword_4());
            		

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
    // $ANTLR end "ruleStandard"


    // $ANTLR start "entryRuleExtraTime"
    // InternalMyDsl.g:2458:1: entryRuleExtraTime returns [EObject current=null] : iv_ruleExtraTime= ruleExtraTime EOF ;
    public final EObject entryRuleExtraTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraTime = null;


        try {
            // InternalMyDsl.g:2458:50: (iv_ruleExtraTime= ruleExtraTime EOF )
            // InternalMyDsl.g:2459:2: iv_ruleExtraTime= ruleExtraTime EOF
            {
             newCompositeNode(grammarAccess.getExtraTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtraTime=ruleExtraTime();

            state._fsp--;

             current =iv_ruleExtraTime; 
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
    // $ANTLR end "entryRuleExtraTime"


    // $ANTLR start "ruleExtraTime"
    // InternalMyDsl.g:2465:1: ruleExtraTime returns [EObject current=null] : ( () otherlv_1= 'ExtraTime' otherlv_2= '{' (otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleExtraTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_extraTime_4_0 = null;

        AntlrDatatypeRuleToken lv_extraTimeDuration_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2471:2: ( ( () otherlv_1= 'ExtraTime' otherlv_2= '{' (otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:2472:2: ( () otherlv_1= 'ExtraTime' otherlv_2= '{' (otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:2472:2: ( () otherlv_1= 'ExtraTime' otherlv_2= '{' (otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:2473:3: () otherlv_1= 'ExtraTime' otherlv_2= '{' (otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) ) )? (otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:2473:3: ()
            // InternalMyDsl.g:2474:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExtraTimeAccess().getExtraTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExtraTimeAccess().getExtraTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_81); 

            			newLeafNode(otherlv_2, grammarAccess.getExtraTimeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2488:3: (otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==69) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2489:4: otherlv_3= 'extraTime' ( (lv_extraTime_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_82); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtraTimeAccess().getExtraTimeKeyword_3_0());
                    			
                    // InternalMyDsl.g:2493:4: ( (lv_extraTime_4_0= ruleEBoolean ) )
                    // InternalMyDsl.g:2494:5: (lv_extraTime_4_0= ruleEBoolean )
                    {
                    // InternalMyDsl.g:2494:5: (lv_extraTime_4_0= ruleEBoolean )
                    // InternalMyDsl.g:2495:6: lv_extraTime_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getExtraTimeAccess().getExtraTimeEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_extraTime_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtraTimeRule());
                    						}
                    						set(
                    							current,
                    							"extraTime",
                    							lv_extraTime_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2513:3: (otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2514:4: otherlv_5= 'extraTimeDuration' ( (lv_extraTimeDuration_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,73,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getExtraTimeAccess().getExtraTimeDurationKeyword_4_0());
                    			
                    // InternalMyDsl.g:2518:4: ( (lv_extraTimeDuration_6_0= ruleEInt ) )
                    // InternalMyDsl.g:2519:5: (lv_extraTimeDuration_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:2519:5: (lv_extraTimeDuration_6_0= ruleEInt )
                    // InternalMyDsl.g:2520:6: lv_extraTimeDuration_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExtraTimeAccess().getExtraTimeDurationEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_extraTimeDuration_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtraTimeRule());
                    						}
                    						set(
                    							current,
                    							"extraTimeDuration",
                    							lv_extraTimeDuration_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExtraTimeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExtraTime"


    // $ANTLR start "entryRulePenaltyShootout"
    // InternalMyDsl.g:2546:1: entryRulePenaltyShootout returns [EObject current=null] : iv_rulePenaltyShootout= rulePenaltyShootout EOF ;
    public final EObject entryRulePenaltyShootout() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenaltyShootout = null;


        try {
            // InternalMyDsl.g:2546:56: (iv_rulePenaltyShootout= rulePenaltyShootout EOF )
            // InternalMyDsl.g:2547:2: iv_rulePenaltyShootout= rulePenaltyShootout EOF
            {
             newCompositeNode(grammarAccess.getPenaltyShootoutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenaltyShootout=rulePenaltyShootout();

            state._fsp--;

             current =iv_rulePenaltyShootout; 
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
    // $ANTLR end "entryRulePenaltyShootout"


    // $ANTLR start "rulePenaltyShootout"
    // InternalMyDsl.g:2553:1: rulePenaltyShootout returns [EObject current=null] : ( () otherlv_1= 'PenaltyShootout' otherlv_2= '{' (otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject rulePenaltyShootout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_penaltyShootouts_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2559:2: ( ( () otherlv_1= 'PenaltyShootout' otherlv_2= '{' (otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2560:2: ( () otherlv_1= 'PenaltyShootout' otherlv_2= '{' (otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2560:2: ( () otherlv_1= 'PenaltyShootout' otherlv_2= '{' (otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2561:3: () otherlv_1= 'PenaltyShootout' otherlv_2= '{' (otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2561:3: ()
            // InternalMyDsl.g:2562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_84); 

            			newLeafNode(otherlv_2, grammarAccess.getPenaltyShootoutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2576:3: (otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2577:4: otherlv_3= 'penaltyShootouts' ( (lv_penaltyShootouts_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_82); 

                    				newLeafNode(otherlv_3, grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsKeyword_3_0());
                    			
                    // InternalMyDsl.g:2581:4: ( (lv_penaltyShootouts_4_0= ruleEBoolean ) )
                    // InternalMyDsl.g:2582:5: (lv_penaltyShootouts_4_0= ruleEBoolean )
                    {
                    // InternalMyDsl.g:2582:5: (lv_penaltyShootouts_4_0= ruleEBoolean )
                    // InternalMyDsl.g:2583:6: lv_penaltyShootouts_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_penaltyShootouts_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPenaltyShootoutRule());
                    						}
                    						set(
                    							current,
                    							"penaltyShootouts",
                    							lv_penaltyShootouts_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPenaltyShootoutAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePenaltyShootout"


    // $ANTLR start "entryRuleGroupStage"
    // InternalMyDsl.g:2609:1: entryRuleGroupStage returns [EObject current=null] : iv_ruleGroupStage= ruleGroupStage EOF ;
    public final EObject entryRuleGroupStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupStage = null;


        try {
            // InternalMyDsl.g:2609:51: (iv_ruleGroupStage= ruleGroupStage EOF )
            // InternalMyDsl.g:2610:2: iv_ruleGroupStage= ruleGroupStage EOF
            {
             newCompositeNode(grammarAccess.getGroupStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupStage=ruleGroupStage();

            state._fsp--;

             current =iv_ruleGroupStage; 
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
    // $ANTLR end "entryRuleGroupStage"


    // $ANTLR start "ruleGroupStage"
    // InternalMyDsl.g:2616:1: ruleGroupStage returns [EObject current=null] : ( () otherlv_1= 'GroupStage' otherlv_2= '{' (otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGroupStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_tieBreaking_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2622:2: ( ( () otherlv_1= 'GroupStage' otherlv_2= '{' (otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2623:2: ( () otherlv_1= 'GroupStage' otherlv_2= '{' (otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2623:2: ( () otherlv_1= 'GroupStage' otherlv_2= '{' (otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2624:3: () otherlv_1= 'GroupStage' otherlv_2= '{' (otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2624:3: ()
            // InternalMyDsl.g:2625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGroupStageAccess().getGroupStageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupStageAccess().getGroupStageKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupStageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2639:3: (otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==68) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2640:4: otherlv_3= 'tieBreaking' ( (lv_tieBreaking_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_82); 

                    				newLeafNode(otherlv_3, grammarAccess.getGroupStageAccess().getTieBreakingKeyword_3_0());
                    			
                    // InternalMyDsl.g:2644:4: ( (lv_tieBreaking_4_0= ruleEBoolean ) )
                    // InternalMyDsl.g:2645:5: (lv_tieBreaking_4_0= ruleEBoolean )
                    {
                    // InternalMyDsl.g:2645:5: (lv_tieBreaking_4_0= ruleEBoolean )
                    // InternalMyDsl.g:2646:6: lv_tieBreaking_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getGroupStageAccess().getTieBreakingEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_tieBreaking_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGroupStageRule());
                    						}
                    						set(
                    							current,
                    							"tieBreaking",
                    							lv_tieBreaking_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupStageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGroupStage"


    // $ANTLR start "ruleTournamentType"
    // InternalMyDsl.g:2672:1: ruleTournamentType returns [Enumerator current=null] : ( (enumLiteral_0= 'KNOCKOUT' ) | (enumLiteral_1= 'LEAGUE' ) | (enumLiteral_2= 'ROUND_ROBIN' ) ) ;
    public final Enumerator ruleTournamentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2678:2: ( ( (enumLiteral_0= 'KNOCKOUT' ) | (enumLiteral_1= 'LEAGUE' ) | (enumLiteral_2= 'ROUND_ROBIN' ) ) )
            // InternalMyDsl.g:2679:2: ( (enumLiteral_0= 'KNOCKOUT' ) | (enumLiteral_1= 'LEAGUE' ) | (enumLiteral_2= 'ROUND_ROBIN' ) )
            {
            // InternalMyDsl.g:2679:2: ( (enumLiteral_0= 'KNOCKOUT' ) | (enumLiteral_1= 'LEAGUE' ) | (enumLiteral_2= 'ROUND_ROBIN' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt55=1;
                }
                break;
            case 77:
                {
                alt55=2;
                }
                break;
            case 78:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2680:3: (enumLiteral_0= 'KNOCKOUT' )
                    {
                    // InternalMyDsl.g:2680:3: (enumLiteral_0= 'KNOCKOUT' )
                    // InternalMyDsl.g:2681:4: enumLiteral_0= 'KNOCKOUT'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getKNOCKOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTournamentTypeAccess().getKNOCKOUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2688:3: (enumLiteral_1= 'LEAGUE' )
                    {
                    // InternalMyDsl.g:2688:3: (enumLiteral_1= 'LEAGUE' )
                    // InternalMyDsl.g:2689:4: enumLiteral_1= 'LEAGUE'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getLEAGUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTournamentTypeAccess().getLEAGUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2696:3: (enumLiteral_2= 'ROUND_ROBIN' )
                    {
                    // InternalMyDsl.g:2696:3: (enumLiteral_2= 'ROUND_ROBIN' )
                    // InternalMyDsl.g:2697:4: enumLiteral_2= 'ROUND_ROBIN'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getTournamentTypeAccess().getROUND_ROBINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTournamentTypeAccess().getROUND_ROBINEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleTournamentType"


    // $ANTLR start "rulePlayerPosition"
    // InternalMyDsl.g:2707:1: rulePlayerPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'GOALKEEPER' ) | (enumLiteral_1= 'DEFENDER' ) | (enumLiteral_2= 'MIDFIELDER' ) | (enumLiteral_3= 'ATTACKER' ) ) ;
    public final Enumerator rulePlayerPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2713:2: ( ( (enumLiteral_0= 'GOALKEEPER' ) | (enumLiteral_1= 'DEFENDER' ) | (enumLiteral_2= 'MIDFIELDER' ) | (enumLiteral_3= 'ATTACKER' ) ) )
            // InternalMyDsl.g:2714:2: ( (enumLiteral_0= 'GOALKEEPER' ) | (enumLiteral_1= 'DEFENDER' ) | (enumLiteral_2= 'MIDFIELDER' ) | (enumLiteral_3= 'ATTACKER' ) )
            {
            // InternalMyDsl.g:2714:2: ( (enumLiteral_0= 'GOALKEEPER' ) | (enumLiteral_1= 'DEFENDER' ) | (enumLiteral_2= 'MIDFIELDER' ) | (enumLiteral_3= 'ATTACKER' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt56=1;
                }
                break;
            case 80:
                {
                alt56=2;
                }
                break;
            case 81:
                {
                alt56=3;
                }
                break;
            case 82:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2715:3: (enumLiteral_0= 'GOALKEEPER' )
                    {
                    // InternalMyDsl.g:2715:3: (enumLiteral_0= 'GOALKEEPER' )
                    // InternalMyDsl.g:2716:4: enumLiteral_0= 'GOALKEEPER'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getGOALKEEPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlayerPositionAccess().getGOALKEEPEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2723:3: (enumLiteral_1= 'DEFENDER' )
                    {
                    // InternalMyDsl.g:2723:3: (enumLiteral_1= 'DEFENDER' )
                    // InternalMyDsl.g:2724:4: enumLiteral_1= 'DEFENDER'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getDEFENDEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlayerPositionAccess().getDEFENDEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2731:3: (enumLiteral_2= 'MIDFIELDER' )
                    {
                    // InternalMyDsl.g:2731:3: (enumLiteral_2= 'MIDFIELDER' )
                    // InternalMyDsl.g:2732:4: enumLiteral_2= 'MIDFIELDER'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getMIDFIELDEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPlayerPositionAccess().getMIDFIELDEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2739:3: (enumLiteral_3= 'ATTACKER' )
                    {
                    // InternalMyDsl.g:2739:3: (enumLiteral_3= 'ATTACKER' )
                    // InternalMyDsl.g:2740:4: enumLiteral_3= 'ATTACKER'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getPlayerPositionAccess().getATTACKEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPlayerPositionAccess().getATTACKEREnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "rulePlayerPosition"


    // $ANTLR start "ruleFinalsFormat"
    // InternalMyDsl.g:2750:1: ruleFinalsFormat returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLE_FINAL' ) | (enumLiteral_1= 'BEST_OF_THREE' ) ) ;
    public final Enumerator ruleFinalsFormat() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2756:2: ( ( (enumLiteral_0= 'SINGLE_FINAL' ) | (enumLiteral_1= 'BEST_OF_THREE' ) ) )
            // InternalMyDsl.g:2757:2: ( (enumLiteral_0= 'SINGLE_FINAL' ) | (enumLiteral_1= 'BEST_OF_THREE' ) )
            {
            // InternalMyDsl.g:2757:2: ( (enumLiteral_0= 'SINGLE_FINAL' ) | (enumLiteral_1= 'BEST_OF_THREE' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==83) ) {
                alt57=1;
            }
            else if ( (LA57_0==84) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2758:3: (enumLiteral_0= 'SINGLE_FINAL' )
                    {
                    // InternalMyDsl.g:2758:3: (enumLiteral_0= 'SINGLE_FINAL' )
                    // InternalMyDsl.g:2759:4: enumLiteral_0= 'SINGLE_FINAL'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getFinalsFormatAccess().getSINGLE_FINALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFinalsFormatAccess().getSINGLE_FINALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2766:3: (enumLiteral_1= 'BEST_OF_THREE' )
                    {
                    // InternalMyDsl.g:2766:3: (enumLiteral_1= 'BEST_OF_THREE' )
                    // InternalMyDsl.g:2767:4: enumLiteral_1= 'BEST_OF_THREE'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getFinalsFormatAccess().getBEST_OF_THREEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFinalsFormatAccess().getBEST_OF_THREEEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleFinalsFormat"


    // $ANTLR start "ruleTieBreakerRule"
    // InternalMyDsl.g:2777:1: ruleTieBreakerRule returns [Enumerator current=null] : ( (enumLiteral_0= 'GOAL_DIFFERENCE' ) | (enumLiteral_1= 'HEAD_TO_HEAD' ) | (enumLiteral_2= 'GOALS_SCORED' ) ) ;
    public final Enumerator ruleTieBreakerRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2783:2: ( ( (enumLiteral_0= 'GOAL_DIFFERENCE' ) | (enumLiteral_1= 'HEAD_TO_HEAD' ) | (enumLiteral_2= 'GOALS_SCORED' ) ) )
            // InternalMyDsl.g:2784:2: ( (enumLiteral_0= 'GOAL_DIFFERENCE' ) | (enumLiteral_1= 'HEAD_TO_HEAD' ) | (enumLiteral_2= 'GOALS_SCORED' ) )
            {
            // InternalMyDsl.g:2784:2: ( (enumLiteral_0= 'GOAL_DIFFERENCE' ) | (enumLiteral_1= 'HEAD_TO_HEAD' ) | (enumLiteral_2= 'GOALS_SCORED' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt58=1;
                }
                break;
            case 86:
                {
                alt58=2;
                }
                break;
            case 87:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2785:3: (enumLiteral_0= 'GOAL_DIFFERENCE' )
                    {
                    // InternalMyDsl.g:2785:3: (enumLiteral_0= 'GOAL_DIFFERENCE' )
                    // InternalMyDsl.g:2786:4: enumLiteral_0= 'GOAL_DIFFERENCE'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getTieBreakerRuleAccess().getGOAL_DIFFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTieBreakerRuleAccess().getGOAL_DIFFERENCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2793:3: (enumLiteral_1= 'HEAD_TO_HEAD' )
                    {
                    // InternalMyDsl.g:2793:3: (enumLiteral_1= 'HEAD_TO_HEAD' )
                    // InternalMyDsl.g:2794:4: enumLiteral_1= 'HEAD_TO_HEAD'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getTieBreakerRuleAccess().getHEAD_TO_HEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTieBreakerRuleAccess().getHEAD_TO_HEADEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2801:3: (enumLiteral_2= 'GOALS_SCORED' )
                    {
                    // InternalMyDsl.g:2801:3: (enumLiteral_2= 'GOALS_SCORED' )
                    // InternalMyDsl.g:2802:4: enumLiteral_2= 'GOALS_SCORED'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getTieBreakerRuleAccess().getGOALS_SCOREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTieBreakerRuleAccess().getGOALS_SCOREDEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleTieBreakerRule"


    // $ANTLR start "ruleBracketSide"
    // InternalMyDsl.g:2812:1: ruleBracketSide returns [Enumerator current=null] : ( (enumLiteral_0= 'UPPER' ) | (enumLiteral_1= 'LOWER' ) ) ;
    public final Enumerator ruleBracketSide() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2818:2: ( ( (enumLiteral_0= 'UPPER' ) | (enumLiteral_1= 'LOWER' ) ) )
            // InternalMyDsl.g:2819:2: ( (enumLiteral_0= 'UPPER' ) | (enumLiteral_1= 'LOWER' ) )
            {
            // InternalMyDsl.g:2819:2: ( (enumLiteral_0= 'UPPER' ) | (enumLiteral_1= 'LOWER' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==88) ) {
                alt59=1;
            }
            else if ( (LA59_0==89) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2820:3: (enumLiteral_0= 'UPPER' )
                    {
                    // InternalMyDsl.g:2820:3: (enumLiteral_0= 'UPPER' )
                    // InternalMyDsl.g:2821:4: enumLiteral_0= 'UPPER'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getBracketSideAccess().getUPPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBracketSideAccess().getUPPEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2828:3: (enumLiteral_1= 'LOWER' )
                    {
                    // InternalMyDsl.g:2828:3: (enumLiteral_1= 'LOWER' )
                    // InternalMyDsl.g:2829:4: enumLiteral_1= 'LOWER'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getBracketSideAccess().getLOWEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBracketSideAccess().getLOWEREnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleBracketSide"


    // $ANTLR start "ruleMatchResult"
    // InternalMyDsl.g:2839:1: ruleMatchResult returns [Enumerator current=null] : ( (enumLiteral_0= 'WIN' ) | (enumLiteral_1= 'LOSS' ) | (enumLiteral_2= 'DRAW' ) ) ;
    public final Enumerator ruleMatchResult() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2845:2: ( ( (enumLiteral_0= 'WIN' ) | (enumLiteral_1= 'LOSS' ) | (enumLiteral_2= 'DRAW' ) ) )
            // InternalMyDsl.g:2846:2: ( (enumLiteral_0= 'WIN' ) | (enumLiteral_1= 'LOSS' ) | (enumLiteral_2= 'DRAW' ) )
            {
            // InternalMyDsl.g:2846:2: ( (enumLiteral_0= 'WIN' ) | (enumLiteral_1= 'LOSS' ) | (enumLiteral_2= 'DRAW' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt60=1;
                }
                break;
            case 91:
                {
                alt60=2;
                }
                break;
            case 92:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2847:3: (enumLiteral_0= 'WIN' )
                    {
                    // InternalMyDsl.g:2847:3: (enumLiteral_0= 'WIN' )
                    // InternalMyDsl.g:2848:4: enumLiteral_0= 'WIN'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getMatchResultAccess().getWINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMatchResultAccess().getWINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2855:3: (enumLiteral_1= 'LOSS' )
                    {
                    // InternalMyDsl.g:2855:3: (enumLiteral_1= 'LOSS' )
                    // InternalMyDsl.g:2856:4: enumLiteral_1= 'LOSS'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getMatchResultAccess().getLOSSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMatchResultAccess().getLOSSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2863:3: (enumLiteral_2= 'DRAW' )
                    {
                    // InternalMyDsl.g:2863:3: (enumLiteral_2= 'DRAW' )
                    // InternalMyDsl.g:2864:4: enumLiteral_2= 'DRAW'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getMatchResultAccess().getDRAWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMatchResultAccess().getDRAWEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleMatchResult"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0308200000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000A0400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000001F800020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000001F000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001E000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000001C000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000005F800020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000005F000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000005E000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000005C000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000058000020000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000050000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000010F800020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000010F000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000010E000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000010C000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000108000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0007000000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0006000000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0003000000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000DF0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000220L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000200L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000010L});

}