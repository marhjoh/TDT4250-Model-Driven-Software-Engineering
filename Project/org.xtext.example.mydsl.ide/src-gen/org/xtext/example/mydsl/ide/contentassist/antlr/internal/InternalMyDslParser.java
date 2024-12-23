package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'KNOCKOUT'", "'LEAGUE'", "'ROUND_ROBIN'", "'GOALKEEPER'", "'DEFENDER'", "'MIDFIELDER'", "'ATTACKER'", "'SINGLE_FINAL'", "'BEST_OF_THREE'", "'GOAL_DIFFERENCE'", "'HEAD_TO_HEAD'", "'GOALS_SCORED'", "'UPPER'", "'LOWER'", "'WIN'", "'LOSS'", "'DRAW'", "'Tournament'", "'{'", "'tournamentformat'", "'brackets'", "'}'", "'tournamentType'", "'teams'", "','", "'Team'", "'players'", "'teamSize'", "'managerName'", "'Bracket'", "'matches'", "'rounds'", "'bracketSide'", "'-'", "'Player'", "'playerstatistics'", "'position'", "'birthDate'", "'number'", "'Defender'", "'goals'", "'assists'", "'fouls'", "'yellowCards'", "'redCards'", "'cleansheets'", "'Goalkeeper'", "'saves'", "'Attacker'", "'sprintSpeed'", "'League'", "'maxTeams'", "'minTeams'", "'description'", "'numberOfRounds'", "'finalsFormat'", "'RoundRobin'", "'pointsForWin'", "'pointsForDraw'", "'pointsForLoss'", "'tieBreakerRule'", "'Knockout'", "'Match'", "'('", "')'", "'matchrules'", "'scoreTeam1'", "'scoreTeam2'", "'matchResult'", "'day'", "'Standard'", "'ExtraTime'", "'extraTime'", "'extraTimeDuration'", "'PenaltyShootout'", "'penaltyShootouts'", "'GroupStage'", "'tieBreaking'", "'hasThirdPlacePlayoff'"
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
    public static final int RULE_ID=6;
    public static final int RULE_DATE=4;
    public static final int RULE_INT=7;
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
    public static final int RULE_STRING=5;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTournament"
    // InternalMyDsl.g:53:1: entryRuleTournament : ruleTournament EOF ;
    public final void entryRuleTournament() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleTournament EOF )
            // InternalMyDsl.g:55:1: ruleTournament EOF
            {
             before(grammarAccess.getTournamentRule()); 
            pushFollow(FOLLOW_1);
            ruleTournament();

            state._fsp--;

             after(grammarAccess.getTournamentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTournament"


    // $ANTLR start "ruleTournament"
    // InternalMyDsl.g:62:1: ruleTournament : ( ( rule__Tournament__Group__0 ) ) ;
    public final void ruleTournament() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Tournament__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Tournament__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Tournament__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Tournament__Group__0 )
            {
             before(grammarAccess.getTournamentAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Tournament__Group__0 )
            // InternalMyDsl.g:69:4: rule__Tournament__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTournament"


    // $ANTLR start "entryRuleTournamentFormat"
    // InternalMyDsl.g:78:1: entryRuleTournamentFormat : ruleTournamentFormat EOF ;
    public final void entryRuleTournamentFormat() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTournamentFormat EOF )
            // InternalMyDsl.g:80:1: ruleTournamentFormat EOF
            {
             before(grammarAccess.getTournamentFormatRule()); 
            pushFollow(FOLLOW_1);
            ruleTournamentFormat();

            state._fsp--;

             after(grammarAccess.getTournamentFormatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTournamentFormat"


    // $ANTLR start "ruleTournamentFormat"
    // InternalMyDsl.g:87:1: ruleTournamentFormat : ( ( rule__TournamentFormat__Alternatives ) ) ;
    public final void ruleTournamentFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__TournamentFormat__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__TournamentFormat__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__TournamentFormat__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__TournamentFormat__Alternatives )
            {
             before(grammarAccess.getTournamentFormatAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__TournamentFormat__Alternatives )
            // InternalMyDsl.g:94:4: rule__TournamentFormat__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TournamentFormat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTournamentFormatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTournamentFormat"


    // $ANTLR start "entryRulePlayerStatistics"
    // InternalMyDsl.g:103:1: entryRulePlayerStatistics : rulePlayerStatistics EOF ;
    public final void entryRulePlayerStatistics() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePlayerStatistics EOF )
            // InternalMyDsl.g:105:1: rulePlayerStatistics EOF
            {
             before(grammarAccess.getPlayerStatisticsRule()); 
            pushFollow(FOLLOW_1);
            rulePlayerStatistics();

            state._fsp--;

             after(grammarAccess.getPlayerStatisticsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayerStatistics"


    // $ANTLR start "rulePlayerStatistics"
    // InternalMyDsl.g:112:1: rulePlayerStatistics : ( ( rule__PlayerStatistics__Alternatives ) ) ;
    public final void rulePlayerStatistics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__PlayerStatistics__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__PlayerStatistics__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__PlayerStatistics__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__PlayerStatistics__Alternatives )
            {
             before(grammarAccess.getPlayerStatisticsAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__PlayerStatistics__Alternatives )
            // InternalMyDsl.g:119:4: rule__PlayerStatistics__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlayerStatistics__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlayerStatisticsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerStatistics"


    // $ANTLR start "entryRuleMatchRules"
    // InternalMyDsl.g:128:1: entryRuleMatchRules : ruleMatchRules EOF ;
    public final void entryRuleMatchRules() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleMatchRules EOF )
            // InternalMyDsl.g:130:1: ruleMatchRules EOF
            {
             before(grammarAccess.getMatchRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleMatchRules();

            state._fsp--;

             after(grammarAccess.getMatchRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatchRules"


    // $ANTLR start "ruleMatchRules"
    // InternalMyDsl.g:137:1: ruleMatchRules : ( ( rule__MatchRules__Alternatives ) ) ;
    public final void ruleMatchRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__MatchRules__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__MatchRules__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__MatchRules__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__MatchRules__Alternatives )
            {
             before(grammarAccess.getMatchRulesAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__MatchRules__Alternatives )
            // InternalMyDsl.g:144:4: rule__MatchRules__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MatchRules__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatchRulesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchRules"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEString EOF )
            // InternalMyDsl.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTeam"
    // InternalMyDsl.g:178:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleTeam EOF )
            // InternalMyDsl.g:180:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalMyDsl.g:187:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Team__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Team__Group__0 )
            // InternalMyDsl.g:194:4: rule__Team__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleBracket"
    // InternalMyDsl.g:203:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleBracket EOF )
            // InternalMyDsl.g:205:1: ruleBracket EOF
            {
             before(grammarAccess.getBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getBracketRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBracket"


    // $ANTLR start "ruleBracket"
    // InternalMyDsl.g:212:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Bracket__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Bracket__Group__0 )
            // InternalMyDsl.g:219:4: rule__Bracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracket"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEInt EOF )
            // InternalMyDsl.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePlayer"
    // InternalMyDsl.g:253:1: entryRulePlayer : rulePlayer EOF ;
    public final void entryRulePlayer() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( rulePlayer EOF )
            // InternalMyDsl.g:255:1: rulePlayer EOF
            {
             before(grammarAccess.getPlayerRule()); 
            pushFollow(FOLLOW_1);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getPlayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlayer"


    // $ANTLR start "rulePlayer"
    // InternalMyDsl.g:262:1: rulePlayer : ( ( rule__Player__Group__0 ) ) ;
    public final void rulePlayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Player__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Player__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Player__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Player__Group__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Player__Group__0 )
            // InternalMyDsl.g:269:4: rule__Player__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayer"


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:278:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleEDate EOF )
            // InternalMyDsl.g:280:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMyDsl.g:287:1: ruleEDate : ( RULE_DATE ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( RULE_DATE ) )
            // InternalMyDsl.g:292:2: ( RULE_DATE )
            {
            // InternalMyDsl.g:292:2: ( RULE_DATE )
            // InternalMyDsl.g:293:3: RULE_DATE
            {
             before(grammarAccess.getEDateAccess().getDATETerminalRuleCall()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getDATETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleDefender"
    // InternalMyDsl.g:303:1: entryRuleDefender : ruleDefender EOF ;
    public final void entryRuleDefender() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDefender EOF )
            // InternalMyDsl.g:305:1: ruleDefender EOF
            {
             before(grammarAccess.getDefenderRule()); 
            pushFollow(FOLLOW_1);
            ruleDefender();

            state._fsp--;

             after(grammarAccess.getDefenderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefender"


    // $ANTLR start "ruleDefender"
    // InternalMyDsl.g:312:1: ruleDefender : ( ( rule__Defender__Group__0 ) ) ;
    public final void ruleDefender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Defender__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Defender__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Defender__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Defender__Group__0 )
            {
             before(grammarAccess.getDefenderAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Defender__Group__0 )
            // InternalMyDsl.g:319:4: rule__Defender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefender"


    // $ANTLR start "entryRuleGoalkeeper"
    // InternalMyDsl.g:328:1: entryRuleGoalkeeper : ruleGoalkeeper EOF ;
    public final void entryRuleGoalkeeper() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleGoalkeeper EOF )
            // InternalMyDsl.g:330:1: ruleGoalkeeper EOF
            {
             before(grammarAccess.getGoalkeeperRule()); 
            pushFollow(FOLLOW_1);
            ruleGoalkeeper();

            state._fsp--;

             after(grammarAccess.getGoalkeeperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoalkeeper"


    // $ANTLR start "ruleGoalkeeper"
    // InternalMyDsl.g:337:1: ruleGoalkeeper : ( ( rule__Goalkeeper__Group__0 ) ) ;
    public final void ruleGoalkeeper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Goalkeeper__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Goalkeeper__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Goalkeeper__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Goalkeeper__Group__0 )
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Goalkeeper__Group__0 )
            // InternalMyDsl.g:344:4: rule__Goalkeeper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoalkeeper"


    // $ANTLR start "entryRuleAttacker"
    // InternalMyDsl.g:353:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAttacker EOF )
            // InternalMyDsl.g:355:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_1);
            ruleAttacker();

            state._fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttacker"


    // $ANTLR start "ruleAttacker"
    // InternalMyDsl.g:362:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Attacker__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Attacker__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Attacker__Group__0 )
            // InternalMyDsl.g:369:4: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttacker"


    // $ANTLR start "entryRuleLeague"
    // InternalMyDsl.g:378:1: entryRuleLeague : ruleLeague EOF ;
    public final void entryRuleLeague() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleLeague EOF )
            // InternalMyDsl.g:380:1: ruleLeague EOF
            {
             before(grammarAccess.getLeagueRule()); 
            pushFollow(FOLLOW_1);
            ruleLeague();

            state._fsp--;

             after(grammarAccess.getLeagueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeague"


    // $ANTLR start "ruleLeague"
    // InternalMyDsl.g:387:1: ruleLeague : ( ( rule__League__Group__0 ) ) ;
    public final void ruleLeague() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__League__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__League__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__League__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__League__Group__0 )
            {
             before(grammarAccess.getLeagueAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__League__Group__0 )
            // InternalMyDsl.g:394:4: rule__League__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__League__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeague"


    // $ANTLR start "entryRuleRoundRobin"
    // InternalMyDsl.g:403:1: entryRuleRoundRobin : ruleRoundRobin EOF ;
    public final void entryRuleRoundRobin() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleRoundRobin EOF )
            // InternalMyDsl.g:405:1: ruleRoundRobin EOF
            {
             before(grammarAccess.getRoundRobinRule()); 
            pushFollow(FOLLOW_1);
            ruleRoundRobin();

            state._fsp--;

             after(grammarAccess.getRoundRobinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoundRobin"


    // $ANTLR start "ruleRoundRobin"
    // InternalMyDsl.g:412:1: ruleRoundRobin : ( ( rule__RoundRobin__Group__0 ) ) ;
    public final void ruleRoundRobin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__RoundRobin__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__RoundRobin__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__RoundRobin__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__RoundRobin__Group__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__RoundRobin__Group__0 )
            // InternalMyDsl.g:419:4: rule__RoundRobin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoundRobin"


    // $ANTLR start "entryRuleKnockout"
    // InternalMyDsl.g:428:1: entryRuleKnockout : ruleKnockout EOF ;
    public final void entryRuleKnockout() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleKnockout EOF )
            // InternalMyDsl.g:430:1: ruleKnockout EOF
            {
             before(grammarAccess.getKnockoutRule()); 
            pushFollow(FOLLOW_1);
            ruleKnockout();

            state._fsp--;

             after(grammarAccess.getKnockoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKnockout"


    // $ANTLR start "ruleKnockout"
    // InternalMyDsl.g:437:1: ruleKnockout : ( ( rule__Knockout__Group__0 ) ) ;
    public final void ruleKnockout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Knockout__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Knockout__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Knockout__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Knockout__Group__0 )
            {
             before(grammarAccess.getKnockoutAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Knockout__Group__0 )
            // InternalMyDsl.g:444:4: rule__Knockout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKnockout"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:453:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:455:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:462:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:469:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleMatch"
    // InternalMyDsl.g:478:1: entryRuleMatch : ruleMatch EOF ;
    public final void entryRuleMatch() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMatch EOF )
            // InternalMyDsl.g:480:1: ruleMatch EOF
            {
             before(grammarAccess.getMatchRule()); 
            pushFollow(FOLLOW_1);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getMatchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatch"


    // $ANTLR start "ruleMatch"
    // InternalMyDsl.g:487:1: ruleMatch : ( ( rule__Match__Group__0 ) ) ;
    public final void ruleMatch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Match__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Match__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Match__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Match__Group__0 )
            {
             before(grammarAccess.getMatchAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Match__Group__0 )
            // InternalMyDsl.g:494:4: rule__Match__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatch"


    // $ANTLR start "entryRuleStandard"
    // InternalMyDsl.g:503:1: entryRuleStandard : ruleStandard EOF ;
    public final void entryRuleStandard() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleStandard EOF )
            // InternalMyDsl.g:505:1: ruleStandard EOF
            {
             before(grammarAccess.getStandardRule()); 
            pushFollow(FOLLOW_1);
            ruleStandard();

            state._fsp--;

             after(grammarAccess.getStandardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStandard"


    // $ANTLR start "ruleStandard"
    // InternalMyDsl.g:512:1: ruleStandard : ( ( rule__Standard__Group__0 ) ) ;
    public final void ruleStandard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Standard__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Standard__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Standard__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Standard__Group__0 )
            {
             before(grammarAccess.getStandardAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Standard__Group__0 )
            // InternalMyDsl.g:519:4: rule__Standard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Standard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandard"


    // $ANTLR start "entryRuleExtraTime"
    // InternalMyDsl.g:528:1: entryRuleExtraTime : ruleExtraTime EOF ;
    public final void entryRuleExtraTime() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleExtraTime EOF )
            // InternalMyDsl.g:530:1: ruleExtraTime EOF
            {
             before(grammarAccess.getExtraTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleExtraTime();

            state._fsp--;

             after(grammarAccess.getExtraTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtraTime"


    // $ANTLR start "ruleExtraTime"
    // InternalMyDsl.g:537:1: ruleExtraTime : ( ( rule__ExtraTime__Group__0 ) ) ;
    public final void ruleExtraTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__ExtraTime__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__ExtraTime__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__ExtraTime__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__ExtraTime__Group__0 )
            {
             before(grammarAccess.getExtraTimeAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__ExtraTime__Group__0 )
            // InternalMyDsl.g:544:4: rule__ExtraTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtraTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtraTime"


    // $ANTLR start "entryRulePenaltyShootout"
    // InternalMyDsl.g:553:1: entryRulePenaltyShootout : rulePenaltyShootout EOF ;
    public final void entryRulePenaltyShootout() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( rulePenaltyShootout EOF )
            // InternalMyDsl.g:555:1: rulePenaltyShootout EOF
            {
             before(grammarAccess.getPenaltyShootoutRule()); 
            pushFollow(FOLLOW_1);
            rulePenaltyShootout();

            state._fsp--;

             after(grammarAccess.getPenaltyShootoutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePenaltyShootout"


    // $ANTLR start "rulePenaltyShootout"
    // InternalMyDsl.g:562:1: rulePenaltyShootout : ( ( rule__PenaltyShootout__Group__0 ) ) ;
    public final void rulePenaltyShootout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__PenaltyShootout__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__PenaltyShootout__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__PenaltyShootout__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__PenaltyShootout__Group__0 )
            {
             before(grammarAccess.getPenaltyShootoutAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__PenaltyShootout__Group__0 )
            // InternalMyDsl.g:569:4: rule__PenaltyShootout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPenaltyShootoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePenaltyShootout"


    // $ANTLR start "entryRuleGroupStage"
    // InternalMyDsl.g:578:1: entryRuleGroupStage : ruleGroupStage EOF ;
    public final void entryRuleGroupStage() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleGroupStage EOF )
            // InternalMyDsl.g:580:1: ruleGroupStage EOF
            {
             before(grammarAccess.getGroupStageRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupStage();

            state._fsp--;

             after(grammarAccess.getGroupStageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupStage"


    // $ANTLR start "ruleGroupStage"
    // InternalMyDsl.g:587:1: ruleGroupStage : ( ( rule__GroupStage__Group__0 ) ) ;
    public final void ruleGroupStage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__GroupStage__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__GroupStage__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__GroupStage__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__GroupStage__Group__0 )
            {
             before(grammarAccess.getGroupStageAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__GroupStage__Group__0 )
            // InternalMyDsl.g:594:4: rule__GroupStage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupStage"


    // $ANTLR start "ruleTournamentType"
    // InternalMyDsl.g:603:1: ruleTournamentType : ( ( rule__TournamentType__Alternatives ) ) ;
    public final void ruleTournamentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( ( rule__TournamentType__Alternatives ) ) )
            // InternalMyDsl.g:608:2: ( ( rule__TournamentType__Alternatives ) )
            {
            // InternalMyDsl.g:608:2: ( ( rule__TournamentType__Alternatives ) )
            // InternalMyDsl.g:609:3: ( rule__TournamentType__Alternatives )
            {
             before(grammarAccess.getTournamentTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:610:3: ( rule__TournamentType__Alternatives )
            // InternalMyDsl.g:610:4: rule__TournamentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TournamentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTournamentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTournamentType"


    // $ANTLR start "rulePlayerPosition"
    // InternalMyDsl.g:619:1: rulePlayerPosition : ( ( rule__PlayerPosition__Alternatives ) ) ;
    public final void rulePlayerPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( ( rule__PlayerPosition__Alternatives ) ) )
            // InternalMyDsl.g:624:2: ( ( rule__PlayerPosition__Alternatives ) )
            {
            // InternalMyDsl.g:624:2: ( ( rule__PlayerPosition__Alternatives ) )
            // InternalMyDsl.g:625:3: ( rule__PlayerPosition__Alternatives )
            {
             before(grammarAccess.getPlayerPositionAccess().getAlternatives()); 
            // InternalMyDsl.g:626:3: ( rule__PlayerPosition__Alternatives )
            // InternalMyDsl.g:626:4: rule__PlayerPosition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlayerPosition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlayerPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlayerPosition"


    // $ANTLR start "ruleFinalsFormat"
    // InternalMyDsl.g:635:1: ruleFinalsFormat : ( ( rule__FinalsFormat__Alternatives ) ) ;
    public final void ruleFinalsFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( ( ( rule__FinalsFormat__Alternatives ) ) )
            // InternalMyDsl.g:640:2: ( ( rule__FinalsFormat__Alternatives ) )
            {
            // InternalMyDsl.g:640:2: ( ( rule__FinalsFormat__Alternatives ) )
            // InternalMyDsl.g:641:3: ( rule__FinalsFormat__Alternatives )
            {
             before(grammarAccess.getFinalsFormatAccess().getAlternatives()); 
            // InternalMyDsl.g:642:3: ( rule__FinalsFormat__Alternatives )
            // InternalMyDsl.g:642:4: rule__FinalsFormat__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FinalsFormat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFinalsFormatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinalsFormat"


    // $ANTLR start "ruleTieBreakerRule"
    // InternalMyDsl.g:651:1: ruleTieBreakerRule : ( ( rule__TieBreakerRule__Alternatives ) ) ;
    public final void ruleTieBreakerRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( ( ( rule__TieBreakerRule__Alternatives ) ) )
            // InternalMyDsl.g:656:2: ( ( rule__TieBreakerRule__Alternatives ) )
            {
            // InternalMyDsl.g:656:2: ( ( rule__TieBreakerRule__Alternatives ) )
            // InternalMyDsl.g:657:3: ( rule__TieBreakerRule__Alternatives )
            {
             before(grammarAccess.getTieBreakerRuleAccess().getAlternatives()); 
            // InternalMyDsl.g:658:3: ( rule__TieBreakerRule__Alternatives )
            // InternalMyDsl.g:658:4: rule__TieBreakerRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TieBreakerRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTieBreakerRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTieBreakerRule"


    // $ANTLR start "ruleBracketSide"
    // InternalMyDsl.g:667:1: ruleBracketSide : ( ( rule__BracketSide__Alternatives ) ) ;
    public final void ruleBracketSide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ( rule__BracketSide__Alternatives ) ) )
            // InternalMyDsl.g:672:2: ( ( rule__BracketSide__Alternatives ) )
            {
            // InternalMyDsl.g:672:2: ( ( rule__BracketSide__Alternatives ) )
            // InternalMyDsl.g:673:3: ( rule__BracketSide__Alternatives )
            {
             before(grammarAccess.getBracketSideAccess().getAlternatives()); 
            // InternalMyDsl.g:674:3: ( rule__BracketSide__Alternatives )
            // InternalMyDsl.g:674:4: rule__BracketSide__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BracketSide__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBracketSideAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracketSide"


    // $ANTLR start "ruleMatchResult"
    // InternalMyDsl.g:683:1: ruleMatchResult : ( ( rule__MatchResult__Alternatives ) ) ;
    public final void ruleMatchResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( ( rule__MatchResult__Alternatives ) ) )
            // InternalMyDsl.g:688:2: ( ( rule__MatchResult__Alternatives ) )
            {
            // InternalMyDsl.g:688:2: ( ( rule__MatchResult__Alternatives ) )
            // InternalMyDsl.g:689:3: ( rule__MatchResult__Alternatives )
            {
             before(grammarAccess.getMatchResultAccess().getAlternatives()); 
            // InternalMyDsl.g:690:3: ( rule__MatchResult__Alternatives )
            // InternalMyDsl.g:690:4: rule__MatchResult__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MatchResult__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMatchResultAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatchResult"


    // $ANTLR start "rule__TournamentFormat__Alternatives"
    // InternalMyDsl.g:698:1: rule__TournamentFormat__Alternatives : ( ( ruleLeague ) | ( ruleRoundRobin ) | ( ruleKnockout ) );
    public final void rule__TournamentFormat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ruleLeague ) | ( ruleRoundRobin ) | ( ruleKnockout ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt1=1;
                }
                break;
            case 70:
                {
                alt1=2;
                }
                break;
            case 75:
            case 92:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:703:2: ( ruleLeague )
                    {
                    // InternalMyDsl.g:703:2: ( ruleLeague )
                    // InternalMyDsl.g:704:3: ruleLeague
                    {
                     before(grammarAccess.getTournamentFormatAccess().getLeagueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeague();

                    state._fsp--;

                     after(grammarAccess.getTournamentFormatAccess().getLeagueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:2: ( ruleRoundRobin )
                    {
                    // InternalMyDsl.g:709:2: ( ruleRoundRobin )
                    // InternalMyDsl.g:710:3: ruleRoundRobin
                    {
                     before(grammarAccess.getTournamentFormatAccess().getRoundRobinParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoundRobin();

                    state._fsp--;

                     after(grammarAccess.getTournamentFormatAccess().getRoundRobinParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:715:2: ( ruleKnockout )
                    {
                    // InternalMyDsl.g:715:2: ( ruleKnockout )
                    // InternalMyDsl.g:716:3: ruleKnockout
                    {
                     before(grammarAccess.getTournamentFormatAccess().getKnockoutParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKnockout();

                    state._fsp--;

                     after(grammarAccess.getTournamentFormatAccess().getKnockoutParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TournamentFormat__Alternatives"


    // $ANTLR start "rule__PlayerStatistics__Alternatives"
    // InternalMyDsl.g:725:1: rule__PlayerStatistics__Alternatives : ( ( ruleDefender ) | ( ruleGoalkeeper ) | ( ruleAttacker ) );
    public final void rule__PlayerStatistics__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( ruleDefender ) | ( ruleGoalkeeper ) | ( ruleAttacker ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt2=1;
                }
                break;
            case 60:
                {
                alt2=2;
                }
                break;
            case 62:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:730:2: ( ruleDefender )
                    {
                    // InternalMyDsl.g:730:2: ( ruleDefender )
                    // InternalMyDsl.g:731:3: ruleDefender
                    {
                     before(grammarAccess.getPlayerStatisticsAccess().getDefenderParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefender();

                    state._fsp--;

                     after(grammarAccess.getPlayerStatisticsAccess().getDefenderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:736:2: ( ruleGoalkeeper )
                    {
                    // InternalMyDsl.g:736:2: ( ruleGoalkeeper )
                    // InternalMyDsl.g:737:3: ruleGoalkeeper
                    {
                     before(grammarAccess.getPlayerStatisticsAccess().getGoalkeeperParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoalkeeper();

                    state._fsp--;

                     after(grammarAccess.getPlayerStatisticsAccess().getGoalkeeperParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:742:2: ( ruleAttacker )
                    {
                    // InternalMyDsl.g:742:2: ( ruleAttacker )
                    // InternalMyDsl.g:743:3: ruleAttacker
                    {
                     before(grammarAccess.getPlayerStatisticsAccess().getAttackerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttacker();

                    state._fsp--;

                     after(grammarAccess.getPlayerStatisticsAccess().getAttackerParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerStatistics__Alternatives"


    // $ANTLR start "rule__MatchRules__Alternatives"
    // InternalMyDsl.g:752:1: rule__MatchRules__Alternatives : ( ( ruleStandard ) | ( ruleExtraTime ) | ( rulePenaltyShootout ) | ( ruleGroupStage ) );
    public final void rule__MatchRules__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( ruleStandard ) | ( ruleExtraTime ) | ( rulePenaltyShootout ) | ( ruleGroupStage ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 84:
            case 86:
            case 89:
            case 91:
                {
                alt3=1;
                }
                break;
            case 85:
                {
                alt3=2;
                }
                break;
            case 88:
                {
                alt3=3;
                }
                break;
            case 90:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:757:2: ( ruleStandard )
                    {
                    // InternalMyDsl.g:757:2: ( ruleStandard )
                    // InternalMyDsl.g:758:3: ruleStandard
                    {
                     before(grammarAccess.getMatchRulesAccess().getStandardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStandard();

                    state._fsp--;

                     after(grammarAccess.getMatchRulesAccess().getStandardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:763:2: ( ruleExtraTime )
                    {
                    // InternalMyDsl.g:763:2: ( ruleExtraTime )
                    // InternalMyDsl.g:764:3: ruleExtraTime
                    {
                     before(grammarAccess.getMatchRulesAccess().getExtraTimeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExtraTime();

                    state._fsp--;

                     after(grammarAccess.getMatchRulesAccess().getExtraTimeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:769:2: ( rulePenaltyShootout )
                    {
                    // InternalMyDsl.g:769:2: ( rulePenaltyShootout )
                    // InternalMyDsl.g:770:3: rulePenaltyShootout
                    {
                     before(grammarAccess.getMatchRulesAccess().getPenaltyShootoutParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePenaltyShootout();

                    state._fsp--;

                     after(grammarAccess.getMatchRulesAccess().getPenaltyShootoutParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:775:2: ( ruleGroupStage )
                    {
                    // InternalMyDsl.g:775:2: ( ruleGroupStage )
                    // InternalMyDsl.g:776:3: ruleGroupStage
                    {
                     before(grammarAccess.getMatchRulesAccess().getGroupStageParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupStage();

                    state._fsp--;

                     after(grammarAccess.getMatchRulesAccess().getGroupStageParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchRules__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:785:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:789:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:790:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:790:2: ( RULE_STRING )
                    // InternalMyDsl.g:791:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:796:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:796:2: ( RULE_ID )
                    // InternalMyDsl.g:797:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:806:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:811:2: ( 'true' )
                    {
                    // InternalMyDsl.g:811:2: ( 'true' )
                    // InternalMyDsl.g:812:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:817:2: ( 'false' )
                    {
                    // InternalMyDsl.g:817:2: ( 'false' )
                    // InternalMyDsl.g:818:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__TournamentType__Alternatives"
    // InternalMyDsl.g:827:1: rule__TournamentType__Alternatives : ( ( ( 'KNOCKOUT' ) ) | ( ( 'LEAGUE' ) ) | ( ( 'ROUND_ROBIN' ) ) );
    public final void rule__TournamentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ( 'KNOCKOUT' ) ) | ( ( 'LEAGUE' ) ) | ( ( 'ROUND_ROBIN' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:832:2: ( ( 'KNOCKOUT' ) )
                    {
                    // InternalMyDsl.g:832:2: ( ( 'KNOCKOUT' ) )
                    // InternalMyDsl.g:833:3: ( 'KNOCKOUT' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getKNOCKOUTEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:834:3: ( 'KNOCKOUT' )
                    // InternalMyDsl.g:834:4: 'KNOCKOUT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getKNOCKOUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:838:2: ( ( 'LEAGUE' ) )
                    {
                    // InternalMyDsl.g:838:2: ( ( 'LEAGUE' ) )
                    // InternalMyDsl.g:839:3: ( 'LEAGUE' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getLEAGUEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:840:3: ( 'LEAGUE' )
                    // InternalMyDsl.g:840:4: 'LEAGUE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getLEAGUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:844:2: ( ( 'ROUND_ROBIN' ) )
                    {
                    // InternalMyDsl.g:844:2: ( ( 'ROUND_ROBIN' ) )
                    // InternalMyDsl.g:845:3: ( 'ROUND_ROBIN' )
                    {
                     before(grammarAccess.getTournamentTypeAccess().getROUND_ROBINEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:846:3: ( 'ROUND_ROBIN' )
                    // InternalMyDsl.g:846:4: 'ROUND_ROBIN'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTournamentTypeAccess().getROUND_ROBINEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TournamentType__Alternatives"


    // $ANTLR start "rule__PlayerPosition__Alternatives"
    // InternalMyDsl.g:854:1: rule__PlayerPosition__Alternatives : ( ( ( 'GOALKEEPER' ) ) | ( ( 'DEFENDER' ) ) | ( ( 'MIDFIELDER' ) ) | ( ( 'ATTACKER' ) ) );
    public final void rule__PlayerPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( ( 'GOALKEEPER' ) ) | ( ( 'DEFENDER' ) ) | ( ( 'MIDFIELDER' ) ) | ( ( 'ATTACKER' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:859:2: ( ( 'GOALKEEPER' ) )
                    {
                    // InternalMyDsl.g:859:2: ( ( 'GOALKEEPER' ) )
                    // InternalMyDsl.g:860:3: ( 'GOALKEEPER' )
                    {
                     before(grammarAccess.getPlayerPositionAccess().getGOALKEEPEREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:861:3: ( 'GOALKEEPER' )
                    // InternalMyDsl.g:861:4: 'GOALKEEPER'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlayerPositionAccess().getGOALKEEPEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:865:2: ( ( 'DEFENDER' ) )
                    {
                    // InternalMyDsl.g:865:2: ( ( 'DEFENDER' ) )
                    // InternalMyDsl.g:866:3: ( 'DEFENDER' )
                    {
                     before(grammarAccess.getPlayerPositionAccess().getDEFENDEREnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:867:3: ( 'DEFENDER' )
                    // InternalMyDsl.g:867:4: 'DEFENDER'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlayerPositionAccess().getDEFENDEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:871:2: ( ( 'MIDFIELDER' ) )
                    {
                    // InternalMyDsl.g:871:2: ( ( 'MIDFIELDER' ) )
                    // InternalMyDsl.g:872:3: ( 'MIDFIELDER' )
                    {
                     before(grammarAccess.getPlayerPositionAccess().getMIDFIELDEREnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:873:3: ( 'MIDFIELDER' )
                    // InternalMyDsl.g:873:4: 'MIDFIELDER'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlayerPositionAccess().getMIDFIELDEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:877:2: ( ( 'ATTACKER' ) )
                    {
                    // InternalMyDsl.g:877:2: ( ( 'ATTACKER' ) )
                    // InternalMyDsl.g:878:3: ( 'ATTACKER' )
                    {
                     before(grammarAccess.getPlayerPositionAccess().getATTACKEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:879:3: ( 'ATTACKER' )
                    // InternalMyDsl.g:879:4: 'ATTACKER'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPlayerPositionAccess().getATTACKEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlayerPosition__Alternatives"


    // $ANTLR start "rule__FinalsFormat__Alternatives"
    // InternalMyDsl.g:887:1: rule__FinalsFormat__Alternatives : ( ( ( 'SINGLE_FINAL' ) ) | ( ( 'BEST_OF_THREE' ) ) );
    public final void rule__FinalsFormat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( ( 'SINGLE_FINAL' ) ) | ( ( 'BEST_OF_THREE' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:892:2: ( ( 'SINGLE_FINAL' ) )
                    {
                    // InternalMyDsl.g:892:2: ( ( 'SINGLE_FINAL' ) )
                    // InternalMyDsl.g:893:3: ( 'SINGLE_FINAL' )
                    {
                     before(grammarAccess.getFinalsFormatAccess().getSINGLE_FINALEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:894:3: ( 'SINGLE_FINAL' )
                    // InternalMyDsl.g:894:4: 'SINGLE_FINAL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFinalsFormatAccess().getSINGLE_FINALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:898:2: ( ( 'BEST_OF_THREE' ) )
                    {
                    // InternalMyDsl.g:898:2: ( ( 'BEST_OF_THREE' ) )
                    // InternalMyDsl.g:899:3: ( 'BEST_OF_THREE' )
                    {
                     before(grammarAccess.getFinalsFormatAccess().getBEST_OF_THREEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:900:3: ( 'BEST_OF_THREE' )
                    // InternalMyDsl.g:900:4: 'BEST_OF_THREE'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFinalsFormatAccess().getBEST_OF_THREEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FinalsFormat__Alternatives"


    // $ANTLR start "rule__TieBreakerRule__Alternatives"
    // InternalMyDsl.g:908:1: rule__TieBreakerRule__Alternatives : ( ( ( 'GOAL_DIFFERENCE' ) ) | ( ( 'HEAD_TO_HEAD' ) ) | ( ( 'GOALS_SCORED' ) ) );
    public final void rule__TieBreakerRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( ( 'GOAL_DIFFERENCE' ) ) | ( ( 'HEAD_TO_HEAD' ) ) | ( ( 'GOALS_SCORED' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:913:2: ( ( 'GOAL_DIFFERENCE' ) )
                    {
                    // InternalMyDsl.g:913:2: ( ( 'GOAL_DIFFERENCE' ) )
                    // InternalMyDsl.g:914:3: ( 'GOAL_DIFFERENCE' )
                    {
                     before(grammarAccess.getTieBreakerRuleAccess().getGOAL_DIFFERENCEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:915:3: ( 'GOAL_DIFFERENCE' )
                    // InternalMyDsl.g:915:4: 'GOAL_DIFFERENCE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTieBreakerRuleAccess().getGOAL_DIFFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:919:2: ( ( 'HEAD_TO_HEAD' ) )
                    {
                    // InternalMyDsl.g:919:2: ( ( 'HEAD_TO_HEAD' ) )
                    // InternalMyDsl.g:920:3: ( 'HEAD_TO_HEAD' )
                    {
                     before(grammarAccess.getTieBreakerRuleAccess().getHEAD_TO_HEADEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:921:3: ( 'HEAD_TO_HEAD' )
                    // InternalMyDsl.g:921:4: 'HEAD_TO_HEAD'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTieBreakerRuleAccess().getHEAD_TO_HEADEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:925:2: ( ( 'GOALS_SCORED' ) )
                    {
                    // InternalMyDsl.g:925:2: ( ( 'GOALS_SCORED' ) )
                    // InternalMyDsl.g:926:3: ( 'GOALS_SCORED' )
                    {
                     before(grammarAccess.getTieBreakerRuleAccess().getGOALS_SCOREDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:927:3: ( 'GOALS_SCORED' )
                    // InternalMyDsl.g:927:4: 'GOALS_SCORED'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTieBreakerRuleAccess().getGOALS_SCOREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TieBreakerRule__Alternatives"


    // $ANTLR start "rule__BracketSide__Alternatives"
    // InternalMyDsl.g:935:1: rule__BracketSide__Alternatives : ( ( ( 'UPPER' ) ) | ( ( 'LOWER' ) ) );
    public final void rule__BracketSide__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( 'UPPER' ) ) | ( ( 'LOWER' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:940:2: ( ( 'UPPER' ) )
                    {
                    // InternalMyDsl.g:940:2: ( ( 'UPPER' ) )
                    // InternalMyDsl.g:941:3: ( 'UPPER' )
                    {
                     before(grammarAccess.getBracketSideAccess().getUPPEREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:942:3: ( 'UPPER' )
                    // InternalMyDsl.g:942:4: 'UPPER'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBracketSideAccess().getUPPEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:946:2: ( ( 'LOWER' ) )
                    {
                    // InternalMyDsl.g:946:2: ( ( 'LOWER' ) )
                    // InternalMyDsl.g:947:3: ( 'LOWER' )
                    {
                     before(grammarAccess.getBracketSideAccess().getLOWEREnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:948:3: ( 'LOWER' )
                    // InternalMyDsl.g:948:4: 'LOWER'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBracketSideAccess().getLOWEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketSide__Alternatives"


    // $ANTLR start "rule__MatchResult__Alternatives"
    // InternalMyDsl.g:956:1: rule__MatchResult__Alternatives : ( ( ( 'WIN' ) ) | ( ( 'LOSS' ) ) | ( ( 'DRAW' ) ) );
    public final void rule__MatchResult__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( ( ( 'WIN' ) ) | ( ( 'LOSS' ) ) | ( ( 'DRAW' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:961:2: ( ( 'WIN' ) )
                    {
                    // InternalMyDsl.g:961:2: ( ( 'WIN' ) )
                    // InternalMyDsl.g:962:3: ( 'WIN' )
                    {
                     before(grammarAccess.getMatchResultAccess().getWINEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:963:3: ( 'WIN' )
                    // InternalMyDsl.g:963:4: 'WIN'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchResultAccess().getWINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:967:2: ( ( 'LOSS' ) )
                    {
                    // InternalMyDsl.g:967:2: ( ( 'LOSS' ) )
                    // InternalMyDsl.g:968:3: ( 'LOSS' )
                    {
                     before(grammarAccess.getMatchResultAccess().getLOSSEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:969:3: ( 'LOSS' )
                    // InternalMyDsl.g:969:4: 'LOSS'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchResultAccess().getLOSSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:973:2: ( ( 'DRAW' ) )
                    {
                    // InternalMyDsl.g:973:2: ( ( 'DRAW' ) )
                    // InternalMyDsl.g:974:3: ( 'DRAW' )
                    {
                     before(grammarAccess.getMatchResultAccess().getDRAWEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:975:3: ( 'DRAW' )
                    // InternalMyDsl.g:975:4: 'DRAW'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMatchResultAccess().getDRAWEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatchResult__Alternatives"


    // $ANTLR start "rule__Tournament__Group__0"
    // InternalMyDsl.g:983:1: rule__Tournament__Group__0 : rule__Tournament__Group__0__Impl rule__Tournament__Group__1 ;
    public final void rule__Tournament__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__Tournament__Group__0__Impl rule__Tournament__Group__1 )
            // InternalMyDsl.g:988:2: rule__Tournament__Group__0__Impl rule__Tournament__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tournament__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__0"


    // $ANTLR start "rule__Tournament__Group__0__Impl"
    // InternalMyDsl.g:995:1: rule__Tournament__Group__0__Impl : ( 'Tournament' ) ;
    public final void rule__Tournament__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( 'Tournament' ) )
            // InternalMyDsl.g:1000:1: ( 'Tournament' )
            {
            // InternalMyDsl.g:1000:1: ( 'Tournament' )
            // InternalMyDsl.g:1001:2: 'Tournament'
            {
             before(grammarAccess.getTournamentAccess().getTournamentKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getTournamentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__0__Impl"


    // $ANTLR start "rule__Tournament__Group__1"
    // InternalMyDsl.g:1010:1: rule__Tournament__Group__1 : rule__Tournament__Group__1__Impl rule__Tournament__Group__2 ;
    public final void rule__Tournament__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__Tournament__Group__1__Impl rule__Tournament__Group__2 )
            // InternalMyDsl.g:1015:2: rule__Tournament__Group__1__Impl rule__Tournament__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tournament__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__1"


    // $ANTLR start "rule__Tournament__Group__1__Impl"
    // InternalMyDsl.g:1022:1: rule__Tournament__Group__1__Impl : ( ( rule__Tournament__NameAssignment_1 ) ) ;
    public final void rule__Tournament__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( rule__Tournament__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1027:1: ( ( rule__Tournament__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1027:1: ( ( rule__Tournament__NameAssignment_1 ) )
            // InternalMyDsl.g:1028:2: ( rule__Tournament__NameAssignment_1 )
            {
             before(grammarAccess.getTournamentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1029:2: ( rule__Tournament__NameAssignment_1 )
            // InternalMyDsl.g:1029:3: rule__Tournament__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__1__Impl"


    // $ANTLR start "rule__Tournament__Group__2"
    // InternalMyDsl.g:1037:1: rule__Tournament__Group__2 : rule__Tournament__Group__2__Impl rule__Tournament__Group__3 ;
    public final void rule__Tournament__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__Tournament__Group__2__Impl rule__Tournament__Group__3 )
            // InternalMyDsl.g:1042:2: rule__Tournament__Group__2__Impl rule__Tournament__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__2"


    // $ANTLR start "rule__Tournament__Group__2__Impl"
    // InternalMyDsl.g:1049:1: rule__Tournament__Group__2__Impl : ( '{' ) ;
    public final void rule__Tournament__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( '{' ) )
            // InternalMyDsl.g:1054:1: ( '{' )
            {
            // InternalMyDsl.g:1054:1: ( '{' )
            // InternalMyDsl.g:1055:2: '{'
            {
             before(grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__2__Impl"


    // $ANTLR start "rule__Tournament__Group__3"
    // InternalMyDsl.g:1064:1: rule__Tournament__Group__3 : rule__Tournament__Group__3__Impl rule__Tournament__Group__4 ;
    public final void rule__Tournament__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__Tournament__Group__3__Impl rule__Tournament__Group__4 )
            // InternalMyDsl.g:1069:2: rule__Tournament__Group__3__Impl rule__Tournament__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__3"


    // $ANTLR start "rule__Tournament__Group__3__Impl"
    // InternalMyDsl.g:1076:1: rule__Tournament__Group__3__Impl : ( ( rule__Tournament__Group_3__0 )? ) ;
    public final void rule__Tournament__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__Tournament__Group_3__0 )? ) )
            // InternalMyDsl.g:1081:1: ( ( rule__Tournament__Group_3__0 )? )
            {
            // InternalMyDsl.g:1081:1: ( ( rule__Tournament__Group_3__0 )? )
            // InternalMyDsl.g:1082:2: ( rule__Tournament__Group_3__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_3()); 
            // InternalMyDsl.g:1083:2: ( rule__Tournament__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1083:3: rule__Tournament__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__3__Impl"


    // $ANTLR start "rule__Tournament__Group__4"
    // InternalMyDsl.g:1091:1: rule__Tournament__Group__4 : rule__Tournament__Group__4__Impl rule__Tournament__Group__5 ;
    public final void rule__Tournament__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__Tournament__Group__4__Impl rule__Tournament__Group__5 )
            // InternalMyDsl.g:1096:2: rule__Tournament__Group__4__Impl rule__Tournament__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Tournament__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__4"


    // $ANTLR start "rule__Tournament__Group__4__Impl"
    // InternalMyDsl.g:1103:1: rule__Tournament__Group__4__Impl : ( ( rule__Tournament__Group_4__0 )? ) ;
    public final void rule__Tournament__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__Tournament__Group_4__0 )? ) )
            // InternalMyDsl.g:1108:1: ( ( rule__Tournament__Group_4__0 )? )
            {
            // InternalMyDsl.g:1108:1: ( ( rule__Tournament__Group_4__0 )? )
            // InternalMyDsl.g:1109:2: ( rule__Tournament__Group_4__0 )?
            {
             before(grammarAccess.getTournamentAccess().getGroup_4()); 
            // InternalMyDsl.g:1110:2: ( rule__Tournament__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1110:3: rule__Tournament__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tournament__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTournamentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__4__Impl"


    // $ANTLR start "rule__Tournament__Group__5"
    // InternalMyDsl.g:1118:1: rule__Tournament__Group__5 : rule__Tournament__Group__5__Impl rule__Tournament__Group__6 ;
    public final void rule__Tournament__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__Tournament__Group__5__Impl rule__Tournament__Group__6 )
            // InternalMyDsl.g:1123:2: rule__Tournament__Group__5__Impl rule__Tournament__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Tournament__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__5"


    // $ANTLR start "rule__Tournament__Group__5__Impl"
    // InternalMyDsl.g:1130:1: rule__Tournament__Group__5__Impl : ( 'tournamentformat' ) ;
    public final void rule__Tournament__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( ( 'tournamentformat' ) )
            // InternalMyDsl.g:1135:1: ( 'tournamentformat' )
            {
            // InternalMyDsl.g:1135:1: ( 'tournamentformat' )
            // InternalMyDsl.g:1136:2: 'tournamentformat'
            {
             before(grammarAccess.getTournamentAccess().getTournamentformatKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getTournamentformatKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__5__Impl"


    // $ANTLR start "rule__Tournament__Group__6"
    // InternalMyDsl.g:1145:1: rule__Tournament__Group__6 : rule__Tournament__Group__6__Impl rule__Tournament__Group__7 ;
    public final void rule__Tournament__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__Tournament__Group__6__Impl rule__Tournament__Group__7 )
            // InternalMyDsl.g:1150:2: rule__Tournament__Group__6__Impl rule__Tournament__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Tournament__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__6"


    // $ANTLR start "rule__Tournament__Group__6__Impl"
    // InternalMyDsl.g:1157:1: rule__Tournament__Group__6__Impl : ( ( rule__Tournament__TournamentformatAssignment_6 ) ) ;
    public final void rule__Tournament__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( ( rule__Tournament__TournamentformatAssignment_6 ) ) )
            // InternalMyDsl.g:1162:1: ( ( rule__Tournament__TournamentformatAssignment_6 ) )
            {
            // InternalMyDsl.g:1162:1: ( ( rule__Tournament__TournamentformatAssignment_6 ) )
            // InternalMyDsl.g:1163:2: ( rule__Tournament__TournamentformatAssignment_6 )
            {
             before(grammarAccess.getTournamentAccess().getTournamentformatAssignment_6()); 
            // InternalMyDsl.g:1164:2: ( rule__Tournament__TournamentformatAssignment_6 )
            // InternalMyDsl.g:1164:3: rule__Tournament__TournamentformatAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__TournamentformatAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getTournamentformatAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__6__Impl"


    // $ANTLR start "rule__Tournament__Group__7"
    // InternalMyDsl.g:1172:1: rule__Tournament__Group__7 : rule__Tournament__Group__7__Impl rule__Tournament__Group__8 ;
    public final void rule__Tournament__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__Tournament__Group__7__Impl rule__Tournament__Group__8 )
            // InternalMyDsl.g:1177:2: rule__Tournament__Group__7__Impl rule__Tournament__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Tournament__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__7"


    // $ANTLR start "rule__Tournament__Group__7__Impl"
    // InternalMyDsl.g:1184:1: rule__Tournament__Group__7__Impl : ( 'brackets' ) ;
    public final void rule__Tournament__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( 'brackets' ) )
            // InternalMyDsl.g:1189:1: ( 'brackets' )
            {
            // InternalMyDsl.g:1189:1: ( 'brackets' )
            // InternalMyDsl.g:1190:2: 'brackets'
            {
             before(grammarAccess.getTournamentAccess().getBracketsKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getBracketsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__7__Impl"


    // $ANTLR start "rule__Tournament__Group__8"
    // InternalMyDsl.g:1199:1: rule__Tournament__Group__8 : rule__Tournament__Group__8__Impl rule__Tournament__Group__9 ;
    public final void rule__Tournament__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__Tournament__Group__8__Impl rule__Tournament__Group__9 )
            // InternalMyDsl.g:1204:2: rule__Tournament__Group__8__Impl rule__Tournament__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Tournament__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__8"


    // $ANTLR start "rule__Tournament__Group__8__Impl"
    // InternalMyDsl.g:1211:1: rule__Tournament__Group__8__Impl : ( '{' ) ;
    public final void rule__Tournament__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( '{' ) )
            // InternalMyDsl.g:1216:1: ( '{' )
            {
            // InternalMyDsl.g:1216:1: ( '{' )
            // InternalMyDsl.g:1217:2: '{'
            {
             before(grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__8__Impl"


    // $ANTLR start "rule__Tournament__Group__9"
    // InternalMyDsl.g:1226:1: rule__Tournament__Group__9 : rule__Tournament__Group__9__Impl rule__Tournament__Group__10 ;
    public final void rule__Tournament__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__Tournament__Group__9__Impl rule__Tournament__Group__10 )
            // InternalMyDsl.g:1231:2: rule__Tournament__Group__9__Impl rule__Tournament__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__9"


    // $ANTLR start "rule__Tournament__Group__9__Impl"
    // InternalMyDsl.g:1238:1: rule__Tournament__Group__9__Impl : ( ( rule__Tournament__BracketsAssignment_9 ) ) ;
    public final void rule__Tournament__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__Tournament__BracketsAssignment_9 ) ) )
            // InternalMyDsl.g:1243:1: ( ( rule__Tournament__BracketsAssignment_9 ) )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__Tournament__BracketsAssignment_9 ) )
            // InternalMyDsl.g:1244:2: ( rule__Tournament__BracketsAssignment_9 )
            {
             before(grammarAccess.getTournamentAccess().getBracketsAssignment_9()); 
            // InternalMyDsl.g:1245:2: ( rule__Tournament__BracketsAssignment_9 )
            // InternalMyDsl.g:1245:3: rule__Tournament__BracketsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__BracketsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getBracketsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__9__Impl"


    // $ANTLR start "rule__Tournament__Group__10"
    // InternalMyDsl.g:1253:1: rule__Tournament__Group__10 : rule__Tournament__Group__10__Impl rule__Tournament__Group__11 ;
    public final void rule__Tournament__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( rule__Tournament__Group__10__Impl rule__Tournament__Group__11 )
            // InternalMyDsl.g:1258:2: rule__Tournament__Group__10__Impl rule__Tournament__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__10"


    // $ANTLR start "rule__Tournament__Group__10__Impl"
    // InternalMyDsl.g:1265:1: rule__Tournament__Group__10__Impl : ( ( rule__Tournament__Group_10__0 )* ) ;
    public final void rule__Tournament__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( ( rule__Tournament__Group_10__0 )* ) )
            // InternalMyDsl.g:1270:1: ( ( rule__Tournament__Group_10__0 )* )
            {
            // InternalMyDsl.g:1270:1: ( ( rule__Tournament__Group_10__0 )* )
            // InternalMyDsl.g:1271:2: ( rule__Tournament__Group_10__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_10()); 
            // InternalMyDsl.g:1272:2: ( rule__Tournament__Group_10__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1272:3: rule__Tournament__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__10__Impl"


    // $ANTLR start "rule__Tournament__Group__11"
    // InternalMyDsl.g:1280:1: rule__Tournament__Group__11 : rule__Tournament__Group__11__Impl rule__Tournament__Group__12 ;
    public final void rule__Tournament__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( rule__Tournament__Group__11__Impl rule__Tournament__Group__12 )
            // InternalMyDsl.g:1285:2: rule__Tournament__Group__11__Impl rule__Tournament__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Tournament__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__11"


    // $ANTLR start "rule__Tournament__Group__11__Impl"
    // InternalMyDsl.g:1292:1: rule__Tournament__Group__11__Impl : ( '}' ) ;
    public final void rule__Tournament__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( '}' ) )
            // InternalMyDsl.g:1297:1: ( '}' )
            {
            // InternalMyDsl.g:1297:1: ( '}' )
            // InternalMyDsl.g:1298:2: '}'
            {
             before(grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__11__Impl"


    // $ANTLR start "rule__Tournament__Group__12"
    // InternalMyDsl.g:1307:1: rule__Tournament__Group__12 : rule__Tournament__Group__12__Impl ;
    public final void rule__Tournament__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( rule__Tournament__Group__12__Impl )
            // InternalMyDsl.g:1312:2: rule__Tournament__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__12"


    // $ANTLR start "rule__Tournament__Group__12__Impl"
    // InternalMyDsl.g:1318:1: rule__Tournament__Group__12__Impl : ( '}' ) ;
    public final void rule__Tournament__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( ( '}' ) )
            // InternalMyDsl.g:1323:1: ( '}' )
            {
            // InternalMyDsl.g:1323:1: ( '}' )
            // InternalMyDsl.g:1324:2: '}'
            {
             before(grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_12()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group__12__Impl"


    // $ANTLR start "rule__Tournament__Group_3__0"
    // InternalMyDsl.g:1334:1: rule__Tournament__Group_3__0 : rule__Tournament__Group_3__0__Impl rule__Tournament__Group_3__1 ;
    public final void rule__Tournament__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( rule__Tournament__Group_3__0__Impl rule__Tournament__Group_3__1 )
            // InternalMyDsl.g:1339:2: rule__Tournament__Group_3__0__Impl rule__Tournament__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Tournament__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_3__0"


    // $ANTLR start "rule__Tournament__Group_3__0__Impl"
    // InternalMyDsl.g:1346:1: rule__Tournament__Group_3__0__Impl : ( 'tournamentType' ) ;
    public final void rule__Tournament__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( 'tournamentType' ) )
            // InternalMyDsl.g:1351:1: ( 'tournamentType' )
            {
            // InternalMyDsl.g:1351:1: ( 'tournamentType' )
            // InternalMyDsl.g:1352:2: 'tournamentType'
            {
             before(grammarAccess.getTournamentAccess().getTournamentTypeKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getTournamentTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_3__0__Impl"


    // $ANTLR start "rule__Tournament__Group_3__1"
    // InternalMyDsl.g:1361:1: rule__Tournament__Group_3__1 : rule__Tournament__Group_3__1__Impl ;
    public final void rule__Tournament__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( rule__Tournament__Group_3__1__Impl )
            // InternalMyDsl.g:1366:2: rule__Tournament__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_3__1"


    // $ANTLR start "rule__Tournament__Group_3__1__Impl"
    // InternalMyDsl.g:1372:1: rule__Tournament__Group_3__1__Impl : ( ( rule__Tournament__TournamentTypeAssignment_3_1 ) ) ;
    public final void rule__Tournament__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( ( ( rule__Tournament__TournamentTypeAssignment_3_1 ) ) )
            // InternalMyDsl.g:1377:1: ( ( rule__Tournament__TournamentTypeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1377:1: ( ( rule__Tournament__TournamentTypeAssignment_3_1 ) )
            // InternalMyDsl.g:1378:2: ( rule__Tournament__TournamentTypeAssignment_3_1 )
            {
             before(grammarAccess.getTournamentAccess().getTournamentTypeAssignment_3_1()); 
            // InternalMyDsl.g:1379:2: ( rule__Tournament__TournamentTypeAssignment_3_1 )
            // InternalMyDsl.g:1379:3: rule__Tournament__TournamentTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__TournamentTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getTournamentTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_3__1__Impl"


    // $ANTLR start "rule__Tournament__Group_4__0"
    // InternalMyDsl.g:1388:1: rule__Tournament__Group_4__0 : rule__Tournament__Group_4__0__Impl rule__Tournament__Group_4__1 ;
    public final void rule__Tournament__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( rule__Tournament__Group_4__0__Impl rule__Tournament__Group_4__1 )
            // InternalMyDsl.g:1393:2: rule__Tournament__Group_4__0__Impl rule__Tournament__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Tournament__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__0"


    // $ANTLR start "rule__Tournament__Group_4__0__Impl"
    // InternalMyDsl.g:1400:1: rule__Tournament__Group_4__0__Impl : ( 'teams' ) ;
    public final void rule__Tournament__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( 'teams' ) )
            // InternalMyDsl.g:1405:1: ( 'teams' )
            {
            // InternalMyDsl.g:1405:1: ( 'teams' )
            // InternalMyDsl.g:1406:2: 'teams'
            {
             before(grammarAccess.getTournamentAccess().getTeamsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getTeamsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__0__Impl"


    // $ANTLR start "rule__Tournament__Group_4__1"
    // InternalMyDsl.g:1415:1: rule__Tournament__Group_4__1 : rule__Tournament__Group_4__1__Impl rule__Tournament__Group_4__2 ;
    public final void rule__Tournament__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( rule__Tournament__Group_4__1__Impl rule__Tournament__Group_4__2 )
            // InternalMyDsl.g:1420:2: rule__Tournament__Group_4__1__Impl rule__Tournament__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Tournament__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__1"


    // $ANTLR start "rule__Tournament__Group_4__1__Impl"
    // InternalMyDsl.g:1427:1: rule__Tournament__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Tournament__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1431:1: ( ( '{' ) )
            // InternalMyDsl.g:1432:1: ( '{' )
            {
            // InternalMyDsl.g:1432:1: ( '{' )
            // InternalMyDsl.g:1433:2: '{'
            {
             before(grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__1__Impl"


    // $ANTLR start "rule__Tournament__Group_4__2"
    // InternalMyDsl.g:1442:1: rule__Tournament__Group_4__2 : rule__Tournament__Group_4__2__Impl rule__Tournament__Group_4__3 ;
    public final void rule__Tournament__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1446:1: ( rule__Tournament__Group_4__2__Impl rule__Tournament__Group_4__3 )
            // InternalMyDsl.g:1447:2: rule__Tournament__Group_4__2__Impl rule__Tournament__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__2"


    // $ANTLR start "rule__Tournament__Group_4__2__Impl"
    // InternalMyDsl.g:1454:1: rule__Tournament__Group_4__2__Impl : ( ( rule__Tournament__TeamsAssignment_4_2 ) ) ;
    public final void rule__Tournament__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( ( rule__Tournament__TeamsAssignment_4_2 ) ) )
            // InternalMyDsl.g:1459:1: ( ( rule__Tournament__TeamsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1459:1: ( ( rule__Tournament__TeamsAssignment_4_2 ) )
            // InternalMyDsl.g:1460:2: ( rule__Tournament__TeamsAssignment_4_2 )
            {
             before(grammarAccess.getTournamentAccess().getTeamsAssignment_4_2()); 
            // InternalMyDsl.g:1461:2: ( rule__Tournament__TeamsAssignment_4_2 )
            // InternalMyDsl.g:1461:3: rule__Tournament__TeamsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__TeamsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getTeamsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__2__Impl"


    // $ANTLR start "rule__Tournament__Group_4__3"
    // InternalMyDsl.g:1469:1: rule__Tournament__Group_4__3 : rule__Tournament__Group_4__3__Impl rule__Tournament__Group_4__4 ;
    public final void rule__Tournament__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( rule__Tournament__Group_4__3__Impl rule__Tournament__Group_4__4 )
            // InternalMyDsl.g:1474:2: rule__Tournament__Group_4__3__Impl rule__Tournament__Group_4__4
            {
            pushFollow(FOLLOW_9);
            rule__Tournament__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__3"


    // $ANTLR start "rule__Tournament__Group_4__3__Impl"
    // InternalMyDsl.g:1481:1: rule__Tournament__Group_4__3__Impl : ( ( rule__Tournament__Group_4_3__0 )* ) ;
    public final void rule__Tournament__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1485:1: ( ( ( rule__Tournament__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1486:1: ( ( rule__Tournament__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1486:1: ( ( rule__Tournament__Group_4_3__0 )* )
            // InternalMyDsl.g:1487:2: ( rule__Tournament__Group_4_3__0 )*
            {
             before(grammarAccess.getTournamentAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1488:2: ( rule__Tournament__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1488:3: rule__Tournament__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Tournament__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTournamentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__3__Impl"


    // $ANTLR start "rule__Tournament__Group_4__4"
    // InternalMyDsl.g:1496:1: rule__Tournament__Group_4__4 : rule__Tournament__Group_4__4__Impl ;
    public final void rule__Tournament__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( rule__Tournament__Group_4__4__Impl )
            // InternalMyDsl.g:1501:2: rule__Tournament__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__4"


    // $ANTLR start "rule__Tournament__Group_4__4__Impl"
    // InternalMyDsl.g:1507:1: rule__Tournament__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Tournament__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( ( '}' ) )
            // InternalMyDsl.g:1512:1: ( '}' )
            {
            // InternalMyDsl.g:1512:1: ( '}' )
            // InternalMyDsl.g:1513:2: '}'
            {
             before(grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4__4__Impl"


    // $ANTLR start "rule__Tournament__Group_4_3__0"
    // InternalMyDsl.g:1523:1: rule__Tournament__Group_4_3__0 : rule__Tournament__Group_4_3__0__Impl rule__Tournament__Group_4_3__1 ;
    public final void rule__Tournament__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( rule__Tournament__Group_4_3__0__Impl rule__Tournament__Group_4_3__1 )
            // InternalMyDsl.g:1528:2: rule__Tournament__Group_4_3__0__Impl rule__Tournament__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Tournament__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4_3__0"


    // $ANTLR start "rule__Tournament__Group_4_3__0__Impl"
    // InternalMyDsl.g:1535:1: rule__Tournament__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ',' ) )
            // InternalMyDsl.g:1540:1: ( ',' )
            {
            // InternalMyDsl.g:1540:1: ( ',' )
            // InternalMyDsl.g:1541:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_4_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4_3__0__Impl"


    // $ANTLR start "rule__Tournament__Group_4_3__1"
    // InternalMyDsl.g:1550:1: rule__Tournament__Group_4_3__1 : rule__Tournament__Group_4_3__1__Impl ;
    public final void rule__Tournament__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( rule__Tournament__Group_4_3__1__Impl )
            // InternalMyDsl.g:1555:2: rule__Tournament__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4_3__1"


    // $ANTLR start "rule__Tournament__Group_4_3__1__Impl"
    // InternalMyDsl.g:1561:1: rule__Tournament__Group_4_3__1__Impl : ( ( rule__Tournament__TeamsAssignment_4_3_1 ) ) ;
    public final void rule__Tournament__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1565:1: ( ( ( rule__Tournament__TeamsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1566:1: ( ( rule__Tournament__TeamsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1566:1: ( ( rule__Tournament__TeamsAssignment_4_3_1 ) )
            // InternalMyDsl.g:1567:2: ( rule__Tournament__TeamsAssignment_4_3_1 )
            {
             before(grammarAccess.getTournamentAccess().getTeamsAssignment_4_3_1()); 
            // InternalMyDsl.g:1568:2: ( rule__Tournament__TeamsAssignment_4_3_1 )
            // InternalMyDsl.g:1568:3: rule__Tournament__TeamsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__TeamsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getTeamsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_4_3__1__Impl"


    // $ANTLR start "rule__Tournament__Group_10__0"
    // InternalMyDsl.g:1577:1: rule__Tournament__Group_10__0 : rule__Tournament__Group_10__0__Impl rule__Tournament__Group_10__1 ;
    public final void rule__Tournament__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( rule__Tournament__Group_10__0__Impl rule__Tournament__Group_10__1 )
            // InternalMyDsl.g:1582:2: rule__Tournament__Group_10__0__Impl rule__Tournament__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Tournament__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tournament__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_10__0"


    // $ANTLR start "rule__Tournament__Group_10__0__Impl"
    // InternalMyDsl.g:1589:1: rule__Tournament__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Tournament__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( ',' ) )
            // InternalMyDsl.g:1594:1: ( ',' )
            {
            // InternalMyDsl.g:1594:1: ( ',' )
            // InternalMyDsl.g:1595:2: ','
            {
             before(grammarAccess.getTournamentAccess().getCommaKeyword_10_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTournamentAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_10__0__Impl"


    // $ANTLR start "rule__Tournament__Group_10__1"
    // InternalMyDsl.g:1604:1: rule__Tournament__Group_10__1 : rule__Tournament__Group_10__1__Impl ;
    public final void rule__Tournament__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( rule__Tournament__Group_10__1__Impl )
            // InternalMyDsl.g:1609:2: rule__Tournament__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_10__1"


    // $ANTLR start "rule__Tournament__Group_10__1__Impl"
    // InternalMyDsl.g:1615:1: rule__Tournament__Group_10__1__Impl : ( ( rule__Tournament__BracketsAssignment_10_1 ) ) ;
    public final void rule__Tournament__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1619:1: ( ( ( rule__Tournament__BracketsAssignment_10_1 ) ) )
            // InternalMyDsl.g:1620:1: ( ( rule__Tournament__BracketsAssignment_10_1 ) )
            {
            // InternalMyDsl.g:1620:1: ( ( rule__Tournament__BracketsAssignment_10_1 ) )
            // InternalMyDsl.g:1621:2: ( rule__Tournament__BracketsAssignment_10_1 )
            {
             before(grammarAccess.getTournamentAccess().getBracketsAssignment_10_1()); 
            // InternalMyDsl.g:1622:2: ( rule__Tournament__BracketsAssignment_10_1 )
            // InternalMyDsl.g:1622:3: rule__Tournament__BracketsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Tournament__BracketsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTournamentAccess().getBracketsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__Group_10__1__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // InternalMyDsl.g:1631:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalMyDsl.g:1636:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // InternalMyDsl.g:1643:1: rule__Team__Group__0__Impl : ( 'Team' ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1647:1: ( ( 'Team' ) )
            // InternalMyDsl.g:1648:1: ( 'Team' )
            {
            // InternalMyDsl.g:1648:1: ( 'Team' )
            // InternalMyDsl.g:1649:2: 'Team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // InternalMyDsl.g:1658:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // InternalMyDsl.g:1663:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // InternalMyDsl.g:1670:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1675:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1675:1: ( ( rule__Team__NameAssignment_1 ) )
            // InternalMyDsl.g:1676:2: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1677:2: ( rule__Team__NameAssignment_1 )
            // InternalMyDsl.g:1677:3: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__2"
    // InternalMyDsl.g:1685:1: rule__Team__Group__2 : rule__Team__Group__2__Impl rule__Team__Group__3 ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( rule__Team__Group__2__Impl rule__Team__Group__3 )
            // InternalMyDsl.g:1690:2: rule__Team__Group__2__Impl rule__Team__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Team__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2"


    // $ANTLR start "rule__Team__Group__2__Impl"
    // InternalMyDsl.g:1697:1: rule__Team__Group__2__Impl : ( '{' ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1701:1: ( ( '{' ) )
            // InternalMyDsl.g:1702:1: ( '{' )
            {
            // InternalMyDsl.g:1702:1: ( '{' )
            // InternalMyDsl.g:1703:2: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__2__Impl"


    // $ANTLR start "rule__Team__Group__3"
    // InternalMyDsl.g:1712:1: rule__Team__Group__3 : rule__Team__Group__3__Impl rule__Team__Group__4 ;
    public final void rule__Team__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( rule__Team__Group__3__Impl rule__Team__Group__4 )
            // InternalMyDsl.g:1717:2: rule__Team__Group__3__Impl rule__Team__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Team__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__3"


    // $ANTLR start "rule__Team__Group__3__Impl"
    // InternalMyDsl.g:1724:1: rule__Team__Group__3__Impl : ( ( rule__Team__Group_3__0 )? ) ;
    public final void rule__Team__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1728:1: ( ( ( rule__Team__Group_3__0 )? ) )
            // InternalMyDsl.g:1729:1: ( ( rule__Team__Group_3__0 )? )
            {
            // InternalMyDsl.g:1729:1: ( ( rule__Team__Group_3__0 )? )
            // InternalMyDsl.g:1730:2: ( rule__Team__Group_3__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_3()); 
            // InternalMyDsl.g:1731:2: ( rule__Team__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1731:3: rule__Team__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Team__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__3__Impl"


    // $ANTLR start "rule__Team__Group__4"
    // InternalMyDsl.g:1739:1: rule__Team__Group__4 : rule__Team__Group__4__Impl rule__Team__Group__5 ;
    public final void rule__Team__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1743:1: ( rule__Team__Group__4__Impl rule__Team__Group__5 )
            // InternalMyDsl.g:1744:2: rule__Team__Group__4__Impl rule__Team__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Team__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__4"


    // $ANTLR start "rule__Team__Group__4__Impl"
    // InternalMyDsl.g:1751:1: rule__Team__Group__4__Impl : ( ( rule__Team__Group_4__0 )? ) ;
    public final void rule__Team__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1755:1: ( ( ( rule__Team__Group_4__0 )? ) )
            // InternalMyDsl.g:1756:1: ( ( rule__Team__Group_4__0 )? )
            {
            // InternalMyDsl.g:1756:1: ( ( rule__Team__Group_4__0 )? )
            // InternalMyDsl.g:1757:2: ( rule__Team__Group_4__0 )?
            {
             before(grammarAccess.getTeamAccess().getGroup_4()); 
            // InternalMyDsl.g:1758:2: ( rule__Team__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1758:3: rule__Team__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Team__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTeamAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__4__Impl"


    // $ANTLR start "rule__Team__Group__5"
    // InternalMyDsl.g:1766:1: rule__Team__Group__5 : rule__Team__Group__5__Impl rule__Team__Group__6 ;
    public final void rule__Team__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( rule__Team__Group__5__Impl rule__Team__Group__6 )
            // InternalMyDsl.g:1771:2: rule__Team__Group__5__Impl rule__Team__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Team__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__5"


    // $ANTLR start "rule__Team__Group__5__Impl"
    // InternalMyDsl.g:1778:1: rule__Team__Group__5__Impl : ( 'players' ) ;
    public final void rule__Team__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1782:1: ( ( 'players' ) )
            // InternalMyDsl.g:1783:1: ( 'players' )
            {
            // InternalMyDsl.g:1783:1: ( 'players' )
            // InternalMyDsl.g:1784:2: 'players'
            {
             before(grammarAccess.getTeamAccess().getPlayersKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getPlayersKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__5__Impl"


    // $ANTLR start "rule__Team__Group__6"
    // InternalMyDsl.g:1793:1: rule__Team__Group__6 : rule__Team__Group__6__Impl rule__Team__Group__7 ;
    public final void rule__Team__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( rule__Team__Group__6__Impl rule__Team__Group__7 )
            // InternalMyDsl.g:1798:2: rule__Team__Group__6__Impl rule__Team__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Team__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__6"


    // $ANTLR start "rule__Team__Group__6__Impl"
    // InternalMyDsl.g:1805:1: rule__Team__Group__6__Impl : ( '{' ) ;
    public final void rule__Team__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( '{' ) )
            // InternalMyDsl.g:1810:1: ( '{' )
            {
            // InternalMyDsl.g:1810:1: ( '{' )
            // InternalMyDsl.g:1811:2: '{'
            {
             before(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__6__Impl"


    // $ANTLR start "rule__Team__Group__7"
    // InternalMyDsl.g:1820:1: rule__Team__Group__7 : rule__Team__Group__7__Impl rule__Team__Group__8 ;
    public final void rule__Team__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( rule__Team__Group__7__Impl rule__Team__Group__8 )
            // InternalMyDsl.g:1825:2: rule__Team__Group__7__Impl rule__Team__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Team__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__7"


    // $ANTLR start "rule__Team__Group__7__Impl"
    // InternalMyDsl.g:1832:1: rule__Team__Group__7__Impl : ( ( rule__Team__PlayersAssignment_7 ) ) ;
    public final void rule__Team__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( ( rule__Team__PlayersAssignment_7 ) ) )
            // InternalMyDsl.g:1837:1: ( ( rule__Team__PlayersAssignment_7 ) )
            {
            // InternalMyDsl.g:1837:1: ( ( rule__Team__PlayersAssignment_7 ) )
            // InternalMyDsl.g:1838:2: ( rule__Team__PlayersAssignment_7 )
            {
             before(grammarAccess.getTeamAccess().getPlayersAssignment_7()); 
            // InternalMyDsl.g:1839:2: ( rule__Team__PlayersAssignment_7 )
            // InternalMyDsl.g:1839:3: rule__Team__PlayersAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Team__PlayersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getPlayersAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__7__Impl"


    // $ANTLR start "rule__Team__Group__8"
    // InternalMyDsl.g:1847:1: rule__Team__Group__8 : rule__Team__Group__8__Impl rule__Team__Group__9 ;
    public final void rule__Team__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( rule__Team__Group__8__Impl rule__Team__Group__9 )
            // InternalMyDsl.g:1852:2: rule__Team__Group__8__Impl rule__Team__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Team__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__8"


    // $ANTLR start "rule__Team__Group__8__Impl"
    // InternalMyDsl.g:1859:1: rule__Team__Group__8__Impl : ( ( rule__Team__Group_8__0 )* ) ;
    public final void rule__Team__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( ( rule__Team__Group_8__0 )* ) )
            // InternalMyDsl.g:1864:1: ( ( rule__Team__Group_8__0 )* )
            {
            // InternalMyDsl.g:1864:1: ( ( rule__Team__Group_8__0 )* )
            // InternalMyDsl.g:1865:2: ( rule__Team__Group_8__0 )*
            {
             before(grammarAccess.getTeamAccess().getGroup_8()); 
            // InternalMyDsl.g:1866:2: ( rule__Team__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1866:3: rule__Team__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Team__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTeamAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__8__Impl"


    // $ANTLR start "rule__Team__Group__9"
    // InternalMyDsl.g:1874:1: rule__Team__Group__9 : rule__Team__Group__9__Impl rule__Team__Group__10 ;
    public final void rule__Team__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( rule__Team__Group__9__Impl rule__Team__Group__10 )
            // InternalMyDsl.g:1879:2: rule__Team__Group__9__Impl rule__Team__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Team__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__9"


    // $ANTLR start "rule__Team__Group__9__Impl"
    // InternalMyDsl.g:1886:1: rule__Team__Group__9__Impl : ( '}' ) ;
    public final void rule__Team__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( ( '}' ) )
            // InternalMyDsl.g:1891:1: ( '}' )
            {
            // InternalMyDsl.g:1891:1: ( '}' )
            // InternalMyDsl.g:1892:2: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__9__Impl"


    // $ANTLR start "rule__Team__Group__10"
    // InternalMyDsl.g:1901:1: rule__Team__Group__10 : rule__Team__Group__10__Impl ;
    public final void rule__Team__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( rule__Team__Group__10__Impl )
            // InternalMyDsl.g:1906:2: rule__Team__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__10"


    // $ANTLR start "rule__Team__Group__10__Impl"
    // InternalMyDsl.g:1912:1: rule__Team__Group__10__Impl : ( '}' ) ;
    public final void rule__Team__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( '}' ) )
            // InternalMyDsl.g:1917:1: ( '}' )
            {
            // InternalMyDsl.g:1917:1: ( '}' )
            // InternalMyDsl.g:1918:2: '}'
            {
             before(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__10__Impl"


    // $ANTLR start "rule__Team__Group_3__0"
    // InternalMyDsl.g:1928:1: rule__Team__Group_3__0 : rule__Team__Group_3__0__Impl rule__Team__Group_3__1 ;
    public final void rule__Team__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( rule__Team__Group_3__0__Impl rule__Team__Group_3__1 )
            // InternalMyDsl.g:1933:2: rule__Team__Group_3__0__Impl rule__Team__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Team__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__0"


    // $ANTLR start "rule__Team__Group_3__0__Impl"
    // InternalMyDsl.g:1940:1: rule__Team__Group_3__0__Impl : ( 'teamSize' ) ;
    public final void rule__Team__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( 'teamSize' ) )
            // InternalMyDsl.g:1945:1: ( 'teamSize' )
            {
            // InternalMyDsl.g:1945:1: ( 'teamSize' )
            // InternalMyDsl.g:1946:2: 'teamSize'
            {
             before(grammarAccess.getTeamAccess().getTeamSizeKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamSizeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__0__Impl"


    // $ANTLR start "rule__Team__Group_3__1"
    // InternalMyDsl.g:1955:1: rule__Team__Group_3__1 : rule__Team__Group_3__1__Impl ;
    public final void rule__Team__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( rule__Team__Group_3__1__Impl )
            // InternalMyDsl.g:1960:2: rule__Team__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__1"


    // $ANTLR start "rule__Team__Group_3__1__Impl"
    // InternalMyDsl.g:1966:1: rule__Team__Group_3__1__Impl : ( ( rule__Team__TeamSizeAssignment_3_1 ) ) ;
    public final void rule__Team__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ( rule__Team__TeamSizeAssignment_3_1 ) ) )
            // InternalMyDsl.g:1971:1: ( ( rule__Team__TeamSizeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1971:1: ( ( rule__Team__TeamSizeAssignment_3_1 ) )
            // InternalMyDsl.g:1972:2: ( rule__Team__TeamSizeAssignment_3_1 )
            {
             before(grammarAccess.getTeamAccess().getTeamSizeAssignment_3_1()); 
            // InternalMyDsl.g:1973:2: ( rule__Team__TeamSizeAssignment_3_1 )
            // InternalMyDsl.g:1973:3: rule__Team__TeamSizeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__TeamSizeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getTeamSizeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_3__1__Impl"


    // $ANTLR start "rule__Team__Group_4__0"
    // InternalMyDsl.g:1982:1: rule__Team__Group_4__0 : rule__Team__Group_4__0__Impl rule__Team__Group_4__1 ;
    public final void rule__Team__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( rule__Team__Group_4__0__Impl rule__Team__Group_4__1 )
            // InternalMyDsl.g:1987:2: rule__Team__Group_4__0__Impl rule__Team__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Team__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__0"


    // $ANTLR start "rule__Team__Group_4__0__Impl"
    // InternalMyDsl.g:1994:1: rule__Team__Group_4__0__Impl : ( 'managerName' ) ;
    public final void rule__Team__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( 'managerName' ) )
            // InternalMyDsl.g:1999:1: ( 'managerName' )
            {
            // InternalMyDsl.g:1999:1: ( 'managerName' )
            // InternalMyDsl.g:2000:2: 'managerName'
            {
             before(grammarAccess.getTeamAccess().getManagerNameKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getManagerNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__0__Impl"


    // $ANTLR start "rule__Team__Group_4__1"
    // InternalMyDsl.g:2009:1: rule__Team__Group_4__1 : rule__Team__Group_4__1__Impl ;
    public final void rule__Team__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( rule__Team__Group_4__1__Impl )
            // InternalMyDsl.g:2014:2: rule__Team__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__1"


    // $ANTLR start "rule__Team__Group_4__1__Impl"
    // InternalMyDsl.g:2020:1: rule__Team__Group_4__1__Impl : ( ( rule__Team__ManagerNameAssignment_4_1 ) ) ;
    public final void rule__Team__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( ( ( rule__Team__ManagerNameAssignment_4_1 ) ) )
            // InternalMyDsl.g:2025:1: ( ( rule__Team__ManagerNameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2025:1: ( ( rule__Team__ManagerNameAssignment_4_1 ) )
            // InternalMyDsl.g:2026:2: ( rule__Team__ManagerNameAssignment_4_1 )
            {
             before(grammarAccess.getTeamAccess().getManagerNameAssignment_4_1()); 
            // InternalMyDsl.g:2027:2: ( rule__Team__ManagerNameAssignment_4_1 )
            // InternalMyDsl.g:2027:3: rule__Team__ManagerNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__ManagerNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getManagerNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_4__1__Impl"


    // $ANTLR start "rule__Team__Group_8__0"
    // InternalMyDsl.g:2036:1: rule__Team__Group_8__0 : rule__Team__Group_8__0__Impl rule__Team__Group_8__1 ;
    public final void rule__Team__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( rule__Team__Group_8__0__Impl rule__Team__Group_8__1 )
            // InternalMyDsl.g:2041:2: rule__Team__Group_8__0__Impl rule__Team__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Team__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_8__0"


    // $ANTLR start "rule__Team__Group_8__0__Impl"
    // InternalMyDsl.g:2048:1: rule__Team__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Team__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( ',' ) )
            // InternalMyDsl.g:2053:1: ( ',' )
            {
            // InternalMyDsl.g:2053:1: ( ',' )
            // InternalMyDsl.g:2054:2: ','
            {
             before(grammarAccess.getTeamAccess().getCommaKeyword_8_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_8__0__Impl"


    // $ANTLR start "rule__Team__Group_8__1"
    // InternalMyDsl.g:2063:1: rule__Team__Group_8__1 : rule__Team__Group_8__1__Impl ;
    public final void rule__Team__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( rule__Team__Group_8__1__Impl )
            // InternalMyDsl.g:2068:2: rule__Team__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_8__1"


    // $ANTLR start "rule__Team__Group_8__1__Impl"
    // InternalMyDsl.g:2074:1: rule__Team__Group_8__1__Impl : ( ( rule__Team__PlayersAssignment_8_1 ) ) ;
    public final void rule__Team__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( ( rule__Team__PlayersAssignment_8_1 ) ) )
            // InternalMyDsl.g:2079:1: ( ( rule__Team__PlayersAssignment_8_1 ) )
            {
            // InternalMyDsl.g:2079:1: ( ( rule__Team__PlayersAssignment_8_1 ) )
            // InternalMyDsl.g:2080:2: ( rule__Team__PlayersAssignment_8_1 )
            {
             before(grammarAccess.getTeamAccess().getPlayersAssignment_8_1()); 
            // InternalMyDsl.g:2081:2: ( rule__Team__PlayersAssignment_8_1 )
            // InternalMyDsl.g:2081:3: rule__Team__PlayersAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__PlayersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getPlayersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group_8__1__Impl"


    // $ANTLR start "rule__Bracket__Group__0"
    // InternalMyDsl.g:2090:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalMyDsl.g:2095:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Bracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__0"


    // $ANTLR start "rule__Bracket__Group__0__Impl"
    // InternalMyDsl.g:2102:1: rule__Bracket__Group__0__Impl : ( 'Bracket' ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( 'Bracket' ) )
            // InternalMyDsl.g:2107:1: ( 'Bracket' )
            {
            // InternalMyDsl.g:2107:1: ( 'Bracket' )
            // InternalMyDsl.g:2108:2: 'Bracket'
            {
             before(grammarAccess.getBracketAccess().getBracketKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__0__Impl"


    // $ANTLR start "rule__Bracket__Group__1"
    // InternalMyDsl.g:2117:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalMyDsl.g:2122:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Bracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__1"


    // $ANTLR start "rule__Bracket__Group__1__Impl"
    // InternalMyDsl.g:2129:1: rule__Bracket__Group__1__Impl : ( '{' ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( '{' ) )
            // InternalMyDsl.g:2134:1: ( '{' )
            {
            // InternalMyDsl.g:2134:1: ( '{' )
            // InternalMyDsl.g:2135:2: '{'
            {
             before(grammarAccess.getBracketAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__1__Impl"


    // $ANTLR start "rule__Bracket__Group__2"
    // InternalMyDsl.g:2144:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl rule__Bracket__Group__3 ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( rule__Bracket__Group__2__Impl rule__Bracket__Group__3 )
            // InternalMyDsl.g:2149:2: rule__Bracket__Group__2__Impl rule__Bracket__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Bracket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__2"


    // $ANTLR start "rule__Bracket__Group__2__Impl"
    // InternalMyDsl.g:2156:1: rule__Bracket__Group__2__Impl : ( ( rule__Bracket__Group_2__0 )? ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( ( rule__Bracket__Group_2__0 )? ) )
            // InternalMyDsl.g:2161:1: ( ( rule__Bracket__Group_2__0 )? )
            {
            // InternalMyDsl.g:2161:1: ( ( rule__Bracket__Group_2__0 )? )
            // InternalMyDsl.g:2162:2: ( rule__Bracket__Group_2__0 )?
            {
             before(grammarAccess.getBracketAccess().getGroup_2()); 
            // InternalMyDsl.g:2163:2: ( rule__Bracket__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2163:3: rule__Bracket__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bracket__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBracketAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__2__Impl"


    // $ANTLR start "rule__Bracket__Group__3"
    // InternalMyDsl.g:2171:1: rule__Bracket__Group__3 : rule__Bracket__Group__3__Impl rule__Bracket__Group__4 ;
    public final void rule__Bracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( rule__Bracket__Group__3__Impl rule__Bracket__Group__4 )
            // InternalMyDsl.g:2176:2: rule__Bracket__Group__3__Impl rule__Bracket__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Bracket__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__3"


    // $ANTLR start "rule__Bracket__Group__3__Impl"
    // InternalMyDsl.g:2183:1: rule__Bracket__Group__3__Impl : ( ( rule__Bracket__Group_3__0 ) ) ;
    public final void rule__Bracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( ( ( rule__Bracket__Group_3__0 ) ) )
            // InternalMyDsl.g:2188:1: ( ( rule__Bracket__Group_3__0 ) )
            {
            // InternalMyDsl.g:2188:1: ( ( rule__Bracket__Group_3__0 ) )
            // InternalMyDsl.g:2189:2: ( rule__Bracket__Group_3__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup_3()); 
            // InternalMyDsl.g:2190:2: ( rule__Bracket__Group_3__0 )
            // InternalMyDsl.g:2190:3: rule__Bracket__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__3__Impl"


    // $ANTLR start "rule__Bracket__Group__4"
    // InternalMyDsl.g:2198:1: rule__Bracket__Group__4 : rule__Bracket__Group__4__Impl rule__Bracket__Group__5 ;
    public final void rule__Bracket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( rule__Bracket__Group__4__Impl rule__Bracket__Group__5 )
            // InternalMyDsl.g:2203:2: rule__Bracket__Group__4__Impl rule__Bracket__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Bracket__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__4"


    // $ANTLR start "rule__Bracket__Group__4__Impl"
    // InternalMyDsl.g:2210:1: rule__Bracket__Group__4__Impl : ( 'matches' ) ;
    public final void rule__Bracket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( ( 'matches' ) )
            // InternalMyDsl.g:2215:1: ( 'matches' )
            {
            // InternalMyDsl.g:2215:1: ( 'matches' )
            // InternalMyDsl.g:2216:2: 'matches'
            {
             before(grammarAccess.getBracketAccess().getMatchesKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getMatchesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__4__Impl"


    // $ANTLR start "rule__Bracket__Group__5"
    // InternalMyDsl.g:2225:1: rule__Bracket__Group__5 : rule__Bracket__Group__5__Impl rule__Bracket__Group__6 ;
    public final void rule__Bracket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2229:1: ( rule__Bracket__Group__5__Impl rule__Bracket__Group__6 )
            // InternalMyDsl.g:2230:2: rule__Bracket__Group__5__Impl rule__Bracket__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Bracket__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__5"


    // $ANTLR start "rule__Bracket__Group__5__Impl"
    // InternalMyDsl.g:2237:1: rule__Bracket__Group__5__Impl : ( '{' ) ;
    public final void rule__Bracket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( ( '{' ) )
            // InternalMyDsl.g:2242:1: ( '{' )
            {
            // InternalMyDsl.g:2242:1: ( '{' )
            // InternalMyDsl.g:2243:2: '{'
            {
             before(grammarAccess.getBracketAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__5__Impl"


    // $ANTLR start "rule__Bracket__Group__6"
    // InternalMyDsl.g:2252:1: rule__Bracket__Group__6 : rule__Bracket__Group__6__Impl rule__Bracket__Group__7 ;
    public final void rule__Bracket__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2256:1: ( rule__Bracket__Group__6__Impl rule__Bracket__Group__7 )
            // InternalMyDsl.g:2257:2: rule__Bracket__Group__6__Impl rule__Bracket__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Bracket__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__6"


    // $ANTLR start "rule__Bracket__Group__6__Impl"
    // InternalMyDsl.g:2264:1: rule__Bracket__Group__6__Impl : ( ( rule__Bracket__MatchesAssignment_6 ) ) ;
    public final void rule__Bracket__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( ( rule__Bracket__MatchesAssignment_6 ) ) )
            // InternalMyDsl.g:2269:1: ( ( rule__Bracket__MatchesAssignment_6 ) )
            {
            // InternalMyDsl.g:2269:1: ( ( rule__Bracket__MatchesAssignment_6 ) )
            // InternalMyDsl.g:2270:2: ( rule__Bracket__MatchesAssignment_6 )
            {
             before(grammarAccess.getBracketAccess().getMatchesAssignment_6()); 
            // InternalMyDsl.g:2271:2: ( rule__Bracket__MatchesAssignment_6 )
            // InternalMyDsl.g:2271:3: rule__Bracket__MatchesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__MatchesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getMatchesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__6__Impl"


    // $ANTLR start "rule__Bracket__Group__7"
    // InternalMyDsl.g:2279:1: rule__Bracket__Group__7 : rule__Bracket__Group__7__Impl rule__Bracket__Group__8 ;
    public final void rule__Bracket__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( rule__Bracket__Group__7__Impl rule__Bracket__Group__8 )
            // InternalMyDsl.g:2284:2: rule__Bracket__Group__7__Impl rule__Bracket__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Bracket__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__7"


    // $ANTLR start "rule__Bracket__Group__7__Impl"
    // InternalMyDsl.g:2291:1: rule__Bracket__Group__7__Impl : ( ( rule__Bracket__Group_7__0 )* ) ;
    public final void rule__Bracket__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ( rule__Bracket__Group_7__0 )* ) )
            // InternalMyDsl.g:2296:1: ( ( rule__Bracket__Group_7__0 )* )
            {
            // InternalMyDsl.g:2296:1: ( ( rule__Bracket__Group_7__0 )* )
            // InternalMyDsl.g:2297:2: ( rule__Bracket__Group_7__0 )*
            {
             before(grammarAccess.getBracketAccess().getGroup_7()); 
            // InternalMyDsl.g:2298:2: ( rule__Bracket__Group_7__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2298:3: rule__Bracket__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Bracket__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBracketAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__7__Impl"


    // $ANTLR start "rule__Bracket__Group__8"
    // InternalMyDsl.g:2306:1: rule__Bracket__Group__8 : rule__Bracket__Group__8__Impl rule__Bracket__Group__9 ;
    public final void rule__Bracket__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( rule__Bracket__Group__8__Impl rule__Bracket__Group__9 )
            // InternalMyDsl.g:2311:2: rule__Bracket__Group__8__Impl rule__Bracket__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Bracket__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__8"


    // $ANTLR start "rule__Bracket__Group__8__Impl"
    // InternalMyDsl.g:2318:1: rule__Bracket__Group__8__Impl : ( '}' ) ;
    public final void rule__Bracket__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( ( '}' ) )
            // InternalMyDsl.g:2323:1: ( '}' )
            {
            // InternalMyDsl.g:2323:1: ( '}' )
            // InternalMyDsl.g:2324:2: '}'
            {
             before(grammarAccess.getBracketAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__8__Impl"


    // $ANTLR start "rule__Bracket__Group__9"
    // InternalMyDsl.g:2333:1: rule__Bracket__Group__9 : rule__Bracket__Group__9__Impl ;
    public final void rule__Bracket__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2337:1: ( rule__Bracket__Group__9__Impl )
            // InternalMyDsl.g:2338:2: rule__Bracket__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__9"


    // $ANTLR start "rule__Bracket__Group__9__Impl"
    // InternalMyDsl.g:2344:1: rule__Bracket__Group__9__Impl : ( '}' ) ;
    public final void rule__Bracket__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( ( '}' ) )
            // InternalMyDsl.g:2349:1: ( '}' )
            {
            // InternalMyDsl.g:2349:1: ( '}' )
            // InternalMyDsl.g:2350:2: '}'
            {
             before(grammarAccess.getBracketAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__9__Impl"


    // $ANTLR start "rule__Bracket__Group_2__0"
    // InternalMyDsl.g:2360:1: rule__Bracket__Group_2__0 : rule__Bracket__Group_2__0__Impl rule__Bracket__Group_2__1 ;
    public final void rule__Bracket__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2364:1: ( rule__Bracket__Group_2__0__Impl rule__Bracket__Group_2__1 )
            // InternalMyDsl.g:2365:2: rule__Bracket__Group_2__0__Impl rule__Bracket__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Bracket__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_2__0"


    // $ANTLR start "rule__Bracket__Group_2__0__Impl"
    // InternalMyDsl.g:2372:1: rule__Bracket__Group_2__0__Impl : ( 'rounds' ) ;
    public final void rule__Bracket__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( ( 'rounds' ) )
            // InternalMyDsl.g:2377:1: ( 'rounds' )
            {
            // InternalMyDsl.g:2377:1: ( 'rounds' )
            // InternalMyDsl.g:2378:2: 'rounds'
            {
             before(grammarAccess.getBracketAccess().getRoundsKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getRoundsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_2__0__Impl"


    // $ANTLR start "rule__Bracket__Group_2__1"
    // InternalMyDsl.g:2387:1: rule__Bracket__Group_2__1 : rule__Bracket__Group_2__1__Impl ;
    public final void rule__Bracket__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( rule__Bracket__Group_2__1__Impl )
            // InternalMyDsl.g:2392:2: rule__Bracket__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_2__1"


    // $ANTLR start "rule__Bracket__Group_2__1__Impl"
    // InternalMyDsl.g:2398:1: rule__Bracket__Group_2__1__Impl : ( ( rule__Bracket__RoundsAssignment_2_1 ) ) ;
    public final void rule__Bracket__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2402:1: ( ( ( rule__Bracket__RoundsAssignment_2_1 ) ) )
            // InternalMyDsl.g:2403:1: ( ( rule__Bracket__RoundsAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2403:1: ( ( rule__Bracket__RoundsAssignment_2_1 ) )
            // InternalMyDsl.g:2404:2: ( rule__Bracket__RoundsAssignment_2_1 )
            {
             before(grammarAccess.getBracketAccess().getRoundsAssignment_2_1()); 
            // InternalMyDsl.g:2405:2: ( rule__Bracket__RoundsAssignment_2_1 )
            // InternalMyDsl.g:2405:3: rule__Bracket__RoundsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__RoundsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getRoundsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_2__1__Impl"


    // $ANTLR start "rule__Bracket__Group_3__0"
    // InternalMyDsl.g:2414:1: rule__Bracket__Group_3__0 : rule__Bracket__Group_3__0__Impl rule__Bracket__Group_3__1 ;
    public final void rule__Bracket__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( rule__Bracket__Group_3__0__Impl rule__Bracket__Group_3__1 )
            // InternalMyDsl.g:2419:2: rule__Bracket__Group_3__0__Impl rule__Bracket__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Bracket__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_3__0"


    // $ANTLR start "rule__Bracket__Group_3__0__Impl"
    // InternalMyDsl.g:2426:1: rule__Bracket__Group_3__0__Impl : ( 'bracketSide' ) ;
    public final void rule__Bracket__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( ( 'bracketSide' ) )
            // InternalMyDsl.g:2431:1: ( 'bracketSide' )
            {
            // InternalMyDsl.g:2431:1: ( 'bracketSide' )
            // InternalMyDsl.g:2432:2: 'bracketSide'
            {
             before(grammarAccess.getBracketAccess().getBracketSideKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getBracketSideKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_3__0__Impl"


    // $ANTLR start "rule__Bracket__Group_3__1"
    // InternalMyDsl.g:2441:1: rule__Bracket__Group_3__1 : rule__Bracket__Group_3__1__Impl ;
    public final void rule__Bracket__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( rule__Bracket__Group_3__1__Impl )
            // InternalMyDsl.g:2446:2: rule__Bracket__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_3__1"


    // $ANTLR start "rule__Bracket__Group_3__1__Impl"
    // InternalMyDsl.g:2452:1: rule__Bracket__Group_3__1__Impl : ( ( rule__Bracket__BracketSideAssignment_3_1 ) ) ;
    public final void rule__Bracket__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2456:1: ( ( ( rule__Bracket__BracketSideAssignment_3_1 ) ) )
            // InternalMyDsl.g:2457:1: ( ( rule__Bracket__BracketSideAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2457:1: ( ( rule__Bracket__BracketSideAssignment_3_1 ) )
            // InternalMyDsl.g:2458:2: ( rule__Bracket__BracketSideAssignment_3_1 )
            {
             before(grammarAccess.getBracketAccess().getBracketSideAssignment_3_1()); 
            // InternalMyDsl.g:2459:2: ( rule__Bracket__BracketSideAssignment_3_1 )
            // InternalMyDsl.g:2459:3: rule__Bracket__BracketSideAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__BracketSideAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getBracketSideAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_3__1__Impl"


    // $ANTLR start "rule__Bracket__Group_7__0"
    // InternalMyDsl.g:2468:1: rule__Bracket__Group_7__0 : rule__Bracket__Group_7__0__Impl rule__Bracket__Group_7__1 ;
    public final void rule__Bracket__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( rule__Bracket__Group_7__0__Impl rule__Bracket__Group_7__1 )
            // InternalMyDsl.g:2473:2: rule__Bracket__Group_7__0__Impl rule__Bracket__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__Bracket__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_7__0"


    // $ANTLR start "rule__Bracket__Group_7__0__Impl"
    // InternalMyDsl.g:2480:1: rule__Bracket__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Bracket__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( ( ',' ) )
            // InternalMyDsl.g:2485:1: ( ',' )
            {
            // InternalMyDsl.g:2485:1: ( ',' )
            // InternalMyDsl.g:2486:2: ','
            {
             before(grammarAccess.getBracketAccess().getCommaKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_7__0__Impl"


    // $ANTLR start "rule__Bracket__Group_7__1"
    // InternalMyDsl.g:2495:1: rule__Bracket__Group_7__1 : rule__Bracket__Group_7__1__Impl ;
    public final void rule__Bracket__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( rule__Bracket__Group_7__1__Impl )
            // InternalMyDsl.g:2500:2: rule__Bracket__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_7__1"


    // $ANTLR start "rule__Bracket__Group_7__1__Impl"
    // InternalMyDsl.g:2506:1: rule__Bracket__Group_7__1__Impl : ( ( rule__Bracket__MatchesAssignment_7_1 ) ) ;
    public final void rule__Bracket__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2510:1: ( ( ( rule__Bracket__MatchesAssignment_7_1 ) ) )
            // InternalMyDsl.g:2511:1: ( ( rule__Bracket__MatchesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:2511:1: ( ( rule__Bracket__MatchesAssignment_7_1 ) )
            // InternalMyDsl.g:2512:2: ( rule__Bracket__MatchesAssignment_7_1 )
            {
             before(grammarAccess.getBracketAccess().getMatchesAssignment_7_1()); 
            // InternalMyDsl.g:2513:2: ( rule__Bracket__MatchesAssignment_7_1 )
            // InternalMyDsl.g:2513:3: rule__Bracket__MatchesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__MatchesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getMatchesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_7__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2522:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2526:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2527:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:2534:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2539:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2539:1: ( ( '-' )? )
            // InternalMyDsl.g:2540:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2541:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2541:3: '-'
                    {
                    match(input,47,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:2549:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2554:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:2560:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2564:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2565:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2565:1: ( RULE_INT )
            // InternalMyDsl.g:2566:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__0"
    // InternalMyDsl.g:2576:1: rule__Player__Group__0 : rule__Player__Group__0__Impl rule__Player__Group__1 ;
    public final void rule__Player__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( rule__Player__Group__0__Impl rule__Player__Group__1 )
            // InternalMyDsl.g:2581:2: rule__Player__Group__0__Impl rule__Player__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Player__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0"


    // $ANTLR start "rule__Player__Group__0__Impl"
    // InternalMyDsl.g:2588:1: rule__Player__Group__0__Impl : ( 'Player' ) ;
    public final void rule__Player__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( 'Player' ) )
            // InternalMyDsl.g:2593:1: ( 'Player' )
            {
            // InternalMyDsl.g:2593:1: ( 'Player' )
            // InternalMyDsl.g:2594:2: 'Player'
            {
             before(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__0__Impl"


    // $ANTLR start "rule__Player__Group__1"
    // InternalMyDsl.g:2603:1: rule__Player__Group__1 : rule__Player__Group__1__Impl rule__Player__Group__2 ;
    public final void rule__Player__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( rule__Player__Group__1__Impl rule__Player__Group__2 )
            // InternalMyDsl.g:2608:2: rule__Player__Group__1__Impl rule__Player__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Player__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1"


    // $ANTLR start "rule__Player__Group__1__Impl"
    // InternalMyDsl.g:2615:1: rule__Player__Group__1__Impl : ( ( rule__Player__NameAssignment_1 ) ) ;
    public final void rule__Player__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( ( ( rule__Player__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2620:1: ( ( rule__Player__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2620:1: ( ( rule__Player__NameAssignment_1 ) )
            // InternalMyDsl.g:2621:2: ( rule__Player__NameAssignment_1 )
            {
             before(grammarAccess.getPlayerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2622:2: ( rule__Player__NameAssignment_1 )
            // InternalMyDsl.g:2622:3: rule__Player__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__1__Impl"


    // $ANTLR start "rule__Player__Group__2"
    // InternalMyDsl.g:2630:1: rule__Player__Group__2 : rule__Player__Group__2__Impl rule__Player__Group__3 ;
    public final void rule__Player__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( rule__Player__Group__2__Impl rule__Player__Group__3 )
            // InternalMyDsl.g:2635:2: rule__Player__Group__2__Impl rule__Player__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Player__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2"


    // $ANTLR start "rule__Player__Group__2__Impl"
    // InternalMyDsl.g:2642:1: rule__Player__Group__2__Impl : ( '{' ) ;
    public final void rule__Player__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( ( '{' ) )
            // InternalMyDsl.g:2647:1: ( '{' )
            {
            // InternalMyDsl.g:2647:1: ( '{' )
            // InternalMyDsl.g:2648:2: '{'
            {
             before(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__2__Impl"


    // $ANTLR start "rule__Player__Group__3"
    // InternalMyDsl.g:2657:1: rule__Player__Group__3 : rule__Player__Group__3__Impl rule__Player__Group__4 ;
    public final void rule__Player__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( rule__Player__Group__3__Impl rule__Player__Group__4 )
            // InternalMyDsl.g:2662:2: rule__Player__Group__3__Impl rule__Player__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Player__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__3"


    // $ANTLR start "rule__Player__Group__3__Impl"
    // InternalMyDsl.g:2669:1: rule__Player__Group__3__Impl : ( ( rule__Player__Group_3__0 ) ) ;
    public final void rule__Player__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( ( rule__Player__Group_3__0 ) ) )
            // InternalMyDsl.g:2674:1: ( ( rule__Player__Group_3__0 ) )
            {
            // InternalMyDsl.g:2674:1: ( ( rule__Player__Group_3__0 ) )
            // InternalMyDsl.g:2675:2: ( rule__Player__Group_3__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup_3()); 
            // InternalMyDsl.g:2676:2: ( rule__Player__Group_3__0 )
            // InternalMyDsl.g:2676:3: rule__Player__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__3__Impl"


    // $ANTLR start "rule__Player__Group__4"
    // InternalMyDsl.g:2684:1: rule__Player__Group__4 : rule__Player__Group__4__Impl rule__Player__Group__5 ;
    public final void rule__Player__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( rule__Player__Group__4__Impl rule__Player__Group__5 )
            // InternalMyDsl.g:2689:2: rule__Player__Group__4__Impl rule__Player__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Player__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__4"


    // $ANTLR start "rule__Player__Group__4__Impl"
    // InternalMyDsl.g:2696:1: rule__Player__Group__4__Impl : ( ( rule__Player__Group_4__0 )? ) ;
    public final void rule__Player__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( ( ( rule__Player__Group_4__0 )? ) )
            // InternalMyDsl.g:2701:1: ( ( rule__Player__Group_4__0 )? )
            {
            // InternalMyDsl.g:2701:1: ( ( rule__Player__Group_4__0 )? )
            // InternalMyDsl.g:2702:2: ( rule__Player__Group_4__0 )?
            {
             before(grammarAccess.getPlayerAccess().getGroup_4()); 
            // InternalMyDsl.g:2703:2: ( rule__Player__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2703:3: rule__Player__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Player__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlayerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__4__Impl"


    // $ANTLR start "rule__Player__Group__5"
    // InternalMyDsl.g:2711:1: rule__Player__Group__5 : rule__Player__Group__5__Impl rule__Player__Group__6 ;
    public final void rule__Player__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( rule__Player__Group__5__Impl rule__Player__Group__6 )
            // InternalMyDsl.g:2716:2: rule__Player__Group__5__Impl rule__Player__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Player__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__5"


    // $ANTLR start "rule__Player__Group__5__Impl"
    // InternalMyDsl.g:2723:1: rule__Player__Group__5__Impl : ( ( rule__Player__Group_5__0 ) ) ;
    public final void rule__Player__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( ( ( rule__Player__Group_5__0 ) ) )
            // InternalMyDsl.g:2728:1: ( ( rule__Player__Group_5__0 ) )
            {
            // InternalMyDsl.g:2728:1: ( ( rule__Player__Group_5__0 ) )
            // InternalMyDsl.g:2729:2: ( rule__Player__Group_5__0 )
            {
             before(grammarAccess.getPlayerAccess().getGroup_5()); 
            // InternalMyDsl.g:2730:2: ( rule__Player__Group_5__0 )
            // InternalMyDsl.g:2730:3: rule__Player__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__5__Impl"


    // $ANTLR start "rule__Player__Group__6"
    // InternalMyDsl.g:2738:1: rule__Player__Group__6 : rule__Player__Group__6__Impl rule__Player__Group__7 ;
    public final void rule__Player__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2742:1: ( rule__Player__Group__6__Impl rule__Player__Group__7 )
            // InternalMyDsl.g:2743:2: rule__Player__Group__6__Impl rule__Player__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Player__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__6"


    // $ANTLR start "rule__Player__Group__6__Impl"
    // InternalMyDsl.g:2750:1: rule__Player__Group__6__Impl : ( 'playerstatistics' ) ;
    public final void rule__Player__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( ( 'playerstatistics' ) )
            // InternalMyDsl.g:2755:1: ( 'playerstatistics' )
            {
            // InternalMyDsl.g:2755:1: ( 'playerstatistics' )
            // InternalMyDsl.g:2756:2: 'playerstatistics'
            {
             before(grammarAccess.getPlayerAccess().getPlayerstatisticsKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPlayerstatisticsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__6__Impl"


    // $ANTLR start "rule__Player__Group__7"
    // InternalMyDsl.g:2765:1: rule__Player__Group__7 : rule__Player__Group__7__Impl rule__Player__Group__8 ;
    public final void rule__Player__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( rule__Player__Group__7__Impl rule__Player__Group__8 )
            // InternalMyDsl.g:2770:2: rule__Player__Group__7__Impl rule__Player__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Player__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__7"


    // $ANTLR start "rule__Player__Group__7__Impl"
    // InternalMyDsl.g:2777:1: rule__Player__Group__7__Impl : ( ( rule__Player__PlayerstatisticsAssignment_7 ) ) ;
    public final void rule__Player__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( ( ( rule__Player__PlayerstatisticsAssignment_7 ) ) )
            // InternalMyDsl.g:2782:1: ( ( rule__Player__PlayerstatisticsAssignment_7 ) )
            {
            // InternalMyDsl.g:2782:1: ( ( rule__Player__PlayerstatisticsAssignment_7 ) )
            // InternalMyDsl.g:2783:2: ( rule__Player__PlayerstatisticsAssignment_7 )
            {
             before(grammarAccess.getPlayerAccess().getPlayerstatisticsAssignment_7()); 
            // InternalMyDsl.g:2784:2: ( rule__Player__PlayerstatisticsAssignment_7 )
            // InternalMyDsl.g:2784:3: rule__Player__PlayerstatisticsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Player__PlayerstatisticsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getPlayerstatisticsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__7__Impl"


    // $ANTLR start "rule__Player__Group__8"
    // InternalMyDsl.g:2792:1: rule__Player__Group__8 : rule__Player__Group__8__Impl ;
    public final void rule__Player__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2796:1: ( rule__Player__Group__8__Impl )
            // InternalMyDsl.g:2797:2: rule__Player__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__8"


    // $ANTLR start "rule__Player__Group__8__Impl"
    // InternalMyDsl.g:2803:1: rule__Player__Group__8__Impl : ( '}' ) ;
    public final void rule__Player__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2807:1: ( ( '}' ) )
            // InternalMyDsl.g:2808:1: ( '}' )
            {
            // InternalMyDsl.g:2808:1: ( '}' )
            // InternalMyDsl.g:2809:2: '}'
            {
             before(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group__8__Impl"


    // $ANTLR start "rule__Player__Group_3__0"
    // InternalMyDsl.g:2819:1: rule__Player__Group_3__0 : rule__Player__Group_3__0__Impl rule__Player__Group_3__1 ;
    public final void rule__Player__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( rule__Player__Group_3__0__Impl rule__Player__Group_3__1 )
            // InternalMyDsl.g:2824:2: rule__Player__Group_3__0__Impl rule__Player__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Player__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_3__0"


    // $ANTLR start "rule__Player__Group_3__0__Impl"
    // InternalMyDsl.g:2831:1: rule__Player__Group_3__0__Impl : ( 'position' ) ;
    public final void rule__Player__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( ( 'position' ) )
            // InternalMyDsl.g:2836:1: ( 'position' )
            {
            // InternalMyDsl.g:2836:1: ( 'position' )
            // InternalMyDsl.g:2837:2: 'position'
            {
             before(grammarAccess.getPlayerAccess().getPositionKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getPositionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_3__0__Impl"


    // $ANTLR start "rule__Player__Group_3__1"
    // InternalMyDsl.g:2846:1: rule__Player__Group_3__1 : rule__Player__Group_3__1__Impl ;
    public final void rule__Player__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( rule__Player__Group_3__1__Impl )
            // InternalMyDsl.g:2851:2: rule__Player__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_3__1"


    // $ANTLR start "rule__Player__Group_3__1__Impl"
    // InternalMyDsl.g:2857:1: rule__Player__Group_3__1__Impl : ( ( rule__Player__PositionAssignment_3_1 ) ) ;
    public final void rule__Player__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( ( rule__Player__PositionAssignment_3_1 ) ) )
            // InternalMyDsl.g:2862:1: ( ( rule__Player__PositionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2862:1: ( ( rule__Player__PositionAssignment_3_1 ) )
            // InternalMyDsl.g:2863:2: ( rule__Player__PositionAssignment_3_1 )
            {
             before(grammarAccess.getPlayerAccess().getPositionAssignment_3_1()); 
            // InternalMyDsl.g:2864:2: ( rule__Player__PositionAssignment_3_1 )
            // InternalMyDsl.g:2864:3: rule__Player__PositionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__PositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getPositionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_3__1__Impl"


    // $ANTLR start "rule__Player__Group_4__0"
    // InternalMyDsl.g:2873:1: rule__Player__Group_4__0 : rule__Player__Group_4__0__Impl rule__Player__Group_4__1 ;
    public final void rule__Player__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2877:1: ( rule__Player__Group_4__0__Impl rule__Player__Group_4__1 )
            // InternalMyDsl.g:2878:2: rule__Player__Group_4__0__Impl rule__Player__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Player__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_4__0"


    // $ANTLR start "rule__Player__Group_4__0__Impl"
    // InternalMyDsl.g:2885:1: rule__Player__Group_4__0__Impl : ( 'birthDate' ) ;
    public final void rule__Player__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2889:1: ( ( 'birthDate' ) )
            // InternalMyDsl.g:2890:1: ( 'birthDate' )
            {
            // InternalMyDsl.g:2890:1: ( 'birthDate' )
            // InternalMyDsl.g:2891:2: 'birthDate'
            {
             before(grammarAccess.getPlayerAccess().getBirthDateKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getBirthDateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_4__0__Impl"


    // $ANTLR start "rule__Player__Group_4__1"
    // InternalMyDsl.g:2900:1: rule__Player__Group_4__1 : rule__Player__Group_4__1__Impl ;
    public final void rule__Player__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( rule__Player__Group_4__1__Impl )
            // InternalMyDsl.g:2905:2: rule__Player__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_4__1"


    // $ANTLR start "rule__Player__Group_4__1__Impl"
    // InternalMyDsl.g:2911:1: rule__Player__Group_4__1__Impl : ( ( rule__Player__BirthDateAssignment_4_1 ) ) ;
    public final void rule__Player__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2915:1: ( ( ( rule__Player__BirthDateAssignment_4_1 ) ) )
            // InternalMyDsl.g:2916:1: ( ( rule__Player__BirthDateAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2916:1: ( ( rule__Player__BirthDateAssignment_4_1 ) )
            // InternalMyDsl.g:2917:2: ( rule__Player__BirthDateAssignment_4_1 )
            {
             before(grammarAccess.getPlayerAccess().getBirthDateAssignment_4_1()); 
            // InternalMyDsl.g:2918:2: ( rule__Player__BirthDateAssignment_4_1 )
            // InternalMyDsl.g:2918:3: rule__Player__BirthDateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__BirthDateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getBirthDateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_4__1__Impl"


    // $ANTLR start "rule__Player__Group_5__0"
    // InternalMyDsl.g:2927:1: rule__Player__Group_5__0 : rule__Player__Group_5__0__Impl rule__Player__Group_5__1 ;
    public final void rule__Player__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( rule__Player__Group_5__0__Impl rule__Player__Group_5__1 )
            // InternalMyDsl.g:2932:2: rule__Player__Group_5__0__Impl rule__Player__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Player__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Player__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_5__0"


    // $ANTLR start "rule__Player__Group_5__0__Impl"
    // InternalMyDsl.g:2939:1: rule__Player__Group_5__0__Impl : ( 'number' ) ;
    public final void rule__Player__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( ( 'number' ) )
            // InternalMyDsl.g:2944:1: ( 'number' )
            {
            // InternalMyDsl.g:2944:1: ( 'number' )
            // InternalMyDsl.g:2945:2: 'number'
            {
             before(grammarAccess.getPlayerAccess().getNumberKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPlayerAccess().getNumberKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_5__0__Impl"


    // $ANTLR start "rule__Player__Group_5__1"
    // InternalMyDsl.g:2954:1: rule__Player__Group_5__1 : rule__Player__Group_5__1__Impl ;
    public final void rule__Player__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2958:1: ( rule__Player__Group_5__1__Impl )
            // InternalMyDsl.g:2959:2: rule__Player__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Player__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_5__1"


    // $ANTLR start "rule__Player__Group_5__1__Impl"
    // InternalMyDsl.g:2965:1: rule__Player__Group_5__1__Impl : ( ( rule__Player__NumberAssignment_5_1 ) ) ;
    public final void rule__Player__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2969:1: ( ( ( rule__Player__NumberAssignment_5_1 ) ) )
            // InternalMyDsl.g:2970:1: ( ( rule__Player__NumberAssignment_5_1 ) )
            {
            // InternalMyDsl.g:2970:1: ( ( rule__Player__NumberAssignment_5_1 ) )
            // InternalMyDsl.g:2971:2: ( rule__Player__NumberAssignment_5_1 )
            {
             before(grammarAccess.getPlayerAccess().getNumberAssignment_5_1()); 
            // InternalMyDsl.g:2972:2: ( rule__Player__NumberAssignment_5_1 )
            // InternalMyDsl.g:2972:3: rule__Player__NumberAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Player__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPlayerAccess().getNumberAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__Group_5__1__Impl"


    // $ANTLR start "rule__Defender__Group__0"
    // InternalMyDsl.g:2981:1: rule__Defender__Group__0 : rule__Defender__Group__0__Impl rule__Defender__Group__1 ;
    public final void rule__Defender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( rule__Defender__Group__0__Impl rule__Defender__Group__1 )
            // InternalMyDsl.g:2986:2: rule__Defender__Group__0__Impl rule__Defender__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Defender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__0"


    // $ANTLR start "rule__Defender__Group__0__Impl"
    // InternalMyDsl.g:2993:1: rule__Defender__Group__0__Impl : ( () ) ;
    public final void rule__Defender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( () ) )
            // InternalMyDsl.g:2998:1: ( () )
            {
            // InternalMyDsl.g:2998:1: ( () )
            // InternalMyDsl.g:2999:2: ()
            {
             before(grammarAccess.getDefenderAccess().getDefenderAction_0()); 
            // InternalMyDsl.g:3000:2: ()
            // InternalMyDsl.g:3000:3: 
            {
            }

             after(grammarAccess.getDefenderAccess().getDefenderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__0__Impl"


    // $ANTLR start "rule__Defender__Group__1"
    // InternalMyDsl.g:3008:1: rule__Defender__Group__1 : rule__Defender__Group__1__Impl rule__Defender__Group__2 ;
    public final void rule__Defender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3012:1: ( rule__Defender__Group__1__Impl rule__Defender__Group__2 )
            // InternalMyDsl.g:3013:2: rule__Defender__Group__1__Impl rule__Defender__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Defender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__1"


    // $ANTLR start "rule__Defender__Group__1__Impl"
    // InternalMyDsl.g:3020:1: rule__Defender__Group__1__Impl : ( 'Defender' ) ;
    public final void rule__Defender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3024:1: ( ( 'Defender' ) )
            // InternalMyDsl.g:3025:1: ( 'Defender' )
            {
            // InternalMyDsl.g:3025:1: ( 'Defender' )
            // InternalMyDsl.g:3026:2: 'Defender'
            {
             before(grammarAccess.getDefenderAccess().getDefenderKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getDefenderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__1__Impl"


    // $ANTLR start "rule__Defender__Group__2"
    // InternalMyDsl.g:3035:1: rule__Defender__Group__2 : rule__Defender__Group__2__Impl rule__Defender__Group__3 ;
    public final void rule__Defender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3039:1: ( rule__Defender__Group__2__Impl rule__Defender__Group__3 )
            // InternalMyDsl.g:3040:2: rule__Defender__Group__2__Impl rule__Defender__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__2"


    // $ANTLR start "rule__Defender__Group__2__Impl"
    // InternalMyDsl.g:3047:1: rule__Defender__Group__2__Impl : ( '{' ) ;
    public final void rule__Defender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3051:1: ( ( '{' ) )
            // InternalMyDsl.g:3052:1: ( '{' )
            {
            // InternalMyDsl.g:3052:1: ( '{' )
            // InternalMyDsl.g:3053:2: '{'
            {
             before(grammarAccess.getDefenderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__2__Impl"


    // $ANTLR start "rule__Defender__Group__3"
    // InternalMyDsl.g:3062:1: rule__Defender__Group__3 : rule__Defender__Group__3__Impl rule__Defender__Group__4 ;
    public final void rule__Defender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3066:1: ( rule__Defender__Group__3__Impl rule__Defender__Group__4 )
            // InternalMyDsl.g:3067:2: rule__Defender__Group__3__Impl rule__Defender__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__3"


    // $ANTLR start "rule__Defender__Group__3__Impl"
    // InternalMyDsl.g:3074:1: rule__Defender__Group__3__Impl : ( ( rule__Defender__Group_3__0 )? ) ;
    public final void rule__Defender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( ( ( rule__Defender__Group_3__0 )? ) )
            // InternalMyDsl.g:3079:1: ( ( rule__Defender__Group_3__0 )? )
            {
            // InternalMyDsl.g:3079:1: ( ( rule__Defender__Group_3__0 )? )
            // InternalMyDsl.g:3080:2: ( rule__Defender__Group_3__0 )?
            {
             before(grammarAccess.getDefenderAccess().getGroup_3()); 
            // InternalMyDsl.g:3081:2: ( rule__Defender__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3081:3: rule__Defender__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defender__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefenderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__3__Impl"


    // $ANTLR start "rule__Defender__Group__4"
    // InternalMyDsl.g:3089:1: rule__Defender__Group__4 : rule__Defender__Group__4__Impl rule__Defender__Group__5 ;
    public final void rule__Defender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( rule__Defender__Group__4__Impl rule__Defender__Group__5 )
            // InternalMyDsl.g:3094:2: rule__Defender__Group__4__Impl rule__Defender__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__4"


    // $ANTLR start "rule__Defender__Group__4__Impl"
    // InternalMyDsl.g:3101:1: rule__Defender__Group__4__Impl : ( ( rule__Defender__Group_4__0 )? ) ;
    public final void rule__Defender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( ( ( rule__Defender__Group_4__0 )? ) )
            // InternalMyDsl.g:3106:1: ( ( rule__Defender__Group_4__0 )? )
            {
            // InternalMyDsl.g:3106:1: ( ( rule__Defender__Group_4__0 )? )
            // InternalMyDsl.g:3107:2: ( rule__Defender__Group_4__0 )?
            {
             before(grammarAccess.getDefenderAccess().getGroup_4()); 
            // InternalMyDsl.g:3108:2: ( rule__Defender__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==55) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3108:3: rule__Defender__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defender__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefenderAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__4__Impl"


    // $ANTLR start "rule__Defender__Group__5"
    // InternalMyDsl.g:3116:1: rule__Defender__Group__5 : rule__Defender__Group__5__Impl rule__Defender__Group__6 ;
    public final void rule__Defender__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3120:1: ( rule__Defender__Group__5__Impl rule__Defender__Group__6 )
            // InternalMyDsl.g:3121:2: rule__Defender__Group__5__Impl rule__Defender__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__5"


    // $ANTLR start "rule__Defender__Group__5__Impl"
    // InternalMyDsl.g:3128:1: rule__Defender__Group__5__Impl : ( ( rule__Defender__Group_5__0 )? ) ;
    public final void rule__Defender__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3132:1: ( ( ( rule__Defender__Group_5__0 )? ) )
            // InternalMyDsl.g:3133:1: ( ( rule__Defender__Group_5__0 )? )
            {
            // InternalMyDsl.g:3133:1: ( ( rule__Defender__Group_5__0 )? )
            // InternalMyDsl.g:3134:2: ( rule__Defender__Group_5__0 )?
            {
             before(grammarAccess.getDefenderAccess().getGroup_5()); 
            // InternalMyDsl.g:3135:2: ( rule__Defender__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==56) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3135:3: rule__Defender__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defender__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefenderAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__5__Impl"


    // $ANTLR start "rule__Defender__Group__6"
    // InternalMyDsl.g:3143:1: rule__Defender__Group__6 : rule__Defender__Group__6__Impl rule__Defender__Group__7 ;
    public final void rule__Defender__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3147:1: ( rule__Defender__Group__6__Impl rule__Defender__Group__7 )
            // InternalMyDsl.g:3148:2: rule__Defender__Group__6__Impl rule__Defender__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__6"


    // $ANTLR start "rule__Defender__Group__6__Impl"
    // InternalMyDsl.g:3155:1: rule__Defender__Group__6__Impl : ( ( rule__Defender__Group_6__0 )? ) ;
    public final void rule__Defender__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( ( ( rule__Defender__Group_6__0 )? ) )
            // InternalMyDsl.g:3160:1: ( ( rule__Defender__Group_6__0 )? )
            {
            // InternalMyDsl.g:3160:1: ( ( rule__Defender__Group_6__0 )? )
            // InternalMyDsl.g:3161:2: ( rule__Defender__Group_6__0 )?
            {
             before(grammarAccess.getDefenderAccess().getGroup_6()); 
            // InternalMyDsl.g:3162:2: ( rule__Defender__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3162:3: rule__Defender__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defender__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefenderAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__6__Impl"


    // $ANTLR start "rule__Defender__Group__7"
    // InternalMyDsl.g:3170:1: rule__Defender__Group__7 : rule__Defender__Group__7__Impl rule__Defender__Group__8 ;
    public final void rule__Defender__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3174:1: ( rule__Defender__Group__7__Impl rule__Defender__Group__8 )
            // InternalMyDsl.g:3175:2: rule__Defender__Group__7__Impl rule__Defender__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__7"


    // $ANTLR start "rule__Defender__Group__7__Impl"
    // InternalMyDsl.g:3182:1: rule__Defender__Group__7__Impl : ( ( rule__Defender__Group_7__0 )? ) ;
    public final void rule__Defender__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( ( ( rule__Defender__Group_7__0 )? ) )
            // InternalMyDsl.g:3187:1: ( ( rule__Defender__Group_7__0 )? )
            {
            // InternalMyDsl.g:3187:1: ( ( rule__Defender__Group_7__0 )? )
            // InternalMyDsl.g:3188:2: ( rule__Defender__Group_7__0 )?
            {
             before(grammarAccess.getDefenderAccess().getGroup_7()); 
            // InternalMyDsl.g:3189:2: ( rule__Defender__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3189:3: rule__Defender__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defender__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefenderAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__7__Impl"


    // $ANTLR start "rule__Defender__Group__8"
    // InternalMyDsl.g:3197:1: rule__Defender__Group__8 : rule__Defender__Group__8__Impl rule__Defender__Group__9 ;
    public final void rule__Defender__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3201:1: ( rule__Defender__Group__8__Impl rule__Defender__Group__9 )
            // InternalMyDsl.g:3202:2: rule__Defender__Group__8__Impl rule__Defender__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Defender__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__8"


    // $ANTLR start "rule__Defender__Group__8__Impl"
    // InternalMyDsl.g:3209:1: rule__Defender__Group__8__Impl : ( ( rule__Defender__Group_8__0 )? ) ;
    public final void rule__Defender__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3213:1: ( ( ( rule__Defender__Group_8__0 )? ) )
            // InternalMyDsl.g:3214:1: ( ( rule__Defender__Group_8__0 )? )
            {
            // InternalMyDsl.g:3214:1: ( ( rule__Defender__Group_8__0 )? )
            // InternalMyDsl.g:3215:2: ( rule__Defender__Group_8__0 )?
            {
             before(grammarAccess.getDefenderAccess().getGroup_8()); 
            // InternalMyDsl.g:3216:2: ( rule__Defender__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3216:3: rule__Defender__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Defender__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefenderAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__8__Impl"


    // $ANTLR start "rule__Defender__Group__9"
    // InternalMyDsl.g:3224:1: rule__Defender__Group__9 : rule__Defender__Group__9__Impl ;
    public final void rule__Defender__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3228:1: ( rule__Defender__Group__9__Impl )
            // InternalMyDsl.g:3229:2: rule__Defender__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__9"


    // $ANTLR start "rule__Defender__Group__9__Impl"
    // InternalMyDsl.g:3235:1: rule__Defender__Group__9__Impl : ( '}' ) ;
    public final void rule__Defender__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3239:1: ( ( '}' ) )
            // InternalMyDsl.g:3240:1: ( '}' )
            {
            // InternalMyDsl.g:3240:1: ( '}' )
            // InternalMyDsl.g:3241:2: '}'
            {
             before(grammarAccess.getDefenderAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group__9__Impl"


    // $ANTLR start "rule__Defender__Group_3__0"
    // InternalMyDsl.g:3251:1: rule__Defender__Group_3__0 : rule__Defender__Group_3__0__Impl rule__Defender__Group_3__1 ;
    public final void rule__Defender__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3255:1: ( rule__Defender__Group_3__0__Impl rule__Defender__Group_3__1 )
            // InternalMyDsl.g:3256:2: rule__Defender__Group_3__0__Impl rule__Defender__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Defender__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_3__0"


    // $ANTLR start "rule__Defender__Group_3__0__Impl"
    // InternalMyDsl.g:3263:1: rule__Defender__Group_3__0__Impl : ( 'goals' ) ;
    public final void rule__Defender__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3267:1: ( ( 'goals' ) )
            // InternalMyDsl.g:3268:1: ( 'goals' )
            {
            // InternalMyDsl.g:3268:1: ( 'goals' )
            // InternalMyDsl.g:3269:2: 'goals'
            {
             before(grammarAccess.getDefenderAccess().getGoalsKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getGoalsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_3__0__Impl"


    // $ANTLR start "rule__Defender__Group_3__1"
    // InternalMyDsl.g:3278:1: rule__Defender__Group_3__1 : rule__Defender__Group_3__1__Impl ;
    public final void rule__Defender__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3282:1: ( rule__Defender__Group_3__1__Impl )
            // InternalMyDsl.g:3283:2: rule__Defender__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_3__1"


    // $ANTLR start "rule__Defender__Group_3__1__Impl"
    // InternalMyDsl.g:3289:1: rule__Defender__Group_3__1__Impl : ( ( rule__Defender__GoalsAssignment_3_1 ) ) ;
    public final void rule__Defender__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3293:1: ( ( ( rule__Defender__GoalsAssignment_3_1 ) ) )
            // InternalMyDsl.g:3294:1: ( ( rule__Defender__GoalsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3294:1: ( ( rule__Defender__GoalsAssignment_3_1 ) )
            // InternalMyDsl.g:3295:2: ( rule__Defender__GoalsAssignment_3_1 )
            {
             before(grammarAccess.getDefenderAccess().getGoalsAssignment_3_1()); 
            // InternalMyDsl.g:3296:2: ( rule__Defender__GoalsAssignment_3_1 )
            // InternalMyDsl.g:3296:3: rule__Defender__GoalsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Defender__GoalsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getGoalsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_3__1__Impl"


    // $ANTLR start "rule__Defender__Group_4__0"
    // InternalMyDsl.g:3305:1: rule__Defender__Group_4__0 : rule__Defender__Group_4__0__Impl rule__Defender__Group_4__1 ;
    public final void rule__Defender__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3309:1: ( rule__Defender__Group_4__0__Impl rule__Defender__Group_4__1 )
            // InternalMyDsl.g:3310:2: rule__Defender__Group_4__0__Impl rule__Defender__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Defender__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_4__0"


    // $ANTLR start "rule__Defender__Group_4__0__Impl"
    // InternalMyDsl.g:3317:1: rule__Defender__Group_4__0__Impl : ( 'assists' ) ;
    public final void rule__Defender__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( ( 'assists' ) )
            // InternalMyDsl.g:3322:1: ( 'assists' )
            {
            // InternalMyDsl.g:3322:1: ( 'assists' )
            // InternalMyDsl.g:3323:2: 'assists'
            {
             before(grammarAccess.getDefenderAccess().getAssistsKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getAssistsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_4__0__Impl"


    // $ANTLR start "rule__Defender__Group_4__1"
    // InternalMyDsl.g:3332:1: rule__Defender__Group_4__1 : rule__Defender__Group_4__1__Impl ;
    public final void rule__Defender__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3336:1: ( rule__Defender__Group_4__1__Impl )
            // InternalMyDsl.g:3337:2: rule__Defender__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_4__1"


    // $ANTLR start "rule__Defender__Group_4__1__Impl"
    // InternalMyDsl.g:3343:1: rule__Defender__Group_4__1__Impl : ( ( rule__Defender__AssistsAssignment_4_1 ) ) ;
    public final void rule__Defender__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3347:1: ( ( ( rule__Defender__AssistsAssignment_4_1 ) ) )
            // InternalMyDsl.g:3348:1: ( ( rule__Defender__AssistsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3348:1: ( ( rule__Defender__AssistsAssignment_4_1 ) )
            // InternalMyDsl.g:3349:2: ( rule__Defender__AssistsAssignment_4_1 )
            {
             before(grammarAccess.getDefenderAccess().getAssistsAssignment_4_1()); 
            // InternalMyDsl.g:3350:2: ( rule__Defender__AssistsAssignment_4_1 )
            // InternalMyDsl.g:3350:3: rule__Defender__AssistsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Defender__AssistsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getAssistsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_4__1__Impl"


    // $ANTLR start "rule__Defender__Group_5__0"
    // InternalMyDsl.g:3359:1: rule__Defender__Group_5__0 : rule__Defender__Group_5__0__Impl rule__Defender__Group_5__1 ;
    public final void rule__Defender__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3363:1: ( rule__Defender__Group_5__0__Impl rule__Defender__Group_5__1 )
            // InternalMyDsl.g:3364:2: rule__Defender__Group_5__0__Impl rule__Defender__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Defender__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_5__0"


    // $ANTLR start "rule__Defender__Group_5__0__Impl"
    // InternalMyDsl.g:3371:1: rule__Defender__Group_5__0__Impl : ( 'fouls' ) ;
    public final void rule__Defender__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( ( 'fouls' ) )
            // InternalMyDsl.g:3376:1: ( 'fouls' )
            {
            // InternalMyDsl.g:3376:1: ( 'fouls' )
            // InternalMyDsl.g:3377:2: 'fouls'
            {
             before(grammarAccess.getDefenderAccess().getFoulsKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getFoulsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_5__0__Impl"


    // $ANTLR start "rule__Defender__Group_5__1"
    // InternalMyDsl.g:3386:1: rule__Defender__Group_5__1 : rule__Defender__Group_5__1__Impl ;
    public final void rule__Defender__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3390:1: ( rule__Defender__Group_5__1__Impl )
            // InternalMyDsl.g:3391:2: rule__Defender__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_5__1"


    // $ANTLR start "rule__Defender__Group_5__1__Impl"
    // InternalMyDsl.g:3397:1: rule__Defender__Group_5__1__Impl : ( ( rule__Defender__FoulsAssignment_5_1 ) ) ;
    public final void rule__Defender__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3401:1: ( ( ( rule__Defender__FoulsAssignment_5_1 ) ) )
            // InternalMyDsl.g:3402:1: ( ( rule__Defender__FoulsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3402:1: ( ( rule__Defender__FoulsAssignment_5_1 ) )
            // InternalMyDsl.g:3403:2: ( rule__Defender__FoulsAssignment_5_1 )
            {
             before(grammarAccess.getDefenderAccess().getFoulsAssignment_5_1()); 
            // InternalMyDsl.g:3404:2: ( rule__Defender__FoulsAssignment_5_1 )
            // InternalMyDsl.g:3404:3: rule__Defender__FoulsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Defender__FoulsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getFoulsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_5__1__Impl"


    // $ANTLR start "rule__Defender__Group_6__0"
    // InternalMyDsl.g:3413:1: rule__Defender__Group_6__0 : rule__Defender__Group_6__0__Impl rule__Defender__Group_6__1 ;
    public final void rule__Defender__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3417:1: ( rule__Defender__Group_6__0__Impl rule__Defender__Group_6__1 )
            // InternalMyDsl.g:3418:2: rule__Defender__Group_6__0__Impl rule__Defender__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Defender__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_6__0"


    // $ANTLR start "rule__Defender__Group_6__0__Impl"
    // InternalMyDsl.g:3425:1: rule__Defender__Group_6__0__Impl : ( 'yellowCards' ) ;
    public final void rule__Defender__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3429:1: ( ( 'yellowCards' ) )
            // InternalMyDsl.g:3430:1: ( 'yellowCards' )
            {
            // InternalMyDsl.g:3430:1: ( 'yellowCards' )
            // InternalMyDsl.g:3431:2: 'yellowCards'
            {
             before(grammarAccess.getDefenderAccess().getYellowCardsKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getYellowCardsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_6__0__Impl"


    // $ANTLR start "rule__Defender__Group_6__1"
    // InternalMyDsl.g:3440:1: rule__Defender__Group_6__1 : rule__Defender__Group_6__1__Impl ;
    public final void rule__Defender__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3444:1: ( rule__Defender__Group_6__1__Impl )
            // InternalMyDsl.g:3445:2: rule__Defender__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_6__1"


    // $ANTLR start "rule__Defender__Group_6__1__Impl"
    // InternalMyDsl.g:3451:1: rule__Defender__Group_6__1__Impl : ( ( rule__Defender__YellowCardsAssignment_6_1 ) ) ;
    public final void rule__Defender__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3455:1: ( ( ( rule__Defender__YellowCardsAssignment_6_1 ) ) )
            // InternalMyDsl.g:3456:1: ( ( rule__Defender__YellowCardsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3456:1: ( ( rule__Defender__YellowCardsAssignment_6_1 ) )
            // InternalMyDsl.g:3457:2: ( rule__Defender__YellowCardsAssignment_6_1 )
            {
             before(grammarAccess.getDefenderAccess().getYellowCardsAssignment_6_1()); 
            // InternalMyDsl.g:3458:2: ( rule__Defender__YellowCardsAssignment_6_1 )
            // InternalMyDsl.g:3458:3: rule__Defender__YellowCardsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Defender__YellowCardsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getYellowCardsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_6__1__Impl"


    // $ANTLR start "rule__Defender__Group_7__0"
    // InternalMyDsl.g:3467:1: rule__Defender__Group_7__0 : rule__Defender__Group_7__0__Impl rule__Defender__Group_7__1 ;
    public final void rule__Defender__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3471:1: ( rule__Defender__Group_7__0__Impl rule__Defender__Group_7__1 )
            // InternalMyDsl.g:3472:2: rule__Defender__Group_7__0__Impl rule__Defender__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Defender__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_7__0"


    // $ANTLR start "rule__Defender__Group_7__0__Impl"
    // InternalMyDsl.g:3479:1: rule__Defender__Group_7__0__Impl : ( 'redCards' ) ;
    public final void rule__Defender__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3483:1: ( ( 'redCards' ) )
            // InternalMyDsl.g:3484:1: ( 'redCards' )
            {
            // InternalMyDsl.g:3484:1: ( 'redCards' )
            // InternalMyDsl.g:3485:2: 'redCards'
            {
             before(grammarAccess.getDefenderAccess().getRedCardsKeyword_7_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getRedCardsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_7__0__Impl"


    // $ANTLR start "rule__Defender__Group_7__1"
    // InternalMyDsl.g:3494:1: rule__Defender__Group_7__1 : rule__Defender__Group_7__1__Impl ;
    public final void rule__Defender__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3498:1: ( rule__Defender__Group_7__1__Impl )
            // InternalMyDsl.g:3499:2: rule__Defender__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_7__1"


    // $ANTLR start "rule__Defender__Group_7__1__Impl"
    // InternalMyDsl.g:3505:1: rule__Defender__Group_7__1__Impl : ( ( rule__Defender__RedCardsAssignment_7_1 ) ) ;
    public final void rule__Defender__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3509:1: ( ( ( rule__Defender__RedCardsAssignment_7_1 ) ) )
            // InternalMyDsl.g:3510:1: ( ( rule__Defender__RedCardsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:3510:1: ( ( rule__Defender__RedCardsAssignment_7_1 ) )
            // InternalMyDsl.g:3511:2: ( rule__Defender__RedCardsAssignment_7_1 )
            {
             before(grammarAccess.getDefenderAccess().getRedCardsAssignment_7_1()); 
            // InternalMyDsl.g:3512:2: ( rule__Defender__RedCardsAssignment_7_1 )
            // InternalMyDsl.g:3512:3: rule__Defender__RedCardsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Defender__RedCardsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getRedCardsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_7__1__Impl"


    // $ANTLR start "rule__Defender__Group_8__0"
    // InternalMyDsl.g:3521:1: rule__Defender__Group_8__0 : rule__Defender__Group_8__0__Impl rule__Defender__Group_8__1 ;
    public final void rule__Defender__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3525:1: ( rule__Defender__Group_8__0__Impl rule__Defender__Group_8__1 )
            // InternalMyDsl.g:3526:2: rule__Defender__Group_8__0__Impl rule__Defender__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Defender__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Defender__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_8__0"


    // $ANTLR start "rule__Defender__Group_8__0__Impl"
    // InternalMyDsl.g:3533:1: rule__Defender__Group_8__0__Impl : ( 'cleansheets' ) ;
    public final void rule__Defender__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3537:1: ( ( 'cleansheets' ) )
            // InternalMyDsl.g:3538:1: ( 'cleansheets' )
            {
            // InternalMyDsl.g:3538:1: ( 'cleansheets' )
            // InternalMyDsl.g:3539:2: 'cleansheets'
            {
             before(grammarAccess.getDefenderAccess().getCleansheetsKeyword_8_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDefenderAccess().getCleansheetsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_8__0__Impl"


    // $ANTLR start "rule__Defender__Group_8__1"
    // InternalMyDsl.g:3548:1: rule__Defender__Group_8__1 : rule__Defender__Group_8__1__Impl ;
    public final void rule__Defender__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3552:1: ( rule__Defender__Group_8__1__Impl )
            // InternalMyDsl.g:3553:2: rule__Defender__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Defender__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_8__1"


    // $ANTLR start "rule__Defender__Group_8__1__Impl"
    // InternalMyDsl.g:3559:1: rule__Defender__Group_8__1__Impl : ( ( rule__Defender__CleansheetsAssignment_8_1 ) ) ;
    public final void rule__Defender__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3563:1: ( ( ( rule__Defender__CleansheetsAssignment_8_1 ) ) )
            // InternalMyDsl.g:3564:1: ( ( rule__Defender__CleansheetsAssignment_8_1 ) )
            {
            // InternalMyDsl.g:3564:1: ( ( rule__Defender__CleansheetsAssignment_8_1 ) )
            // InternalMyDsl.g:3565:2: ( rule__Defender__CleansheetsAssignment_8_1 )
            {
             before(grammarAccess.getDefenderAccess().getCleansheetsAssignment_8_1()); 
            // InternalMyDsl.g:3566:2: ( rule__Defender__CleansheetsAssignment_8_1 )
            // InternalMyDsl.g:3566:3: rule__Defender__CleansheetsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Defender__CleansheetsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDefenderAccess().getCleansheetsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__Group_8__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__0"
    // InternalMyDsl.g:3575:1: rule__Goalkeeper__Group__0 : rule__Goalkeeper__Group__0__Impl rule__Goalkeeper__Group__1 ;
    public final void rule__Goalkeeper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3579:1: ( rule__Goalkeeper__Group__0__Impl rule__Goalkeeper__Group__1 )
            // InternalMyDsl.g:3580:2: rule__Goalkeeper__Group__0__Impl rule__Goalkeeper__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Goalkeeper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__0"


    // $ANTLR start "rule__Goalkeeper__Group__0__Impl"
    // InternalMyDsl.g:3587:1: rule__Goalkeeper__Group__0__Impl : ( () ) ;
    public final void rule__Goalkeeper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3591:1: ( ( () ) )
            // InternalMyDsl.g:3592:1: ( () )
            {
            // InternalMyDsl.g:3592:1: ( () )
            // InternalMyDsl.g:3593:2: ()
            {
             before(grammarAccess.getGoalkeeperAccess().getGoalkeeperAction_0()); 
            // InternalMyDsl.g:3594:2: ()
            // InternalMyDsl.g:3594:3: 
            {
            }

             after(grammarAccess.getGoalkeeperAccess().getGoalkeeperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__1"
    // InternalMyDsl.g:3602:1: rule__Goalkeeper__Group__1 : rule__Goalkeeper__Group__1__Impl rule__Goalkeeper__Group__2 ;
    public final void rule__Goalkeeper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3606:1: ( rule__Goalkeeper__Group__1__Impl rule__Goalkeeper__Group__2 )
            // InternalMyDsl.g:3607:2: rule__Goalkeeper__Group__1__Impl rule__Goalkeeper__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Goalkeeper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__1"


    // $ANTLR start "rule__Goalkeeper__Group__1__Impl"
    // InternalMyDsl.g:3614:1: rule__Goalkeeper__Group__1__Impl : ( 'Goalkeeper' ) ;
    public final void rule__Goalkeeper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3618:1: ( ( 'Goalkeeper' ) )
            // InternalMyDsl.g:3619:1: ( 'Goalkeeper' )
            {
            // InternalMyDsl.g:3619:1: ( 'Goalkeeper' )
            // InternalMyDsl.g:3620:2: 'Goalkeeper'
            {
             before(grammarAccess.getGoalkeeperAccess().getGoalkeeperKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getGoalkeeperKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__2"
    // InternalMyDsl.g:3629:1: rule__Goalkeeper__Group__2 : rule__Goalkeeper__Group__2__Impl rule__Goalkeeper__Group__3 ;
    public final void rule__Goalkeeper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3633:1: ( rule__Goalkeeper__Group__2__Impl rule__Goalkeeper__Group__3 )
            // InternalMyDsl.g:3634:2: rule__Goalkeeper__Group__2__Impl rule__Goalkeeper__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__2"


    // $ANTLR start "rule__Goalkeeper__Group__2__Impl"
    // InternalMyDsl.g:3641:1: rule__Goalkeeper__Group__2__Impl : ( '{' ) ;
    public final void rule__Goalkeeper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3645:1: ( ( '{' ) )
            // InternalMyDsl.g:3646:1: ( '{' )
            {
            // InternalMyDsl.g:3646:1: ( '{' )
            // InternalMyDsl.g:3647:2: '{'
            {
             before(grammarAccess.getGoalkeeperAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__2__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__3"
    // InternalMyDsl.g:3656:1: rule__Goalkeeper__Group__3 : rule__Goalkeeper__Group__3__Impl rule__Goalkeeper__Group__4 ;
    public final void rule__Goalkeeper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3660:1: ( rule__Goalkeeper__Group__3__Impl rule__Goalkeeper__Group__4 )
            // InternalMyDsl.g:3661:2: rule__Goalkeeper__Group__3__Impl rule__Goalkeeper__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__3"


    // $ANTLR start "rule__Goalkeeper__Group__3__Impl"
    // InternalMyDsl.g:3668:1: rule__Goalkeeper__Group__3__Impl : ( ( rule__Goalkeeper__Group_3__0 )? ) ;
    public final void rule__Goalkeeper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3672:1: ( ( ( rule__Goalkeeper__Group_3__0 )? ) )
            // InternalMyDsl.g:3673:1: ( ( rule__Goalkeeper__Group_3__0 )? )
            {
            // InternalMyDsl.g:3673:1: ( ( rule__Goalkeeper__Group_3__0 )? )
            // InternalMyDsl.g:3674:2: ( rule__Goalkeeper__Group_3__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_3()); 
            // InternalMyDsl.g:3675:2: ( rule__Goalkeeper__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3675:3: rule__Goalkeeper__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__3__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__4"
    // InternalMyDsl.g:3683:1: rule__Goalkeeper__Group__4 : rule__Goalkeeper__Group__4__Impl rule__Goalkeeper__Group__5 ;
    public final void rule__Goalkeeper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3687:1: ( rule__Goalkeeper__Group__4__Impl rule__Goalkeeper__Group__5 )
            // InternalMyDsl.g:3688:2: rule__Goalkeeper__Group__4__Impl rule__Goalkeeper__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__4"


    // $ANTLR start "rule__Goalkeeper__Group__4__Impl"
    // InternalMyDsl.g:3695:1: rule__Goalkeeper__Group__4__Impl : ( ( rule__Goalkeeper__Group_4__0 )? ) ;
    public final void rule__Goalkeeper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3699:1: ( ( ( rule__Goalkeeper__Group_4__0 )? ) )
            // InternalMyDsl.g:3700:1: ( ( rule__Goalkeeper__Group_4__0 )? )
            {
            // InternalMyDsl.g:3700:1: ( ( rule__Goalkeeper__Group_4__0 )? )
            // InternalMyDsl.g:3701:2: ( rule__Goalkeeper__Group_4__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_4()); 
            // InternalMyDsl.g:3702:2: ( rule__Goalkeeper__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3702:3: rule__Goalkeeper__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__4__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__5"
    // InternalMyDsl.g:3710:1: rule__Goalkeeper__Group__5 : rule__Goalkeeper__Group__5__Impl rule__Goalkeeper__Group__6 ;
    public final void rule__Goalkeeper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3714:1: ( rule__Goalkeeper__Group__5__Impl rule__Goalkeeper__Group__6 )
            // InternalMyDsl.g:3715:2: rule__Goalkeeper__Group__5__Impl rule__Goalkeeper__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__5"


    // $ANTLR start "rule__Goalkeeper__Group__5__Impl"
    // InternalMyDsl.g:3722:1: rule__Goalkeeper__Group__5__Impl : ( ( rule__Goalkeeper__Group_5__0 )? ) ;
    public final void rule__Goalkeeper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3726:1: ( ( ( rule__Goalkeeper__Group_5__0 )? ) )
            // InternalMyDsl.g:3727:1: ( ( rule__Goalkeeper__Group_5__0 )? )
            {
            // InternalMyDsl.g:3727:1: ( ( rule__Goalkeeper__Group_5__0 )? )
            // InternalMyDsl.g:3728:2: ( rule__Goalkeeper__Group_5__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_5()); 
            // InternalMyDsl.g:3729:2: ( rule__Goalkeeper__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==56) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3729:3: rule__Goalkeeper__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__5__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__6"
    // InternalMyDsl.g:3737:1: rule__Goalkeeper__Group__6 : rule__Goalkeeper__Group__6__Impl rule__Goalkeeper__Group__7 ;
    public final void rule__Goalkeeper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3741:1: ( rule__Goalkeeper__Group__6__Impl rule__Goalkeeper__Group__7 )
            // InternalMyDsl.g:3742:2: rule__Goalkeeper__Group__6__Impl rule__Goalkeeper__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__6"


    // $ANTLR start "rule__Goalkeeper__Group__6__Impl"
    // InternalMyDsl.g:3749:1: rule__Goalkeeper__Group__6__Impl : ( ( rule__Goalkeeper__Group_6__0 )? ) ;
    public final void rule__Goalkeeper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3753:1: ( ( ( rule__Goalkeeper__Group_6__0 )? ) )
            // InternalMyDsl.g:3754:1: ( ( rule__Goalkeeper__Group_6__0 )? )
            {
            // InternalMyDsl.g:3754:1: ( ( rule__Goalkeeper__Group_6__0 )? )
            // InternalMyDsl.g:3755:2: ( rule__Goalkeeper__Group_6__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_6()); 
            // InternalMyDsl.g:3756:2: ( rule__Goalkeeper__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==57) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3756:3: rule__Goalkeeper__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__6__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__7"
    // InternalMyDsl.g:3764:1: rule__Goalkeeper__Group__7 : rule__Goalkeeper__Group__7__Impl rule__Goalkeeper__Group__8 ;
    public final void rule__Goalkeeper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3768:1: ( rule__Goalkeeper__Group__7__Impl rule__Goalkeeper__Group__8 )
            // InternalMyDsl.g:3769:2: rule__Goalkeeper__Group__7__Impl rule__Goalkeeper__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__7"


    // $ANTLR start "rule__Goalkeeper__Group__7__Impl"
    // InternalMyDsl.g:3776:1: rule__Goalkeeper__Group__7__Impl : ( ( rule__Goalkeeper__Group_7__0 )? ) ;
    public final void rule__Goalkeeper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3780:1: ( ( ( rule__Goalkeeper__Group_7__0 )? ) )
            // InternalMyDsl.g:3781:1: ( ( rule__Goalkeeper__Group_7__0 )? )
            {
            // InternalMyDsl.g:3781:1: ( ( rule__Goalkeeper__Group_7__0 )? )
            // InternalMyDsl.g:3782:2: ( rule__Goalkeeper__Group_7__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_7()); 
            // InternalMyDsl.g:3783:2: ( rule__Goalkeeper__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==58) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3783:3: rule__Goalkeeper__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__7__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__8"
    // InternalMyDsl.g:3791:1: rule__Goalkeeper__Group__8 : rule__Goalkeeper__Group__8__Impl rule__Goalkeeper__Group__9 ;
    public final void rule__Goalkeeper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3795:1: ( rule__Goalkeeper__Group__8__Impl rule__Goalkeeper__Group__9 )
            // InternalMyDsl.g:3796:2: rule__Goalkeeper__Group__8__Impl rule__Goalkeeper__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__8"


    // $ANTLR start "rule__Goalkeeper__Group__8__Impl"
    // InternalMyDsl.g:3803:1: rule__Goalkeeper__Group__8__Impl : ( ( rule__Goalkeeper__Group_8__0 )? ) ;
    public final void rule__Goalkeeper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3807:1: ( ( ( rule__Goalkeeper__Group_8__0 )? ) )
            // InternalMyDsl.g:3808:1: ( ( rule__Goalkeeper__Group_8__0 )? )
            {
            // InternalMyDsl.g:3808:1: ( ( rule__Goalkeeper__Group_8__0 )? )
            // InternalMyDsl.g:3809:2: ( rule__Goalkeeper__Group_8__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_8()); 
            // InternalMyDsl.g:3810:2: ( rule__Goalkeeper__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3810:3: rule__Goalkeeper__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__8__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__9"
    // InternalMyDsl.g:3818:1: rule__Goalkeeper__Group__9 : rule__Goalkeeper__Group__9__Impl rule__Goalkeeper__Group__10 ;
    public final void rule__Goalkeeper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3822:1: ( rule__Goalkeeper__Group__9__Impl rule__Goalkeeper__Group__10 )
            // InternalMyDsl.g:3823:2: rule__Goalkeeper__Group__9__Impl rule__Goalkeeper__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__Goalkeeper__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__9"


    // $ANTLR start "rule__Goalkeeper__Group__9__Impl"
    // InternalMyDsl.g:3830:1: rule__Goalkeeper__Group__9__Impl : ( ( rule__Goalkeeper__Group_9__0 )? ) ;
    public final void rule__Goalkeeper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3834:1: ( ( ( rule__Goalkeeper__Group_9__0 )? ) )
            // InternalMyDsl.g:3835:1: ( ( rule__Goalkeeper__Group_9__0 )? )
            {
            // InternalMyDsl.g:3835:1: ( ( rule__Goalkeeper__Group_9__0 )? )
            // InternalMyDsl.g:3836:2: ( rule__Goalkeeper__Group_9__0 )?
            {
             before(grammarAccess.getGoalkeeperAccess().getGroup_9()); 
            // InternalMyDsl.g:3837:2: ( rule__Goalkeeper__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3837:3: rule__Goalkeeper__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goalkeeper__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalkeeperAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__9__Impl"


    // $ANTLR start "rule__Goalkeeper__Group__10"
    // InternalMyDsl.g:3845:1: rule__Goalkeeper__Group__10 : rule__Goalkeeper__Group__10__Impl ;
    public final void rule__Goalkeeper__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3849:1: ( rule__Goalkeeper__Group__10__Impl )
            // InternalMyDsl.g:3850:2: rule__Goalkeeper__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__10"


    // $ANTLR start "rule__Goalkeeper__Group__10__Impl"
    // InternalMyDsl.g:3856:1: rule__Goalkeeper__Group__10__Impl : ( '}' ) ;
    public final void rule__Goalkeeper__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3860:1: ( ( '}' ) )
            // InternalMyDsl.g:3861:1: ( '}' )
            {
            // InternalMyDsl.g:3861:1: ( '}' )
            // InternalMyDsl.g:3862:2: '}'
            {
             before(grammarAccess.getGoalkeeperAccess().getRightCurlyBracketKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group__10__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_3__0"
    // InternalMyDsl.g:3872:1: rule__Goalkeeper__Group_3__0 : rule__Goalkeeper__Group_3__0__Impl rule__Goalkeeper__Group_3__1 ;
    public final void rule__Goalkeeper__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3876:1: ( rule__Goalkeeper__Group_3__0__Impl rule__Goalkeeper__Group_3__1 )
            // InternalMyDsl.g:3877:2: rule__Goalkeeper__Group_3__0__Impl rule__Goalkeeper__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_3__0"


    // $ANTLR start "rule__Goalkeeper__Group_3__0__Impl"
    // InternalMyDsl.g:3884:1: rule__Goalkeeper__Group_3__0__Impl : ( 'goals' ) ;
    public final void rule__Goalkeeper__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3888:1: ( ( 'goals' ) )
            // InternalMyDsl.g:3889:1: ( 'goals' )
            {
            // InternalMyDsl.g:3889:1: ( 'goals' )
            // InternalMyDsl.g:3890:2: 'goals'
            {
             before(grammarAccess.getGoalkeeperAccess().getGoalsKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getGoalsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_3__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_3__1"
    // InternalMyDsl.g:3899:1: rule__Goalkeeper__Group_3__1 : rule__Goalkeeper__Group_3__1__Impl ;
    public final void rule__Goalkeeper__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3903:1: ( rule__Goalkeeper__Group_3__1__Impl )
            // InternalMyDsl.g:3904:2: rule__Goalkeeper__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_3__1"


    // $ANTLR start "rule__Goalkeeper__Group_3__1__Impl"
    // InternalMyDsl.g:3910:1: rule__Goalkeeper__Group_3__1__Impl : ( ( rule__Goalkeeper__GoalsAssignment_3_1 ) ) ;
    public final void rule__Goalkeeper__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3914:1: ( ( ( rule__Goalkeeper__GoalsAssignment_3_1 ) ) )
            // InternalMyDsl.g:3915:1: ( ( rule__Goalkeeper__GoalsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3915:1: ( ( rule__Goalkeeper__GoalsAssignment_3_1 ) )
            // InternalMyDsl.g:3916:2: ( rule__Goalkeeper__GoalsAssignment_3_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getGoalsAssignment_3_1()); 
            // InternalMyDsl.g:3917:2: ( rule__Goalkeeper__GoalsAssignment_3_1 )
            // InternalMyDsl.g:3917:3: rule__Goalkeeper__GoalsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__GoalsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getGoalsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_3__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_4__0"
    // InternalMyDsl.g:3926:1: rule__Goalkeeper__Group_4__0 : rule__Goalkeeper__Group_4__0__Impl rule__Goalkeeper__Group_4__1 ;
    public final void rule__Goalkeeper__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3930:1: ( rule__Goalkeeper__Group_4__0__Impl rule__Goalkeeper__Group_4__1 )
            // InternalMyDsl.g:3931:2: rule__Goalkeeper__Group_4__0__Impl rule__Goalkeeper__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_4__0"


    // $ANTLR start "rule__Goalkeeper__Group_4__0__Impl"
    // InternalMyDsl.g:3938:1: rule__Goalkeeper__Group_4__0__Impl : ( 'assists' ) ;
    public final void rule__Goalkeeper__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3942:1: ( ( 'assists' ) )
            // InternalMyDsl.g:3943:1: ( 'assists' )
            {
            // InternalMyDsl.g:3943:1: ( 'assists' )
            // InternalMyDsl.g:3944:2: 'assists'
            {
             before(grammarAccess.getGoalkeeperAccess().getAssistsKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getAssistsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_4__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_4__1"
    // InternalMyDsl.g:3953:1: rule__Goalkeeper__Group_4__1 : rule__Goalkeeper__Group_4__1__Impl ;
    public final void rule__Goalkeeper__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3957:1: ( rule__Goalkeeper__Group_4__1__Impl )
            // InternalMyDsl.g:3958:2: rule__Goalkeeper__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_4__1"


    // $ANTLR start "rule__Goalkeeper__Group_4__1__Impl"
    // InternalMyDsl.g:3964:1: rule__Goalkeeper__Group_4__1__Impl : ( ( rule__Goalkeeper__AssistsAssignment_4_1 ) ) ;
    public final void rule__Goalkeeper__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3968:1: ( ( ( rule__Goalkeeper__AssistsAssignment_4_1 ) ) )
            // InternalMyDsl.g:3969:1: ( ( rule__Goalkeeper__AssistsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3969:1: ( ( rule__Goalkeeper__AssistsAssignment_4_1 ) )
            // InternalMyDsl.g:3970:2: ( rule__Goalkeeper__AssistsAssignment_4_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getAssistsAssignment_4_1()); 
            // InternalMyDsl.g:3971:2: ( rule__Goalkeeper__AssistsAssignment_4_1 )
            // InternalMyDsl.g:3971:3: rule__Goalkeeper__AssistsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__AssistsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getAssistsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_4__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_5__0"
    // InternalMyDsl.g:3980:1: rule__Goalkeeper__Group_5__0 : rule__Goalkeeper__Group_5__0__Impl rule__Goalkeeper__Group_5__1 ;
    public final void rule__Goalkeeper__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3984:1: ( rule__Goalkeeper__Group_5__0__Impl rule__Goalkeeper__Group_5__1 )
            // InternalMyDsl.g:3985:2: rule__Goalkeeper__Group_5__0__Impl rule__Goalkeeper__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_5__0"


    // $ANTLR start "rule__Goalkeeper__Group_5__0__Impl"
    // InternalMyDsl.g:3992:1: rule__Goalkeeper__Group_5__0__Impl : ( 'fouls' ) ;
    public final void rule__Goalkeeper__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3996:1: ( ( 'fouls' ) )
            // InternalMyDsl.g:3997:1: ( 'fouls' )
            {
            // InternalMyDsl.g:3997:1: ( 'fouls' )
            // InternalMyDsl.g:3998:2: 'fouls'
            {
             before(grammarAccess.getGoalkeeperAccess().getFoulsKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getFoulsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_5__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_5__1"
    // InternalMyDsl.g:4007:1: rule__Goalkeeper__Group_5__1 : rule__Goalkeeper__Group_5__1__Impl ;
    public final void rule__Goalkeeper__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4011:1: ( rule__Goalkeeper__Group_5__1__Impl )
            // InternalMyDsl.g:4012:2: rule__Goalkeeper__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_5__1"


    // $ANTLR start "rule__Goalkeeper__Group_5__1__Impl"
    // InternalMyDsl.g:4018:1: rule__Goalkeeper__Group_5__1__Impl : ( ( rule__Goalkeeper__FoulsAssignment_5_1 ) ) ;
    public final void rule__Goalkeeper__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4022:1: ( ( ( rule__Goalkeeper__FoulsAssignment_5_1 ) ) )
            // InternalMyDsl.g:4023:1: ( ( rule__Goalkeeper__FoulsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4023:1: ( ( rule__Goalkeeper__FoulsAssignment_5_1 ) )
            // InternalMyDsl.g:4024:2: ( rule__Goalkeeper__FoulsAssignment_5_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getFoulsAssignment_5_1()); 
            // InternalMyDsl.g:4025:2: ( rule__Goalkeeper__FoulsAssignment_5_1 )
            // InternalMyDsl.g:4025:3: rule__Goalkeeper__FoulsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__FoulsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getFoulsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_5__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_6__0"
    // InternalMyDsl.g:4034:1: rule__Goalkeeper__Group_6__0 : rule__Goalkeeper__Group_6__0__Impl rule__Goalkeeper__Group_6__1 ;
    public final void rule__Goalkeeper__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4038:1: ( rule__Goalkeeper__Group_6__0__Impl rule__Goalkeeper__Group_6__1 )
            // InternalMyDsl.g:4039:2: rule__Goalkeeper__Group_6__0__Impl rule__Goalkeeper__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_6__0"


    // $ANTLR start "rule__Goalkeeper__Group_6__0__Impl"
    // InternalMyDsl.g:4046:1: rule__Goalkeeper__Group_6__0__Impl : ( 'yellowCards' ) ;
    public final void rule__Goalkeeper__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4050:1: ( ( 'yellowCards' ) )
            // InternalMyDsl.g:4051:1: ( 'yellowCards' )
            {
            // InternalMyDsl.g:4051:1: ( 'yellowCards' )
            // InternalMyDsl.g:4052:2: 'yellowCards'
            {
             before(grammarAccess.getGoalkeeperAccess().getYellowCardsKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getYellowCardsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_6__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_6__1"
    // InternalMyDsl.g:4061:1: rule__Goalkeeper__Group_6__1 : rule__Goalkeeper__Group_6__1__Impl ;
    public final void rule__Goalkeeper__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4065:1: ( rule__Goalkeeper__Group_6__1__Impl )
            // InternalMyDsl.g:4066:2: rule__Goalkeeper__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_6__1"


    // $ANTLR start "rule__Goalkeeper__Group_6__1__Impl"
    // InternalMyDsl.g:4072:1: rule__Goalkeeper__Group_6__1__Impl : ( ( rule__Goalkeeper__YellowCardsAssignment_6_1 ) ) ;
    public final void rule__Goalkeeper__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4076:1: ( ( ( rule__Goalkeeper__YellowCardsAssignment_6_1 ) ) )
            // InternalMyDsl.g:4077:1: ( ( rule__Goalkeeper__YellowCardsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4077:1: ( ( rule__Goalkeeper__YellowCardsAssignment_6_1 ) )
            // InternalMyDsl.g:4078:2: ( rule__Goalkeeper__YellowCardsAssignment_6_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getYellowCardsAssignment_6_1()); 
            // InternalMyDsl.g:4079:2: ( rule__Goalkeeper__YellowCardsAssignment_6_1 )
            // InternalMyDsl.g:4079:3: rule__Goalkeeper__YellowCardsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__YellowCardsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getYellowCardsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_6__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_7__0"
    // InternalMyDsl.g:4088:1: rule__Goalkeeper__Group_7__0 : rule__Goalkeeper__Group_7__0__Impl rule__Goalkeeper__Group_7__1 ;
    public final void rule__Goalkeeper__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4092:1: ( rule__Goalkeeper__Group_7__0__Impl rule__Goalkeeper__Group_7__1 )
            // InternalMyDsl.g:4093:2: rule__Goalkeeper__Group_7__0__Impl rule__Goalkeeper__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_7__0"


    // $ANTLR start "rule__Goalkeeper__Group_7__0__Impl"
    // InternalMyDsl.g:4100:1: rule__Goalkeeper__Group_7__0__Impl : ( 'redCards' ) ;
    public final void rule__Goalkeeper__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4104:1: ( ( 'redCards' ) )
            // InternalMyDsl.g:4105:1: ( 'redCards' )
            {
            // InternalMyDsl.g:4105:1: ( 'redCards' )
            // InternalMyDsl.g:4106:2: 'redCards'
            {
             before(grammarAccess.getGoalkeeperAccess().getRedCardsKeyword_7_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getRedCardsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_7__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_7__1"
    // InternalMyDsl.g:4115:1: rule__Goalkeeper__Group_7__1 : rule__Goalkeeper__Group_7__1__Impl ;
    public final void rule__Goalkeeper__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4119:1: ( rule__Goalkeeper__Group_7__1__Impl )
            // InternalMyDsl.g:4120:2: rule__Goalkeeper__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_7__1"


    // $ANTLR start "rule__Goalkeeper__Group_7__1__Impl"
    // InternalMyDsl.g:4126:1: rule__Goalkeeper__Group_7__1__Impl : ( ( rule__Goalkeeper__RedCardsAssignment_7_1 ) ) ;
    public final void rule__Goalkeeper__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4130:1: ( ( ( rule__Goalkeeper__RedCardsAssignment_7_1 ) ) )
            // InternalMyDsl.g:4131:1: ( ( rule__Goalkeeper__RedCardsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4131:1: ( ( rule__Goalkeeper__RedCardsAssignment_7_1 ) )
            // InternalMyDsl.g:4132:2: ( rule__Goalkeeper__RedCardsAssignment_7_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getRedCardsAssignment_7_1()); 
            // InternalMyDsl.g:4133:2: ( rule__Goalkeeper__RedCardsAssignment_7_1 )
            // InternalMyDsl.g:4133:3: rule__Goalkeeper__RedCardsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__RedCardsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getRedCardsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_7__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_8__0"
    // InternalMyDsl.g:4142:1: rule__Goalkeeper__Group_8__0 : rule__Goalkeeper__Group_8__0__Impl rule__Goalkeeper__Group_8__1 ;
    public final void rule__Goalkeeper__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4146:1: ( rule__Goalkeeper__Group_8__0__Impl rule__Goalkeeper__Group_8__1 )
            // InternalMyDsl.g:4147:2: rule__Goalkeeper__Group_8__0__Impl rule__Goalkeeper__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_8__0"


    // $ANTLR start "rule__Goalkeeper__Group_8__0__Impl"
    // InternalMyDsl.g:4154:1: rule__Goalkeeper__Group_8__0__Impl : ( 'cleansheets' ) ;
    public final void rule__Goalkeeper__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4158:1: ( ( 'cleansheets' ) )
            // InternalMyDsl.g:4159:1: ( 'cleansheets' )
            {
            // InternalMyDsl.g:4159:1: ( 'cleansheets' )
            // InternalMyDsl.g:4160:2: 'cleansheets'
            {
             before(grammarAccess.getGoalkeeperAccess().getCleansheetsKeyword_8_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getCleansheetsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_8__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_8__1"
    // InternalMyDsl.g:4169:1: rule__Goalkeeper__Group_8__1 : rule__Goalkeeper__Group_8__1__Impl ;
    public final void rule__Goalkeeper__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4173:1: ( rule__Goalkeeper__Group_8__1__Impl )
            // InternalMyDsl.g:4174:2: rule__Goalkeeper__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_8__1"


    // $ANTLR start "rule__Goalkeeper__Group_8__1__Impl"
    // InternalMyDsl.g:4180:1: rule__Goalkeeper__Group_8__1__Impl : ( ( rule__Goalkeeper__CleansheetsAssignment_8_1 ) ) ;
    public final void rule__Goalkeeper__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4184:1: ( ( ( rule__Goalkeeper__CleansheetsAssignment_8_1 ) ) )
            // InternalMyDsl.g:4185:1: ( ( rule__Goalkeeper__CleansheetsAssignment_8_1 ) )
            {
            // InternalMyDsl.g:4185:1: ( ( rule__Goalkeeper__CleansheetsAssignment_8_1 ) )
            // InternalMyDsl.g:4186:2: ( rule__Goalkeeper__CleansheetsAssignment_8_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getCleansheetsAssignment_8_1()); 
            // InternalMyDsl.g:4187:2: ( rule__Goalkeeper__CleansheetsAssignment_8_1 )
            // InternalMyDsl.g:4187:3: rule__Goalkeeper__CleansheetsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__CleansheetsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getCleansheetsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_8__1__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_9__0"
    // InternalMyDsl.g:4196:1: rule__Goalkeeper__Group_9__0 : rule__Goalkeeper__Group_9__0__Impl rule__Goalkeeper__Group_9__1 ;
    public final void rule__Goalkeeper__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4200:1: ( rule__Goalkeeper__Group_9__0__Impl rule__Goalkeeper__Group_9__1 )
            // InternalMyDsl.g:4201:2: rule__Goalkeeper__Group_9__0__Impl rule__Goalkeeper__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__Goalkeeper__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_9__0"


    // $ANTLR start "rule__Goalkeeper__Group_9__0__Impl"
    // InternalMyDsl.g:4208:1: rule__Goalkeeper__Group_9__0__Impl : ( 'saves' ) ;
    public final void rule__Goalkeeper__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4212:1: ( ( 'saves' ) )
            // InternalMyDsl.g:4213:1: ( 'saves' )
            {
            // InternalMyDsl.g:4213:1: ( 'saves' )
            // InternalMyDsl.g:4214:2: 'saves'
            {
             before(grammarAccess.getGoalkeeperAccess().getSavesKeyword_9_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGoalkeeperAccess().getSavesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_9__0__Impl"


    // $ANTLR start "rule__Goalkeeper__Group_9__1"
    // InternalMyDsl.g:4223:1: rule__Goalkeeper__Group_9__1 : rule__Goalkeeper__Group_9__1__Impl ;
    public final void rule__Goalkeeper__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4227:1: ( rule__Goalkeeper__Group_9__1__Impl )
            // InternalMyDsl.g:4228:2: rule__Goalkeeper__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_9__1"


    // $ANTLR start "rule__Goalkeeper__Group_9__1__Impl"
    // InternalMyDsl.g:4234:1: rule__Goalkeeper__Group_9__1__Impl : ( ( rule__Goalkeeper__SavesAssignment_9_1 ) ) ;
    public final void rule__Goalkeeper__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4238:1: ( ( ( rule__Goalkeeper__SavesAssignment_9_1 ) ) )
            // InternalMyDsl.g:4239:1: ( ( rule__Goalkeeper__SavesAssignment_9_1 ) )
            {
            // InternalMyDsl.g:4239:1: ( ( rule__Goalkeeper__SavesAssignment_9_1 ) )
            // InternalMyDsl.g:4240:2: ( rule__Goalkeeper__SavesAssignment_9_1 )
            {
             before(grammarAccess.getGoalkeeperAccess().getSavesAssignment_9_1()); 
            // InternalMyDsl.g:4241:2: ( rule__Goalkeeper__SavesAssignment_9_1 )
            // InternalMyDsl.g:4241:3: rule__Goalkeeper__SavesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Goalkeeper__SavesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalkeeperAccess().getSavesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__Group_9__1__Impl"


    // $ANTLR start "rule__Attacker__Group__0"
    // InternalMyDsl.g:4250:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4254:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // InternalMyDsl.g:4255:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Attacker__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__0"


    // $ANTLR start "rule__Attacker__Group__0__Impl"
    // InternalMyDsl.g:4262:1: rule__Attacker__Group__0__Impl : ( () ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4266:1: ( ( () ) )
            // InternalMyDsl.g:4267:1: ( () )
            {
            // InternalMyDsl.g:4267:1: ( () )
            // InternalMyDsl.g:4268:2: ()
            {
             before(grammarAccess.getAttackerAccess().getAttackerAction_0()); 
            // InternalMyDsl.g:4269:2: ()
            // InternalMyDsl.g:4269:3: 
            {
            }

             after(grammarAccess.getAttackerAccess().getAttackerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__0__Impl"


    // $ANTLR start "rule__Attacker__Group__1"
    // InternalMyDsl.g:4277:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl rule__Attacker__Group__2 ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4281:1: ( rule__Attacker__Group__1__Impl rule__Attacker__Group__2 )
            // InternalMyDsl.g:4282:2: rule__Attacker__Group__1__Impl rule__Attacker__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attacker__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__1"


    // $ANTLR start "rule__Attacker__Group__1__Impl"
    // InternalMyDsl.g:4289:1: rule__Attacker__Group__1__Impl : ( 'Attacker' ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4293:1: ( ( 'Attacker' ) )
            // InternalMyDsl.g:4294:1: ( 'Attacker' )
            {
            // InternalMyDsl.g:4294:1: ( 'Attacker' )
            // InternalMyDsl.g:4295:2: 'Attacker'
            {
             before(grammarAccess.getAttackerAccess().getAttackerKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getAttackerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__1__Impl"


    // $ANTLR start "rule__Attacker__Group__2"
    // InternalMyDsl.g:4304:1: rule__Attacker__Group__2 : rule__Attacker__Group__2__Impl rule__Attacker__Group__3 ;
    public final void rule__Attacker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4308:1: ( rule__Attacker__Group__2__Impl rule__Attacker__Group__3 )
            // InternalMyDsl.g:4309:2: rule__Attacker__Group__2__Impl rule__Attacker__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__2"


    // $ANTLR start "rule__Attacker__Group__2__Impl"
    // InternalMyDsl.g:4316:1: rule__Attacker__Group__2__Impl : ( '{' ) ;
    public final void rule__Attacker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4320:1: ( ( '{' ) )
            // InternalMyDsl.g:4321:1: ( '{' )
            {
            // InternalMyDsl.g:4321:1: ( '{' )
            // InternalMyDsl.g:4322:2: '{'
            {
             before(grammarAccess.getAttackerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__2__Impl"


    // $ANTLR start "rule__Attacker__Group__3"
    // InternalMyDsl.g:4331:1: rule__Attacker__Group__3 : rule__Attacker__Group__3__Impl rule__Attacker__Group__4 ;
    public final void rule__Attacker__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4335:1: ( rule__Attacker__Group__3__Impl rule__Attacker__Group__4 )
            // InternalMyDsl.g:4336:2: rule__Attacker__Group__3__Impl rule__Attacker__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__3"


    // $ANTLR start "rule__Attacker__Group__3__Impl"
    // InternalMyDsl.g:4343:1: rule__Attacker__Group__3__Impl : ( ( rule__Attacker__Group_3__0 )? ) ;
    public final void rule__Attacker__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4347:1: ( ( ( rule__Attacker__Group_3__0 )? ) )
            // InternalMyDsl.g:4348:1: ( ( rule__Attacker__Group_3__0 )? )
            {
            // InternalMyDsl.g:4348:1: ( ( rule__Attacker__Group_3__0 )? )
            // InternalMyDsl.g:4349:2: ( rule__Attacker__Group_3__0 )?
            {
             before(grammarAccess.getAttackerAccess().getGroup_3()); 
            // InternalMyDsl.g:4350:2: ( rule__Attacker__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4350:3: rule__Attacker__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attacker__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__3__Impl"


    // $ANTLR start "rule__Attacker__Group__4"
    // InternalMyDsl.g:4358:1: rule__Attacker__Group__4 : rule__Attacker__Group__4__Impl rule__Attacker__Group__5 ;
    public final void rule__Attacker__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4362:1: ( rule__Attacker__Group__4__Impl rule__Attacker__Group__5 )
            // InternalMyDsl.g:4363:2: rule__Attacker__Group__4__Impl rule__Attacker__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__4"


    // $ANTLR start "rule__Attacker__Group__4__Impl"
    // InternalMyDsl.g:4370:1: rule__Attacker__Group__4__Impl : ( ( rule__Attacker__Group_4__0 )? ) ;
    public final void rule__Attacker__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4374:1: ( ( ( rule__Attacker__Group_4__0 )? ) )
            // InternalMyDsl.g:4375:1: ( ( rule__Attacker__Group_4__0 )? )
            {
            // InternalMyDsl.g:4375:1: ( ( rule__Attacker__Group_4__0 )? )
            // InternalMyDsl.g:4376:2: ( rule__Attacker__Group_4__0 )?
            {
             before(grammarAccess.getAttackerAccess().getGroup_4()); 
            // InternalMyDsl.g:4377:2: ( rule__Attacker__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4377:3: rule__Attacker__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attacker__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__4__Impl"


    // $ANTLR start "rule__Attacker__Group__5"
    // InternalMyDsl.g:4385:1: rule__Attacker__Group__5 : rule__Attacker__Group__5__Impl rule__Attacker__Group__6 ;
    public final void rule__Attacker__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4389:1: ( rule__Attacker__Group__5__Impl rule__Attacker__Group__6 )
            // InternalMyDsl.g:4390:2: rule__Attacker__Group__5__Impl rule__Attacker__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__5"


    // $ANTLR start "rule__Attacker__Group__5__Impl"
    // InternalMyDsl.g:4397:1: rule__Attacker__Group__5__Impl : ( ( rule__Attacker__Group_5__0 )? ) ;
    public final void rule__Attacker__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4401:1: ( ( ( rule__Attacker__Group_5__0 )? ) )
            // InternalMyDsl.g:4402:1: ( ( rule__Attacker__Group_5__0 )? )
            {
            // InternalMyDsl.g:4402:1: ( ( rule__Attacker__Group_5__0 )? )
            // InternalMyDsl.g:4403:2: ( rule__Attacker__Group_5__0 )?
            {
             before(grammarAccess.getAttackerAccess().getGroup_5()); 
            // InternalMyDsl.g:4404:2: ( rule__Attacker__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4404:3: rule__Attacker__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attacker__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__5__Impl"


    // $ANTLR start "rule__Attacker__Group__6"
    // InternalMyDsl.g:4412:1: rule__Attacker__Group__6 : rule__Attacker__Group__6__Impl rule__Attacker__Group__7 ;
    public final void rule__Attacker__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4416:1: ( rule__Attacker__Group__6__Impl rule__Attacker__Group__7 )
            // InternalMyDsl.g:4417:2: rule__Attacker__Group__6__Impl rule__Attacker__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__6"


    // $ANTLR start "rule__Attacker__Group__6__Impl"
    // InternalMyDsl.g:4424:1: rule__Attacker__Group__6__Impl : ( ( rule__Attacker__Group_6__0 )? ) ;
    public final void rule__Attacker__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4428:1: ( ( ( rule__Attacker__Group_6__0 )? ) )
            // InternalMyDsl.g:4429:1: ( ( rule__Attacker__Group_6__0 )? )
            {
            // InternalMyDsl.g:4429:1: ( ( rule__Attacker__Group_6__0 )? )
            // InternalMyDsl.g:4430:2: ( rule__Attacker__Group_6__0 )?
            {
             before(grammarAccess.getAttackerAccess().getGroup_6()); 
            // InternalMyDsl.g:4431:2: ( rule__Attacker__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4431:3: rule__Attacker__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attacker__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__6__Impl"


    // $ANTLR start "rule__Attacker__Group__7"
    // InternalMyDsl.g:4439:1: rule__Attacker__Group__7 : rule__Attacker__Group__7__Impl rule__Attacker__Group__8 ;
    public final void rule__Attacker__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4443:1: ( rule__Attacker__Group__7__Impl rule__Attacker__Group__8 )
            // InternalMyDsl.g:4444:2: rule__Attacker__Group__7__Impl rule__Attacker__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__7"


    // $ANTLR start "rule__Attacker__Group__7__Impl"
    // InternalMyDsl.g:4451:1: rule__Attacker__Group__7__Impl : ( ( rule__Attacker__Group_7__0 )? ) ;
    public final void rule__Attacker__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4455:1: ( ( ( rule__Attacker__Group_7__0 )? ) )
            // InternalMyDsl.g:4456:1: ( ( rule__Attacker__Group_7__0 )? )
            {
            // InternalMyDsl.g:4456:1: ( ( rule__Attacker__Group_7__0 )? )
            // InternalMyDsl.g:4457:2: ( rule__Attacker__Group_7__0 )?
            {
             before(grammarAccess.getAttackerAccess().getGroup_7()); 
            // InternalMyDsl.g:4458:2: ( rule__Attacker__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4458:3: rule__Attacker__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attacker__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__7__Impl"


    // $ANTLR start "rule__Attacker__Group__8"
    // InternalMyDsl.g:4466:1: rule__Attacker__Group__8 : rule__Attacker__Group__8__Impl rule__Attacker__Group__9 ;
    public final void rule__Attacker__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4470:1: ( rule__Attacker__Group__8__Impl rule__Attacker__Group__9 )
            // InternalMyDsl.g:4471:2: rule__Attacker__Group__8__Impl rule__Attacker__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Attacker__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__8"


    // $ANTLR start "rule__Attacker__Group__8__Impl"
    // InternalMyDsl.g:4478:1: rule__Attacker__Group__8__Impl : ( ( rule__Attacker__Group_8__0 )? ) ;
    public final void rule__Attacker__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4482:1: ( ( ( rule__Attacker__Group_8__0 )? ) )
            // InternalMyDsl.g:4483:1: ( ( rule__Attacker__Group_8__0 )? )
            {
            // InternalMyDsl.g:4483:1: ( ( rule__Attacker__Group_8__0 )? )
            // InternalMyDsl.g:4484:2: ( rule__Attacker__Group_8__0 )?
            {
             before(grammarAccess.getAttackerAccess().getGroup_8()); 
            // InternalMyDsl.g:4485:2: ( rule__Attacker__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:4485:3: rule__Attacker__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attacker__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__8__Impl"


    // $ANTLR start "rule__Attacker__Group__9"
    // InternalMyDsl.g:4493:1: rule__Attacker__Group__9 : rule__Attacker__Group__9__Impl ;
    public final void rule__Attacker__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4497:1: ( rule__Attacker__Group__9__Impl )
            // InternalMyDsl.g:4498:2: rule__Attacker__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__9"


    // $ANTLR start "rule__Attacker__Group__9__Impl"
    // InternalMyDsl.g:4504:1: rule__Attacker__Group__9__Impl : ( '}' ) ;
    public final void rule__Attacker__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4508:1: ( ( '}' ) )
            // InternalMyDsl.g:4509:1: ( '}' )
            {
            // InternalMyDsl.g:4509:1: ( '}' )
            // InternalMyDsl.g:4510:2: '}'
            {
             before(grammarAccess.getAttackerAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group__9__Impl"


    // $ANTLR start "rule__Attacker__Group_3__0"
    // InternalMyDsl.g:4520:1: rule__Attacker__Group_3__0 : rule__Attacker__Group_3__0__Impl rule__Attacker__Group_3__1 ;
    public final void rule__Attacker__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4524:1: ( rule__Attacker__Group_3__0__Impl rule__Attacker__Group_3__1 )
            // InternalMyDsl.g:4525:2: rule__Attacker__Group_3__0__Impl rule__Attacker__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Attacker__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_3__0"


    // $ANTLR start "rule__Attacker__Group_3__0__Impl"
    // InternalMyDsl.g:4532:1: rule__Attacker__Group_3__0__Impl : ( 'goals' ) ;
    public final void rule__Attacker__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4536:1: ( ( 'goals' ) )
            // InternalMyDsl.g:4537:1: ( 'goals' )
            {
            // InternalMyDsl.g:4537:1: ( 'goals' )
            // InternalMyDsl.g:4538:2: 'goals'
            {
             before(grammarAccess.getAttackerAccess().getGoalsKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getGoalsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_3__0__Impl"


    // $ANTLR start "rule__Attacker__Group_3__1"
    // InternalMyDsl.g:4547:1: rule__Attacker__Group_3__1 : rule__Attacker__Group_3__1__Impl ;
    public final void rule__Attacker__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4551:1: ( rule__Attacker__Group_3__1__Impl )
            // InternalMyDsl.g:4552:2: rule__Attacker__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_3__1"


    // $ANTLR start "rule__Attacker__Group_3__1__Impl"
    // InternalMyDsl.g:4558:1: rule__Attacker__Group_3__1__Impl : ( ( rule__Attacker__GoalsAssignment_3_1 ) ) ;
    public final void rule__Attacker__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4562:1: ( ( ( rule__Attacker__GoalsAssignment_3_1 ) ) )
            // InternalMyDsl.g:4563:1: ( ( rule__Attacker__GoalsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4563:1: ( ( rule__Attacker__GoalsAssignment_3_1 ) )
            // InternalMyDsl.g:4564:2: ( rule__Attacker__GoalsAssignment_3_1 )
            {
             before(grammarAccess.getAttackerAccess().getGoalsAssignment_3_1()); 
            // InternalMyDsl.g:4565:2: ( rule__Attacker__GoalsAssignment_3_1 )
            // InternalMyDsl.g:4565:3: rule__Attacker__GoalsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__GoalsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getGoalsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_3__1__Impl"


    // $ANTLR start "rule__Attacker__Group_4__0"
    // InternalMyDsl.g:4574:1: rule__Attacker__Group_4__0 : rule__Attacker__Group_4__0__Impl rule__Attacker__Group_4__1 ;
    public final void rule__Attacker__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4578:1: ( rule__Attacker__Group_4__0__Impl rule__Attacker__Group_4__1 )
            // InternalMyDsl.g:4579:2: rule__Attacker__Group_4__0__Impl rule__Attacker__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Attacker__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_4__0"


    // $ANTLR start "rule__Attacker__Group_4__0__Impl"
    // InternalMyDsl.g:4586:1: rule__Attacker__Group_4__0__Impl : ( 'assists' ) ;
    public final void rule__Attacker__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4590:1: ( ( 'assists' ) )
            // InternalMyDsl.g:4591:1: ( 'assists' )
            {
            // InternalMyDsl.g:4591:1: ( 'assists' )
            // InternalMyDsl.g:4592:2: 'assists'
            {
             before(grammarAccess.getAttackerAccess().getAssistsKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getAssistsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_4__0__Impl"


    // $ANTLR start "rule__Attacker__Group_4__1"
    // InternalMyDsl.g:4601:1: rule__Attacker__Group_4__1 : rule__Attacker__Group_4__1__Impl ;
    public final void rule__Attacker__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4605:1: ( rule__Attacker__Group_4__1__Impl )
            // InternalMyDsl.g:4606:2: rule__Attacker__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_4__1"


    // $ANTLR start "rule__Attacker__Group_4__1__Impl"
    // InternalMyDsl.g:4612:1: rule__Attacker__Group_4__1__Impl : ( ( rule__Attacker__AssistsAssignment_4_1 ) ) ;
    public final void rule__Attacker__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4616:1: ( ( ( rule__Attacker__AssistsAssignment_4_1 ) ) )
            // InternalMyDsl.g:4617:1: ( ( rule__Attacker__AssistsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4617:1: ( ( rule__Attacker__AssistsAssignment_4_1 ) )
            // InternalMyDsl.g:4618:2: ( rule__Attacker__AssistsAssignment_4_1 )
            {
             before(grammarAccess.getAttackerAccess().getAssistsAssignment_4_1()); 
            // InternalMyDsl.g:4619:2: ( rule__Attacker__AssistsAssignment_4_1 )
            // InternalMyDsl.g:4619:3: rule__Attacker__AssistsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__AssistsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getAssistsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_4__1__Impl"


    // $ANTLR start "rule__Attacker__Group_5__0"
    // InternalMyDsl.g:4628:1: rule__Attacker__Group_5__0 : rule__Attacker__Group_5__0__Impl rule__Attacker__Group_5__1 ;
    public final void rule__Attacker__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4632:1: ( rule__Attacker__Group_5__0__Impl rule__Attacker__Group_5__1 )
            // InternalMyDsl.g:4633:2: rule__Attacker__Group_5__0__Impl rule__Attacker__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Attacker__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_5__0"


    // $ANTLR start "rule__Attacker__Group_5__0__Impl"
    // InternalMyDsl.g:4640:1: rule__Attacker__Group_5__0__Impl : ( 'fouls' ) ;
    public final void rule__Attacker__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4644:1: ( ( 'fouls' ) )
            // InternalMyDsl.g:4645:1: ( 'fouls' )
            {
            // InternalMyDsl.g:4645:1: ( 'fouls' )
            // InternalMyDsl.g:4646:2: 'fouls'
            {
             before(grammarAccess.getAttackerAccess().getFoulsKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getFoulsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_5__0__Impl"


    // $ANTLR start "rule__Attacker__Group_5__1"
    // InternalMyDsl.g:4655:1: rule__Attacker__Group_5__1 : rule__Attacker__Group_5__1__Impl ;
    public final void rule__Attacker__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4659:1: ( rule__Attacker__Group_5__1__Impl )
            // InternalMyDsl.g:4660:2: rule__Attacker__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_5__1"


    // $ANTLR start "rule__Attacker__Group_5__1__Impl"
    // InternalMyDsl.g:4666:1: rule__Attacker__Group_5__1__Impl : ( ( rule__Attacker__FoulsAssignment_5_1 ) ) ;
    public final void rule__Attacker__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4670:1: ( ( ( rule__Attacker__FoulsAssignment_5_1 ) ) )
            // InternalMyDsl.g:4671:1: ( ( rule__Attacker__FoulsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4671:1: ( ( rule__Attacker__FoulsAssignment_5_1 ) )
            // InternalMyDsl.g:4672:2: ( rule__Attacker__FoulsAssignment_5_1 )
            {
             before(grammarAccess.getAttackerAccess().getFoulsAssignment_5_1()); 
            // InternalMyDsl.g:4673:2: ( rule__Attacker__FoulsAssignment_5_1 )
            // InternalMyDsl.g:4673:3: rule__Attacker__FoulsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__FoulsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getFoulsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_5__1__Impl"


    // $ANTLR start "rule__Attacker__Group_6__0"
    // InternalMyDsl.g:4682:1: rule__Attacker__Group_6__0 : rule__Attacker__Group_6__0__Impl rule__Attacker__Group_6__1 ;
    public final void rule__Attacker__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4686:1: ( rule__Attacker__Group_6__0__Impl rule__Attacker__Group_6__1 )
            // InternalMyDsl.g:4687:2: rule__Attacker__Group_6__0__Impl rule__Attacker__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Attacker__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_6__0"


    // $ANTLR start "rule__Attacker__Group_6__0__Impl"
    // InternalMyDsl.g:4694:1: rule__Attacker__Group_6__0__Impl : ( 'yellowCards' ) ;
    public final void rule__Attacker__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4698:1: ( ( 'yellowCards' ) )
            // InternalMyDsl.g:4699:1: ( 'yellowCards' )
            {
            // InternalMyDsl.g:4699:1: ( 'yellowCards' )
            // InternalMyDsl.g:4700:2: 'yellowCards'
            {
             before(grammarAccess.getAttackerAccess().getYellowCardsKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getYellowCardsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_6__0__Impl"


    // $ANTLR start "rule__Attacker__Group_6__1"
    // InternalMyDsl.g:4709:1: rule__Attacker__Group_6__1 : rule__Attacker__Group_6__1__Impl ;
    public final void rule__Attacker__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4713:1: ( rule__Attacker__Group_6__1__Impl )
            // InternalMyDsl.g:4714:2: rule__Attacker__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_6__1"


    // $ANTLR start "rule__Attacker__Group_6__1__Impl"
    // InternalMyDsl.g:4720:1: rule__Attacker__Group_6__1__Impl : ( ( rule__Attacker__YellowCardsAssignment_6_1 ) ) ;
    public final void rule__Attacker__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4724:1: ( ( ( rule__Attacker__YellowCardsAssignment_6_1 ) ) )
            // InternalMyDsl.g:4725:1: ( ( rule__Attacker__YellowCardsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4725:1: ( ( rule__Attacker__YellowCardsAssignment_6_1 ) )
            // InternalMyDsl.g:4726:2: ( rule__Attacker__YellowCardsAssignment_6_1 )
            {
             before(grammarAccess.getAttackerAccess().getYellowCardsAssignment_6_1()); 
            // InternalMyDsl.g:4727:2: ( rule__Attacker__YellowCardsAssignment_6_1 )
            // InternalMyDsl.g:4727:3: rule__Attacker__YellowCardsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__YellowCardsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getYellowCardsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_6__1__Impl"


    // $ANTLR start "rule__Attacker__Group_7__0"
    // InternalMyDsl.g:4736:1: rule__Attacker__Group_7__0 : rule__Attacker__Group_7__0__Impl rule__Attacker__Group_7__1 ;
    public final void rule__Attacker__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4740:1: ( rule__Attacker__Group_7__0__Impl rule__Attacker__Group_7__1 )
            // InternalMyDsl.g:4741:2: rule__Attacker__Group_7__0__Impl rule__Attacker__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__Attacker__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_7__0"


    // $ANTLR start "rule__Attacker__Group_7__0__Impl"
    // InternalMyDsl.g:4748:1: rule__Attacker__Group_7__0__Impl : ( 'redCards' ) ;
    public final void rule__Attacker__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4752:1: ( ( 'redCards' ) )
            // InternalMyDsl.g:4753:1: ( 'redCards' )
            {
            // InternalMyDsl.g:4753:1: ( 'redCards' )
            // InternalMyDsl.g:4754:2: 'redCards'
            {
             before(grammarAccess.getAttackerAccess().getRedCardsKeyword_7_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getRedCardsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_7__0__Impl"


    // $ANTLR start "rule__Attacker__Group_7__1"
    // InternalMyDsl.g:4763:1: rule__Attacker__Group_7__1 : rule__Attacker__Group_7__1__Impl ;
    public final void rule__Attacker__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4767:1: ( rule__Attacker__Group_7__1__Impl )
            // InternalMyDsl.g:4768:2: rule__Attacker__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_7__1"


    // $ANTLR start "rule__Attacker__Group_7__1__Impl"
    // InternalMyDsl.g:4774:1: rule__Attacker__Group_7__1__Impl : ( ( rule__Attacker__RedCardsAssignment_7_1 ) ) ;
    public final void rule__Attacker__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4778:1: ( ( ( rule__Attacker__RedCardsAssignment_7_1 ) ) )
            // InternalMyDsl.g:4779:1: ( ( rule__Attacker__RedCardsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4779:1: ( ( rule__Attacker__RedCardsAssignment_7_1 ) )
            // InternalMyDsl.g:4780:2: ( rule__Attacker__RedCardsAssignment_7_1 )
            {
             before(grammarAccess.getAttackerAccess().getRedCardsAssignment_7_1()); 
            // InternalMyDsl.g:4781:2: ( rule__Attacker__RedCardsAssignment_7_1 )
            // InternalMyDsl.g:4781:3: rule__Attacker__RedCardsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__RedCardsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getRedCardsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_7__1__Impl"


    // $ANTLR start "rule__Attacker__Group_8__0"
    // InternalMyDsl.g:4790:1: rule__Attacker__Group_8__0 : rule__Attacker__Group_8__0__Impl rule__Attacker__Group_8__1 ;
    public final void rule__Attacker__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4794:1: ( rule__Attacker__Group_8__0__Impl rule__Attacker__Group_8__1 )
            // InternalMyDsl.g:4795:2: rule__Attacker__Group_8__0__Impl rule__Attacker__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Attacker__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attacker__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_8__0"


    // $ANTLR start "rule__Attacker__Group_8__0__Impl"
    // InternalMyDsl.g:4802:1: rule__Attacker__Group_8__0__Impl : ( 'sprintSpeed' ) ;
    public final void rule__Attacker__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4806:1: ( ( 'sprintSpeed' ) )
            // InternalMyDsl.g:4807:1: ( 'sprintSpeed' )
            {
            // InternalMyDsl.g:4807:1: ( 'sprintSpeed' )
            // InternalMyDsl.g:4808:2: 'sprintSpeed'
            {
             before(grammarAccess.getAttackerAccess().getSprintSpeedKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAttackerAccess().getSprintSpeedKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_8__0__Impl"


    // $ANTLR start "rule__Attacker__Group_8__1"
    // InternalMyDsl.g:4817:1: rule__Attacker__Group_8__1 : rule__Attacker__Group_8__1__Impl ;
    public final void rule__Attacker__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4821:1: ( rule__Attacker__Group_8__1__Impl )
            // InternalMyDsl.g:4822:2: rule__Attacker__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_8__1"


    // $ANTLR start "rule__Attacker__Group_8__1__Impl"
    // InternalMyDsl.g:4828:1: rule__Attacker__Group_8__1__Impl : ( ( rule__Attacker__SprintSpeedAssignment_8_1 ) ) ;
    public final void rule__Attacker__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4832:1: ( ( ( rule__Attacker__SprintSpeedAssignment_8_1 ) ) )
            // InternalMyDsl.g:4833:1: ( ( rule__Attacker__SprintSpeedAssignment_8_1 ) )
            {
            // InternalMyDsl.g:4833:1: ( ( rule__Attacker__SprintSpeedAssignment_8_1 ) )
            // InternalMyDsl.g:4834:2: ( rule__Attacker__SprintSpeedAssignment_8_1 )
            {
             before(grammarAccess.getAttackerAccess().getSprintSpeedAssignment_8_1()); 
            // InternalMyDsl.g:4835:2: ( rule__Attacker__SprintSpeedAssignment_8_1 )
            // InternalMyDsl.g:4835:3: rule__Attacker__SprintSpeedAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Attacker__SprintSpeedAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAttackerAccess().getSprintSpeedAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__Group_8__1__Impl"


    // $ANTLR start "rule__League__Group__0"
    // InternalMyDsl.g:4844:1: rule__League__Group__0 : rule__League__Group__0__Impl rule__League__Group__1 ;
    public final void rule__League__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4848:1: ( rule__League__Group__0__Impl rule__League__Group__1 )
            // InternalMyDsl.g:4849:2: rule__League__Group__0__Impl rule__League__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__League__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__0"


    // $ANTLR start "rule__League__Group__0__Impl"
    // InternalMyDsl.g:4856:1: rule__League__Group__0__Impl : ( () ) ;
    public final void rule__League__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4860:1: ( ( () ) )
            // InternalMyDsl.g:4861:1: ( () )
            {
            // InternalMyDsl.g:4861:1: ( () )
            // InternalMyDsl.g:4862:2: ()
            {
             before(grammarAccess.getLeagueAccess().getLeagueAction_0()); 
            // InternalMyDsl.g:4863:2: ()
            // InternalMyDsl.g:4863:3: 
            {
            }

             after(grammarAccess.getLeagueAccess().getLeagueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__0__Impl"


    // $ANTLR start "rule__League__Group__1"
    // InternalMyDsl.g:4871:1: rule__League__Group__1 : rule__League__Group__1__Impl rule__League__Group__2 ;
    public final void rule__League__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( rule__League__Group__1__Impl rule__League__Group__2 )
            // InternalMyDsl.g:4876:2: rule__League__Group__1__Impl rule__League__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__League__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__1"


    // $ANTLR start "rule__League__Group__1__Impl"
    // InternalMyDsl.g:4883:1: rule__League__Group__1__Impl : ( 'League' ) ;
    public final void rule__League__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4887:1: ( ( 'League' ) )
            // InternalMyDsl.g:4888:1: ( 'League' )
            {
            // InternalMyDsl.g:4888:1: ( 'League' )
            // InternalMyDsl.g:4889:2: 'League'
            {
             before(grammarAccess.getLeagueAccess().getLeagueKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getLeagueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__1__Impl"


    // $ANTLR start "rule__League__Group__2"
    // InternalMyDsl.g:4898:1: rule__League__Group__2 : rule__League__Group__2__Impl rule__League__Group__3 ;
    public final void rule__League__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4902:1: ( rule__League__Group__2__Impl rule__League__Group__3 )
            // InternalMyDsl.g:4903:2: rule__League__Group__2__Impl rule__League__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__League__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__2"


    // $ANTLR start "rule__League__Group__2__Impl"
    // InternalMyDsl.g:4910:1: rule__League__Group__2__Impl : ( ( rule__League__NameAssignment_2 ) ) ;
    public final void rule__League__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4914:1: ( ( ( rule__League__NameAssignment_2 ) ) )
            // InternalMyDsl.g:4915:1: ( ( rule__League__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:4915:1: ( ( rule__League__NameAssignment_2 ) )
            // InternalMyDsl.g:4916:2: ( rule__League__NameAssignment_2 )
            {
             before(grammarAccess.getLeagueAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:4917:2: ( rule__League__NameAssignment_2 )
            // InternalMyDsl.g:4917:3: rule__League__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__League__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__2__Impl"


    // $ANTLR start "rule__League__Group__3"
    // InternalMyDsl.g:4925:1: rule__League__Group__3 : rule__League__Group__3__Impl rule__League__Group__4 ;
    public final void rule__League__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4929:1: ( rule__League__Group__3__Impl rule__League__Group__4 )
            // InternalMyDsl.g:4930:2: rule__League__Group__3__Impl rule__League__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__League__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__3"


    // $ANTLR start "rule__League__Group__3__Impl"
    // InternalMyDsl.g:4937:1: rule__League__Group__3__Impl : ( '{' ) ;
    public final void rule__League__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4941:1: ( ( '{' ) )
            // InternalMyDsl.g:4942:1: ( '{' )
            {
            // InternalMyDsl.g:4942:1: ( '{' )
            // InternalMyDsl.g:4943:2: '{'
            {
             before(grammarAccess.getLeagueAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__3__Impl"


    // $ANTLR start "rule__League__Group__4"
    // InternalMyDsl.g:4952:1: rule__League__Group__4 : rule__League__Group__4__Impl rule__League__Group__5 ;
    public final void rule__League__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4956:1: ( rule__League__Group__4__Impl rule__League__Group__5 )
            // InternalMyDsl.g:4957:2: rule__League__Group__4__Impl rule__League__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__League__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__4"


    // $ANTLR start "rule__League__Group__4__Impl"
    // InternalMyDsl.g:4964:1: rule__League__Group__4__Impl : ( ( rule__League__Group_4__0 ) ) ;
    public final void rule__League__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4968:1: ( ( ( rule__League__Group_4__0 ) ) )
            // InternalMyDsl.g:4969:1: ( ( rule__League__Group_4__0 ) )
            {
            // InternalMyDsl.g:4969:1: ( ( rule__League__Group_4__0 ) )
            // InternalMyDsl.g:4970:2: ( rule__League__Group_4__0 )
            {
             before(grammarAccess.getLeagueAccess().getGroup_4()); 
            // InternalMyDsl.g:4971:2: ( rule__League__Group_4__0 )
            // InternalMyDsl.g:4971:3: rule__League__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__4__Impl"


    // $ANTLR start "rule__League__Group__5"
    // InternalMyDsl.g:4979:1: rule__League__Group__5 : rule__League__Group__5__Impl rule__League__Group__6 ;
    public final void rule__League__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4983:1: ( rule__League__Group__5__Impl rule__League__Group__6 )
            // InternalMyDsl.g:4984:2: rule__League__Group__5__Impl rule__League__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__League__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__5"


    // $ANTLR start "rule__League__Group__5__Impl"
    // InternalMyDsl.g:4991:1: rule__League__Group__5__Impl : ( ( rule__League__Group_5__0 ) ) ;
    public final void rule__League__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4995:1: ( ( ( rule__League__Group_5__0 ) ) )
            // InternalMyDsl.g:4996:1: ( ( rule__League__Group_5__0 ) )
            {
            // InternalMyDsl.g:4996:1: ( ( rule__League__Group_5__0 ) )
            // InternalMyDsl.g:4997:2: ( rule__League__Group_5__0 )
            {
             before(grammarAccess.getLeagueAccess().getGroup_5()); 
            // InternalMyDsl.g:4998:2: ( rule__League__Group_5__0 )
            // InternalMyDsl.g:4998:3: rule__League__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__5__Impl"


    // $ANTLR start "rule__League__Group__6"
    // InternalMyDsl.g:5006:1: rule__League__Group__6 : rule__League__Group__6__Impl rule__League__Group__7 ;
    public final void rule__League__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( rule__League__Group__6__Impl rule__League__Group__7 )
            // InternalMyDsl.g:5011:2: rule__League__Group__6__Impl rule__League__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__League__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__6"


    // $ANTLR start "rule__League__Group__6__Impl"
    // InternalMyDsl.g:5018:1: rule__League__Group__6__Impl : ( ( rule__League__Group_6__0 )? ) ;
    public final void rule__League__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5022:1: ( ( ( rule__League__Group_6__0 )? ) )
            // InternalMyDsl.g:5023:1: ( ( rule__League__Group_6__0 )? )
            {
            // InternalMyDsl.g:5023:1: ( ( rule__League__Group_6__0 )? )
            // InternalMyDsl.g:5024:2: ( rule__League__Group_6__0 )?
            {
             before(grammarAccess.getLeagueAccess().getGroup_6()); 
            // InternalMyDsl.g:5025:2: ( rule__League__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==67) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:5025:3: rule__League__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__League__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeagueAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__6__Impl"


    // $ANTLR start "rule__League__Group__7"
    // InternalMyDsl.g:5033:1: rule__League__Group__7 : rule__League__Group__7__Impl rule__League__Group__8 ;
    public final void rule__League__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5037:1: ( rule__League__Group__7__Impl rule__League__Group__8 )
            // InternalMyDsl.g:5038:2: rule__League__Group__7__Impl rule__League__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__League__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__7"


    // $ANTLR start "rule__League__Group__7__Impl"
    // InternalMyDsl.g:5045:1: rule__League__Group__7__Impl : ( ( rule__League__Group_7__0 )? ) ;
    public final void rule__League__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5049:1: ( ( ( rule__League__Group_7__0 )? ) )
            // InternalMyDsl.g:5050:1: ( ( rule__League__Group_7__0 )? )
            {
            // InternalMyDsl.g:5050:1: ( ( rule__League__Group_7__0 )? )
            // InternalMyDsl.g:5051:2: ( rule__League__Group_7__0 )?
            {
             before(grammarAccess.getLeagueAccess().getGroup_7()); 
            // InternalMyDsl.g:5052:2: ( rule__League__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==68) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:5052:3: rule__League__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__League__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeagueAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__7__Impl"


    // $ANTLR start "rule__League__Group__8"
    // InternalMyDsl.g:5060:1: rule__League__Group__8 : rule__League__Group__8__Impl rule__League__Group__9 ;
    public final void rule__League__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5064:1: ( rule__League__Group__8__Impl rule__League__Group__9 )
            // InternalMyDsl.g:5065:2: rule__League__Group__8__Impl rule__League__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__League__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__8"


    // $ANTLR start "rule__League__Group__8__Impl"
    // InternalMyDsl.g:5072:1: rule__League__Group__8__Impl : ( ( rule__League__Group_8__0 )? ) ;
    public final void rule__League__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5076:1: ( ( ( rule__League__Group_8__0 )? ) )
            // InternalMyDsl.g:5077:1: ( ( rule__League__Group_8__0 )? )
            {
            // InternalMyDsl.g:5077:1: ( ( rule__League__Group_8__0 )? )
            // InternalMyDsl.g:5078:2: ( rule__League__Group_8__0 )?
            {
             before(grammarAccess.getLeagueAccess().getGroup_8()); 
            // InternalMyDsl.g:5079:2: ( rule__League__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:5079:3: rule__League__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__League__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeagueAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__8__Impl"


    // $ANTLR start "rule__League__Group__9"
    // InternalMyDsl.g:5087:1: rule__League__Group__9 : rule__League__Group__9__Impl ;
    public final void rule__League__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5091:1: ( rule__League__Group__9__Impl )
            // InternalMyDsl.g:5092:2: rule__League__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__9"


    // $ANTLR start "rule__League__Group__9__Impl"
    // InternalMyDsl.g:5098:1: rule__League__Group__9__Impl : ( '}' ) ;
    public final void rule__League__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5102:1: ( ( '}' ) )
            // InternalMyDsl.g:5103:1: ( '}' )
            {
            // InternalMyDsl.g:5103:1: ( '}' )
            // InternalMyDsl.g:5104:2: '}'
            {
             before(grammarAccess.getLeagueAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group__9__Impl"


    // $ANTLR start "rule__League__Group_4__0"
    // InternalMyDsl.g:5114:1: rule__League__Group_4__0 : rule__League__Group_4__0__Impl rule__League__Group_4__1 ;
    public final void rule__League__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5118:1: ( rule__League__Group_4__0__Impl rule__League__Group_4__1 )
            // InternalMyDsl.g:5119:2: rule__League__Group_4__0__Impl rule__League__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__League__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_4__0"


    // $ANTLR start "rule__League__Group_4__0__Impl"
    // InternalMyDsl.g:5126:1: rule__League__Group_4__0__Impl : ( 'maxTeams' ) ;
    public final void rule__League__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5130:1: ( ( 'maxTeams' ) )
            // InternalMyDsl.g:5131:1: ( 'maxTeams' )
            {
            // InternalMyDsl.g:5131:1: ( 'maxTeams' )
            // InternalMyDsl.g:5132:2: 'maxTeams'
            {
             before(grammarAccess.getLeagueAccess().getMaxTeamsKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getMaxTeamsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_4__0__Impl"


    // $ANTLR start "rule__League__Group_4__1"
    // InternalMyDsl.g:5141:1: rule__League__Group_4__1 : rule__League__Group_4__1__Impl ;
    public final void rule__League__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5145:1: ( rule__League__Group_4__1__Impl )
            // InternalMyDsl.g:5146:2: rule__League__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_4__1"


    // $ANTLR start "rule__League__Group_4__1__Impl"
    // InternalMyDsl.g:5152:1: rule__League__Group_4__1__Impl : ( ( rule__League__MaxTeamsAssignment_4_1 ) ) ;
    public final void rule__League__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5156:1: ( ( ( rule__League__MaxTeamsAssignment_4_1 ) ) )
            // InternalMyDsl.g:5157:1: ( ( rule__League__MaxTeamsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5157:1: ( ( rule__League__MaxTeamsAssignment_4_1 ) )
            // InternalMyDsl.g:5158:2: ( rule__League__MaxTeamsAssignment_4_1 )
            {
             before(grammarAccess.getLeagueAccess().getMaxTeamsAssignment_4_1()); 
            // InternalMyDsl.g:5159:2: ( rule__League__MaxTeamsAssignment_4_1 )
            // InternalMyDsl.g:5159:3: rule__League__MaxTeamsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__League__MaxTeamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getMaxTeamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_4__1__Impl"


    // $ANTLR start "rule__League__Group_5__0"
    // InternalMyDsl.g:5168:1: rule__League__Group_5__0 : rule__League__Group_5__0__Impl rule__League__Group_5__1 ;
    public final void rule__League__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5172:1: ( rule__League__Group_5__0__Impl rule__League__Group_5__1 )
            // InternalMyDsl.g:5173:2: rule__League__Group_5__0__Impl rule__League__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__League__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_5__0"


    // $ANTLR start "rule__League__Group_5__0__Impl"
    // InternalMyDsl.g:5180:1: rule__League__Group_5__0__Impl : ( 'minTeams' ) ;
    public final void rule__League__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5184:1: ( ( 'minTeams' ) )
            // InternalMyDsl.g:5185:1: ( 'minTeams' )
            {
            // InternalMyDsl.g:5185:1: ( 'minTeams' )
            // InternalMyDsl.g:5186:2: 'minTeams'
            {
             before(grammarAccess.getLeagueAccess().getMinTeamsKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getMinTeamsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_5__0__Impl"


    // $ANTLR start "rule__League__Group_5__1"
    // InternalMyDsl.g:5195:1: rule__League__Group_5__1 : rule__League__Group_5__1__Impl ;
    public final void rule__League__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5199:1: ( rule__League__Group_5__1__Impl )
            // InternalMyDsl.g:5200:2: rule__League__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_5__1"


    // $ANTLR start "rule__League__Group_5__1__Impl"
    // InternalMyDsl.g:5206:1: rule__League__Group_5__1__Impl : ( ( rule__League__MinTeamsAssignment_5_1 ) ) ;
    public final void rule__League__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5210:1: ( ( ( rule__League__MinTeamsAssignment_5_1 ) ) )
            // InternalMyDsl.g:5211:1: ( ( rule__League__MinTeamsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5211:1: ( ( rule__League__MinTeamsAssignment_5_1 ) )
            // InternalMyDsl.g:5212:2: ( rule__League__MinTeamsAssignment_5_1 )
            {
             before(grammarAccess.getLeagueAccess().getMinTeamsAssignment_5_1()); 
            // InternalMyDsl.g:5213:2: ( rule__League__MinTeamsAssignment_5_1 )
            // InternalMyDsl.g:5213:3: rule__League__MinTeamsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__League__MinTeamsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getMinTeamsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_5__1__Impl"


    // $ANTLR start "rule__League__Group_6__0"
    // InternalMyDsl.g:5222:1: rule__League__Group_6__0 : rule__League__Group_6__0__Impl rule__League__Group_6__1 ;
    public final void rule__League__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5226:1: ( rule__League__Group_6__0__Impl rule__League__Group_6__1 )
            // InternalMyDsl.g:5227:2: rule__League__Group_6__0__Impl rule__League__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__League__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_6__0"


    // $ANTLR start "rule__League__Group_6__0__Impl"
    // InternalMyDsl.g:5234:1: rule__League__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__League__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5238:1: ( ( 'description' ) )
            // InternalMyDsl.g:5239:1: ( 'description' )
            {
            // InternalMyDsl.g:5239:1: ( 'description' )
            // InternalMyDsl.g:5240:2: 'description'
            {
             before(grammarAccess.getLeagueAccess().getDescriptionKeyword_6_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_6__0__Impl"


    // $ANTLR start "rule__League__Group_6__1"
    // InternalMyDsl.g:5249:1: rule__League__Group_6__1 : rule__League__Group_6__1__Impl ;
    public final void rule__League__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5253:1: ( rule__League__Group_6__1__Impl )
            // InternalMyDsl.g:5254:2: rule__League__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_6__1"


    // $ANTLR start "rule__League__Group_6__1__Impl"
    // InternalMyDsl.g:5260:1: rule__League__Group_6__1__Impl : ( ( rule__League__DescriptionAssignment_6_1 ) ) ;
    public final void rule__League__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5264:1: ( ( ( rule__League__DescriptionAssignment_6_1 ) ) )
            // InternalMyDsl.g:5265:1: ( ( rule__League__DescriptionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:5265:1: ( ( rule__League__DescriptionAssignment_6_1 ) )
            // InternalMyDsl.g:5266:2: ( rule__League__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getLeagueAccess().getDescriptionAssignment_6_1()); 
            // InternalMyDsl.g:5267:2: ( rule__League__DescriptionAssignment_6_1 )
            // InternalMyDsl.g:5267:3: rule__League__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__League__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_6__1__Impl"


    // $ANTLR start "rule__League__Group_7__0"
    // InternalMyDsl.g:5276:1: rule__League__Group_7__0 : rule__League__Group_7__0__Impl rule__League__Group_7__1 ;
    public final void rule__League__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5280:1: ( rule__League__Group_7__0__Impl rule__League__Group_7__1 )
            // InternalMyDsl.g:5281:2: rule__League__Group_7__0__Impl rule__League__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__League__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_7__0"


    // $ANTLR start "rule__League__Group_7__0__Impl"
    // InternalMyDsl.g:5288:1: rule__League__Group_7__0__Impl : ( 'numberOfRounds' ) ;
    public final void rule__League__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5292:1: ( ( 'numberOfRounds' ) )
            // InternalMyDsl.g:5293:1: ( 'numberOfRounds' )
            {
            // InternalMyDsl.g:5293:1: ( 'numberOfRounds' )
            // InternalMyDsl.g:5294:2: 'numberOfRounds'
            {
             before(grammarAccess.getLeagueAccess().getNumberOfRoundsKeyword_7_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getNumberOfRoundsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_7__0__Impl"


    // $ANTLR start "rule__League__Group_7__1"
    // InternalMyDsl.g:5303:1: rule__League__Group_7__1 : rule__League__Group_7__1__Impl ;
    public final void rule__League__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5307:1: ( rule__League__Group_7__1__Impl )
            // InternalMyDsl.g:5308:2: rule__League__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_7__1"


    // $ANTLR start "rule__League__Group_7__1__Impl"
    // InternalMyDsl.g:5314:1: rule__League__Group_7__1__Impl : ( ( rule__League__NumberOfRoundsAssignment_7_1 ) ) ;
    public final void rule__League__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5318:1: ( ( ( rule__League__NumberOfRoundsAssignment_7_1 ) ) )
            // InternalMyDsl.g:5319:1: ( ( rule__League__NumberOfRoundsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:5319:1: ( ( rule__League__NumberOfRoundsAssignment_7_1 ) )
            // InternalMyDsl.g:5320:2: ( rule__League__NumberOfRoundsAssignment_7_1 )
            {
             before(grammarAccess.getLeagueAccess().getNumberOfRoundsAssignment_7_1()); 
            // InternalMyDsl.g:5321:2: ( rule__League__NumberOfRoundsAssignment_7_1 )
            // InternalMyDsl.g:5321:3: rule__League__NumberOfRoundsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__League__NumberOfRoundsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getNumberOfRoundsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_7__1__Impl"


    // $ANTLR start "rule__League__Group_8__0"
    // InternalMyDsl.g:5330:1: rule__League__Group_8__0 : rule__League__Group_8__0__Impl rule__League__Group_8__1 ;
    public final void rule__League__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5334:1: ( rule__League__Group_8__0__Impl rule__League__Group_8__1 )
            // InternalMyDsl.g:5335:2: rule__League__Group_8__0__Impl rule__League__Group_8__1
            {
            pushFollow(FOLLOW_36);
            rule__League__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__League__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_8__0"


    // $ANTLR start "rule__League__Group_8__0__Impl"
    // InternalMyDsl.g:5342:1: rule__League__Group_8__0__Impl : ( 'finalsFormat' ) ;
    public final void rule__League__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5346:1: ( ( 'finalsFormat' ) )
            // InternalMyDsl.g:5347:1: ( 'finalsFormat' )
            {
            // InternalMyDsl.g:5347:1: ( 'finalsFormat' )
            // InternalMyDsl.g:5348:2: 'finalsFormat'
            {
             before(grammarAccess.getLeagueAccess().getFinalsFormatKeyword_8_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLeagueAccess().getFinalsFormatKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_8__0__Impl"


    // $ANTLR start "rule__League__Group_8__1"
    // InternalMyDsl.g:5357:1: rule__League__Group_8__1 : rule__League__Group_8__1__Impl ;
    public final void rule__League__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5361:1: ( rule__League__Group_8__1__Impl )
            // InternalMyDsl.g:5362:2: rule__League__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__League__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_8__1"


    // $ANTLR start "rule__League__Group_8__1__Impl"
    // InternalMyDsl.g:5368:1: rule__League__Group_8__1__Impl : ( ( rule__League__FinalsFormatAssignment_8_1 ) ) ;
    public final void rule__League__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5372:1: ( ( ( rule__League__FinalsFormatAssignment_8_1 ) ) )
            // InternalMyDsl.g:5373:1: ( ( rule__League__FinalsFormatAssignment_8_1 ) )
            {
            // InternalMyDsl.g:5373:1: ( ( rule__League__FinalsFormatAssignment_8_1 ) )
            // InternalMyDsl.g:5374:2: ( rule__League__FinalsFormatAssignment_8_1 )
            {
             before(grammarAccess.getLeagueAccess().getFinalsFormatAssignment_8_1()); 
            // InternalMyDsl.g:5375:2: ( rule__League__FinalsFormatAssignment_8_1 )
            // InternalMyDsl.g:5375:3: rule__League__FinalsFormatAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__League__FinalsFormatAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLeagueAccess().getFinalsFormatAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__Group_8__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group__0"
    // InternalMyDsl.g:5384:1: rule__RoundRobin__Group__0 : rule__RoundRobin__Group__0__Impl rule__RoundRobin__Group__1 ;
    public final void rule__RoundRobin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5388:1: ( rule__RoundRobin__Group__0__Impl rule__RoundRobin__Group__1 )
            // InternalMyDsl.g:5389:2: rule__RoundRobin__Group__0__Impl rule__RoundRobin__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__RoundRobin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__0"


    // $ANTLR start "rule__RoundRobin__Group__0__Impl"
    // InternalMyDsl.g:5396:1: rule__RoundRobin__Group__0__Impl : ( () ) ;
    public final void rule__RoundRobin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5400:1: ( ( () ) )
            // InternalMyDsl.g:5401:1: ( () )
            {
            // InternalMyDsl.g:5401:1: ( () )
            // InternalMyDsl.g:5402:2: ()
            {
             before(grammarAccess.getRoundRobinAccess().getRoundRobinAction_0()); 
            // InternalMyDsl.g:5403:2: ()
            // InternalMyDsl.g:5403:3: 
            {
            }

             after(grammarAccess.getRoundRobinAccess().getRoundRobinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group__1"
    // InternalMyDsl.g:5411:1: rule__RoundRobin__Group__1 : rule__RoundRobin__Group__1__Impl rule__RoundRobin__Group__2 ;
    public final void rule__RoundRobin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5415:1: ( rule__RoundRobin__Group__1__Impl rule__RoundRobin__Group__2 )
            // InternalMyDsl.g:5416:2: rule__RoundRobin__Group__1__Impl rule__RoundRobin__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RoundRobin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__1"


    // $ANTLR start "rule__RoundRobin__Group__1__Impl"
    // InternalMyDsl.g:5423:1: rule__RoundRobin__Group__1__Impl : ( 'RoundRobin' ) ;
    public final void rule__RoundRobin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5427:1: ( ( 'RoundRobin' ) )
            // InternalMyDsl.g:5428:1: ( 'RoundRobin' )
            {
            // InternalMyDsl.g:5428:1: ( 'RoundRobin' )
            // InternalMyDsl.g:5429:2: 'RoundRobin'
            {
             before(grammarAccess.getRoundRobinAccess().getRoundRobinKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getRoundRobinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group__2"
    // InternalMyDsl.g:5438:1: rule__RoundRobin__Group__2 : rule__RoundRobin__Group__2__Impl rule__RoundRobin__Group__3 ;
    public final void rule__RoundRobin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5442:1: ( rule__RoundRobin__Group__2__Impl rule__RoundRobin__Group__3 )
            // InternalMyDsl.g:5443:2: rule__RoundRobin__Group__2__Impl rule__RoundRobin__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RoundRobin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__2"


    // $ANTLR start "rule__RoundRobin__Group__2__Impl"
    // InternalMyDsl.g:5450:1: rule__RoundRobin__Group__2__Impl : ( ( rule__RoundRobin__NameAssignment_2 ) ) ;
    public final void rule__RoundRobin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5454:1: ( ( ( rule__RoundRobin__NameAssignment_2 ) ) )
            // InternalMyDsl.g:5455:1: ( ( rule__RoundRobin__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:5455:1: ( ( rule__RoundRobin__NameAssignment_2 ) )
            // InternalMyDsl.g:5456:2: ( rule__RoundRobin__NameAssignment_2 )
            {
             before(grammarAccess.getRoundRobinAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:5457:2: ( rule__RoundRobin__NameAssignment_2 )
            // InternalMyDsl.g:5457:3: rule__RoundRobin__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__2__Impl"


    // $ANTLR start "rule__RoundRobin__Group__3"
    // InternalMyDsl.g:5465:1: rule__RoundRobin__Group__3 : rule__RoundRobin__Group__3__Impl rule__RoundRobin__Group__4 ;
    public final void rule__RoundRobin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5469:1: ( rule__RoundRobin__Group__3__Impl rule__RoundRobin__Group__4 )
            // InternalMyDsl.g:5470:2: rule__RoundRobin__Group__3__Impl rule__RoundRobin__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__RoundRobin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__3"


    // $ANTLR start "rule__RoundRobin__Group__3__Impl"
    // InternalMyDsl.g:5477:1: rule__RoundRobin__Group__3__Impl : ( '{' ) ;
    public final void rule__RoundRobin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5481:1: ( ( '{' ) )
            // InternalMyDsl.g:5482:1: ( '{' )
            {
            // InternalMyDsl.g:5482:1: ( '{' )
            // InternalMyDsl.g:5483:2: '{'
            {
             before(grammarAccess.getRoundRobinAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__3__Impl"


    // $ANTLR start "rule__RoundRobin__Group__4"
    // InternalMyDsl.g:5492:1: rule__RoundRobin__Group__4 : rule__RoundRobin__Group__4__Impl rule__RoundRobin__Group__5 ;
    public final void rule__RoundRobin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5496:1: ( rule__RoundRobin__Group__4__Impl rule__RoundRobin__Group__5 )
            // InternalMyDsl.g:5497:2: rule__RoundRobin__Group__4__Impl rule__RoundRobin__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__RoundRobin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__4"


    // $ANTLR start "rule__RoundRobin__Group__4__Impl"
    // InternalMyDsl.g:5504:1: rule__RoundRobin__Group__4__Impl : ( ( rule__RoundRobin__Group_4__0 ) ) ;
    public final void rule__RoundRobin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5508:1: ( ( ( rule__RoundRobin__Group_4__0 ) ) )
            // InternalMyDsl.g:5509:1: ( ( rule__RoundRobin__Group_4__0 ) )
            {
            // InternalMyDsl.g:5509:1: ( ( rule__RoundRobin__Group_4__0 ) )
            // InternalMyDsl.g:5510:2: ( rule__RoundRobin__Group_4__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_4()); 
            // InternalMyDsl.g:5511:2: ( rule__RoundRobin__Group_4__0 )
            // InternalMyDsl.g:5511:3: rule__RoundRobin__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__4__Impl"


    // $ANTLR start "rule__RoundRobin__Group__5"
    // InternalMyDsl.g:5519:1: rule__RoundRobin__Group__5 : rule__RoundRobin__Group__5__Impl rule__RoundRobin__Group__6 ;
    public final void rule__RoundRobin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5523:1: ( rule__RoundRobin__Group__5__Impl rule__RoundRobin__Group__6 )
            // InternalMyDsl.g:5524:2: rule__RoundRobin__Group__5__Impl rule__RoundRobin__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__RoundRobin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__5"


    // $ANTLR start "rule__RoundRobin__Group__5__Impl"
    // InternalMyDsl.g:5531:1: rule__RoundRobin__Group__5__Impl : ( ( rule__RoundRobin__Group_5__0 ) ) ;
    public final void rule__RoundRobin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5535:1: ( ( ( rule__RoundRobin__Group_5__0 ) ) )
            // InternalMyDsl.g:5536:1: ( ( rule__RoundRobin__Group_5__0 ) )
            {
            // InternalMyDsl.g:5536:1: ( ( rule__RoundRobin__Group_5__0 ) )
            // InternalMyDsl.g:5537:2: ( rule__RoundRobin__Group_5__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_5()); 
            // InternalMyDsl.g:5538:2: ( rule__RoundRobin__Group_5__0 )
            // InternalMyDsl.g:5538:3: rule__RoundRobin__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__5__Impl"


    // $ANTLR start "rule__RoundRobin__Group__6"
    // InternalMyDsl.g:5546:1: rule__RoundRobin__Group__6 : rule__RoundRobin__Group__6__Impl rule__RoundRobin__Group__7 ;
    public final void rule__RoundRobin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5550:1: ( rule__RoundRobin__Group__6__Impl rule__RoundRobin__Group__7 )
            // InternalMyDsl.g:5551:2: rule__RoundRobin__Group__6__Impl rule__RoundRobin__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__RoundRobin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__6"


    // $ANTLR start "rule__RoundRobin__Group__6__Impl"
    // InternalMyDsl.g:5558:1: rule__RoundRobin__Group__6__Impl : ( ( rule__RoundRobin__Group_6__0 )? ) ;
    public final void rule__RoundRobin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5562:1: ( ( ( rule__RoundRobin__Group_6__0 )? ) )
            // InternalMyDsl.g:5563:1: ( ( rule__RoundRobin__Group_6__0 )? )
            {
            // InternalMyDsl.g:5563:1: ( ( rule__RoundRobin__Group_6__0 )? )
            // InternalMyDsl.g:5564:2: ( rule__RoundRobin__Group_6__0 )?
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_6()); 
            // InternalMyDsl.g:5565:2: ( rule__RoundRobin__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:5565:3: rule__RoundRobin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoundRobin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoundRobinAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__6__Impl"


    // $ANTLR start "rule__RoundRobin__Group__7"
    // InternalMyDsl.g:5573:1: rule__RoundRobin__Group__7 : rule__RoundRobin__Group__7__Impl rule__RoundRobin__Group__8 ;
    public final void rule__RoundRobin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5577:1: ( rule__RoundRobin__Group__7__Impl rule__RoundRobin__Group__8 )
            // InternalMyDsl.g:5578:2: rule__RoundRobin__Group__7__Impl rule__RoundRobin__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__RoundRobin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__7"


    // $ANTLR start "rule__RoundRobin__Group__7__Impl"
    // InternalMyDsl.g:5585:1: rule__RoundRobin__Group__7__Impl : ( ( rule__RoundRobin__Group_7__0 ) ) ;
    public final void rule__RoundRobin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5589:1: ( ( ( rule__RoundRobin__Group_7__0 ) ) )
            // InternalMyDsl.g:5590:1: ( ( rule__RoundRobin__Group_7__0 ) )
            {
            // InternalMyDsl.g:5590:1: ( ( rule__RoundRobin__Group_7__0 ) )
            // InternalMyDsl.g:5591:2: ( rule__RoundRobin__Group_7__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_7()); 
            // InternalMyDsl.g:5592:2: ( rule__RoundRobin__Group_7__0 )
            // InternalMyDsl.g:5592:3: rule__RoundRobin__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__7__Impl"


    // $ANTLR start "rule__RoundRobin__Group__8"
    // InternalMyDsl.g:5600:1: rule__RoundRobin__Group__8 : rule__RoundRobin__Group__8__Impl rule__RoundRobin__Group__9 ;
    public final void rule__RoundRobin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5604:1: ( rule__RoundRobin__Group__8__Impl rule__RoundRobin__Group__9 )
            // InternalMyDsl.g:5605:2: rule__RoundRobin__Group__8__Impl rule__RoundRobin__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__RoundRobin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__8"


    // $ANTLR start "rule__RoundRobin__Group__8__Impl"
    // InternalMyDsl.g:5612:1: rule__RoundRobin__Group__8__Impl : ( ( rule__RoundRobin__Group_8__0 ) ) ;
    public final void rule__RoundRobin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5616:1: ( ( ( rule__RoundRobin__Group_8__0 ) ) )
            // InternalMyDsl.g:5617:1: ( ( rule__RoundRobin__Group_8__0 ) )
            {
            // InternalMyDsl.g:5617:1: ( ( rule__RoundRobin__Group_8__0 ) )
            // InternalMyDsl.g:5618:2: ( rule__RoundRobin__Group_8__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_8()); 
            // InternalMyDsl.g:5619:2: ( rule__RoundRobin__Group_8__0 )
            // InternalMyDsl.g:5619:3: rule__RoundRobin__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__8__Impl"


    // $ANTLR start "rule__RoundRobin__Group__9"
    // InternalMyDsl.g:5627:1: rule__RoundRobin__Group__9 : rule__RoundRobin__Group__9__Impl rule__RoundRobin__Group__10 ;
    public final void rule__RoundRobin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5631:1: ( rule__RoundRobin__Group__9__Impl rule__RoundRobin__Group__10 )
            // InternalMyDsl.g:5632:2: rule__RoundRobin__Group__9__Impl rule__RoundRobin__Group__10
            {
            pushFollow(FOLLOW_41);
            rule__RoundRobin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__9"


    // $ANTLR start "rule__RoundRobin__Group__9__Impl"
    // InternalMyDsl.g:5639:1: rule__RoundRobin__Group__9__Impl : ( ( rule__RoundRobin__Group_9__0 ) ) ;
    public final void rule__RoundRobin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5643:1: ( ( ( rule__RoundRobin__Group_9__0 ) ) )
            // InternalMyDsl.g:5644:1: ( ( rule__RoundRobin__Group_9__0 ) )
            {
            // InternalMyDsl.g:5644:1: ( ( rule__RoundRobin__Group_9__0 ) )
            // InternalMyDsl.g:5645:2: ( rule__RoundRobin__Group_9__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_9()); 
            // InternalMyDsl.g:5646:2: ( rule__RoundRobin__Group_9__0 )
            // InternalMyDsl.g:5646:3: rule__RoundRobin__Group_9__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__9__Impl"


    // $ANTLR start "rule__RoundRobin__Group__10"
    // InternalMyDsl.g:5654:1: rule__RoundRobin__Group__10 : rule__RoundRobin__Group__10__Impl rule__RoundRobin__Group__11 ;
    public final void rule__RoundRobin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5658:1: ( rule__RoundRobin__Group__10__Impl rule__RoundRobin__Group__11 )
            // InternalMyDsl.g:5659:2: rule__RoundRobin__Group__10__Impl rule__RoundRobin__Group__11
            {
            pushFollow(FOLLOW_42);
            rule__RoundRobin__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__10"


    // $ANTLR start "rule__RoundRobin__Group__10__Impl"
    // InternalMyDsl.g:5666:1: rule__RoundRobin__Group__10__Impl : ( ( rule__RoundRobin__Group_10__0 ) ) ;
    public final void rule__RoundRobin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5670:1: ( ( ( rule__RoundRobin__Group_10__0 ) ) )
            // InternalMyDsl.g:5671:1: ( ( rule__RoundRobin__Group_10__0 ) )
            {
            // InternalMyDsl.g:5671:1: ( ( rule__RoundRobin__Group_10__0 ) )
            // InternalMyDsl.g:5672:2: ( rule__RoundRobin__Group_10__0 )
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_10()); 
            // InternalMyDsl.g:5673:2: ( rule__RoundRobin__Group_10__0 )
            // InternalMyDsl.g:5673:3: rule__RoundRobin__Group_10__0
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_10__0();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__10__Impl"


    // $ANTLR start "rule__RoundRobin__Group__11"
    // InternalMyDsl.g:5681:1: rule__RoundRobin__Group__11 : rule__RoundRobin__Group__11__Impl rule__RoundRobin__Group__12 ;
    public final void rule__RoundRobin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5685:1: ( rule__RoundRobin__Group__11__Impl rule__RoundRobin__Group__12 )
            // InternalMyDsl.g:5686:2: rule__RoundRobin__Group__11__Impl rule__RoundRobin__Group__12
            {
            pushFollow(FOLLOW_42);
            rule__RoundRobin__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__11"


    // $ANTLR start "rule__RoundRobin__Group__11__Impl"
    // InternalMyDsl.g:5693:1: rule__RoundRobin__Group__11__Impl : ( ( rule__RoundRobin__Group_11__0 )? ) ;
    public final void rule__RoundRobin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5697:1: ( ( ( rule__RoundRobin__Group_11__0 )? ) )
            // InternalMyDsl.g:5698:1: ( ( rule__RoundRobin__Group_11__0 )? )
            {
            // InternalMyDsl.g:5698:1: ( ( rule__RoundRobin__Group_11__0 )? )
            // InternalMyDsl.g:5699:2: ( rule__RoundRobin__Group_11__0 )?
            {
             before(grammarAccess.getRoundRobinAccess().getGroup_11()); 
            // InternalMyDsl.g:5700:2: ( rule__RoundRobin__Group_11__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==74) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:5700:3: rule__RoundRobin__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoundRobin__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoundRobinAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__11__Impl"


    // $ANTLR start "rule__RoundRobin__Group__12"
    // InternalMyDsl.g:5708:1: rule__RoundRobin__Group__12 : rule__RoundRobin__Group__12__Impl ;
    public final void rule__RoundRobin__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5712:1: ( rule__RoundRobin__Group__12__Impl )
            // InternalMyDsl.g:5713:2: rule__RoundRobin__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__12"


    // $ANTLR start "rule__RoundRobin__Group__12__Impl"
    // InternalMyDsl.g:5719:1: rule__RoundRobin__Group__12__Impl : ( '}' ) ;
    public final void rule__RoundRobin__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5723:1: ( ( '}' ) )
            // InternalMyDsl.g:5724:1: ( '}' )
            {
            // InternalMyDsl.g:5724:1: ( '}' )
            // InternalMyDsl.g:5725:2: '}'
            {
             before(grammarAccess.getRoundRobinAccess().getRightCurlyBracketKeyword_12()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group__12__Impl"


    // $ANTLR start "rule__RoundRobin__Group_4__0"
    // InternalMyDsl.g:5735:1: rule__RoundRobin__Group_4__0 : rule__RoundRobin__Group_4__0__Impl rule__RoundRobin__Group_4__1 ;
    public final void rule__RoundRobin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5739:1: ( rule__RoundRobin__Group_4__0__Impl rule__RoundRobin__Group_4__1 )
            // InternalMyDsl.g:5740:2: rule__RoundRobin__Group_4__0__Impl rule__RoundRobin__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__RoundRobin__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_4__0"


    // $ANTLR start "rule__RoundRobin__Group_4__0__Impl"
    // InternalMyDsl.g:5747:1: rule__RoundRobin__Group_4__0__Impl : ( 'maxTeams' ) ;
    public final void rule__RoundRobin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5751:1: ( ( 'maxTeams' ) )
            // InternalMyDsl.g:5752:1: ( 'maxTeams' )
            {
            // InternalMyDsl.g:5752:1: ( 'maxTeams' )
            // InternalMyDsl.g:5753:2: 'maxTeams'
            {
             before(grammarAccess.getRoundRobinAccess().getMaxTeamsKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getMaxTeamsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_4__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_4__1"
    // InternalMyDsl.g:5762:1: rule__RoundRobin__Group_4__1 : rule__RoundRobin__Group_4__1__Impl ;
    public final void rule__RoundRobin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5766:1: ( rule__RoundRobin__Group_4__1__Impl )
            // InternalMyDsl.g:5767:2: rule__RoundRobin__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_4__1"


    // $ANTLR start "rule__RoundRobin__Group_4__1__Impl"
    // InternalMyDsl.g:5773:1: rule__RoundRobin__Group_4__1__Impl : ( ( rule__RoundRobin__MaxTeamsAssignment_4_1 ) ) ;
    public final void rule__RoundRobin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5777:1: ( ( ( rule__RoundRobin__MaxTeamsAssignment_4_1 ) ) )
            // InternalMyDsl.g:5778:1: ( ( rule__RoundRobin__MaxTeamsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5778:1: ( ( rule__RoundRobin__MaxTeamsAssignment_4_1 ) )
            // InternalMyDsl.g:5779:2: ( rule__RoundRobin__MaxTeamsAssignment_4_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getMaxTeamsAssignment_4_1()); 
            // InternalMyDsl.g:5780:2: ( rule__RoundRobin__MaxTeamsAssignment_4_1 )
            // InternalMyDsl.g:5780:3: rule__RoundRobin__MaxTeamsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__MaxTeamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getMaxTeamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_4__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_5__0"
    // InternalMyDsl.g:5789:1: rule__RoundRobin__Group_5__0 : rule__RoundRobin__Group_5__0__Impl rule__RoundRobin__Group_5__1 ;
    public final void rule__RoundRobin__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5793:1: ( rule__RoundRobin__Group_5__0__Impl rule__RoundRobin__Group_5__1 )
            // InternalMyDsl.g:5794:2: rule__RoundRobin__Group_5__0__Impl rule__RoundRobin__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__RoundRobin__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_5__0"


    // $ANTLR start "rule__RoundRobin__Group_5__0__Impl"
    // InternalMyDsl.g:5801:1: rule__RoundRobin__Group_5__0__Impl : ( 'minTeams' ) ;
    public final void rule__RoundRobin__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5805:1: ( ( 'minTeams' ) )
            // InternalMyDsl.g:5806:1: ( 'minTeams' )
            {
            // InternalMyDsl.g:5806:1: ( 'minTeams' )
            // InternalMyDsl.g:5807:2: 'minTeams'
            {
             before(grammarAccess.getRoundRobinAccess().getMinTeamsKeyword_5_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getMinTeamsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_5__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_5__1"
    // InternalMyDsl.g:5816:1: rule__RoundRobin__Group_5__1 : rule__RoundRobin__Group_5__1__Impl ;
    public final void rule__RoundRobin__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5820:1: ( rule__RoundRobin__Group_5__1__Impl )
            // InternalMyDsl.g:5821:2: rule__RoundRobin__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_5__1"


    // $ANTLR start "rule__RoundRobin__Group_5__1__Impl"
    // InternalMyDsl.g:5827:1: rule__RoundRobin__Group_5__1__Impl : ( ( rule__RoundRobin__MinTeamsAssignment_5_1 ) ) ;
    public final void rule__RoundRobin__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5831:1: ( ( ( rule__RoundRobin__MinTeamsAssignment_5_1 ) ) )
            // InternalMyDsl.g:5832:1: ( ( rule__RoundRobin__MinTeamsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5832:1: ( ( rule__RoundRobin__MinTeamsAssignment_5_1 ) )
            // InternalMyDsl.g:5833:2: ( rule__RoundRobin__MinTeamsAssignment_5_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getMinTeamsAssignment_5_1()); 
            // InternalMyDsl.g:5834:2: ( rule__RoundRobin__MinTeamsAssignment_5_1 )
            // InternalMyDsl.g:5834:3: rule__RoundRobin__MinTeamsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__MinTeamsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getMinTeamsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_5__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_6__0"
    // InternalMyDsl.g:5843:1: rule__RoundRobin__Group_6__0 : rule__RoundRobin__Group_6__0__Impl rule__RoundRobin__Group_6__1 ;
    public final void rule__RoundRobin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5847:1: ( rule__RoundRobin__Group_6__0__Impl rule__RoundRobin__Group_6__1 )
            // InternalMyDsl.g:5848:2: rule__RoundRobin__Group_6__0__Impl rule__RoundRobin__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__RoundRobin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_6__0"


    // $ANTLR start "rule__RoundRobin__Group_6__0__Impl"
    // InternalMyDsl.g:5855:1: rule__RoundRobin__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__RoundRobin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5859:1: ( ( 'description' ) )
            // InternalMyDsl.g:5860:1: ( 'description' )
            {
            // InternalMyDsl.g:5860:1: ( 'description' )
            // InternalMyDsl.g:5861:2: 'description'
            {
             before(grammarAccess.getRoundRobinAccess().getDescriptionKeyword_6_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getDescriptionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_6__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_6__1"
    // InternalMyDsl.g:5870:1: rule__RoundRobin__Group_6__1 : rule__RoundRobin__Group_6__1__Impl ;
    public final void rule__RoundRobin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5874:1: ( rule__RoundRobin__Group_6__1__Impl )
            // InternalMyDsl.g:5875:2: rule__RoundRobin__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_6__1"


    // $ANTLR start "rule__RoundRobin__Group_6__1__Impl"
    // InternalMyDsl.g:5881:1: rule__RoundRobin__Group_6__1__Impl : ( ( rule__RoundRobin__DescriptionAssignment_6_1 ) ) ;
    public final void rule__RoundRobin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5885:1: ( ( ( rule__RoundRobin__DescriptionAssignment_6_1 ) ) )
            // InternalMyDsl.g:5886:1: ( ( rule__RoundRobin__DescriptionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:5886:1: ( ( rule__RoundRobin__DescriptionAssignment_6_1 ) )
            // InternalMyDsl.g:5887:2: ( rule__RoundRobin__DescriptionAssignment_6_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getDescriptionAssignment_6_1()); 
            // InternalMyDsl.g:5888:2: ( rule__RoundRobin__DescriptionAssignment_6_1 )
            // InternalMyDsl.g:5888:3: rule__RoundRobin__DescriptionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__DescriptionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getDescriptionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_6__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_7__0"
    // InternalMyDsl.g:5897:1: rule__RoundRobin__Group_7__0 : rule__RoundRobin__Group_7__0__Impl rule__RoundRobin__Group_7__1 ;
    public final void rule__RoundRobin__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5901:1: ( rule__RoundRobin__Group_7__0__Impl rule__RoundRobin__Group_7__1 )
            // InternalMyDsl.g:5902:2: rule__RoundRobin__Group_7__0__Impl rule__RoundRobin__Group_7__1
            {
            pushFollow(FOLLOW_16);
            rule__RoundRobin__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_7__0"


    // $ANTLR start "rule__RoundRobin__Group_7__0__Impl"
    // InternalMyDsl.g:5909:1: rule__RoundRobin__Group_7__0__Impl : ( 'pointsForWin' ) ;
    public final void rule__RoundRobin__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5913:1: ( ( 'pointsForWin' ) )
            // InternalMyDsl.g:5914:1: ( 'pointsForWin' )
            {
            // InternalMyDsl.g:5914:1: ( 'pointsForWin' )
            // InternalMyDsl.g:5915:2: 'pointsForWin'
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForWinKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getPointsForWinKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_7__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_7__1"
    // InternalMyDsl.g:5924:1: rule__RoundRobin__Group_7__1 : rule__RoundRobin__Group_7__1__Impl ;
    public final void rule__RoundRobin__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5928:1: ( rule__RoundRobin__Group_7__1__Impl )
            // InternalMyDsl.g:5929:2: rule__RoundRobin__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_7__1"


    // $ANTLR start "rule__RoundRobin__Group_7__1__Impl"
    // InternalMyDsl.g:5935:1: rule__RoundRobin__Group_7__1__Impl : ( ( rule__RoundRobin__PointsForWinAssignment_7_1 ) ) ;
    public final void rule__RoundRobin__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5939:1: ( ( ( rule__RoundRobin__PointsForWinAssignment_7_1 ) ) )
            // InternalMyDsl.g:5940:1: ( ( rule__RoundRobin__PointsForWinAssignment_7_1 ) )
            {
            // InternalMyDsl.g:5940:1: ( ( rule__RoundRobin__PointsForWinAssignment_7_1 ) )
            // InternalMyDsl.g:5941:2: ( rule__RoundRobin__PointsForWinAssignment_7_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForWinAssignment_7_1()); 
            // InternalMyDsl.g:5942:2: ( rule__RoundRobin__PointsForWinAssignment_7_1 )
            // InternalMyDsl.g:5942:3: rule__RoundRobin__PointsForWinAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__PointsForWinAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getPointsForWinAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_7__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_8__0"
    // InternalMyDsl.g:5951:1: rule__RoundRobin__Group_8__0 : rule__RoundRobin__Group_8__0__Impl rule__RoundRobin__Group_8__1 ;
    public final void rule__RoundRobin__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5955:1: ( rule__RoundRobin__Group_8__0__Impl rule__RoundRobin__Group_8__1 )
            // InternalMyDsl.g:5956:2: rule__RoundRobin__Group_8__0__Impl rule__RoundRobin__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__RoundRobin__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_8__0"


    // $ANTLR start "rule__RoundRobin__Group_8__0__Impl"
    // InternalMyDsl.g:5963:1: rule__RoundRobin__Group_8__0__Impl : ( 'pointsForDraw' ) ;
    public final void rule__RoundRobin__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5967:1: ( ( 'pointsForDraw' ) )
            // InternalMyDsl.g:5968:1: ( 'pointsForDraw' )
            {
            // InternalMyDsl.g:5968:1: ( 'pointsForDraw' )
            // InternalMyDsl.g:5969:2: 'pointsForDraw'
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForDrawKeyword_8_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getPointsForDrawKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_8__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_8__1"
    // InternalMyDsl.g:5978:1: rule__RoundRobin__Group_8__1 : rule__RoundRobin__Group_8__1__Impl ;
    public final void rule__RoundRobin__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5982:1: ( rule__RoundRobin__Group_8__1__Impl )
            // InternalMyDsl.g:5983:2: rule__RoundRobin__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_8__1"


    // $ANTLR start "rule__RoundRobin__Group_8__1__Impl"
    // InternalMyDsl.g:5989:1: rule__RoundRobin__Group_8__1__Impl : ( ( rule__RoundRobin__PointsForDrawAssignment_8_1 ) ) ;
    public final void rule__RoundRobin__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5993:1: ( ( ( rule__RoundRobin__PointsForDrawAssignment_8_1 ) ) )
            // InternalMyDsl.g:5994:1: ( ( rule__RoundRobin__PointsForDrawAssignment_8_1 ) )
            {
            // InternalMyDsl.g:5994:1: ( ( rule__RoundRobin__PointsForDrawAssignment_8_1 ) )
            // InternalMyDsl.g:5995:2: ( rule__RoundRobin__PointsForDrawAssignment_8_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForDrawAssignment_8_1()); 
            // InternalMyDsl.g:5996:2: ( rule__RoundRobin__PointsForDrawAssignment_8_1 )
            // InternalMyDsl.g:5996:3: rule__RoundRobin__PointsForDrawAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__PointsForDrawAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getPointsForDrawAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_8__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_9__0"
    // InternalMyDsl.g:6005:1: rule__RoundRobin__Group_9__0 : rule__RoundRobin__Group_9__0__Impl rule__RoundRobin__Group_9__1 ;
    public final void rule__RoundRobin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6009:1: ( rule__RoundRobin__Group_9__0__Impl rule__RoundRobin__Group_9__1 )
            // InternalMyDsl.g:6010:2: rule__RoundRobin__Group_9__0__Impl rule__RoundRobin__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__RoundRobin__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_9__0"


    // $ANTLR start "rule__RoundRobin__Group_9__0__Impl"
    // InternalMyDsl.g:6017:1: rule__RoundRobin__Group_9__0__Impl : ( 'pointsForLoss' ) ;
    public final void rule__RoundRobin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6021:1: ( ( 'pointsForLoss' ) )
            // InternalMyDsl.g:6022:1: ( 'pointsForLoss' )
            {
            // InternalMyDsl.g:6022:1: ( 'pointsForLoss' )
            // InternalMyDsl.g:6023:2: 'pointsForLoss'
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForLossKeyword_9_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getPointsForLossKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_9__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_9__1"
    // InternalMyDsl.g:6032:1: rule__RoundRobin__Group_9__1 : rule__RoundRobin__Group_9__1__Impl ;
    public final void rule__RoundRobin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6036:1: ( rule__RoundRobin__Group_9__1__Impl )
            // InternalMyDsl.g:6037:2: rule__RoundRobin__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_9__1"


    // $ANTLR start "rule__RoundRobin__Group_9__1__Impl"
    // InternalMyDsl.g:6043:1: rule__RoundRobin__Group_9__1__Impl : ( ( rule__RoundRobin__PointsForLossAssignment_9_1 ) ) ;
    public final void rule__RoundRobin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6047:1: ( ( ( rule__RoundRobin__PointsForLossAssignment_9_1 ) ) )
            // InternalMyDsl.g:6048:1: ( ( rule__RoundRobin__PointsForLossAssignment_9_1 ) )
            {
            // InternalMyDsl.g:6048:1: ( ( rule__RoundRobin__PointsForLossAssignment_9_1 ) )
            // InternalMyDsl.g:6049:2: ( rule__RoundRobin__PointsForLossAssignment_9_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForLossAssignment_9_1()); 
            // InternalMyDsl.g:6050:2: ( rule__RoundRobin__PointsForLossAssignment_9_1 )
            // InternalMyDsl.g:6050:3: rule__RoundRobin__PointsForLossAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__PointsForLossAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getPointsForLossAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_9__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_10__0"
    // InternalMyDsl.g:6059:1: rule__RoundRobin__Group_10__0 : rule__RoundRobin__Group_10__0__Impl rule__RoundRobin__Group_10__1 ;
    public final void rule__RoundRobin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6063:1: ( rule__RoundRobin__Group_10__0__Impl rule__RoundRobin__Group_10__1 )
            // InternalMyDsl.g:6064:2: rule__RoundRobin__Group_10__0__Impl rule__RoundRobin__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__RoundRobin__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_10__0"


    // $ANTLR start "rule__RoundRobin__Group_10__0__Impl"
    // InternalMyDsl.g:6071:1: rule__RoundRobin__Group_10__0__Impl : ( 'numberOfRounds' ) ;
    public final void rule__RoundRobin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6075:1: ( ( 'numberOfRounds' ) )
            // InternalMyDsl.g:6076:1: ( 'numberOfRounds' )
            {
            // InternalMyDsl.g:6076:1: ( 'numberOfRounds' )
            // InternalMyDsl.g:6077:2: 'numberOfRounds'
            {
             before(grammarAccess.getRoundRobinAccess().getNumberOfRoundsKeyword_10_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getNumberOfRoundsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_10__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_10__1"
    // InternalMyDsl.g:6086:1: rule__RoundRobin__Group_10__1 : rule__RoundRobin__Group_10__1__Impl ;
    public final void rule__RoundRobin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6090:1: ( rule__RoundRobin__Group_10__1__Impl )
            // InternalMyDsl.g:6091:2: rule__RoundRobin__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_10__1"


    // $ANTLR start "rule__RoundRobin__Group_10__1__Impl"
    // InternalMyDsl.g:6097:1: rule__RoundRobin__Group_10__1__Impl : ( ( rule__RoundRobin__NumberOfRoundsAssignment_10_1 ) ) ;
    public final void rule__RoundRobin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6101:1: ( ( ( rule__RoundRobin__NumberOfRoundsAssignment_10_1 ) ) )
            // InternalMyDsl.g:6102:1: ( ( rule__RoundRobin__NumberOfRoundsAssignment_10_1 ) )
            {
            // InternalMyDsl.g:6102:1: ( ( rule__RoundRobin__NumberOfRoundsAssignment_10_1 ) )
            // InternalMyDsl.g:6103:2: ( rule__RoundRobin__NumberOfRoundsAssignment_10_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getNumberOfRoundsAssignment_10_1()); 
            // InternalMyDsl.g:6104:2: ( rule__RoundRobin__NumberOfRoundsAssignment_10_1 )
            // InternalMyDsl.g:6104:3: rule__RoundRobin__NumberOfRoundsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__NumberOfRoundsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getNumberOfRoundsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_10__1__Impl"


    // $ANTLR start "rule__RoundRobin__Group_11__0"
    // InternalMyDsl.g:6113:1: rule__RoundRobin__Group_11__0 : rule__RoundRobin__Group_11__0__Impl rule__RoundRobin__Group_11__1 ;
    public final void rule__RoundRobin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6117:1: ( rule__RoundRobin__Group_11__0__Impl rule__RoundRobin__Group_11__1 )
            // InternalMyDsl.g:6118:2: rule__RoundRobin__Group_11__0__Impl rule__RoundRobin__Group_11__1
            {
            pushFollow(FOLLOW_43);
            rule__RoundRobin__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_11__0"


    // $ANTLR start "rule__RoundRobin__Group_11__0__Impl"
    // InternalMyDsl.g:6125:1: rule__RoundRobin__Group_11__0__Impl : ( 'tieBreakerRule' ) ;
    public final void rule__RoundRobin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6129:1: ( ( 'tieBreakerRule' ) )
            // InternalMyDsl.g:6130:1: ( 'tieBreakerRule' )
            {
            // InternalMyDsl.g:6130:1: ( 'tieBreakerRule' )
            // InternalMyDsl.g:6131:2: 'tieBreakerRule'
            {
             before(grammarAccess.getRoundRobinAccess().getTieBreakerRuleKeyword_11_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getRoundRobinAccess().getTieBreakerRuleKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_11__0__Impl"


    // $ANTLR start "rule__RoundRobin__Group_11__1"
    // InternalMyDsl.g:6140:1: rule__RoundRobin__Group_11__1 : rule__RoundRobin__Group_11__1__Impl ;
    public final void rule__RoundRobin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6144:1: ( rule__RoundRobin__Group_11__1__Impl )
            // InternalMyDsl.g:6145:2: rule__RoundRobin__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_11__1"


    // $ANTLR start "rule__RoundRobin__Group_11__1__Impl"
    // InternalMyDsl.g:6151:1: rule__RoundRobin__Group_11__1__Impl : ( ( rule__RoundRobin__TieBreakerRuleAssignment_11_1 ) ) ;
    public final void rule__RoundRobin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6155:1: ( ( ( rule__RoundRobin__TieBreakerRuleAssignment_11_1 ) ) )
            // InternalMyDsl.g:6156:1: ( ( rule__RoundRobin__TieBreakerRuleAssignment_11_1 ) )
            {
            // InternalMyDsl.g:6156:1: ( ( rule__RoundRobin__TieBreakerRuleAssignment_11_1 ) )
            // InternalMyDsl.g:6157:2: ( rule__RoundRobin__TieBreakerRuleAssignment_11_1 )
            {
             before(grammarAccess.getRoundRobinAccess().getTieBreakerRuleAssignment_11_1()); 
            // InternalMyDsl.g:6158:2: ( rule__RoundRobin__TieBreakerRuleAssignment_11_1 )
            // InternalMyDsl.g:6158:3: rule__RoundRobin__TieBreakerRuleAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__RoundRobin__TieBreakerRuleAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getRoundRobinAccess().getTieBreakerRuleAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__Group_11__1__Impl"


    // $ANTLR start "rule__Knockout__Group__0"
    // InternalMyDsl.g:6167:1: rule__Knockout__Group__0 : rule__Knockout__Group__0__Impl rule__Knockout__Group__1 ;
    public final void rule__Knockout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6171:1: ( rule__Knockout__Group__0__Impl rule__Knockout__Group__1 )
            // InternalMyDsl.g:6172:2: rule__Knockout__Group__0__Impl rule__Knockout__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Knockout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__0"


    // $ANTLR start "rule__Knockout__Group__0__Impl"
    // InternalMyDsl.g:6179:1: rule__Knockout__Group__0__Impl : ( () ) ;
    public final void rule__Knockout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6183:1: ( ( () ) )
            // InternalMyDsl.g:6184:1: ( () )
            {
            // InternalMyDsl.g:6184:1: ( () )
            // InternalMyDsl.g:6185:2: ()
            {
             before(grammarAccess.getKnockoutAccess().getKnockoutAction_0()); 
            // InternalMyDsl.g:6186:2: ()
            // InternalMyDsl.g:6186:3: 
            {
            }

             after(grammarAccess.getKnockoutAccess().getKnockoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__0__Impl"


    // $ANTLR start "rule__Knockout__Group__1"
    // InternalMyDsl.g:6194:1: rule__Knockout__Group__1 : rule__Knockout__Group__1__Impl rule__Knockout__Group__2 ;
    public final void rule__Knockout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6198:1: ( rule__Knockout__Group__1__Impl rule__Knockout__Group__2 )
            // InternalMyDsl.g:6199:2: rule__Knockout__Group__1__Impl rule__Knockout__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Knockout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__1"


    // $ANTLR start "rule__Knockout__Group__1__Impl"
    // InternalMyDsl.g:6206:1: rule__Knockout__Group__1__Impl : ( ( rule__Knockout__HasThirdPlacePlayoffAssignment_1 )? ) ;
    public final void rule__Knockout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6210:1: ( ( ( rule__Knockout__HasThirdPlacePlayoffAssignment_1 )? ) )
            // InternalMyDsl.g:6211:1: ( ( rule__Knockout__HasThirdPlacePlayoffAssignment_1 )? )
            {
            // InternalMyDsl.g:6211:1: ( ( rule__Knockout__HasThirdPlacePlayoffAssignment_1 )? )
            // InternalMyDsl.g:6212:2: ( rule__Knockout__HasThirdPlacePlayoffAssignment_1 )?
            {
             before(grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffAssignment_1()); 
            // InternalMyDsl.g:6213:2: ( rule__Knockout__HasThirdPlacePlayoffAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==92) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:6213:3: rule__Knockout__HasThirdPlacePlayoffAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Knockout__HasThirdPlacePlayoffAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__1__Impl"


    // $ANTLR start "rule__Knockout__Group__2"
    // InternalMyDsl.g:6221:1: rule__Knockout__Group__2 : rule__Knockout__Group__2__Impl rule__Knockout__Group__3 ;
    public final void rule__Knockout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6225:1: ( rule__Knockout__Group__2__Impl rule__Knockout__Group__3 )
            // InternalMyDsl.g:6226:2: rule__Knockout__Group__2__Impl rule__Knockout__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Knockout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__2"


    // $ANTLR start "rule__Knockout__Group__2__Impl"
    // InternalMyDsl.g:6233:1: rule__Knockout__Group__2__Impl : ( 'Knockout' ) ;
    public final void rule__Knockout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6237:1: ( ( 'Knockout' ) )
            // InternalMyDsl.g:6238:1: ( 'Knockout' )
            {
            // InternalMyDsl.g:6238:1: ( 'Knockout' )
            // InternalMyDsl.g:6239:2: 'Knockout'
            {
             before(grammarAccess.getKnockoutAccess().getKnockoutKeyword_2()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getKnockoutKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__2__Impl"


    // $ANTLR start "rule__Knockout__Group__3"
    // InternalMyDsl.g:6248:1: rule__Knockout__Group__3 : rule__Knockout__Group__3__Impl rule__Knockout__Group__4 ;
    public final void rule__Knockout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6252:1: ( rule__Knockout__Group__3__Impl rule__Knockout__Group__4 )
            // InternalMyDsl.g:6253:2: rule__Knockout__Group__3__Impl rule__Knockout__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Knockout__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__3"


    // $ANTLR start "rule__Knockout__Group__3__Impl"
    // InternalMyDsl.g:6260:1: rule__Knockout__Group__3__Impl : ( ( rule__Knockout__NameAssignment_3 ) ) ;
    public final void rule__Knockout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6264:1: ( ( ( rule__Knockout__NameAssignment_3 ) ) )
            // InternalMyDsl.g:6265:1: ( ( rule__Knockout__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:6265:1: ( ( rule__Knockout__NameAssignment_3 ) )
            // InternalMyDsl.g:6266:2: ( rule__Knockout__NameAssignment_3 )
            {
             before(grammarAccess.getKnockoutAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:6267:2: ( rule__Knockout__NameAssignment_3 )
            // InternalMyDsl.g:6267:3: rule__Knockout__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__3__Impl"


    // $ANTLR start "rule__Knockout__Group__4"
    // InternalMyDsl.g:6275:1: rule__Knockout__Group__4 : rule__Knockout__Group__4__Impl rule__Knockout__Group__5 ;
    public final void rule__Knockout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6279:1: ( rule__Knockout__Group__4__Impl rule__Knockout__Group__5 )
            // InternalMyDsl.g:6280:2: rule__Knockout__Group__4__Impl rule__Knockout__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Knockout__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__4"


    // $ANTLR start "rule__Knockout__Group__4__Impl"
    // InternalMyDsl.g:6287:1: rule__Knockout__Group__4__Impl : ( '{' ) ;
    public final void rule__Knockout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6291:1: ( ( '{' ) )
            // InternalMyDsl.g:6292:1: ( '{' )
            {
            // InternalMyDsl.g:6292:1: ( '{' )
            // InternalMyDsl.g:6293:2: '{'
            {
             before(grammarAccess.getKnockoutAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__4__Impl"


    // $ANTLR start "rule__Knockout__Group__5"
    // InternalMyDsl.g:6302:1: rule__Knockout__Group__5 : rule__Knockout__Group__5__Impl rule__Knockout__Group__6 ;
    public final void rule__Knockout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6306:1: ( rule__Knockout__Group__5__Impl rule__Knockout__Group__6 )
            // InternalMyDsl.g:6307:2: rule__Knockout__Group__5__Impl rule__Knockout__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Knockout__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__5"


    // $ANTLR start "rule__Knockout__Group__5__Impl"
    // InternalMyDsl.g:6314:1: rule__Knockout__Group__5__Impl : ( ( rule__Knockout__Group_5__0 ) ) ;
    public final void rule__Knockout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6318:1: ( ( ( rule__Knockout__Group_5__0 ) ) )
            // InternalMyDsl.g:6319:1: ( ( rule__Knockout__Group_5__0 ) )
            {
            // InternalMyDsl.g:6319:1: ( ( rule__Knockout__Group_5__0 ) )
            // InternalMyDsl.g:6320:2: ( rule__Knockout__Group_5__0 )
            {
             before(grammarAccess.getKnockoutAccess().getGroup_5()); 
            // InternalMyDsl.g:6321:2: ( rule__Knockout__Group_5__0 )
            // InternalMyDsl.g:6321:3: rule__Knockout__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__5__Impl"


    // $ANTLR start "rule__Knockout__Group__6"
    // InternalMyDsl.g:6329:1: rule__Knockout__Group__6 : rule__Knockout__Group__6__Impl rule__Knockout__Group__7 ;
    public final void rule__Knockout__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6333:1: ( rule__Knockout__Group__6__Impl rule__Knockout__Group__7 )
            // InternalMyDsl.g:6334:2: rule__Knockout__Group__6__Impl rule__Knockout__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__Knockout__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__6"


    // $ANTLR start "rule__Knockout__Group__6__Impl"
    // InternalMyDsl.g:6341:1: rule__Knockout__Group__6__Impl : ( ( rule__Knockout__Group_6__0 ) ) ;
    public final void rule__Knockout__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6345:1: ( ( ( rule__Knockout__Group_6__0 ) ) )
            // InternalMyDsl.g:6346:1: ( ( rule__Knockout__Group_6__0 ) )
            {
            // InternalMyDsl.g:6346:1: ( ( rule__Knockout__Group_6__0 ) )
            // InternalMyDsl.g:6347:2: ( rule__Knockout__Group_6__0 )
            {
             before(grammarAccess.getKnockoutAccess().getGroup_6()); 
            // InternalMyDsl.g:6348:2: ( rule__Knockout__Group_6__0 )
            // InternalMyDsl.g:6348:3: rule__Knockout__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__6__Impl"


    // $ANTLR start "rule__Knockout__Group__7"
    // InternalMyDsl.g:6356:1: rule__Knockout__Group__7 : rule__Knockout__Group__7__Impl rule__Knockout__Group__8 ;
    public final void rule__Knockout__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6360:1: ( rule__Knockout__Group__7__Impl rule__Knockout__Group__8 )
            // InternalMyDsl.g:6361:2: rule__Knockout__Group__7__Impl rule__Knockout__Group__8
            {
            pushFollow(FOLLOW_44);
            rule__Knockout__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__7"


    // $ANTLR start "rule__Knockout__Group__7__Impl"
    // InternalMyDsl.g:6368:1: rule__Knockout__Group__7__Impl : ( ( rule__Knockout__Group_7__0 )? ) ;
    public final void rule__Knockout__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6372:1: ( ( ( rule__Knockout__Group_7__0 )? ) )
            // InternalMyDsl.g:6373:1: ( ( rule__Knockout__Group_7__0 )? )
            {
            // InternalMyDsl.g:6373:1: ( ( rule__Knockout__Group_7__0 )? )
            // InternalMyDsl.g:6374:2: ( rule__Knockout__Group_7__0 )?
            {
             before(grammarAccess.getKnockoutAccess().getGroup_7()); 
            // InternalMyDsl.g:6375:2: ( rule__Knockout__Group_7__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:6375:3: rule__Knockout__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Knockout__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnockoutAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__7__Impl"


    // $ANTLR start "rule__Knockout__Group__8"
    // InternalMyDsl.g:6383:1: rule__Knockout__Group__8 : rule__Knockout__Group__8__Impl rule__Knockout__Group__9 ;
    public final void rule__Knockout__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6387:1: ( rule__Knockout__Group__8__Impl rule__Knockout__Group__9 )
            // InternalMyDsl.g:6388:2: rule__Knockout__Group__8__Impl rule__Knockout__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__Knockout__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__8"


    // $ANTLR start "rule__Knockout__Group__8__Impl"
    // InternalMyDsl.g:6395:1: rule__Knockout__Group__8__Impl : ( ( rule__Knockout__Group_8__0 )? ) ;
    public final void rule__Knockout__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6399:1: ( ( ( rule__Knockout__Group_8__0 )? ) )
            // InternalMyDsl.g:6400:1: ( ( rule__Knockout__Group_8__0 )? )
            {
            // InternalMyDsl.g:6400:1: ( ( rule__Knockout__Group_8__0 )? )
            // InternalMyDsl.g:6401:2: ( rule__Knockout__Group_8__0 )?
            {
             before(grammarAccess.getKnockoutAccess().getGroup_8()); 
            // InternalMyDsl.g:6402:2: ( rule__Knockout__Group_8__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==68) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:6402:3: rule__Knockout__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Knockout__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKnockoutAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__8__Impl"


    // $ANTLR start "rule__Knockout__Group__9"
    // InternalMyDsl.g:6410:1: rule__Knockout__Group__9 : rule__Knockout__Group__9__Impl ;
    public final void rule__Knockout__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6414:1: ( rule__Knockout__Group__9__Impl )
            // InternalMyDsl.g:6415:2: rule__Knockout__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__9"


    // $ANTLR start "rule__Knockout__Group__9__Impl"
    // InternalMyDsl.g:6421:1: rule__Knockout__Group__9__Impl : ( '}' ) ;
    public final void rule__Knockout__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6425:1: ( ( '}' ) )
            // InternalMyDsl.g:6426:1: ( '}' )
            {
            // InternalMyDsl.g:6426:1: ( '}' )
            // InternalMyDsl.g:6427:2: '}'
            {
             before(grammarAccess.getKnockoutAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group__9__Impl"


    // $ANTLR start "rule__Knockout__Group_5__0"
    // InternalMyDsl.g:6437:1: rule__Knockout__Group_5__0 : rule__Knockout__Group_5__0__Impl rule__Knockout__Group_5__1 ;
    public final void rule__Knockout__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6441:1: ( rule__Knockout__Group_5__0__Impl rule__Knockout__Group_5__1 )
            // InternalMyDsl.g:6442:2: rule__Knockout__Group_5__0__Impl rule__Knockout__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Knockout__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_5__0"


    // $ANTLR start "rule__Knockout__Group_5__0__Impl"
    // InternalMyDsl.g:6449:1: rule__Knockout__Group_5__0__Impl : ( 'maxTeams' ) ;
    public final void rule__Knockout__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6453:1: ( ( 'maxTeams' ) )
            // InternalMyDsl.g:6454:1: ( 'maxTeams' )
            {
            // InternalMyDsl.g:6454:1: ( 'maxTeams' )
            // InternalMyDsl.g:6455:2: 'maxTeams'
            {
             before(grammarAccess.getKnockoutAccess().getMaxTeamsKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getMaxTeamsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_5__0__Impl"


    // $ANTLR start "rule__Knockout__Group_5__1"
    // InternalMyDsl.g:6464:1: rule__Knockout__Group_5__1 : rule__Knockout__Group_5__1__Impl ;
    public final void rule__Knockout__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6468:1: ( rule__Knockout__Group_5__1__Impl )
            // InternalMyDsl.g:6469:2: rule__Knockout__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_5__1"


    // $ANTLR start "rule__Knockout__Group_5__1__Impl"
    // InternalMyDsl.g:6475:1: rule__Knockout__Group_5__1__Impl : ( ( rule__Knockout__MaxTeamsAssignment_5_1 ) ) ;
    public final void rule__Knockout__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6479:1: ( ( ( rule__Knockout__MaxTeamsAssignment_5_1 ) ) )
            // InternalMyDsl.g:6480:1: ( ( rule__Knockout__MaxTeamsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:6480:1: ( ( rule__Knockout__MaxTeamsAssignment_5_1 ) )
            // InternalMyDsl.g:6481:2: ( rule__Knockout__MaxTeamsAssignment_5_1 )
            {
             before(grammarAccess.getKnockoutAccess().getMaxTeamsAssignment_5_1()); 
            // InternalMyDsl.g:6482:2: ( rule__Knockout__MaxTeamsAssignment_5_1 )
            // InternalMyDsl.g:6482:3: rule__Knockout__MaxTeamsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__MaxTeamsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getMaxTeamsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_5__1__Impl"


    // $ANTLR start "rule__Knockout__Group_6__0"
    // InternalMyDsl.g:6491:1: rule__Knockout__Group_6__0 : rule__Knockout__Group_6__0__Impl rule__Knockout__Group_6__1 ;
    public final void rule__Knockout__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6495:1: ( rule__Knockout__Group_6__0__Impl rule__Knockout__Group_6__1 )
            // InternalMyDsl.g:6496:2: rule__Knockout__Group_6__0__Impl rule__Knockout__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Knockout__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_6__0"


    // $ANTLR start "rule__Knockout__Group_6__0__Impl"
    // InternalMyDsl.g:6503:1: rule__Knockout__Group_6__0__Impl : ( 'minTeams' ) ;
    public final void rule__Knockout__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6507:1: ( ( 'minTeams' ) )
            // InternalMyDsl.g:6508:1: ( 'minTeams' )
            {
            // InternalMyDsl.g:6508:1: ( 'minTeams' )
            // InternalMyDsl.g:6509:2: 'minTeams'
            {
             before(grammarAccess.getKnockoutAccess().getMinTeamsKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getMinTeamsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_6__0__Impl"


    // $ANTLR start "rule__Knockout__Group_6__1"
    // InternalMyDsl.g:6518:1: rule__Knockout__Group_6__1 : rule__Knockout__Group_6__1__Impl ;
    public final void rule__Knockout__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6522:1: ( rule__Knockout__Group_6__1__Impl )
            // InternalMyDsl.g:6523:2: rule__Knockout__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_6__1"


    // $ANTLR start "rule__Knockout__Group_6__1__Impl"
    // InternalMyDsl.g:6529:1: rule__Knockout__Group_6__1__Impl : ( ( rule__Knockout__MinTeamsAssignment_6_1 ) ) ;
    public final void rule__Knockout__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6533:1: ( ( ( rule__Knockout__MinTeamsAssignment_6_1 ) ) )
            // InternalMyDsl.g:6534:1: ( ( rule__Knockout__MinTeamsAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6534:1: ( ( rule__Knockout__MinTeamsAssignment_6_1 ) )
            // InternalMyDsl.g:6535:2: ( rule__Knockout__MinTeamsAssignment_6_1 )
            {
             before(grammarAccess.getKnockoutAccess().getMinTeamsAssignment_6_1()); 
            // InternalMyDsl.g:6536:2: ( rule__Knockout__MinTeamsAssignment_6_1 )
            // InternalMyDsl.g:6536:3: rule__Knockout__MinTeamsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__MinTeamsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getMinTeamsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_6__1__Impl"


    // $ANTLR start "rule__Knockout__Group_7__0"
    // InternalMyDsl.g:6545:1: rule__Knockout__Group_7__0 : rule__Knockout__Group_7__0__Impl rule__Knockout__Group_7__1 ;
    public final void rule__Knockout__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6549:1: ( rule__Knockout__Group_7__0__Impl rule__Knockout__Group_7__1 )
            // InternalMyDsl.g:6550:2: rule__Knockout__Group_7__0__Impl rule__Knockout__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Knockout__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_7__0"


    // $ANTLR start "rule__Knockout__Group_7__0__Impl"
    // InternalMyDsl.g:6557:1: rule__Knockout__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Knockout__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6561:1: ( ( 'description' ) )
            // InternalMyDsl.g:6562:1: ( 'description' )
            {
            // InternalMyDsl.g:6562:1: ( 'description' )
            // InternalMyDsl.g:6563:2: 'description'
            {
             before(grammarAccess.getKnockoutAccess().getDescriptionKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getDescriptionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_7__0__Impl"


    // $ANTLR start "rule__Knockout__Group_7__1"
    // InternalMyDsl.g:6572:1: rule__Knockout__Group_7__1 : rule__Knockout__Group_7__1__Impl ;
    public final void rule__Knockout__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6576:1: ( rule__Knockout__Group_7__1__Impl )
            // InternalMyDsl.g:6577:2: rule__Knockout__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_7__1"


    // $ANTLR start "rule__Knockout__Group_7__1__Impl"
    // InternalMyDsl.g:6583:1: rule__Knockout__Group_7__1__Impl : ( ( rule__Knockout__DescriptionAssignment_7_1 ) ) ;
    public final void rule__Knockout__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6587:1: ( ( ( rule__Knockout__DescriptionAssignment_7_1 ) ) )
            // InternalMyDsl.g:6588:1: ( ( rule__Knockout__DescriptionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:6588:1: ( ( rule__Knockout__DescriptionAssignment_7_1 ) )
            // InternalMyDsl.g:6589:2: ( rule__Knockout__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getKnockoutAccess().getDescriptionAssignment_7_1()); 
            // InternalMyDsl.g:6590:2: ( rule__Knockout__DescriptionAssignment_7_1 )
            // InternalMyDsl.g:6590:3: rule__Knockout__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getDescriptionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_7__1__Impl"


    // $ANTLR start "rule__Knockout__Group_8__0"
    // InternalMyDsl.g:6599:1: rule__Knockout__Group_8__0 : rule__Knockout__Group_8__0__Impl rule__Knockout__Group_8__1 ;
    public final void rule__Knockout__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6603:1: ( rule__Knockout__Group_8__0__Impl rule__Knockout__Group_8__1 )
            // InternalMyDsl.g:6604:2: rule__Knockout__Group_8__0__Impl rule__Knockout__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Knockout__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knockout__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_8__0"


    // $ANTLR start "rule__Knockout__Group_8__0__Impl"
    // InternalMyDsl.g:6611:1: rule__Knockout__Group_8__0__Impl : ( 'numberOfRounds' ) ;
    public final void rule__Knockout__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6615:1: ( ( 'numberOfRounds' ) )
            // InternalMyDsl.g:6616:1: ( 'numberOfRounds' )
            {
            // InternalMyDsl.g:6616:1: ( 'numberOfRounds' )
            // InternalMyDsl.g:6617:2: 'numberOfRounds'
            {
             before(grammarAccess.getKnockoutAccess().getNumberOfRoundsKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getNumberOfRoundsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_8__0__Impl"


    // $ANTLR start "rule__Knockout__Group_8__1"
    // InternalMyDsl.g:6626:1: rule__Knockout__Group_8__1 : rule__Knockout__Group_8__1__Impl ;
    public final void rule__Knockout__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6630:1: ( rule__Knockout__Group_8__1__Impl )
            // InternalMyDsl.g:6631:2: rule__Knockout__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_8__1"


    // $ANTLR start "rule__Knockout__Group_8__1__Impl"
    // InternalMyDsl.g:6637:1: rule__Knockout__Group_8__1__Impl : ( ( rule__Knockout__NumberOfRoundsAssignment_8_1 ) ) ;
    public final void rule__Knockout__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6641:1: ( ( ( rule__Knockout__NumberOfRoundsAssignment_8_1 ) ) )
            // InternalMyDsl.g:6642:1: ( ( rule__Knockout__NumberOfRoundsAssignment_8_1 ) )
            {
            // InternalMyDsl.g:6642:1: ( ( rule__Knockout__NumberOfRoundsAssignment_8_1 ) )
            // InternalMyDsl.g:6643:2: ( rule__Knockout__NumberOfRoundsAssignment_8_1 )
            {
             before(grammarAccess.getKnockoutAccess().getNumberOfRoundsAssignment_8_1()); 
            // InternalMyDsl.g:6644:2: ( rule__Knockout__NumberOfRoundsAssignment_8_1 )
            // InternalMyDsl.g:6644:3: rule__Knockout__NumberOfRoundsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Knockout__NumberOfRoundsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getKnockoutAccess().getNumberOfRoundsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__Group_8__1__Impl"


    // $ANTLR start "rule__Match__Group__0"
    // InternalMyDsl.g:6653:1: rule__Match__Group__0 : rule__Match__Group__0__Impl rule__Match__Group__1 ;
    public final void rule__Match__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6657:1: ( rule__Match__Group__0__Impl rule__Match__Group__1 )
            // InternalMyDsl.g:6658:2: rule__Match__Group__0__Impl rule__Match__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Match__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__0"


    // $ANTLR start "rule__Match__Group__0__Impl"
    // InternalMyDsl.g:6665:1: rule__Match__Group__0__Impl : ( 'Match' ) ;
    public final void rule__Match__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6669:1: ( ( 'Match' ) )
            // InternalMyDsl.g:6670:1: ( 'Match' )
            {
            // InternalMyDsl.g:6670:1: ( 'Match' )
            // InternalMyDsl.g:6671:2: 'Match'
            {
             before(grammarAccess.getMatchAccess().getMatchKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getMatchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__0__Impl"


    // $ANTLR start "rule__Match__Group__1"
    // InternalMyDsl.g:6680:1: rule__Match__Group__1 : rule__Match__Group__1__Impl rule__Match__Group__2 ;
    public final void rule__Match__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6684:1: ( rule__Match__Group__1__Impl rule__Match__Group__2 )
            // InternalMyDsl.g:6685:2: rule__Match__Group__1__Impl rule__Match__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Match__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__1"


    // $ANTLR start "rule__Match__Group__1__Impl"
    // InternalMyDsl.g:6692:1: rule__Match__Group__1__Impl : ( '{' ) ;
    public final void rule__Match__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6696:1: ( ( '{' ) )
            // InternalMyDsl.g:6697:1: ( '{' )
            {
            // InternalMyDsl.g:6697:1: ( '{' )
            // InternalMyDsl.g:6698:2: '{'
            {
             before(grammarAccess.getMatchAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__1__Impl"


    // $ANTLR start "rule__Match__Group__2"
    // InternalMyDsl.g:6707:1: rule__Match__Group__2 : rule__Match__Group__2__Impl rule__Match__Group__3 ;
    public final void rule__Match__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6711:1: ( rule__Match__Group__2__Impl rule__Match__Group__3 )
            // InternalMyDsl.g:6712:2: rule__Match__Group__2__Impl rule__Match__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Match__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__2"


    // $ANTLR start "rule__Match__Group__2__Impl"
    // InternalMyDsl.g:6719:1: rule__Match__Group__2__Impl : ( ( rule__Match__Group_2__0 )? ) ;
    public final void rule__Match__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6723:1: ( ( ( rule__Match__Group_2__0 )? ) )
            // InternalMyDsl.g:6724:1: ( ( rule__Match__Group_2__0 )? )
            {
            // InternalMyDsl.g:6724:1: ( ( rule__Match__Group_2__0 )? )
            // InternalMyDsl.g:6725:2: ( rule__Match__Group_2__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_2()); 
            // InternalMyDsl.g:6726:2: ( rule__Match__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==80) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:6726:3: rule__Match__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Match__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__2__Impl"


    // $ANTLR start "rule__Match__Group__3"
    // InternalMyDsl.g:6734:1: rule__Match__Group__3 : rule__Match__Group__3__Impl rule__Match__Group__4 ;
    public final void rule__Match__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6738:1: ( rule__Match__Group__3__Impl rule__Match__Group__4 )
            // InternalMyDsl.g:6739:2: rule__Match__Group__3__Impl rule__Match__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Match__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__3"


    // $ANTLR start "rule__Match__Group__3__Impl"
    // InternalMyDsl.g:6746:1: rule__Match__Group__3__Impl : ( ( rule__Match__Group_3__0 )? ) ;
    public final void rule__Match__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6750:1: ( ( ( rule__Match__Group_3__0 )? ) )
            // InternalMyDsl.g:6751:1: ( ( rule__Match__Group_3__0 )? )
            {
            // InternalMyDsl.g:6751:1: ( ( rule__Match__Group_3__0 )? )
            // InternalMyDsl.g:6752:2: ( rule__Match__Group_3__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_3()); 
            // InternalMyDsl.g:6753:2: ( rule__Match__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==81) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:6753:3: rule__Match__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Match__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__3__Impl"


    // $ANTLR start "rule__Match__Group__4"
    // InternalMyDsl.g:6761:1: rule__Match__Group__4 : rule__Match__Group__4__Impl rule__Match__Group__5 ;
    public final void rule__Match__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6765:1: ( rule__Match__Group__4__Impl rule__Match__Group__5 )
            // InternalMyDsl.g:6766:2: rule__Match__Group__4__Impl rule__Match__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__Match__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__4"


    // $ANTLR start "rule__Match__Group__4__Impl"
    // InternalMyDsl.g:6773:1: rule__Match__Group__4__Impl : ( ( rule__Match__Group_4__0 )? ) ;
    public final void rule__Match__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6777:1: ( ( ( rule__Match__Group_4__0 )? ) )
            // InternalMyDsl.g:6778:1: ( ( rule__Match__Group_4__0 )? )
            {
            // InternalMyDsl.g:6778:1: ( ( rule__Match__Group_4__0 )? )
            // InternalMyDsl.g:6779:2: ( rule__Match__Group_4__0 )?
            {
             before(grammarAccess.getMatchAccess().getGroup_4()); 
            // InternalMyDsl.g:6780:2: ( rule__Match__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==82) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:6780:3: rule__Match__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Match__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__4__Impl"


    // $ANTLR start "rule__Match__Group__5"
    // InternalMyDsl.g:6788:1: rule__Match__Group__5 : rule__Match__Group__5__Impl rule__Match__Group__6 ;
    public final void rule__Match__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6792:1: ( rule__Match__Group__5__Impl rule__Match__Group__6 )
            // InternalMyDsl.g:6793:2: rule__Match__Group__5__Impl rule__Match__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__Match__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__5"


    // $ANTLR start "rule__Match__Group__5__Impl"
    // InternalMyDsl.g:6800:1: rule__Match__Group__5__Impl : ( ( rule__Match__Group_5__0 ) ) ;
    public final void rule__Match__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6804:1: ( ( ( rule__Match__Group_5__0 ) ) )
            // InternalMyDsl.g:6805:1: ( ( rule__Match__Group_5__0 ) )
            {
            // InternalMyDsl.g:6805:1: ( ( rule__Match__Group_5__0 ) )
            // InternalMyDsl.g:6806:2: ( rule__Match__Group_5__0 )
            {
             before(grammarAccess.getMatchAccess().getGroup_5()); 
            // InternalMyDsl.g:6807:2: ( rule__Match__Group_5__0 )
            // InternalMyDsl.g:6807:3: rule__Match__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__5__Impl"


    // $ANTLR start "rule__Match__Group__6"
    // InternalMyDsl.g:6815:1: rule__Match__Group__6 : rule__Match__Group__6__Impl rule__Match__Group__7 ;
    public final void rule__Match__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6819:1: ( rule__Match__Group__6__Impl rule__Match__Group__7 )
            // InternalMyDsl.g:6820:2: rule__Match__Group__6__Impl rule__Match__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__Match__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__6"


    // $ANTLR start "rule__Match__Group__6__Impl"
    // InternalMyDsl.g:6827:1: rule__Match__Group__6__Impl : ( 'teams' ) ;
    public final void rule__Match__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6831:1: ( ( 'teams' ) )
            // InternalMyDsl.g:6832:1: ( 'teams' )
            {
            // InternalMyDsl.g:6832:1: ( 'teams' )
            // InternalMyDsl.g:6833:2: 'teams'
            {
             before(grammarAccess.getMatchAccess().getTeamsKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getTeamsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__6__Impl"


    // $ANTLR start "rule__Match__Group__7"
    // InternalMyDsl.g:6842:1: rule__Match__Group__7 : rule__Match__Group__7__Impl rule__Match__Group__8 ;
    public final void rule__Match__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6846:1: ( rule__Match__Group__7__Impl rule__Match__Group__8 )
            // InternalMyDsl.g:6847:2: rule__Match__Group__7__Impl rule__Match__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Match__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__7"


    // $ANTLR start "rule__Match__Group__7__Impl"
    // InternalMyDsl.g:6854:1: rule__Match__Group__7__Impl : ( '(' ) ;
    public final void rule__Match__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6858:1: ( ( '(' ) )
            // InternalMyDsl.g:6859:1: ( '(' )
            {
            // InternalMyDsl.g:6859:1: ( '(' )
            // InternalMyDsl.g:6860:2: '('
            {
             before(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_7()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__7__Impl"


    // $ANTLR start "rule__Match__Group__8"
    // InternalMyDsl.g:6869:1: rule__Match__Group__8 : rule__Match__Group__8__Impl rule__Match__Group__9 ;
    public final void rule__Match__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6873:1: ( rule__Match__Group__8__Impl rule__Match__Group__9 )
            // InternalMyDsl.g:6874:2: rule__Match__Group__8__Impl rule__Match__Group__9
            {
            pushFollow(FOLLOW_48);
            rule__Match__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__8"


    // $ANTLR start "rule__Match__Group__8__Impl"
    // InternalMyDsl.g:6881:1: rule__Match__Group__8__Impl : ( ( rule__Match__TeamsAssignment_8 ) ) ;
    public final void rule__Match__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6885:1: ( ( ( rule__Match__TeamsAssignment_8 ) ) )
            // InternalMyDsl.g:6886:1: ( ( rule__Match__TeamsAssignment_8 ) )
            {
            // InternalMyDsl.g:6886:1: ( ( rule__Match__TeamsAssignment_8 ) )
            // InternalMyDsl.g:6887:2: ( rule__Match__TeamsAssignment_8 )
            {
             before(grammarAccess.getMatchAccess().getTeamsAssignment_8()); 
            // InternalMyDsl.g:6888:2: ( rule__Match__TeamsAssignment_8 )
            // InternalMyDsl.g:6888:3: rule__Match__TeamsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Match__TeamsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getTeamsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__8__Impl"


    // $ANTLR start "rule__Match__Group__9"
    // InternalMyDsl.g:6896:1: rule__Match__Group__9 : rule__Match__Group__9__Impl rule__Match__Group__10 ;
    public final void rule__Match__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6900:1: ( rule__Match__Group__9__Impl rule__Match__Group__10 )
            // InternalMyDsl.g:6901:2: rule__Match__Group__9__Impl rule__Match__Group__10
            {
            pushFollow(FOLLOW_48);
            rule__Match__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__9"


    // $ANTLR start "rule__Match__Group__9__Impl"
    // InternalMyDsl.g:6908:1: rule__Match__Group__9__Impl : ( ( rule__Match__Group_9__0 )* ) ;
    public final void rule__Match__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6912:1: ( ( ( rule__Match__Group_9__0 )* ) )
            // InternalMyDsl.g:6913:1: ( ( rule__Match__Group_9__0 )* )
            {
            // InternalMyDsl.g:6913:1: ( ( rule__Match__Group_9__0 )* )
            // InternalMyDsl.g:6914:2: ( rule__Match__Group_9__0 )*
            {
             before(grammarAccess.getMatchAccess().getGroup_9()); 
            // InternalMyDsl.g:6915:2: ( rule__Match__Group_9__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==38) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:6915:3: rule__Match__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Match__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getMatchAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__9__Impl"


    // $ANTLR start "rule__Match__Group__10"
    // InternalMyDsl.g:6923:1: rule__Match__Group__10 : rule__Match__Group__10__Impl rule__Match__Group__11 ;
    public final void rule__Match__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6927:1: ( rule__Match__Group__10__Impl rule__Match__Group__11 )
            // InternalMyDsl.g:6928:2: rule__Match__Group__10__Impl rule__Match__Group__11
            {
            pushFollow(FOLLOW_49);
            rule__Match__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__10"


    // $ANTLR start "rule__Match__Group__10__Impl"
    // InternalMyDsl.g:6935:1: rule__Match__Group__10__Impl : ( ')' ) ;
    public final void rule__Match__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6939:1: ( ( ')' ) )
            // InternalMyDsl.g:6940:1: ( ')' )
            {
            // InternalMyDsl.g:6940:1: ( ')' )
            // InternalMyDsl.g:6941:2: ')'
            {
             before(grammarAccess.getMatchAccess().getRightParenthesisKeyword_10()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__10__Impl"


    // $ANTLR start "rule__Match__Group__11"
    // InternalMyDsl.g:6950:1: rule__Match__Group__11 : rule__Match__Group__11__Impl rule__Match__Group__12 ;
    public final void rule__Match__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6954:1: ( rule__Match__Group__11__Impl rule__Match__Group__12 )
            // InternalMyDsl.g:6955:2: rule__Match__Group__11__Impl rule__Match__Group__12
            {
            pushFollow(FOLLOW_50);
            rule__Match__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__11"


    // $ANTLR start "rule__Match__Group__11__Impl"
    // InternalMyDsl.g:6962:1: rule__Match__Group__11__Impl : ( 'matchrules' ) ;
    public final void rule__Match__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6966:1: ( ( 'matchrules' ) )
            // InternalMyDsl.g:6967:1: ( 'matchrules' )
            {
            // InternalMyDsl.g:6967:1: ( 'matchrules' )
            // InternalMyDsl.g:6968:2: 'matchrules'
            {
             before(grammarAccess.getMatchAccess().getMatchrulesKeyword_11()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getMatchrulesKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__11__Impl"


    // $ANTLR start "rule__Match__Group__12"
    // InternalMyDsl.g:6977:1: rule__Match__Group__12 : rule__Match__Group__12__Impl rule__Match__Group__13 ;
    public final void rule__Match__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6981:1: ( rule__Match__Group__12__Impl rule__Match__Group__13 )
            // InternalMyDsl.g:6982:2: rule__Match__Group__12__Impl rule__Match__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Match__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__12"


    // $ANTLR start "rule__Match__Group__12__Impl"
    // InternalMyDsl.g:6989:1: rule__Match__Group__12__Impl : ( ( rule__Match__MatchrulesAssignment_12 ) ) ;
    public final void rule__Match__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6993:1: ( ( ( rule__Match__MatchrulesAssignment_12 ) ) )
            // InternalMyDsl.g:6994:1: ( ( rule__Match__MatchrulesAssignment_12 ) )
            {
            // InternalMyDsl.g:6994:1: ( ( rule__Match__MatchrulesAssignment_12 ) )
            // InternalMyDsl.g:6995:2: ( rule__Match__MatchrulesAssignment_12 )
            {
             before(grammarAccess.getMatchAccess().getMatchrulesAssignment_12()); 
            // InternalMyDsl.g:6996:2: ( rule__Match__MatchrulesAssignment_12 )
            // InternalMyDsl.g:6996:3: rule__Match__MatchrulesAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Match__MatchrulesAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getMatchrulesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__12__Impl"


    // $ANTLR start "rule__Match__Group__13"
    // InternalMyDsl.g:7004:1: rule__Match__Group__13 : rule__Match__Group__13__Impl ;
    public final void rule__Match__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7008:1: ( rule__Match__Group__13__Impl )
            // InternalMyDsl.g:7009:2: rule__Match__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__13"


    // $ANTLR start "rule__Match__Group__13__Impl"
    // InternalMyDsl.g:7015:1: rule__Match__Group__13__Impl : ( '}' ) ;
    public final void rule__Match__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7019:1: ( ( '}' ) )
            // InternalMyDsl.g:7020:1: ( '}' )
            {
            // InternalMyDsl.g:7020:1: ( '}' )
            // InternalMyDsl.g:7021:2: '}'
            {
             before(grammarAccess.getMatchAccess().getRightCurlyBracketKeyword_13()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group__13__Impl"


    // $ANTLR start "rule__Match__Group_2__0"
    // InternalMyDsl.g:7031:1: rule__Match__Group_2__0 : rule__Match__Group_2__0__Impl rule__Match__Group_2__1 ;
    public final void rule__Match__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7035:1: ( rule__Match__Group_2__0__Impl rule__Match__Group_2__1 )
            // InternalMyDsl.g:7036:2: rule__Match__Group_2__0__Impl rule__Match__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Match__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_2__0"


    // $ANTLR start "rule__Match__Group_2__0__Impl"
    // InternalMyDsl.g:7043:1: rule__Match__Group_2__0__Impl : ( 'scoreTeam1' ) ;
    public final void rule__Match__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7047:1: ( ( 'scoreTeam1' ) )
            // InternalMyDsl.g:7048:1: ( 'scoreTeam1' )
            {
            // InternalMyDsl.g:7048:1: ( 'scoreTeam1' )
            // InternalMyDsl.g:7049:2: 'scoreTeam1'
            {
             before(grammarAccess.getMatchAccess().getScoreTeam1Keyword_2_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getScoreTeam1Keyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_2__0__Impl"


    // $ANTLR start "rule__Match__Group_2__1"
    // InternalMyDsl.g:7058:1: rule__Match__Group_2__1 : rule__Match__Group_2__1__Impl ;
    public final void rule__Match__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7062:1: ( rule__Match__Group_2__1__Impl )
            // InternalMyDsl.g:7063:2: rule__Match__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_2__1"


    // $ANTLR start "rule__Match__Group_2__1__Impl"
    // InternalMyDsl.g:7069:1: rule__Match__Group_2__1__Impl : ( ( rule__Match__ScoreTeam1Assignment_2_1 ) ) ;
    public final void rule__Match__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7073:1: ( ( ( rule__Match__ScoreTeam1Assignment_2_1 ) ) )
            // InternalMyDsl.g:7074:1: ( ( rule__Match__ScoreTeam1Assignment_2_1 ) )
            {
            // InternalMyDsl.g:7074:1: ( ( rule__Match__ScoreTeam1Assignment_2_1 ) )
            // InternalMyDsl.g:7075:2: ( rule__Match__ScoreTeam1Assignment_2_1 )
            {
             before(grammarAccess.getMatchAccess().getScoreTeam1Assignment_2_1()); 
            // InternalMyDsl.g:7076:2: ( rule__Match__ScoreTeam1Assignment_2_1 )
            // InternalMyDsl.g:7076:3: rule__Match__ScoreTeam1Assignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Match__ScoreTeam1Assignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getScoreTeam1Assignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_2__1__Impl"


    // $ANTLR start "rule__Match__Group_3__0"
    // InternalMyDsl.g:7085:1: rule__Match__Group_3__0 : rule__Match__Group_3__0__Impl rule__Match__Group_3__1 ;
    public final void rule__Match__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7089:1: ( rule__Match__Group_3__0__Impl rule__Match__Group_3__1 )
            // InternalMyDsl.g:7090:2: rule__Match__Group_3__0__Impl rule__Match__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Match__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_3__0"


    // $ANTLR start "rule__Match__Group_3__0__Impl"
    // InternalMyDsl.g:7097:1: rule__Match__Group_3__0__Impl : ( 'scoreTeam2' ) ;
    public final void rule__Match__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7101:1: ( ( 'scoreTeam2' ) )
            // InternalMyDsl.g:7102:1: ( 'scoreTeam2' )
            {
            // InternalMyDsl.g:7102:1: ( 'scoreTeam2' )
            // InternalMyDsl.g:7103:2: 'scoreTeam2'
            {
             before(grammarAccess.getMatchAccess().getScoreTeam2Keyword_3_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getScoreTeam2Keyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_3__0__Impl"


    // $ANTLR start "rule__Match__Group_3__1"
    // InternalMyDsl.g:7112:1: rule__Match__Group_3__1 : rule__Match__Group_3__1__Impl ;
    public final void rule__Match__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7116:1: ( rule__Match__Group_3__1__Impl )
            // InternalMyDsl.g:7117:2: rule__Match__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_3__1"


    // $ANTLR start "rule__Match__Group_3__1__Impl"
    // InternalMyDsl.g:7123:1: rule__Match__Group_3__1__Impl : ( ( rule__Match__ScoreTeam2Assignment_3_1 ) ) ;
    public final void rule__Match__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7127:1: ( ( ( rule__Match__ScoreTeam2Assignment_3_1 ) ) )
            // InternalMyDsl.g:7128:1: ( ( rule__Match__ScoreTeam2Assignment_3_1 ) )
            {
            // InternalMyDsl.g:7128:1: ( ( rule__Match__ScoreTeam2Assignment_3_1 ) )
            // InternalMyDsl.g:7129:2: ( rule__Match__ScoreTeam2Assignment_3_1 )
            {
             before(grammarAccess.getMatchAccess().getScoreTeam2Assignment_3_1()); 
            // InternalMyDsl.g:7130:2: ( rule__Match__ScoreTeam2Assignment_3_1 )
            // InternalMyDsl.g:7130:3: rule__Match__ScoreTeam2Assignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Match__ScoreTeam2Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getScoreTeam2Assignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_3__1__Impl"


    // $ANTLR start "rule__Match__Group_4__0"
    // InternalMyDsl.g:7139:1: rule__Match__Group_4__0 : rule__Match__Group_4__0__Impl rule__Match__Group_4__1 ;
    public final void rule__Match__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7143:1: ( rule__Match__Group_4__0__Impl rule__Match__Group_4__1 )
            // InternalMyDsl.g:7144:2: rule__Match__Group_4__0__Impl rule__Match__Group_4__1
            {
            pushFollow(FOLLOW_51);
            rule__Match__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_4__0"


    // $ANTLR start "rule__Match__Group_4__0__Impl"
    // InternalMyDsl.g:7151:1: rule__Match__Group_4__0__Impl : ( 'matchResult' ) ;
    public final void rule__Match__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7155:1: ( ( 'matchResult' ) )
            // InternalMyDsl.g:7156:1: ( 'matchResult' )
            {
            // InternalMyDsl.g:7156:1: ( 'matchResult' )
            // InternalMyDsl.g:7157:2: 'matchResult'
            {
             before(grammarAccess.getMatchAccess().getMatchResultKeyword_4_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getMatchResultKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_4__0__Impl"


    // $ANTLR start "rule__Match__Group_4__1"
    // InternalMyDsl.g:7166:1: rule__Match__Group_4__1 : rule__Match__Group_4__1__Impl ;
    public final void rule__Match__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7170:1: ( rule__Match__Group_4__1__Impl )
            // InternalMyDsl.g:7171:2: rule__Match__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_4__1"


    // $ANTLR start "rule__Match__Group_4__1__Impl"
    // InternalMyDsl.g:7177:1: rule__Match__Group_4__1__Impl : ( ( rule__Match__MatchResultAssignment_4_1 ) ) ;
    public final void rule__Match__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7181:1: ( ( ( rule__Match__MatchResultAssignment_4_1 ) ) )
            // InternalMyDsl.g:7182:1: ( ( rule__Match__MatchResultAssignment_4_1 ) )
            {
            // InternalMyDsl.g:7182:1: ( ( rule__Match__MatchResultAssignment_4_1 ) )
            // InternalMyDsl.g:7183:2: ( rule__Match__MatchResultAssignment_4_1 )
            {
             before(grammarAccess.getMatchAccess().getMatchResultAssignment_4_1()); 
            // InternalMyDsl.g:7184:2: ( rule__Match__MatchResultAssignment_4_1 )
            // InternalMyDsl.g:7184:3: rule__Match__MatchResultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Match__MatchResultAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getMatchResultAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_4__1__Impl"


    // $ANTLR start "rule__Match__Group_5__0"
    // InternalMyDsl.g:7193:1: rule__Match__Group_5__0 : rule__Match__Group_5__0__Impl rule__Match__Group_5__1 ;
    public final void rule__Match__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7197:1: ( rule__Match__Group_5__0__Impl rule__Match__Group_5__1 )
            // InternalMyDsl.g:7198:2: rule__Match__Group_5__0__Impl rule__Match__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__Match__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_5__0"


    // $ANTLR start "rule__Match__Group_5__0__Impl"
    // InternalMyDsl.g:7205:1: rule__Match__Group_5__0__Impl : ( 'day' ) ;
    public final void rule__Match__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7209:1: ( ( 'day' ) )
            // InternalMyDsl.g:7210:1: ( 'day' )
            {
            // InternalMyDsl.g:7210:1: ( 'day' )
            // InternalMyDsl.g:7211:2: 'day'
            {
             before(grammarAccess.getMatchAccess().getDayKeyword_5_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getDayKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_5__0__Impl"


    // $ANTLR start "rule__Match__Group_5__1"
    // InternalMyDsl.g:7220:1: rule__Match__Group_5__1 : rule__Match__Group_5__1__Impl ;
    public final void rule__Match__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7224:1: ( rule__Match__Group_5__1__Impl )
            // InternalMyDsl.g:7225:2: rule__Match__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_5__1"


    // $ANTLR start "rule__Match__Group_5__1__Impl"
    // InternalMyDsl.g:7231:1: rule__Match__Group_5__1__Impl : ( ( rule__Match__DayAssignment_5_1 ) ) ;
    public final void rule__Match__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7235:1: ( ( ( rule__Match__DayAssignment_5_1 ) ) )
            // InternalMyDsl.g:7236:1: ( ( rule__Match__DayAssignment_5_1 ) )
            {
            // InternalMyDsl.g:7236:1: ( ( rule__Match__DayAssignment_5_1 ) )
            // InternalMyDsl.g:7237:2: ( rule__Match__DayAssignment_5_1 )
            {
             before(grammarAccess.getMatchAccess().getDayAssignment_5_1()); 
            // InternalMyDsl.g:7238:2: ( rule__Match__DayAssignment_5_1 )
            // InternalMyDsl.g:7238:3: rule__Match__DayAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Match__DayAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getDayAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_5__1__Impl"


    // $ANTLR start "rule__Match__Group_9__0"
    // InternalMyDsl.g:7247:1: rule__Match__Group_9__0 : rule__Match__Group_9__0__Impl rule__Match__Group_9__1 ;
    public final void rule__Match__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7251:1: ( rule__Match__Group_9__0__Impl rule__Match__Group_9__1 )
            // InternalMyDsl.g:7252:2: rule__Match__Group_9__0__Impl rule__Match__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Match__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Match__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_9__0"


    // $ANTLR start "rule__Match__Group_9__0__Impl"
    // InternalMyDsl.g:7259:1: rule__Match__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Match__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7263:1: ( ( ',' ) )
            // InternalMyDsl.g:7264:1: ( ',' )
            {
            // InternalMyDsl.g:7264:1: ( ',' )
            // InternalMyDsl.g:7265:2: ','
            {
             before(grammarAccess.getMatchAccess().getCommaKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMatchAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_9__0__Impl"


    // $ANTLR start "rule__Match__Group_9__1"
    // InternalMyDsl.g:7274:1: rule__Match__Group_9__1 : rule__Match__Group_9__1__Impl ;
    public final void rule__Match__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7278:1: ( rule__Match__Group_9__1__Impl )
            // InternalMyDsl.g:7279:2: rule__Match__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Match__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_9__1"


    // $ANTLR start "rule__Match__Group_9__1__Impl"
    // InternalMyDsl.g:7285:1: rule__Match__Group_9__1__Impl : ( ( rule__Match__TeamsAssignment_9_1 ) ) ;
    public final void rule__Match__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7289:1: ( ( ( rule__Match__TeamsAssignment_9_1 ) ) )
            // InternalMyDsl.g:7290:1: ( ( rule__Match__TeamsAssignment_9_1 ) )
            {
            // InternalMyDsl.g:7290:1: ( ( rule__Match__TeamsAssignment_9_1 ) )
            // InternalMyDsl.g:7291:2: ( rule__Match__TeamsAssignment_9_1 )
            {
             before(grammarAccess.getMatchAccess().getTeamsAssignment_9_1()); 
            // InternalMyDsl.g:7292:2: ( rule__Match__TeamsAssignment_9_1 )
            // InternalMyDsl.g:7292:3: rule__Match__TeamsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Match__TeamsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchAccess().getTeamsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__Group_9__1__Impl"


    // $ANTLR start "rule__Standard__Group__0"
    // InternalMyDsl.g:7301:1: rule__Standard__Group__0 : rule__Standard__Group__0__Impl rule__Standard__Group__1 ;
    public final void rule__Standard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7305:1: ( rule__Standard__Group__0__Impl rule__Standard__Group__1 )
            // InternalMyDsl.g:7306:2: rule__Standard__Group__0__Impl rule__Standard__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Standard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Standard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__0"


    // $ANTLR start "rule__Standard__Group__0__Impl"
    // InternalMyDsl.g:7313:1: rule__Standard__Group__0__Impl : ( () ) ;
    public final void rule__Standard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7317:1: ( ( () ) )
            // InternalMyDsl.g:7318:1: ( () )
            {
            // InternalMyDsl.g:7318:1: ( () )
            // InternalMyDsl.g:7319:2: ()
            {
             before(grammarAccess.getStandardAccess().getStandardAction_0()); 
            // InternalMyDsl.g:7320:2: ()
            // InternalMyDsl.g:7320:3: 
            {
            }

             after(grammarAccess.getStandardAccess().getStandardAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__0__Impl"


    // $ANTLR start "rule__Standard__Group__1"
    // InternalMyDsl.g:7328:1: rule__Standard__Group__1 : rule__Standard__Group__1__Impl rule__Standard__Group__2 ;
    public final void rule__Standard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7332:1: ( rule__Standard__Group__1__Impl rule__Standard__Group__2 )
            // InternalMyDsl.g:7333:2: rule__Standard__Group__1__Impl rule__Standard__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__Standard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Standard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__1"


    // $ANTLR start "rule__Standard__Group__1__Impl"
    // InternalMyDsl.g:7340:1: rule__Standard__Group__1__Impl : ( ( rule__Standard__TieBreakingAssignment_1 )? ) ;
    public final void rule__Standard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7344:1: ( ( ( rule__Standard__TieBreakingAssignment_1 )? ) )
            // InternalMyDsl.g:7345:1: ( ( rule__Standard__TieBreakingAssignment_1 )? )
            {
            // InternalMyDsl.g:7345:1: ( ( rule__Standard__TieBreakingAssignment_1 )? )
            // InternalMyDsl.g:7346:2: ( rule__Standard__TieBreakingAssignment_1 )?
            {
             before(grammarAccess.getStandardAccess().getTieBreakingAssignment_1()); 
            // InternalMyDsl.g:7347:2: ( rule__Standard__TieBreakingAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==91) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:7347:3: rule__Standard__TieBreakingAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Standard__TieBreakingAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardAccess().getTieBreakingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__1__Impl"


    // $ANTLR start "rule__Standard__Group__2"
    // InternalMyDsl.g:7355:1: rule__Standard__Group__2 : rule__Standard__Group__2__Impl rule__Standard__Group__3 ;
    public final void rule__Standard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7359:1: ( rule__Standard__Group__2__Impl rule__Standard__Group__3 )
            // InternalMyDsl.g:7360:2: rule__Standard__Group__2__Impl rule__Standard__Group__3
            {
            pushFollow(FOLLOW_52);
            rule__Standard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Standard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__2"


    // $ANTLR start "rule__Standard__Group__2__Impl"
    // InternalMyDsl.g:7367:1: rule__Standard__Group__2__Impl : ( ( rule__Standard__ExtraTimeAssignment_2 )? ) ;
    public final void rule__Standard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7371:1: ( ( ( rule__Standard__ExtraTimeAssignment_2 )? ) )
            // InternalMyDsl.g:7372:1: ( ( rule__Standard__ExtraTimeAssignment_2 )? )
            {
            // InternalMyDsl.g:7372:1: ( ( rule__Standard__ExtraTimeAssignment_2 )? )
            // InternalMyDsl.g:7373:2: ( rule__Standard__ExtraTimeAssignment_2 )?
            {
             before(grammarAccess.getStandardAccess().getExtraTimeAssignment_2()); 
            // InternalMyDsl.g:7374:2: ( rule__Standard__ExtraTimeAssignment_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==86) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:7374:3: rule__Standard__ExtraTimeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Standard__ExtraTimeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardAccess().getExtraTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__2__Impl"


    // $ANTLR start "rule__Standard__Group__3"
    // InternalMyDsl.g:7382:1: rule__Standard__Group__3 : rule__Standard__Group__3__Impl rule__Standard__Group__4 ;
    public final void rule__Standard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7386:1: ( rule__Standard__Group__3__Impl rule__Standard__Group__4 )
            // InternalMyDsl.g:7387:2: rule__Standard__Group__3__Impl rule__Standard__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__Standard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Standard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__3"


    // $ANTLR start "rule__Standard__Group__3__Impl"
    // InternalMyDsl.g:7394:1: rule__Standard__Group__3__Impl : ( ( rule__Standard__PenaltyShootoutsAssignment_3 )? ) ;
    public final void rule__Standard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7398:1: ( ( ( rule__Standard__PenaltyShootoutsAssignment_3 )? ) )
            // InternalMyDsl.g:7399:1: ( ( rule__Standard__PenaltyShootoutsAssignment_3 )? )
            {
            // InternalMyDsl.g:7399:1: ( ( rule__Standard__PenaltyShootoutsAssignment_3 )? )
            // InternalMyDsl.g:7400:2: ( rule__Standard__PenaltyShootoutsAssignment_3 )?
            {
             before(grammarAccess.getStandardAccess().getPenaltyShootoutsAssignment_3()); 
            // InternalMyDsl.g:7401:2: ( rule__Standard__PenaltyShootoutsAssignment_3 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==89) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:7401:3: rule__Standard__PenaltyShootoutsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Standard__PenaltyShootoutsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardAccess().getPenaltyShootoutsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__3__Impl"


    // $ANTLR start "rule__Standard__Group__4"
    // InternalMyDsl.g:7409:1: rule__Standard__Group__4 : rule__Standard__Group__4__Impl ;
    public final void rule__Standard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7413:1: ( rule__Standard__Group__4__Impl )
            // InternalMyDsl.g:7414:2: rule__Standard__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Standard__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__4"


    // $ANTLR start "rule__Standard__Group__4__Impl"
    // InternalMyDsl.g:7420:1: rule__Standard__Group__4__Impl : ( 'Standard' ) ;
    public final void rule__Standard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7424:1: ( ( 'Standard' ) )
            // InternalMyDsl.g:7425:1: ( 'Standard' )
            {
            // InternalMyDsl.g:7425:1: ( 'Standard' )
            // InternalMyDsl.g:7426:2: 'Standard'
            {
             before(grammarAccess.getStandardAccess().getStandardKeyword_4()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getStandardAccess().getStandardKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__Group__4__Impl"


    // $ANTLR start "rule__ExtraTime__Group__0"
    // InternalMyDsl.g:7436:1: rule__ExtraTime__Group__0 : rule__ExtraTime__Group__0__Impl rule__ExtraTime__Group__1 ;
    public final void rule__ExtraTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7440:1: ( rule__ExtraTime__Group__0__Impl rule__ExtraTime__Group__1 )
            // InternalMyDsl.g:7441:2: rule__ExtraTime__Group__0__Impl rule__ExtraTime__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__ExtraTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__0"


    // $ANTLR start "rule__ExtraTime__Group__0__Impl"
    // InternalMyDsl.g:7448:1: rule__ExtraTime__Group__0__Impl : ( () ) ;
    public final void rule__ExtraTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7452:1: ( ( () ) )
            // InternalMyDsl.g:7453:1: ( () )
            {
            // InternalMyDsl.g:7453:1: ( () )
            // InternalMyDsl.g:7454:2: ()
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeAction_0()); 
            // InternalMyDsl.g:7455:2: ()
            // InternalMyDsl.g:7455:3: 
            {
            }

             after(grammarAccess.getExtraTimeAccess().getExtraTimeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__0__Impl"


    // $ANTLR start "rule__ExtraTime__Group__1"
    // InternalMyDsl.g:7463:1: rule__ExtraTime__Group__1 : rule__ExtraTime__Group__1__Impl rule__ExtraTime__Group__2 ;
    public final void rule__ExtraTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7467:1: ( rule__ExtraTime__Group__1__Impl rule__ExtraTime__Group__2 )
            // InternalMyDsl.g:7468:2: rule__ExtraTime__Group__1__Impl rule__ExtraTime__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExtraTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__1"


    // $ANTLR start "rule__ExtraTime__Group__1__Impl"
    // InternalMyDsl.g:7475:1: rule__ExtraTime__Group__1__Impl : ( 'ExtraTime' ) ;
    public final void rule__ExtraTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7479:1: ( ( 'ExtraTime' ) )
            // InternalMyDsl.g:7480:1: ( 'ExtraTime' )
            {
            // InternalMyDsl.g:7480:1: ( 'ExtraTime' )
            // InternalMyDsl.g:7481:2: 'ExtraTime'
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeKeyword_1()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getExtraTimeAccess().getExtraTimeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__1__Impl"


    // $ANTLR start "rule__ExtraTime__Group__2"
    // InternalMyDsl.g:7490:1: rule__ExtraTime__Group__2 : rule__ExtraTime__Group__2__Impl rule__ExtraTime__Group__3 ;
    public final void rule__ExtraTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7494:1: ( rule__ExtraTime__Group__2__Impl rule__ExtraTime__Group__3 )
            // InternalMyDsl.g:7495:2: rule__ExtraTime__Group__2__Impl rule__ExtraTime__Group__3
            {
            pushFollow(FOLLOW_54);
            rule__ExtraTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__2"


    // $ANTLR start "rule__ExtraTime__Group__2__Impl"
    // InternalMyDsl.g:7502:1: rule__ExtraTime__Group__2__Impl : ( '{' ) ;
    public final void rule__ExtraTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7506:1: ( ( '{' ) )
            // InternalMyDsl.g:7507:1: ( '{' )
            {
            // InternalMyDsl.g:7507:1: ( '{' )
            // InternalMyDsl.g:7508:2: '{'
            {
             before(grammarAccess.getExtraTimeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExtraTimeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__2__Impl"


    // $ANTLR start "rule__ExtraTime__Group__3"
    // InternalMyDsl.g:7517:1: rule__ExtraTime__Group__3 : rule__ExtraTime__Group__3__Impl rule__ExtraTime__Group__4 ;
    public final void rule__ExtraTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7521:1: ( rule__ExtraTime__Group__3__Impl rule__ExtraTime__Group__4 )
            // InternalMyDsl.g:7522:2: rule__ExtraTime__Group__3__Impl rule__ExtraTime__Group__4
            {
            pushFollow(FOLLOW_54);
            rule__ExtraTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__3"


    // $ANTLR start "rule__ExtraTime__Group__3__Impl"
    // InternalMyDsl.g:7529:1: rule__ExtraTime__Group__3__Impl : ( ( rule__ExtraTime__Group_3__0 )? ) ;
    public final void rule__ExtraTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7533:1: ( ( ( rule__ExtraTime__Group_3__0 )? ) )
            // InternalMyDsl.g:7534:1: ( ( rule__ExtraTime__Group_3__0 )? )
            {
            // InternalMyDsl.g:7534:1: ( ( rule__ExtraTime__Group_3__0 )? )
            // InternalMyDsl.g:7535:2: ( rule__ExtraTime__Group_3__0 )?
            {
             before(grammarAccess.getExtraTimeAccess().getGroup_3()); 
            // InternalMyDsl.g:7536:2: ( rule__ExtraTime__Group_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==86) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:7536:3: rule__ExtraTime__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtraTime__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtraTimeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__3__Impl"


    // $ANTLR start "rule__ExtraTime__Group__4"
    // InternalMyDsl.g:7544:1: rule__ExtraTime__Group__4 : rule__ExtraTime__Group__4__Impl rule__ExtraTime__Group__5 ;
    public final void rule__ExtraTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7548:1: ( rule__ExtraTime__Group__4__Impl rule__ExtraTime__Group__5 )
            // InternalMyDsl.g:7549:2: rule__ExtraTime__Group__4__Impl rule__ExtraTime__Group__5
            {
            pushFollow(FOLLOW_54);
            rule__ExtraTime__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__4"


    // $ANTLR start "rule__ExtraTime__Group__4__Impl"
    // InternalMyDsl.g:7556:1: rule__ExtraTime__Group__4__Impl : ( ( rule__ExtraTime__Group_4__0 )? ) ;
    public final void rule__ExtraTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7560:1: ( ( ( rule__ExtraTime__Group_4__0 )? ) )
            // InternalMyDsl.g:7561:1: ( ( rule__ExtraTime__Group_4__0 )? )
            {
            // InternalMyDsl.g:7561:1: ( ( rule__ExtraTime__Group_4__0 )? )
            // InternalMyDsl.g:7562:2: ( rule__ExtraTime__Group_4__0 )?
            {
             before(grammarAccess.getExtraTimeAccess().getGroup_4()); 
            // InternalMyDsl.g:7563:2: ( rule__ExtraTime__Group_4__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==87) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:7563:3: rule__ExtraTime__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtraTime__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtraTimeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__4__Impl"


    // $ANTLR start "rule__ExtraTime__Group__5"
    // InternalMyDsl.g:7571:1: rule__ExtraTime__Group__5 : rule__ExtraTime__Group__5__Impl ;
    public final void rule__ExtraTime__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7575:1: ( rule__ExtraTime__Group__5__Impl )
            // InternalMyDsl.g:7576:2: rule__ExtraTime__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__5"


    // $ANTLR start "rule__ExtraTime__Group__5__Impl"
    // InternalMyDsl.g:7582:1: rule__ExtraTime__Group__5__Impl : ( '}' ) ;
    public final void rule__ExtraTime__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7586:1: ( ( '}' ) )
            // InternalMyDsl.g:7587:1: ( '}' )
            {
            // InternalMyDsl.g:7587:1: ( '}' )
            // InternalMyDsl.g:7588:2: '}'
            {
             before(grammarAccess.getExtraTimeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExtraTimeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group__5__Impl"


    // $ANTLR start "rule__ExtraTime__Group_3__0"
    // InternalMyDsl.g:7598:1: rule__ExtraTime__Group_3__0 : rule__ExtraTime__Group_3__0__Impl rule__ExtraTime__Group_3__1 ;
    public final void rule__ExtraTime__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7602:1: ( rule__ExtraTime__Group_3__0__Impl rule__ExtraTime__Group_3__1 )
            // InternalMyDsl.g:7603:2: rule__ExtraTime__Group_3__0__Impl rule__ExtraTime__Group_3__1
            {
            pushFollow(FOLLOW_55);
            rule__ExtraTime__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_3__0"


    // $ANTLR start "rule__ExtraTime__Group_3__0__Impl"
    // InternalMyDsl.g:7610:1: rule__ExtraTime__Group_3__0__Impl : ( 'extraTime' ) ;
    public final void rule__ExtraTime__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7614:1: ( ( 'extraTime' ) )
            // InternalMyDsl.g:7615:1: ( 'extraTime' )
            {
            // InternalMyDsl.g:7615:1: ( 'extraTime' )
            // InternalMyDsl.g:7616:2: 'extraTime'
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeKeyword_3_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getExtraTimeAccess().getExtraTimeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_3__0__Impl"


    // $ANTLR start "rule__ExtraTime__Group_3__1"
    // InternalMyDsl.g:7625:1: rule__ExtraTime__Group_3__1 : rule__ExtraTime__Group_3__1__Impl ;
    public final void rule__ExtraTime__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7629:1: ( rule__ExtraTime__Group_3__1__Impl )
            // InternalMyDsl.g:7630:2: rule__ExtraTime__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_3__1"


    // $ANTLR start "rule__ExtraTime__Group_3__1__Impl"
    // InternalMyDsl.g:7636:1: rule__ExtraTime__Group_3__1__Impl : ( ( rule__ExtraTime__ExtraTimeAssignment_3_1 ) ) ;
    public final void rule__ExtraTime__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7640:1: ( ( ( rule__ExtraTime__ExtraTimeAssignment_3_1 ) ) )
            // InternalMyDsl.g:7641:1: ( ( rule__ExtraTime__ExtraTimeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:7641:1: ( ( rule__ExtraTime__ExtraTimeAssignment_3_1 ) )
            // InternalMyDsl.g:7642:2: ( rule__ExtraTime__ExtraTimeAssignment_3_1 )
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeAssignment_3_1()); 
            // InternalMyDsl.g:7643:2: ( rule__ExtraTime__ExtraTimeAssignment_3_1 )
            // InternalMyDsl.g:7643:3: rule__ExtraTime__ExtraTimeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtraTime__ExtraTimeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExtraTimeAccess().getExtraTimeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_3__1__Impl"


    // $ANTLR start "rule__ExtraTime__Group_4__0"
    // InternalMyDsl.g:7652:1: rule__ExtraTime__Group_4__0 : rule__ExtraTime__Group_4__0__Impl rule__ExtraTime__Group_4__1 ;
    public final void rule__ExtraTime__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7656:1: ( rule__ExtraTime__Group_4__0__Impl rule__ExtraTime__Group_4__1 )
            // InternalMyDsl.g:7657:2: rule__ExtraTime__Group_4__0__Impl rule__ExtraTime__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__ExtraTime__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_4__0"


    // $ANTLR start "rule__ExtraTime__Group_4__0__Impl"
    // InternalMyDsl.g:7664:1: rule__ExtraTime__Group_4__0__Impl : ( 'extraTimeDuration' ) ;
    public final void rule__ExtraTime__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7668:1: ( ( 'extraTimeDuration' ) )
            // InternalMyDsl.g:7669:1: ( 'extraTimeDuration' )
            {
            // InternalMyDsl.g:7669:1: ( 'extraTimeDuration' )
            // InternalMyDsl.g:7670:2: 'extraTimeDuration'
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeDurationKeyword_4_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getExtraTimeAccess().getExtraTimeDurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_4__0__Impl"


    // $ANTLR start "rule__ExtraTime__Group_4__1"
    // InternalMyDsl.g:7679:1: rule__ExtraTime__Group_4__1 : rule__ExtraTime__Group_4__1__Impl ;
    public final void rule__ExtraTime__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7683:1: ( rule__ExtraTime__Group_4__1__Impl )
            // InternalMyDsl.g:7684:2: rule__ExtraTime__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtraTime__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_4__1"


    // $ANTLR start "rule__ExtraTime__Group_4__1__Impl"
    // InternalMyDsl.g:7690:1: rule__ExtraTime__Group_4__1__Impl : ( ( rule__ExtraTime__ExtraTimeDurationAssignment_4_1 ) ) ;
    public final void rule__ExtraTime__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7694:1: ( ( ( rule__ExtraTime__ExtraTimeDurationAssignment_4_1 ) ) )
            // InternalMyDsl.g:7695:1: ( ( rule__ExtraTime__ExtraTimeDurationAssignment_4_1 ) )
            {
            // InternalMyDsl.g:7695:1: ( ( rule__ExtraTime__ExtraTimeDurationAssignment_4_1 ) )
            // InternalMyDsl.g:7696:2: ( rule__ExtraTime__ExtraTimeDurationAssignment_4_1 )
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeDurationAssignment_4_1()); 
            // InternalMyDsl.g:7697:2: ( rule__ExtraTime__ExtraTimeDurationAssignment_4_1 )
            // InternalMyDsl.g:7697:3: rule__ExtraTime__ExtraTimeDurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtraTime__ExtraTimeDurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExtraTimeAccess().getExtraTimeDurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__Group_4__1__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group__0"
    // InternalMyDsl.g:7706:1: rule__PenaltyShootout__Group__0 : rule__PenaltyShootout__Group__0__Impl rule__PenaltyShootout__Group__1 ;
    public final void rule__PenaltyShootout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7710:1: ( rule__PenaltyShootout__Group__0__Impl rule__PenaltyShootout__Group__1 )
            // InternalMyDsl.g:7711:2: rule__PenaltyShootout__Group__0__Impl rule__PenaltyShootout__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__PenaltyShootout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__0"


    // $ANTLR start "rule__PenaltyShootout__Group__0__Impl"
    // InternalMyDsl.g:7718:1: rule__PenaltyShootout__Group__0__Impl : ( () ) ;
    public final void rule__PenaltyShootout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7722:1: ( ( () ) )
            // InternalMyDsl.g:7723:1: ( () )
            {
            // InternalMyDsl.g:7723:1: ( () )
            // InternalMyDsl.g:7724:2: ()
            {
             before(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutAction_0()); 
            // InternalMyDsl.g:7725:2: ()
            // InternalMyDsl.g:7725:3: 
            {
            }

             after(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__0__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group__1"
    // InternalMyDsl.g:7733:1: rule__PenaltyShootout__Group__1 : rule__PenaltyShootout__Group__1__Impl rule__PenaltyShootout__Group__2 ;
    public final void rule__PenaltyShootout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7737:1: ( rule__PenaltyShootout__Group__1__Impl rule__PenaltyShootout__Group__2 )
            // InternalMyDsl.g:7738:2: rule__PenaltyShootout__Group__1__Impl rule__PenaltyShootout__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PenaltyShootout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__1"


    // $ANTLR start "rule__PenaltyShootout__Group__1__Impl"
    // InternalMyDsl.g:7745:1: rule__PenaltyShootout__Group__1__Impl : ( 'PenaltyShootout' ) ;
    public final void rule__PenaltyShootout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7749:1: ( ( 'PenaltyShootout' ) )
            // InternalMyDsl.g:7750:1: ( 'PenaltyShootout' )
            {
            // InternalMyDsl.g:7750:1: ( 'PenaltyShootout' )
            // InternalMyDsl.g:7751:2: 'PenaltyShootout'
            {
             before(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutKeyword_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__1__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group__2"
    // InternalMyDsl.g:7760:1: rule__PenaltyShootout__Group__2 : rule__PenaltyShootout__Group__2__Impl rule__PenaltyShootout__Group__3 ;
    public final void rule__PenaltyShootout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7764:1: ( rule__PenaltyShootout__Group__2__Impl rule__PenaltyShootout__Group__3 )
            // InternalMyDsl.g:7765:2: rule__PenaltyShootout__Group__2__Impl rule__PenaltyShootout__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__PenaltyShootout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__2"


    // $ANTLR start "rule__PenaltyShootout__Group__2__Impl"
    // InternalMyDsl.g:7772:1: rule__PenaltyShootout__Group__2__Impl : ( '{' ) ;
    public final void rule__PenaltyShootout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7776:1: ( ( '{' ) )
            // InternalMyDsl.g:7777:1: ( '{' )
            {
            // InternalMyDsl.g:7777:1: ( '{' )
            // InternalMyDsl.g:7778:2: '{'
            {
             before(grammarAccess.getPenaltyShootoutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPenaltyShootoutAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__2__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group__3"
    // InternalMyDsl.g:7787:1: rule__PenaltyShootout__Group__3 : rule__PenaltyShootout__Group__3__Impl rule__PenaltyShootout__Group__4 ;
    public final void rule__PenaltyShootout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7791:1: ( rule__PenaltyShootout__Group__3__Impl rule__PenaltyShootout__Group__4 )
            // InternalMyDsl.g:7792:2: rule__PenaltyShootout__Group__3__Impl rule__PenaltyShootout__Group__4
            {
            pushFollow(FOLLOW_57);
            rule__PenaltyShootout__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__3"


    // $ANTLR start "rule__PenaltyShootout__Group__3__Impl"
    // InternalMyDsl.g:7799:1: rule__PenaltyShootout__Group__3__Impl : ( ( rule__PenaltyShootout__Group_3__0 )? ) ;
    public final void rule__PenaltyShootout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7803:1: ( ( ( rule__PenaltyShootout__Group_3__0 )? ) )
            // InternalMyDsl.g:7804:1: ( ( rule__PenaltyShootout__Group_3__0 )? )
            {
            // InternalMyDsl.g:7804:1: ( ( rule__PenaltyShootout__Group_3__0 )? )
            // InternalMyDsl.g:7805:2: ( rule__PenaltyShootout__Group_3__0 )?
            {
             before(grammarAccess.getPenaltyShootoutAccess().getGroup_3()); 
            // InternalMyDsl.g:7806:2: ( rule__PenaltyShootout__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==89) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:7806:3: rule__PenaltyShootout__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PenaltyShootout__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPenaltyShootoutAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__3__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group__4"
    // InternalMyDsl.g:7814:1: rule__PenaltyShootout__Group__4 : rule__PenaltyShootout__Group__4__Impl ;
    public final void rule__PenaltyShootout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7818:1: ( rule__PenaltyShootout__Group__4__Impl )
            // InternalMyDsl.g:7819:2: rule__PenaltyShootout__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__4"


    // $ANTLR start "rule__PenaltyShootout__Group__4__Impl"
    // InternalMyDsl.g:7825:1: rule__PenaltyShootout__Group__4__Impl : ( '}' ) ;
    public final void rule__PenaltyShootout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7829:1: ( ( '}' ) )
            // InternalMyDsl.g:7830:1: ( '}' )
            {
            // InternalMyDsl.g:7830:1: ( '}' )
            // InternalMyDsl.g:7831:2: '}'
            {
             before(grammarAccess.getPenaltyShootoutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPenaltyShootoutAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group__4__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group_3__0"
    // InternalMyDsl.g:7841:1: rule__PenaltyShootout__Group_3__0 : rule__PenaltyShootout__Group_3__0__Impl rule__PenaltyShootout__Group_3__1 ;
    public final void rule__PenaltyShootout__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7845:1: ( rule__PenaltyShootout__Group_3__0__Impl rule__PenaltyShootout__Group_3__1 )
            // InternalMyDsl.g:7846:2: rule__PenaltyShootout__Group_3__0__Impl rule__PenaltyShootout__Group_3__1
            {
            pushFollow(FOLLOW_55);
            rule__PenaltyShootout__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group_3__0"


    // $ANTLR start "rule__PenaltyShootout__Group_3__0__Impl"
    // InternalMyDsl.g:7853:1: rule__PenaltyShootout__Group_3__0__Impl : ( 'penaltyShootouts' ) ;
    public final void rule__PenaltyShootout__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7857:1: ( ( 'penaltyShootouts' ) )
            // InternalMyDsl.g:7858:1: ( 'penaltyShootouts' )
            {
            // InternalMyDsl.g:7858:1: ( 'penaltyShootouts' )
            // InternalMyDsl.g:7859:2: 'penaltyShootouts'
            {
             before(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsKeyword_3_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group_3__0__Impl"


    // $ANTLR start "rule__PenaltyShootout__Group_3__1"
    // InternalMyDsl.g:7868:1: rule__PenaltyShootout__Group_3__1 : rule__PenaltyShootout__Group_3__1__Impl ;
    public final void rule__PenaltyShootout__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7872:1: ( rule__PenaltyShootout__Group_3__1__Impl )
            // InternalMyDsl.g:7873:2: rule__PenaltyShootout__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group_3__1"


    // $ANTLR start "rule__PenaltyShootout__Group_3__1__Impl"
    // InternalMyDsl.g:7879:1: rule__PenaltyShootout__Group_3__1__Impl : ( ( rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 ) ) ;
    public final void rule__PenaltyShootout__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7883:1: ( ( ( rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 ) ) )
            // InternalMyDsl.g:7884:1: ( ( rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:7884:1: ( ( rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 ) )
            // InternalMyDsl.g:7885:2: ( rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 )
            {
             before(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsAssignment_3_1()); 
            // InternalMyDsl.g:7886:2: ( rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 )
            // InternalMyDsl.g:7886:3: rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__Group_3__1__Impl"


    // $ANTLR start "rule__GroupStage__Group__0"
    // InternalMyDsl.g:7895:1: rule__GroupStage__Group__0 : rule__GroupStage__Group__0__Impl rule__GroupStage__Group__1 ;
    public final void rule__GroupStage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7899:1: ( rule__GroupStage__Group__0__Impl rule__GroupStage__Group__1 )
            // InternalMyDsl.g:7900:2: rule__GroupStage__Group__0__Impl rule__GroupStage__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__GroupStage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__0"


    // $ANTLR start "rule__GroupStage__Group__0__Impl"
    // InternalMyDsl.g:7907:1: rule__GroupStage__Group__0__Impl : ( () ) ;
    public final void rule__GroupStage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7911:1: ( ( () ) )
            // InternalMyDsl.g:7912:1: ( () )
            {
            // InternalMyDsl.g:7912:1: ( () )
            // InternalMyDsl.g:7913:2: ()
            {
             before(grammarAccess.getGroupStageAccess().getGroupStageAction_0()); 
            // InternalMyDsl.g:7914:2: ()
            // InternalMyDsl.g:7914:3: 
            {
            }

             after(grammarAccess.getGroupStageAccess().getGroupStageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__0__Impl"


    // $ANTLR start "rule__GroupStage__Group__1"
    // InternalMyDsl.g:7922:1: rule__GroupStage__Group__1 : rule__GroupStage__Group__1__Impl rule__GroupStage__Group__2 ;
    public final void rule__GroupStage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7926:1: ( rule__GroupStage__Group__1__Impl rule__GroupStage__Group__2 )
            // InternalMyDsl.g:7927:2: rule__GroupStage__Group__1__Impl rule__GroupStage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GroupStage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__1"


    // $ANTLR start "rule__GroupStage__Group__1__Impl"
    // InternalMyDsl.g:7934:1: rule__GroupStage__Group__1__Impl : ( 'GroupStage' ) ;
    public final void rule__GroupStage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7938:1: ( ( 'GroupStage' ) )
            // InternalMyDsl.g:7939:1: ( 'GroupStage' )
            {
            // InternalMyDsl.g:7939:1: ( 'GroupStage' )
            // InternalMyDsl.g:7940:2: 'GroupStage'
            {
             before(grammarAccess.getGroupStageAccess().getGroupStageKeyword_1()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getGroupStageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__1__Impl"


    // $ANTLR start "rule__GroupStage__Group__2"
    // InternalMyDsl.g:7949:1: rule__GroupStage__Group__2 : rule__GroupStage__Group__2__Impl rule__GroupStage__Group__3 ;
    public final void rule__GroupStage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7953:1: ( rule__GroupStage__Group__2__Impl rule__GroupStage__Group__3 )
            // InternalMyDsl.g:7954:2: rule__GroupStage__Group__2__Impl rule__GroupStage__Group__3
            {
            pushFollow(FOLLOW_58);
            rule__GroupStage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__2"


    // $ANTLR start "rule__GroupStage__Group__2__Impl"
    // InternalMyDsl.g:7961:1: rule__GroupStage__Group__2__Impl : ( '{' ) ;
    public final void rule__GroupStage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7965:1: ( ( '{' ) )
            // InternalMyDsl.g:7966:1: ( '{' )
            {
            // InternalMyDsl.g:7966:1: ( '{' )
            // InternalMyDsl.g:7967:2: '{'
            {
             before(grammarAccess.getGroupStageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__2__Impl"


    // $ANTLR start "rule__GroupStage__Group__3"
    // InternalMyDsl.g:7976:1: rule__GroupStage__Group__3 : rule__GroupStage__Group__3__Impl rule__GroupStage__Group__4 ;
    public final void rule__GroupStage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7980:1: ( rule__GroupStage__Group__3__Impl rule__GroupStage__Group__4 )
            // InternalMyDsl.g:7981:2: rule__GroupStage__Group__3__Impl rule__GroupStage__Group__4
            {
            pushFollow(FOLLOW_58);
            rule__GroupStage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__3"


    // $ANTLR start "rule__GroupStage__Group__3__Impl"
    // InternalMyDsl.g:7988:1: rule__GroupStage__Group__3__Impl : ( ( rule__GroupStage__Group_3__0 )? ) ;
    public final void rule__GroupStage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7992:1: ( ( ( rule__GroupStage__Group_3__0 )? ) )
            // InternalMyDsl.g:7993:1: ( ( rule__GroupStage__Group_3__0 )? )
            {
            // InternalMyDsl.g:7993:1: ( ( rule__GroupStage__Group_3__0 )? )
            // InternalMyDsl.g:7994:2: ( rule__GroupStage__Group_3__0 )?
            {
             before(grammarAccess.getGroupStageAccess().getGroup_3()); 
            // InternalMyDsl.g:7995:2: ( rule__GroupStage__Group_3__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==91) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:7995:3: rule__GroupStage__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GroupStage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupStageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__3__Impl"


    // $ANTLR start "rule__GroupStage__Group__4"
    // InternalMyDsl.g:8003:1: rule__GroupStage__Group__4 : rule__GroupStage__Group__4__Impl ;
    public final void rule__GroupStage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8007:1: ( rule__GroupStage__Group__4__Impl )
            // InternalMyDsl.g:8008:2: rule__GroupStage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__4"


    // $ANTLR start "rule__GroupStage__Group__4__Impl"
    // InternalMyDsl.g:8014:1: rule__GroupStage__Group__4__Impl : ( '}' ) ;
    public final void rule__GroupStage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8018:1: ( ( '}' ) )
            // InternalMyDsl.g:8019:1: ( '}' )
            {
            // InternalMyDsl.g:8019:1: ( '}' )
            // InternalMyDsl.g:8020:2: '}'
            {
             before(grammarAccess.getGroupStageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group__4__Impl"


    // $ANTLR start "rule__GroupStage__Group_3__0"
    // InternalMyDsl.g:8030:1: rule__GroupStage__Group_3__0 : rule__GroupStage__Group_3__0__Impl rule__GroupStage__Group_3__1 ;
    public final void rule__GroupStage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8034:1: ( rule__GroupStage__Group_3__0__Impl rule__GroupStage__Group_3__1 )
            // InternalMyDsl.g:8035:2: rule__GroupStage__Group_3__0__Impl rule__GroupStage__Group_3__1
            {
            pushFollow(FOLLOW_55);
            rule__GroupStage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group_3__0"


    // $ANTLR start "rule__GroupStage__Group_3__0__Impl"
    // InternalMyDsl.g:8042:1: rule__GroupStage__Group_3__0__Impl : ( 'tieBreaking' ) ;
    public final void rule__GroupStage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8046:1: ( ( 'tieBreaking' ) )
            // InternalMyDsl.g:8047:1: ( 'tieBreaking' )
            {
            // InternalMyDsl.g:8047:1: ( 'tieBreaking' )
            // InternalMyDsl.g:8048:2: 'tieBreaking'
            {
             before(grammarAccess.getGroupStageAccess().getTieBreakingKeyword_3_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getGroupStageAccess().getTieBreakingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group_3__0__Impl"


    // $ANTLR start "rule__GroupStage__Group_3__1"
    // InternalMyDsl.g:8057:1: rule__GroupStage__Group_3__1 : rule__GroupStage__Group_3__1__Impl ;
    public final void rule__GroupStage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8061:1: ( rule__GroupStage__Group_3__1__Impl )
            // InternalMyDsl.g:8062:2: rule__GroupStage__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group_3__1"


    // $ANTLR start "rule__GroupStage__Group_3__1__Impl"
    // InternalMyDsl.g:8068:1: rule__GroupStage__Group_3__1__Impl : ( ( rule__GroupStage__TieBreakingAssignment_3_1 ) ) ;
    public final void rule__GroupStage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8072:1: ( ( ( rule__GroupStage__TieBreakingAssignment_3_1 ) ) )
            // InternalMyDsl.g:8073:1: ( ( rule__GroupStage__TieBreakingAssignment_3_1 ) )
            {
            // InternalMyDsl.g:8073:1: ( ( rule__GroupStage__TieBreakingAssignment_3_1 ) )
            // InternalMyDsl.g:8074:2: ( rule__GroupStage__TieBreakingAssignment_3_1 )
            {
             before(grammarAccess.getGroupStageAccess().getTieBreakingAssignment_3_1()); 
            // InternalMyDsl.g:8075:2: ( rule__GroupStage__TieBreakingAssignment_3_1 )
            // InternalMyDsl.g:8075:3: rule__GroupStage__TieBreakingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupStage__TieBreakingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupStageAccess().getTieBreakingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__Group_3__1__Impl"


    // $ANTLR start "rule__Tournament__NameAssignment_1"
    // InternalMyDsl.g:8084:1: rule__Tournament__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Tournament__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8088:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8089:2: ( ruleEString )
            {
            // InternalMyDsl.g:8089:2: ( ruleEString )
            // InternalMyDsl.g:8090:3: ruleEString
            {
             before(grammarAccess.getTournamentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__NameAssignment_1"


    // $ANTLR start "rule__Tournament__TournamentTypeAssignment_3_1"
    // InternalMyDsl.g:8099:1: rule__Tournament__TournamentTypeAssignment_3_1 : ( ruleTournamentType ) ;
    public final void rule__Tournament__TournamentTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8103:1: ( ( ruleTournamentType ) )
            // InternalMyDsl.g:8104:2: ( ruleTournamentType )
            {
            // InternalMyDsl.g:8104:2: ( ruleTournamentType )
            // InternalMyDsl.g:8105:3: ruleTournamentType
            {
             before(grammarAccess.getTournamentAccess().getTournamentTypeTournamentTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTournamentType();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getTournamentTypeTournamentTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__TournamentTypeAssignment_3_1"


    // $ANTLR start "rule__Tournament__TeamsAssignment_4_2"
    // InternalMyDsl.g:8114:1: rule__Tournament__TeamsAssignment_4_2 : ( ruleTeam ) ;
    public final void rule__Tournament__TeamsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8118:1: ( ( ruleTeam ) )
            // InternalMyDsl.g:8119:2: ( ruleTeam )
            {
            // InternalMyDsl.g:8119:2: ( ruleTeam )
            // InternalMyDsl.g:8120:3: ruleTeam
            {
             before(grammarAccess.getTournamentAccess().getTeamsTeamParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getTeamsTeamParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__TeamsAssignment_4_2"


    // $ANTLR start "rule__Tournament__TeamsAssignment_4_3_1"
    // InternalMyDsl.g:8129:1: rule__Tournament__TeamsAssignment_4_3_1 : ( ruleTeam ) ;
    public final void rule__Tournament__TeamsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8133:1: ( ( ruleTeam ) )
            // InternalMyDsl.g:8134:2: ( ruleTeam )
            {
            // InternalMyDsl.g:8134:2: ( ruleTeam )
            // InternalMyDsl.g:8135:3: ruleTeam
            {
             before(grammarAccess.getTournamentAccess().getTeamsTeamParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getTeamsTeamParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__TeamsAssignment_4_3_1"


    // $ANTLR start "rule__Tournament__TournamentformatAssignment_6"
    // InternalMyDsl.g:8144:1: rule__Tournament__TournamentformatAssignment_6 : ( ruleTournamentFormat ) ;
    public final void rule__Tournament__TournamentformatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8148:1: ( ( ruleTournamentFormat ) )
            // InternalMyDsl.g:8149:2: ( ruleTournamentFormat )
            {
            // InternalMyDsl.g:8149:2: ( ruleTournamentFormat )
            // InternalMyDsl.g:8150:3: ruleTournamentFormat
            {
             before(grammarAccess.getTournamentAccess().getTournamentformatTournamentFormatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTournamentFormat();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getTournamentformatTournamentFormatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__TournamentformatAssignment_6"


    // $ANTLR start "rule__Tournament__BracketsAssignment_9"
    // InternalMyDsl.g:8159:1: rule__Tournament__BracketsAssignment_9 : ( ruleBracket ) ;
    public final void rule__Tournament__BracketsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8163:1: ( ( ruleBracket ) )
            // InternalMyDsl.g:8164:2: ( ruleBracket )
            {
            // InternalMyDsl.g:8164:2: ( ruleBracket )
            // InternalMyDsl.g:8165:3: ruleBracket
            {
             before(grammarAccess.getTournamentAccess().getBracketsBracketParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getBracketsBracketParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__BracketsAssignment_9"


    // $ANTLR start "rule__Tournament__BracketsAssignment_10_1"
    // InternalMyDsl.g:8174:1: rule__Tournament__BracketsAssignment_10_1 : ( ruleBracket ) ;
    public final void rule__Tournament__BracketsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8178:1: ( ( ruleBracket ) )
            // InternalMyDsl.g:8179:2: ( ruleBracket )
            {
            // InternalMyDsl.g:8179:2: ( ruleBracket )
            // InternalMyDsl.g:8180:3: ruleBracket
            {
             before(grammarAccess.getTournamentAccess().getBracketsBracketParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getTournamentAccess().getBracketsBracketParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tournament__BracketsAssignment_10_1"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // InternalMyDsl.g:8189:1: rule__Team__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8193:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8194:2: ( ruleEString )
            {
            // InternalMyDsl.g:8194:2: ( ruleEString )
            // InternalMyDsl.g:8195:3: ruleEString
            {
             before(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__NameAssignment_1"


    // $ANTLR start "rule__Team__TeamSizeAssignment_3_1"
    // InternalMyDsl.g:8204:1: rule__Team__TeamSizeAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Team__TeamSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8208:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8209:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8209:2: ( ruleEInt )
            // InternalMyDsl.g:8210:3: ruleEInt
            {
             before(grammarAccess.getTeamAccess().getTeamSizeEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getTeamSizeEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__TeamSizeAssignment_3_1"


    // $ANTLR start "rule__Team__ManagerNameAssignment_4_1"
    // InternalMyDsl.g:8219:1: rule__Team__ManagerNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Team__ManagerNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8223:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8224:2: ( ruleEString )
            {
            // InternalMyDsl.g:8224:2: ( ruleEString )
            // InternalMyDsl.g:8225:3: ruleEString
            {
             before(grammarAccess.getTeamAccess().getManagerNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getManagerNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__ManagerNameAssignment_4_1"


    // $ANTLR start "rule__Team__PlayersAssignment_7"
    // InternalMyDsl.g:8234:1: rule__Team__PlayersAssignment_7 : ( rulePlayer ) ;
    public final void rule__Team__PlayersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8238:1: ( ( rulePlayer ) )
            // InternalMyDsl.g:8239:2: ( rulePlayer )
            {
            // InternalMyDsl.g:8239:2: ( rulePlayer )
            // InternalMyDsl.g:8240:3: rulePlayer
            {
             before(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__PlayersAssignment_7"


    // $ANTLR start "rule__Team__PlayersAssignment_8_1"
    // InternalMyDsl.g:8249:1: rule__Team__PlayersAssignment_8_1 : ( rulePlayer ) ;
    public final void rule__Team__PlayersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8253:1: ( ( rulePlayer ) )
            // InternalMyDsl.g:8254:2: ( rulePlayer )
            {
            // InternalMyDsl.g:8254:2: ( rulePlayer )
            // InternalMyDsl.g:8255:3: rulePlayer
            {
             before(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayer();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getPlayersPlayerParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__PlayersAssignment_8_1"


    // $ANTLR start "rule__Bracket__RoundsAssignment_2_1"
    // InternalMyDsl.g:8264:1: rule__Bracket__RoundsAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Bracket__RoundsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8268:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8269:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8269:2: ( ruleEInt )
            // InternalMyDsl.g:8270:3: ruleEInt
            {
             before(grammarAccess.getBracketAccess().getRoundsEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getRoundsEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__RoundsAssignment_2_1"


    // $ANTLR start "rule__Bracket__BracketSideAssignment_3_1"
    // InternalMyDsl.g:8279:1: rule__Bracket__BracketSideAssignment_3_1 : ( ruleBracketSide ) ;
    public final void rule__Bracket__BracketSideAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8283:1: ( ( ruleBracketSide ) )
            // InternalMyDsl.g:8284:2: ( ruleBracketSide )
            {
            // InternalMyDsl.g:8284:2: ( ruleBracketSide )
            // InternalMyDsl.g:8285:3: ruleBracketSide
            {
             before(grammarAccess.getBracketAccess().getBracketSideBracketSideEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracketSide();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getBracketSideBracketSideEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__BracketSideAssignment_3_1"


    // $ANTLR start "rule__Bracket__MatchesAssignment_6"
    // InternalMyDsl.g:8294:1: rule__Bracket__MatchesAssignment_6 : ( ruleMatch ) ;
    public final void rule__Bracket__MatchesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8298:1: ( ( ruleMatch ) )
            // InternalMyDsl.g:8299:2: ( ruleMatch )
            {
            // InternalMyDsl.g:8299:2: ( ruleMatch )
            // InternalMyDsl.g:8300:3: ruleMatch
            {
             before(grammarAccess.getBracketAccess().getMatchesMatchParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getMatchesMatchParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__MatchesAssignment_6"


    // $ANTLR start "rule__Bracket__MatchesAssignment_7_1"
    // InternalMyDsl.g:8309:1: rule__Bracket__MatchesAssignment_7_1 : ( ruleMatch ) ;
    public final void rule__Bracket__MatchesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8313:1: ( ( ruleMatch ) )
            // InternalMyDsl.g:8314:2: ( ruleMatch )
            {
            // InternalMyDsl.g:8314:2: ( ruleMatch )
            // InternalMyDsl.g:8315:3: ruleMatch
            {
             before(grammarAccess.getBracketAccess().getMatchesMatchParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatch();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getMatchesMatchParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__MatchesAssignment_7_1"


    // $ANTLR start "rule__Player__NameAssignment_1"
    // InternalMyDsl.g:8324:1: rule__Player__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Player__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8328:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8329:2: ( ruleEString )
            {
            // InternalMyDsl.g:8329:2: ( ruleEString )
            // InternalMyDsl.g:8330:3: ruleEString
            {
             before(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NameAssignment_1"


    // $ANTLR start "rule__Player__PositionAssignment_3_1"
    // InternalMyDsl.g:8339:1: rule__Player__PositionAssignment_3_1 : ( rulePlayerPosition ) ;
    public final void rule__Player__PositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8343:1: ( ( rulePlayerPosition ) )
            // InternalMyDsl.g:8344:2: ( rulePlayerPosition )
            {
            // InternalMyDsl.g:8344:2: ( rulePlayerPosition )
            // InternalMyDsl.g:8345:3: rulePlayerPosition
            {
             before(grammarAccess.getPlayerAccess().getPositionPlayerPositionEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerPosition();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getPositionPlayerPositionEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__PositionAssignment_3_1"


    // $ANTLR start "rule__Player__BirthDateAssignment_4_1"
    // InternalMyDsl.g:8354:1: rule__Player__BirthDateAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Player__BirthDateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8358:1: ( ( ruleEDate ) )
            // InternalMyDsl.g:8359:2: ( ruleEDate )
            {
            // InternalMyDsl.g:8359:2: ( ruleEDate )
            // InternalMyDsl.g:8360:3: ruleEDate
            {
             before(grammarAccess.getPlayerAccess().getBirthDateEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getBirthDateEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__BirthDateAssignment_4_1"


    // $ANTLR start "rule__Player__NumberAssignment_5_1"
    // InternalMyDsl.g:8369:1: rule__Player__NumberAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Player__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8373:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8374:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8374:2: ( ruleEInt )
            // InternalMyDsl.g:8375:3: ruleEInt
            {
             before(grammarAccess.getPlayerAccess().getNumberEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getNumberEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__NumberAssignment_5_1"


    // $ANTLR start "rule__Player__PlayerstatisticsAssignment_7"
    // InternalMyDsl.g:8384:1: rule__Player__PlayerstatisticsAssignment_7 : ( rulePlayerStatistics ) ;
    public final void rule__Player__PlayerstatisticsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8388:1: ( ( rulePlayerStatistics ) )
            // InternalMyDsl.g:8389:2: ( rulePlayerStatistics )
            {
            // InternalMyDsl.g:8389:2: ( rulePlayerStatistics )
            // InternalMyDsl.g:8390:3: rulePlayerStatistics
            {
             before(grammarAccess.getPlayerAccess().getPlayerstatisticsPlayerStatisticsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePlayerStatistics();

            state._fsp--;

             after(grammarAccess.getPlayerAccess().getPlayerstatisticsPlayerStatisticsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Player__PlayerstatisticsAssignment_7"


    // $ANTLR start "rule__Defender__GoalsAssignment_3_1"
    // InternalMyDsl.g:8399:1: rule__Defender__GoalsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Defender__GoalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8403:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8404:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8404:2: ( ruleEInt )
            // InternalMyDsl.g:8405:3: ruleEInt
            {
             before(grammarAccess.getDefenderAccess().getGoalsEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getGoalsEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__GoalsAssignment_3_1"


    // $ANTLR start "rule__Defender__AssistsAssignment_4_1"
    // InternalMyDsl.g:8414:1: rule__Defender__AssistsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Defender__AssistsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8418:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8419:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8419:2: ( ruleEInt )
            // InternalMyDsl.g:8420:3: ruleEInt
            {
             before(grammarAccess.getDefenderAccess().getAssistsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getAssistsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__AssistsAssignment_4_1"


    // $ANTLR start "rule__Defender__FoulsAssignment_5_1"
    // InternalMyDsl.g:8429:1: rule__Defender__FoulsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Defender__FoulsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8433:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8434:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8434:2: ( ruleEInt )
            // InternalMyDsl.g:8435:3: ruleEInt
            {
             before(grammarAccess.getDefenderAccess().getFoulsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getFoulsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__FoulsAssignment_5_1"


    // $ANTLR start "rule__Defender__YellowCardsAssignment_6_1"
    // InternalMyDsl.g:8444:1: rule__Defender__YellowCardsAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Defender__YellowCardsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8448:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8449:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8449:2: ( ruleEInt )
            // InternalMyDsl.g:8450:3: ruleEInt
            {
             before(grammarAccess.getDefenderAccess().getYellowCardsEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getYellowCardsEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__YellowCardsAssignment_6_1"


    // $ANTLR start "rule__Defender__RedCardsAssignment_7_1"
    // InternalMyDsl.g:8459:1: rule__Defender__RedCardsAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Defender__RedCardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8463:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8464:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8464:2: ( ruleEInt )
            // InternalMyDsl.g:8465:3: ruleEInt
            {
             before(grammarAccess.getDefenderAccess().getRedCardsEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getRedCardsEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__RedCardsAssignment_7_1"


    // $ANTLR start "rule__Defender__CleansheetsAssignment_8_1"
    // InternalMyDsl.g:8474:1: rule__Defender__CleansheetsAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Defender__CleansheetsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8478:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8479:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8479:2: ( ruleEInt )
            // InternalMyDsl.g:8480:3: ruleEInt
            {
             before(grammarAccess.getDefenderAccess().getCleansheetsEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefenderAccess().getCleansheetsEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Defender__CleansheetsAssignment_8_1"


    // $ANTLR start "rule__Goalkeeper__GoalsAssignment_3_1"
    // InternalMyDsl.g:8489:1: rule__Goalkeeper__GoalsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__GoalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8493:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8494:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8494:2: ( ruleEInt )
            // InternalMyDsl.g:8495:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getGoalsEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getGoalsEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__GoalsAssignment_3_1"


    // $ANTLR start "rule__Goalkeeper__AssistsAssignment_4_1"
    // InternalMyDsl.g:8504:1: rule__Goalkeeper__AssistsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__AssistsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8508:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8509:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8509:2: ( ruleEInt )
            // InternalMyDsl.g:8510:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getAssistsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getAssistsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__AssistsAssignment_4_1"


    // $ANTLR start "rule__Goalkeeper__FoulsAssignment_5_1"
    // InternalMyDsl.g:8519:1: rule__Goalkeeper__FoulsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__FoulsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8523:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8524:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8524:2: ( ruleEInt )
            // InternalMyDsl.g:8525:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getFoulsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getFoulsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__FoulsAssignment_5_1"


    // $ANTLR start "rule__Goalkeeper__YellowCardsAssignment_6_1"
    // InternalMyDsl.g:8534:1: rule__Goalkeeper__YellowCardsAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__YellowCardsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8538:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8539:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8539:2: ( ruleEInt )
            // InternalMyDsl.g:8540:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getYellowCardsEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getYellowCardsEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__YellowCardsAssignment_6_1"


    // $ANTLR start "rule__Goalkeeper__RedCardsAssignment_7_1"
    // InternalMyDsl.g:8549:1: rule__Goalkeeper__RedCardsAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__RedCardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8553:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8554:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8554:2: ( ruleEInt )
            // InternalMyDsl.g:8555:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getRedCardsEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getRedCardsEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__RedCardsAssignment_7_1"


    // $ANTLR start "rule__Goalkeeper__CleansheetsAssignment_8_1"
    // InternalMyDsl.g:8564:1: rule__Goalkeeper__CleansheetsAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__CleansheetsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8568:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8569:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8569:2: ( ruleEInt )
            // InternalMyDsl.g:8570:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getCleansheetsEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getCleansheetsEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__CleansheetsAssignment_8_1"


    // $ANTLR start "rule__Goalkeeper__SavesAssignment_9_1"
    // InternalMyDsl.g:8579:1: rule__Goalkeeper__SavesAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__Goalkeeper__SavesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8583:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8584:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8584:2: ( ruleEInt )
            // InternalMyDsl.g:8585:3: ruleEInt
            {
             before(grammarAccess.getGoalkeeperAccess().getSavesEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGoalkeeperAccess().getSavesEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goalkeeper__SavesAssignment_9_1"


    // $ANTLR start "rule__Attacker__GoalsAssignment_3_1"
    // InternalMyDsl.g:8594:1: rule__Attacker__GoalsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Attacker__GoalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8598:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8599:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8599:2: ( ruleEInt )
            // InternalMyDsl.g:8600:3: ruleEInt
            {
             before(grammarAccess.getAttackerAccess().getGoalsEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getGoalsEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__GoalsAssignment_3_1"


    // $ANTLR start "rule__Attacker__AssistsAssignment_4_1"
    // InternalMyDsl.g:8609:1: rule__Attacker__AssistsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Attacker__AssistsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8613:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8614:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8614:2: ( ruleEInt )
            // InternalMyDsl.g:8615:3: ruleEInt
            {
             before(grammarAccess.getAttackerAccess().getAssistsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getAssistsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__AssistsAssignment_4_1"


    // $ANTLR start "rule__Attacker__FoulsAssignment_5_1"
    // InternalMyDsl.g:8624:1: rule__Attacker__FoulsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Attacker__FoulsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8628:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8629:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8629:2: ( ruleEInt )
            // InternalMyDsl.g:8630:3: ruleEInt
            {
             before(grammarAccess.getAttackerAccess().getFoulsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getFoulsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__FoulsAssignment_5_1"


    // $ANTLR start "rule__Attacker__YellowCardsAssignment_6_1"
    // InternalMyDsl.g:8639:1: rule__Attacker__YellowCardsAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Attacker__YellowCardsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8643:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8644:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8644:2: ( ruleEInt )
            // InternalMyDsl.g:8645:3: ruleEInt
            {
             before(grammarAccess.getAttackerAccess().getYellowCardsEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getYellowCardsEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__YellowCardsAssignment_6_1"


    // $ANTLR start "rule__Attacker__RedCardsAssignment_7_1"
    // InternalMyDsl.g:8654:1: rule__Attacker__RedCardsAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Attacker__RedCardsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8658:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8659:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8659:2: ( ruleEInt )
            // InternalMyDsl.g:8660:3: ruleEInt
            {
             before(grammarAccess.getAttackerAccess().getRedCardsEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getRedCardsEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__RedCardsAssignment_7_1"


    // $ANTLR start "rule__Attacker__SprintSpeedAssignment_8_1"
    // InternalMyDsl.g:8669:1: rule__Attacker__SprintSpeedAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Attacker__SprintSpeedAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8673:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8674:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8674:2: ( ruleEInt )
            // InternalMyDsl.g:8675:3: ruleEInt
            {
             before(grammarAccess.getAttackerAccess().getSprintSpeedEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttackerAccess().getSprintSpeedEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attacker__SprintSpeedAssignment_8_1"


    // $ANTLR start "rule__League__NameAssignment_2"
    // InternalMyDsl.g:8684:1: rule__League__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__League__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8688:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8689:2: ( ruleEString )
            {
            // InternalMyDsl.g:8689:2: ( ruleEString )
            // InternalMyDsl.g:8690:3: ruleEString
            {
             before(grammarAccess.getLeagueAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__NameAssignment_2"


    // $ANTLR start "rule__League__MaxTeamsAssignment_4_1"
    // InternalMyDsl.g:8699:1: rule__League__MaxTeamsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__League__MaxTeamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8703:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8704:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8704:2: ( ruleEInt )
            // InternalMyDsl.g:8705:3: ruleEInt
            {
             before(grammarAccess.getLeagueAccess().getMaxTeamsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getMaxTeamsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__MaxTeamsAssignment_4_1"


    // $ANTLR start "rule__League__MinTeamsAssignment_5_1"
    // InternalMyDsl.g:8714:1: rule__League__MinTeamsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__League__MinTeamsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8718:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8719:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8719:2: ( ruleEInt )
            // InternalMyDsl.g:8720:3: ruleEInt
            {
             before(grammarAccess.getLeagueAccess().getMinTeamsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getMinTeamsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__MinTeamsAssignment_5_1"


    // $ANTLR start "rule__League__DescriptionAssignment_6_1"
    // InternalMyDsl.g:8729:1: rule__League__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__League__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8733:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8734:2: ( ruleEString )
            {
            // InternalMyDsl.g:8734:2: ( ruleEString )
            // InternalMyDsl.g:8735:3: ruleEString
            {
             before(grammarAccess.getLeagueAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__DescriptionAssignment_6_1"


    // $ANTLR start "rule__League__NumberOfRoundsAssignment_7_1"
    // InternalMyDsl.g:8744:1: rule__League__NumberOfRoundsAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__League__NumberOfRoundsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8748:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8749:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8749:2: ( ruleEInt )
            // InternalMyDsl.g:8750:3: ruleEInt
            {
             before(grammarAccess.getLeagueAccess().getNumberOfRoundsEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getNumberOfRoundsEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__NumberOfRoundsAssignment_7_1"


    // $ANTLR start "rule__League__FinalsFormatAssignment_8_1"
    // InternalMyDsl.g:8759:1: rule__League__FinalsFormatAssignment_8_1 : ( ruleFinalsFormat ) ;
    public final void rule__League__FinalsFormatAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8763:1: ( ( ruleFinalsFormat ) )
            // InternalMyDsl.g:8764:2: ( ruleFinalsFormat )
            {
            // InternalMyDsl.g:8764:2: ( ruleFinalsFormat )
            // InternalMyDsl.g:8765:3: ruleFinalsFormat
            {
             before(grammarAccess.getLeagueAccess().getFinalsFormatFinalsFormatEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFinalsFormat();

            state._fsp--;

             after(grammarAccess.getLeagueAccess().getFinalsFormatFinalsFormatEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__League__FinalsFormatAssignment_8_1"


    // $ANTLR start "rule__RoundRobin__NameAssignment_2"
    // InternalMyDsl.g:8774:1: rule__RoundRobin__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoundRobin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8778:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8779:2: ( ruleEString )
            {
            // InternalMyDsl.g:8779:2: ( ruleEString )
            // InternalMyDsl.g:8780:3: ruleEString
            {
             before(grammarAccess.getRoundRobinAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__NameAssignment_2"


    // $ANTLR start "rule__RoundRobin__MaxTeamsAssignment_4_1"
    // InternalMyDsl.g:8789:1: rule__RoundRobin__MaxTeamsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__RoundRobin__MaxTeamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8793:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8794:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8794:2: ( ruleEInt )
            // InternalMyDsl.g:8795:3: ruleEInt
            {
             before(grammarAccess.getRoundRobinAccess().getMaxTeamsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getMaxTeamsEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__MaxTeamsAssignment_4_1"


    // $ANTLR start "rule__RoundRobin__MinTeamsAssignment_5_1"
    // InternalMyDsl.g:8804:1: rule__RoundRobin__MinTeamsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__RoundRobin__MinTeamsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8808:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8809:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8809:2: ( ruleEInt )
            // InternalMyDsl.g:8810:3: ruleEInt
            {
             before(grammarAccess.getRoundRobinAccess().getMinTeamsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getMinTeamsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__MinTeamsAssignment_5_1"


    // $ANTLR start "rule__RoundRobin__DescriptionAssignment_6_1"
    // InternalMyDsl.g:8819:1: rule__RoundRobin__DescriptionAssignment_6_1 : ( ruleEString ) ;
    public final void rule__RoundRobin__DescriptionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8823:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8824:2: ( ruleEString )
            {
            // InternalMyDsl.g:8824:2: ( ruleEString )
            // InternalMyDsl.g:8825:3: ruleEString
            {
             before(grammarAccess.getRoundRobinAccess().getDescriptionEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getDescriptionEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__DescriptionAssignment_6_1"


    // $ANTLR start "rule__RoundRobin__PointsForWinAssignment_7_1"
    // InternalMyDsl.g:8834:1: rule__RoundRobin__PointsForWinAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__RoundRobin__PointsForWinAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8838:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8839:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8839:2: ( ruleEInt )
            // InternalMyDsl.g:8840:3: ruleEInt
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForWinEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getPointsForWinEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__PointsForWinAssignment_7_1"


    // $ANTLR start "rule__RoundRobin__PointsForDrawAssignment_8_1"
    // InternalMyDsl.g:8849:1: rule__RoundRobin__PointsForDrawAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__RoundRobin__PointsForDrawAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8853:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8854:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8854:2: ( ruleEInt )
            // InternalMyDsl.g:8855:3: ruleEInt
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForDrawEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getPointsForDrawEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__PointsForDrawAssignment_8_1"


    // $ANTLR start "rule__RoundRobin__PointsForLossAssignment_9_1"
    // InternalMyDsl.g:8864:1: rule__RoundRobin__PointsForLossAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__RoundRobin__PointsForLossAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8868:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8869:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8869:2: ( ruleEInt )
            // InternalMyDsl.g:8870:3: ruleEInt
            {
             before(grammarAccess.getRoundRobinAccess().getPointsForLossEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getPointsForLossEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__PointsForLossAssignment_9_1"


    // $ANTLR start "rule__RoundRobin__NumberOfRoundsAssignment_10_1"
    // InternalMyDsl.g:8879:1: rule__RoundRobin__NumberOfRoundsAssignment_10_1 : ( ruleEInt ) ;
    public final void rule__RoundRobin__NumberOfRoundsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8883:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8884:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8884:2: ( ruleEInt )
            // InternalMyDsl.g:8885:3: ruleEInt
            {
             before(grammarAccess.getRoundRobinAccess().getNumberOfRoundsEIntParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getNumberOfRoundsEIntParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__NumberOfRoundsAssignment_10_1"


    // $ANTLR start "rule__RoundRobin__TieBreakerRuleAssignment_11_1"
    // InternalMyDsl.g:8894:1: rule__RoundRobin__TieBreakerRuleAssignment_11_1 : ( ruleTieBreakerRule ) ;
    public final void rule__RoundRobin__TieBreakerRuleAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8898:1: ( ( ruleTieBreakerRule ) )
            // InternalMyDsl.g:8899:2: ( ruleTieBreakerRule )
            {
            // InternalMyDsl.g:8899:2: ( ruleTieBreakerRule )
            // InternalMyDsl.g:8900:3: ruleTieBreakerRule
            {
             before(grammarAccess.getRoundRobinAccess().getTieBreakerRuleTieBreakerRuleEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTieBreakerRule();

            state._fsp--;

             after(grammarAccess.getRoundRobinAccess().getTieBreakerRuleTieBreakerRuleEnumRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoundRobin__TieBreakerRuleAssignment_11_1"


    // $ANTLR start "rule__Knockout__HasThirdPlacePlayoffAssignment_1"
    // InternalMyDsl.g:8909:1: rule__Knockout__HasThirdPlacePlayoffAssignment_1 : ( ( 'hasThirdPlacePlayoff' ) ) ;
    public final void rule__Knockout__HasThirdPlacePlayoffAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8913:1: ( ( ( 'hasThirdPlacePlayoff' ) ) )
            // InternalMyDsl.g:8914:2: ( ( 'hasThirdPlacePlayoff' ) )
            {
            // InternalMyDsl.g:8914:2: ( ( 'hasThirdPlacePlayoff' ) )
            // InternalMyDsl.g:8915:3: ( 'hasThirdPlacePlayoff' )
            {
             before(grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffHasThirdPlacePlayoffKeyword_1_0()); 
            // InternalMyDsl.g:8916:3: ( 'hasThirdPlacePlayoff' )
            // InternalMyDsl.g:8917:4: 'hasThirdPlacePlayoff'
            {
             before(grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffHasThirdPlacePlayoffKeyword_1_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffHasThirdPlacePlayoffKeyword_1_0()); 

            }

             after(grammarAccess.getKnockoutAccess().getHasThirdPlacePlayoffHasThirdPlacePlayoffKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__HasThirdPlacePlayoffAssignment_1"


    // $ANTLR start "rule__Knockout__NameAssignment_3"
    // InternalMyDsl.g:8928:1: rule__Knockout__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Knockout__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8932:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8933:2: ( ruleEString )
            {
            // InternalMyDsl.g:8933:2: ( ruleEString )
            // InternalMyDsl.g:8934:3: ruleEString
            {
             before(grammarAccess.getKnockoutAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKnockoutAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__NameAssignment_3"


    // $ANTLR start "rule__Knockout__MaxTeamsAssignment_5_1"
    // InternalMyDsl.g:8943:1: rule__Knockout__MaxTeamsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Knockout__MaxTeamsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8947:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8948:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8948:2: ( ruleEInt )
            // InternalMyDsl.g:8949:3: ruleEInt
            {
             before(grammarAccess.getKnockoutAccess().getMaxTeamsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getKnockoutAccess().getMaxTeamsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__MaxTeamsAssignment_5_1"


    // $ANTLR start "rule__Knockout__MinTeamsAssignment_6_1"
    // InternalMyDsl.g:8958:1: rule__Knockout__MinTeamsAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Knockout__MinTeamsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8962:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8963:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8963:2: ( ruleEInt )
            // InternalMyDsl.g:8964:3: ruleEInt
            {
             before(grammarAccess.getKnockoutAccess().getMinTeamsEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getKnockoutAccess().getMinTeamsEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__MinTeamsAssignment_6_1"


    // $ANTLR start "rule__Knockout__DescriptionAssignment_7_1"
    // InternalMyDsl.g:8973:1: rule__Knockout__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__Knockout__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8977:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8978:2: ( ruleEString )
            {
            // InternalMyDsl.g:8978:2: ( ruleEString )
            // InternalMyDsl.g:8979:3: ruleEString
            {
             before(grammarAccess.getKnockoutAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKnockoutAccess().getDescriptionEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__DescriptionAssignment_7_1"


    // $ANTLR start "rule__Knockout__NumberOfRoundsAssignment_8_1"
    // InternalMyDsl.g:8988:1: rule__Knockout__NumberOfRoundsAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Knockout__NumberOfRoundsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8992:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8993:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8993:2: ( ruleEInt )
            // InternalMyDsl.g:8994:3: ruleEInt
            {
             before(grammarAccess.getKnockoutAccess().getNumberOfRoundsEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getKnockoutAccess().getNumberOfRoundsEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knockout__NumberOfRoundsAssignment_8_1"


    // $ANTLR start "rule__Match__ScoreTeam1Assignment_2_1"
    // InternalMyDsl.g:9003:1: rule__Match__ScoreTeam1Assignment_2_1 : ( ruleEInt ) ;
    public final void rule__Match__ScoreTeam1Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9007:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:9008:2: ( ruleEInt )
            {
            // InternalMyDsl.g:9008:2: ( ruleEInt )
            // InternalMyDsl.g:9009:3: ruleEInt
            {
             before(grammarAccess.getMatchAccess().getScoreTeam1EIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getScoreTeam1EIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__ScoreTeam1Assignment_2_1"


    // $ANTLR start "rule__Match__ScoreTeam2Assignment_3_1"
    // InternalMyDsl.g:9018:1: rule__Match__ScoreTeam2Assignment_3_1 : ( ruleEInt ) ;
    public final void rule__Match__ScoreTeam2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9022:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:9023:2: ( ruleEInt )
            {
            // InternalMyDsl.g:9023:2: ( ruleEInt )
            // InternalMyDsl.g:9024:3: ruleEInt
            {
             before(grammarAccess.getMatchAccess().getScoreTeam2EIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getScoreTeam2EIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__ScoreTeam2Assignment_3_1"


    // $ANTLR start "rule__Match__MatchResultAssignment_4_1"
    // InternalMyDsl.g:9033:1: rule__Match__MatchResultAssignment_4_1 : ( ruleMatchResult ) ;
    public final void rule__Match__MatchResultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9037:1: ( ( ruleMatchResult ) )
            // InternalMyDsl.g:9038:2: ( ruleMatchResult )
            {
            // InternalMyDsl.g:9038:2: ( ruleMatchResult )
            // InternalMyDsl.g:9039:3: ruleMatchResult
            {
             before(grammarAccess.getMatchAccess().getMatchResultMatchResultEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchResult();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getMatchResultMatchResultEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__MatchResultAssignment_4_1"


    // $ANTLR start "rule__Match__DayAssignment_5_1"
    // InternalMyDsl.g:9048:1: rule__Match__DayAssignment_5_1 : ( ruleEDate ) ;
    public final void rule__Match__DayAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9052:1: ( ( ruleEDate ) )
            // InternalMyDsl.g:9053:2: ( ruleEDate )
            {
            // InternalMyDsl.g:9053:2: ( ruleEDate )
            // InternalMyDsl.g:9054:3: ruleEDate
            {
             before(grammarAccess.getMatchAccess().getDayEDateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getDayEDateParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__DayAssignment_5_1"


    // $ANTLR start "rule__Match__TeamsAssignment_8"
    // InternalMyDsl.g:9063:1: rule__Match__TeamsAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Match__TeamsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9067:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9068:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9068:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9069:3: ( ruleEString )
            {
             before(grammarAccess.getMatchAccess().getTeamsTeamCrossReference_8_0()); 
            // InternalMyDsl.g:9070:3: ( ruleEString )
            // InternalMyDsl.g:9071:4: ruleEString
            {
             before(grammarAccess.getMatchAccess().getTeamsTeamEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getTeamsTeamEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getMatchAccess().getTeamsTeamCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__TeamsAssignment_8"


    // $ANTLR start "rule__Match__TeamsAssignment_9_1"
    // InternalMyDsl.g:9082:1: rule__Match__TeamsAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__Match__TeamsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9086:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9087:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9087:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9088:3: ( ruleEString )
            {
             before(grammarAccess.getMatchAccess().getTeamsTeamCrossReference_9_1_0()); 
            // InternalMyDsl.g:9089:3: ( ruleEString )
            // InternalMyDsl.g:9090:4: ruleEString
            {
             before(grammarAccess.getMatchAccess().getTeamsTeamEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getTeamsTeamEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getMatchAccess().getTeamsTeamCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__TeamsAssignment_9_1"


    // $ANTLR start "rule__Match__MatchrulesAssignment_12"
    // InternalMyDsl.g:9101:1: rule__Match__MatchrulesAssignment_12 : ( ruleMatchRules ) ;
    public final void rule__Match__MatchrulesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9105:1: ( ( ruleMatchRules ) )
            // InternalMyDsl.g:9106:2: ( ruleMatchRules )
            {
            // InternalMyDsl.g:9106:2: ( ruleMatchRules )
            // InternalMyDsl.g:9107:3: ruleMatchRules
            {
             before(grammarAccess.getMatchAccess().getMatchrulesMatchRulesParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMatchRules();

            state._fsp--;

             after(grammarAccess.getMatchAccess().getMatchrulesMatchRulesParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Match__MatchrulesAssignment_12"


    // $ANTLR start "rule__Standard__TieBreakingAssignment_1"
    // InternalMyDsl.g:9116:1: rule__Standard__TieBreakingAssignment_1 : ( ( 'tieBreaking' ) ) ;
    public final void rule__Standard__TieBreakingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9120:1: ( ( ( 'tieBreaking' ) ) )
            // InternalMyDsl.g:9121:2: ( ( 'tieBreaking' ) )
            {
            // InternalMyDsl.g:9121:2: ( ( 'tieBreaking' ) )
            // InternalMyDsl.g:9122:3: ( 'tieBreaking' )
            {
             before(grammarAccess.getStandardAccess().getTieBreakingTieBreakingKeyword_1_0()); 
            // InternalMyDsl.g:9123:3: ( 'tieBreaking' )
            // InternalMyDsl.g:9124:4: 'tieBreaking'
            {
             before(grammarAccess.getStandardAccess().getTieBreakingTieBreakingKeyword_1_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getStandardAccess().getTieBreakingTieBreakingKeyword_1_0()); 

            }

             after(grammarAccess.getStandardAccess().getTieBreakingTieBreakingKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__TieBreakingAssignment_1"


    // $ANTLR start "rule__Standard__ExtraTimeAssignment_2"
    // InternalMyDsl.g:9135:1: rule__Standard__ExtraTimeAssignment_2 : ( ( 'extraTime' ) ) ;
    public final void rule__Standard__ExtraTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9139:1: ( ( ( 'extraTime' ) ) )
            // InternalMyDsl.g:9140:2: ( ( 'extraTime' ) )
            {
            // InternalMyDsl.g:9140:2: ( ( 'extraTime' ) )
            // InternalMyDsl.g:9141:3: ( 'extraTime' )
            {
             before(grammarAccess.getStandardAccess().getExtraTimeExtraTimeKeyword_2_0()); 
            // InternalMyDsl.g:9142:3: ( 'extraTime' )
            // InternalMyDsl.g:9143:4: 'extraTime'
            {
             before(grammarAccess.getStandardAccess().getExtraTimeExtraTimeKeyword_2_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getStandardAccess().getExtraTimeExtraTimeKeyword_2_0()); 

            }

             after(grammarAccess.getStandardAccess().getExtraTimeExtraTimeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__ExtraTimeAssignment_2"


    // $ANTLR start "rule__Standard__PenaltyShootoutsAssignment_3"
    // InternalMyDsl.g:9154:1: rule__Standard__PenaltyShootoutsAssignment_3 : ( ( 'penaltyShootouts' ) ) ;
    public final void rule__Standard__PenaltyShootoutsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9158:1: ( ( ( 'penaltyShootouts' ) ) )
            // InternalMyDsl.g:9159:2: ( ( 'penaltyShootouts' ) )
            {
            // InternalMyDsl.g:9159:2: ( ( 'penaltyShootouts' ) )
            // InternalMyDsl.g:9160:3: ( 'penaltyShootouts' )
            {
             before(grammarAccess.getStandardAccess().getPenaltyShootoutsPenaltyShootoutsKeyword_3_0()); 
            // InternalMyDsl.g:9161:3: ( 'penaltyShootouts' )
            // InternalMyDsl.g:9162:4: 'penaltyShootouts'
            {
             before(grammarAccess.getStandardAccess().getPenaltyShootoutsPenaltyShootoutsKeyword_3_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getStandardAccess().getPenaltyShootoutsPenaltyShootoutsKeyword_3_0()); 

            }

             after(grammarAccess.getStandardAccess().getPenaltyShootoutsPenaltyShootoutsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Standard__PenaltyShootoutsAssignment_3"


    // $ANTLR start "rule__ExtraTime__ExtraTimeAssignment_3_1"
    // InternalMyDsl.g:9173:1: rule__ExtraTime__ExtraTimeAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__ExtraTime__ExtraTimeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9177:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:9178:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:9178:2: ( ruleEBoolean )
            // InternalMyDsl.g:9179:3: ruleEBoolean
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getExtraTimeAccess().getExtraTimeEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__ExtraTimeAssignment_3_1"


    // $ANTLR start "rule__ExtraTime__ExtraTimeDurationAssignment_4_1"
    // InternalMyDsl.g:9188:1: rule__ExtraTime__ExtraTimeDurationAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ExtraTime__ExtraTimeDurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9192:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:9193:2: ( ruleEInt )
            {
            // InternalMyDsl.g:9193:2: ( ruleEInt )
            // InternalMyDsl.g:9194:3: ruleEInt
            {
             before(grammarAccess.getExtraTimeAccess().getExtraTimeDurationEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExtraTimeAccess().getExtraTimeDurationEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraTime__ExtraTimeDurationAssignment_4_1"


    // $ANTLR start "rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1"
    // InternalMyDsl.g:9203:1: rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9207:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:9208:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:9208:2: ( ruleEBoolean )
            // InternalMyDsl.g:9209:3: ruleEBoolean
            {
             before(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getPenaltyShootoutAccess().getPenaltyShootoutsEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PenaltyShootout__PenaltyShootoutsAssignment_3_1"


    // $ANTLR start "rule__GroupStage__TieBreakingAssignment_3_1"
    // InternalMyDsl.g:9218:1: rule__GroupStage__TieBreakingAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__GroupStage__TieBreakingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9222:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:9223:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:9223:2: ( ruleEBoolean )
            // InternalMyDsl.g:9224:3: ruleEBoolean
            {
             before(grammarAccess.getGroupStageAccess().getTieBreakingEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getGroupStageAccess().getTieBreakingEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupStage__TieBreakingAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000003200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000841L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x5020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0FC0000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2FC0000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x87C0000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000088L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000004000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x000000000F700000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x000000000A500000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000800000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000800000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000800000000L,0x0000000008000000L});

}