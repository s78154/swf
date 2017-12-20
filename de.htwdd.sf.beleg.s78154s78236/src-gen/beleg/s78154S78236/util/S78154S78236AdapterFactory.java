/**
 * generated by Xtext 2.13.0
 */
package beleg.s78154S78236.util;

import beleg.s78154S78236.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see beleg.s78154S78236.S78154S78236Package
 * @generated
 */
public class S78154S78236AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static S78154S78236Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S78154S78236AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = S78154S78236Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected S78154S78236Switch<Adapter> modelSwitch =
    new S78154S78236Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePrologDsl(PrologDsl object)
      {
        return createPrologDslAdapter();
      }
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseExquery(Exquery object)
      {
        return createExqueryAdapter();
      }
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseEPredicate(EPredicate object)
      {
        return createEPredicateAdapter();
      }
      @Override
      public Adapter caseClause(Clause object)
      {
        return createClauseAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter caseFunctor(Functor object)
      {
        return createFunctorAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseETerm(ETerm object)
      {
        return createETermAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseEmptyList(EmptyList object)
      {
        return createEmptyListAdapter();
      }
      @Override
      public Adapter caseNonEmptyList(NonEmptyList object)
      {
        return createNonEmptyListAdapter();
      }
      @Override
      public Adapter caseFolge(Folge object)
      {
        return createFolgeAdapter();
      }
      @Override
      public Adapter caseEFolge(EFolge object)
      {
        return createEFolgeAdapter();
      }
      @Override
      public Adapter caseEList(EList object)
      {
        return createEListAdapter();
      }
      @Override
      public Adapter caseEAtom(EAtom object)
      {
        return createEAtomAdapter();
      }
      @Override
      public Adapter caseIdent(Ident object)
      {
        return createIdentAdapter();
      }
      @Override
      public Adapter caseEVar(EVar object)
      {
        return createEVarAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.PrologDsl <em>Prolog Dsl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.PrologDsl
   * @generated
   */
  public Adapter createPrologDslAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Exquery <em>Exquery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Exquery
   * @generated
   */
  public Adapter createExqueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.EPredicate <em>EPredicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.EPredicate
   * @generated
   */
  public Adapter createEPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Clause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Clause
   * @generated
   */
  public Adapter createClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Functor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Functor
   * @generated
   */
  public Adapter createFunctorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.ETerm <em>ETerm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.ETerm
   * @generated
   */
  public Adapter createETermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.EmptyList <em>Empty List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.EmptyList
   * @generated
   */
  public Adapter createEmptyListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.NonEmptyList <em>Non Empty List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.NonEmptyList
   * @generated
   */
  public Adapter createNonEmptyListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Folge <em>Folge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Folge
   * @generated
   */
  public Adapter createFolgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.EFolge <em>EFolge</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.EFolge
   * @generated
   */
  public Adapter createEFolgeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.EList <em>EList</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.EList
   * @generated
   */
  public Adapter createEListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.EAtom <em>EAtom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.EAtom
   * @generated
   */
  public Adapter createEAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.Ident <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.Ident
   * @generated
   */
  public Adapter createIdentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link beleg.s78154S78236.EVar <em>EVar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see beleg.s78154S78236.EVar
   * @generated
   */
  public Adapter createEVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //S78154S78236AdapterFactory