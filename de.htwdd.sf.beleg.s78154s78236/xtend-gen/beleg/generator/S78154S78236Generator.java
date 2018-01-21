/**
 * generated by Xtext 2.13.0
 */
package beleg.generator;

import beleg.s78154S78236.Atom;
import beleg.s78154S78236.Clause;
import beleg.s78154S78236.EAtom;
import beleg.s78154S78236.EFolge;
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
import beleg.s78154S78236.NonEmptyList;
import beleg.s78154S78236.Predicate;
import beleg.s78154S78236.Program;
import beleg.s78154S78236.PrologDsl;
import beleg.s78154S78236.Query;
import beleg.s78154S78236.Rule;
import beleg.s78154S78236.Term;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class S78154S78236Generator extends AbstractGenerator {
  private String code;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.code = "";
    System.out.println("Transformation gestartet");
    Iterable<PrologDsl> _filter = Iterables.<PrologDsl>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), PrologDsl.class);
    for (final PrologDsl e : _filter) {
      this.transform(e);
    }
    System.out.println(("Code: \n" + this.code));
    fsa.generateFile("beleg_prolog.lsp", this.code);
    System.out.println("Schreibvorgang beendet");
  }
  
  public String conc(final String str) {
    return this.code = (this.code + str);
  }
  
  public String transform(final PrologDsl d) {
    String _xblockexpression = null;
    {
      this.conc("(prolog (quote ");
      this.transform(d.getProgram());
      this.conc(")");
      this.newline();
      this.conc("(quote ");
      this.transform(d.getExQuery());
      _xblockexpression = this.conc("))");
    }
    return _xblockexpression;
  }
  
  public String transform(final Program p) {
    String _xblockexpression = null;
    {
      this.conc("(");
      EList<Clause> _clauses = p.getClauses();
      for (final Clause clause : _clauses) {
        this.transform(clause);
      }
      _xblockexpression = this.conc(")");
    }
    return _xblockexpression;
  }
  
  public String transform(final Query q) {
    String _xblockexpression = null;
    {
      this.conc("(");
      this.transform(q.getPredicate());
      EList<EPredicate> _epredicates = q.getEpredicates();
      for (final EPredicate predicate : _epredicates) {
        this.transform(predicate);
      }
      _xblockexpression = this.conc(")");
    }
    return _xblockexpression;
  }
  
  public String transform(final Exquery e) {
    return this.transform(e.getQuery());
  }
  
  public String transform(final Clause c) {
    String _xblockexpression = null;
    {
      this.conc("(");
      this.transform(c.getPredicate());
      String _xifexpression = null;
      Fact _fact = c.getFact();
      boolean _notEquals = (!Objects.equal(_fact, null));
      if (_notEquals) {
        String _xblockexpression_1 = null;
        {
          this.conc(")");
          _xblockexpression_1 = this.transform(c.getFact());
        }
        _xifexpression = _xblockexpression_1;
      } else {
        String _xifexpression_1 = null;
        Rule _rule = c.getRule();
        boolean _notEquals_1 = (!Objects.equal(_rule, null));
        if (_notEquals_1) {
          String _xblockexpression_2 = null;
          {
            this.transform(c.getRule());
            _xblockexpression_2 = this.conc(")");
          }
          _xifexpression_1 = _xblockexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String transform(final Fact f) {
    return this.newline();
  }
  
  public void transform(final Rule r) {
    this.transform(r.getQuery().getPredicate());
    EList<EPredicate> _epredicates = r.getQuery().getEpredicates();
    for (final EPredicate epredicate : _epredicates) {
      this.transform(epredicate);
    }
  }
  
  public String space() {
    return this.conc(" ");
  }
  
  public String newline() {
    return this.conc("\n");
  }
  
  public String transform(final Predicate p) {
    String _xblockexpression = null;
    {
      this.conc("(");
      this.transform(p.getFunctor());
      this.space();
      this.transform(p.getTerm());
      EList<ETerm> _eterms = p.getEterms();
      for (final ETerm eterm : _eterms) {
        {
          this.space();
          this.transform(eterm);
        }
      }
      _xblockexpression = this.conc(")");
    }
    return _xblockexpression;
  }
  
  public String transform(final EPredicate ep) {
    return this.transform(ep.getPredicate());
  }
  
  public String transform(final Functor f) {
    return this.transform(f.getIdent());
  }
  
  public String transform(final Term t) {
    String _xifexpression = null;
    Atom _atom = t.getAtom();
    boolean _notEquals = (!Objects.equal(_atom, null));
    if (_notEquals) {
      _xifexpression = this.transform(t.getAtom());
    } else {
      String _xifexpression_1 = null;
      List _list = t.getList();
      boolean _notEquals_1 = (!Objects.equal(_list, null));
      if (_notEquals_1) {
        _xifexpression_1 = this.transform(t.getList());
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String transform(final ETerm et) {
    return this.transform(et.getTerm());
  }
  
  public String transform(final Atom a) {
    String _xblockexpression = null;
    {
      Ident _ident = a.getIdent();
      boolean _notEquals = (!Objects.equal(_ident, null));
      if (_notEquals) {
        this.transform(a.getIdent());
      }
      String _number = a.getNumber();
      boolean _notEquals_1 = (!Objects.equal(_number, null));
      if (_notEquals_1) {
        this.conc(a.getNumber());
      }
      String _xifexpression = null;
      EVar _evar = a.getEvar();
      boolean _notEquals_2 = (!Objects.equal(_evar, null));
      if (_notEquals_2) {
        _xifexpression = this.transform(a.getEvar());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String transform(final EAtom ea) {
    return this.transform(ea.getAtom());
  }
  
  public String transform(final List l) {
    String _xifexpression = null;
    EmptyList _empty = l.getEmpty();
    boolean _notEquals = (!Objects.equal(_empty, null));
    if (_notEquals) {
      _xifexpression = this.transform(l.getEmpty());
    } else {
      _xifexpression = this.transform(l.getNonEmptyList());
    }
    return _xifexpression;
  }
  
  public String transform(final EmptyList e) {
    return this.conc("()");
  }
  
  public Object transform(final beleg.s78154S78236.EList el) {
    Object _xblockexpression = null;
    {
      this.transform(el.getAtom());
      this.space();
      _xblockexpression = this.transform(el.getTerm());
    }
    return _xblockexpression;
  }
  
  public String transform(final NonEmptyList n) {
    String _xifexpression = null;
    EFolge _efolge = n.getEfolge();
    boolean _notEquals = (!Objects.equal(_efolge, null));
    if (_notEquals) {
      _xifexpression = this.transform(n.getEfolge());
    } else {
      String _xifexpression_1 = null;
      beleg.s78154S78236.EList _elist = n.getElist();
      boolean _notEquals_1 = (!Objects.equal(_elist, null));
      if (_notEquals_1) {
        String _xblockexpression = null;
        {
          this.conc("(cons ");
          this.transform(n.getElist());
          _xblockexpression = this.conc(")");
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String transform(final Folge f) {
    String _xblockexpression = null;
    {
      this.conc("(cons ");
      this.transform(f.getAtom());
      this.space();
      EList<EAtom> _eatoms = f.getEatoms();
      for (final EAtom ea : _eatoms) {
        {
          this.conc("(cons ");
          this.transform(ea);
          this.space();
        }
      }
      this.conc("()");
      EList<EAtom> _eatoms_1 = f.getEatoms();
      for (final EAtom ea_1 : _eatoms_1) {
        this.conc(")");
      }
      _xblockexpression = this.conc(")");
    }
    return _xblockexpression;
  }
  
  public String transform(final EFolge ef) {
    return this.transform(ef.getFolge());
  }
  
  public String transform(final EVar v) {
    return this.conc(v.getVariable());
  }
  
  public String transform(final Ident i) {
    return this.conc(i.getIdent());
  }
}
