/*
 * generated by Xtext 2.13.0
 */
package beleg.serializer;

import beleg.s78154S78236.Atom;
import beleg.s78154S78236.Clause;
import beleg.s78154S78236.EAtom;
import beleg.s78154S78236.EFolge;
import beleg.s78154S78236.EList;
import beleg.s78154S78236.EPredicate;
import beleg.s78154S78236.ETerm;
import beleg.s78154S78236.EVar;
import beleg.s78154S78236.EmptyList;
import beleg.s78154S78236.Exquery;
import beleg.s78154S78236.Fact;
import beleg.s78154S78236.Folge;
import beleg.s78154S78236.Functor;
import beleg.s78154S78236.Ident;
import beleg.s78154S78236.List;
import beleg.s78154S78236.Model;
import beleg.s78154S78236.NonEmptyList;
import beleg.s78154S78236.Predicate;
import beleg.s78154S78236.Program;
import beleg.s78154S78236.PrologDsl;
import beleg.s78154S78236.Query;
import beleg.s78154S78236.Rule;
import beleg.s78154S78236.S78154S78236Package;
import beleg.s78154S78236.Term;
import beleg.services.S78154S78236GrammarAccess;
import com.google.inject.Inject;
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
public class S78154S78236SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private S78154S78236GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == S78154S78236Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case S78154S78236Package.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case S78154S78236Package.CLAUSE:
				sequence_Clause(context, (Clause) semanticObject); 
				return; 
			case S78154S78236Package.EATOM:
				sequence_EAtom(context, (EAtom) semanticObject); 
				return; 
			case S78154S78236Package.EFOLGE:
				sequence_EFolge(context, (EFolge) semanticObject); 
				return; 
			case S78154S78236Package.ELIST:
				sequence_EList(context, (EList) semanticObject); 
				return; 
			case S78154S78236Package.EPREDICATE:
				sequence_EPredicate(context, (EPredicate) semanticObject); 
				return; 
			case S78154S78236Package.ETERM:
				sequence_ETerm(context, (ETerm) semanticObject); 
				return; 
			case S78154S78236Package.EVAR:
				sequence_EVar(context, (EVar) semanticObject); 
				return; 
			case S78154S78236Package.EMPTY_LIST:
				sequence_EmptyList(context, (EmptyList) semanticObject); 
				return; 
			case S78154S78236Package.EXQUERY:
				sequence_Exquery(context, (Exquery) semanticObject); 
				return; 
			case S78154S78236Package.FACT:
				sequence_Fact(context, (Fact) semanticObject); 
				return; 
			case S78154S78236Package.FOLGE:
				sequence_Folge(context, (Folge) semanticObject); 
				return; 
			case S78154S78236Package.FUNCTOR:
				sequence_Functor(context, (Functor) semanticObject); 
				return; 
			case S78154S78236Package.IDENT:
				sequence_Ident(context, (Ident) semanticObject); 
				return; 
			case S78154S78236Package.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case S78154S78236Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case S78154S78236Package.NON_EMPTY_LIST:
				sequence_NonEmptyList(context, (NonEmptyList) semanticObject); 
				return; 
			case S78154S78236Package.PREDICATE:
				sequence_Predicate(context, (Predicate) semanticObject); 
				return; 
			case S78154S78236Package.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case S78154S78236Package.PROLOG_DSL:
				sequence_PrologDsl(context, (PrologDsl) semanticObject); 
				return; 
			case S78154S78236Package.QUERY:
				sequence_Query(context, (Query) semanticObject); 
				return; 
			case S78154S78236Package.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case S78154S78236Package.TERM:
				sequence_Term(context, (Term) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Atom returns Atom
	 *
	 * Constraint:
	 *     (ident=Ident | number=NUMBER | evar=EVar)
	 */
	protected void sequence_Atom(ISerializationContext context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Clause returns Clause
	 *
	 * Constraint:
	 *     (predicate=Predicate (fact=Fact | rule=Rule))
	 */
	protected void sequence_Clause(ISerializationContext context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EAtom returns EAtom
	 *
	 * Constraint:
	 *     atom=Atom
	 */
	protected void sequence_EAtom(ISerializationContext context, EAtom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.EATOM__ATOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.EATOM__ATOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEAtomAccess().getAtomAtomParserRuleCall_1_0(), semanticObject.getAtom());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EFolge returns EFolge
	 *
	 * Constraint:
	 *     folge=Folge
	 */
	protected void sequence_EFolge(ISerializationContext context, EFolge semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.EFOLGE__FOLGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.EFOLGE__FOLGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEFolgeAccess().getFolgeFolgeParserRuleCall_1_0(), semanticObject.getFolge());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EList returns EList
	 *
	 * Constraint:
	 *     (atom=Atom term=Term)
	 */
	protected void sequence_EList(ISerializationContext context, EList semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.ELIST__ATOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.ELIST__ATOM));
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.ELIST__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.ELIST__TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEListAccess().getAtomAtomParserRuleCall_1_0(), semanticObject.getAtom());
		feeder.accept(grammarAccess.getEListAccess().getTermTermParserRuleCall_3_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EPredicate returns EPredicate
	 *
	 * Constraint:
	 *     predicate=Predicate
	 */
	protected void sequence_EPredicate(ISerializationContext context, EPredicate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.EPREDICATE__PREDICATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.EPREDICATE__PREDICATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEPredicateAccess().getPredicatePredicateParserRuleCall_1_0(), semanticObject.getPredicate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ETerm returns ETerm
	 *
	 * Constraint:
	 *     term=Term
	 */
	protected void sequence_ETerm(ISerializationContext context, ETerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.ETERM__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.ETERM__TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getETermAccess().getTermTermParserRuleCall_1_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EVar returns EVar
	 *
	 * Constraint:
	 *     variable=VARIABLE
	 */
	protected void sequence_EVar(ISerializationContext context, EVar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.EVAR__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.EVAR__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEVarAccess().getVariableVARIABLETerminalRuleCall_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EmptyList returns EmptyList
	 *
	 * Constraint:
	 *     {EmptyList}
	 */
	protected void sequence_EmptyList(ISerializationContext context, EmptyList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exquery returns Exquery
	 *
	 * Constraint:
	 *     query=Query
	 */
	protected void sequence_Exquery(ISerializationContext context, Exquery semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.EXQUERY__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.EXQUERY__QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fact returns Fact
	 *
	 * Constraint:
	 *     {Fact}
	 */
	protected void sequence_Fact(ISerializationContext context, Fact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Folge returns Folge
	 *
	 * Constraint:
	 *     (atom=Atom eatoms+=EAtom*)
	 */
	protected void sequence_Folge(ISerializationContext context, Folge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Functor returns Functor
	 *
	 * Constraint:
	 *     ident=Ident
	 */
	protected void sequence_Functor(ISerializationContext context, Functor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.FUNCTOR__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.FUNCTOR__IDENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctorAccess().getIdentIdentParserRuleCall_0(), semanticObject.getIdent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Ident returns Ident
	 *
	 * Constraint:
	 *     ident=ID
	 */
	protected void sequence_Ident(ISerializationContext context, Ident semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.IDENT__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.IDENT__IDENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdentAccess().getIdentIDTerminalRuleCall_0(), semanticObject.getIdent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     List returns List
	 *
	 * Constraint:
	 *     (empty=EmptyList | nonEmptyList=NonEmptyList)
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     model+=PrologDsl+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NonEmptyList returns NonEmptyList
	 *
	 * Constraint:
	 *     (efolge=EFolge | elist=EList)
	 */
	protected void sequence_NonEmptyList(ISerializationContext context, NonEmptyList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Predicate returns Predicate
	 *
	 * Constraint:
	 *     (functor=Functor term=Term eterms+=ETerm*)
	 */
	protected void sequence_Predicate(ISerializationContext context, Predicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     clauses+=Clause+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrologDsl returns PrologDsl
	 *
	 * Constraint:
	 *     (program=Program exQuery=Exquery)
	 */
	protected void sequence_PrologDsl(ISerializationContext context, PrologDsl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.PROLOG_DSL__PROGRAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.PROLOG_DSL__PROGRAM));
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.PROLOG_DSL__EX_QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.PROLOG_DSL__EX_QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0(), semanticObject.getProgram());
		feeder.accept(grammarAccess.getPrologDslAccess().getExQueryExqueryParserRuleCall_1_0(), semanticObject.getExQuery());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Query returns Query
	 *
	 * Constraint:
	 *     (predicate=Predicate epredicates+=EPredicate*)
	 */
	protected void sequence_Query(ISerializationContext context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     query=Query
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, S78154S78236Package.Literals.RULE__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, S78154S78236Package.Literals.RULE__QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Term returns Term
	 *
	 * Constraint:
	 *     (atom=Atom | list=List)
	 */
	protected void sequence_Term(ISerializationContext context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
