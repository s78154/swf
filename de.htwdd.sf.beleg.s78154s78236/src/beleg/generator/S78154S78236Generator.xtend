/*
 * generated by Xtext 2.13.0
 */
package beleg.generator

import beleg.s78154S78236.*
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.xbase.lib.IteratorExtensions;


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
@SuppressWarnings("all")
class S78154S78236Generator extends AbstractGenerator {

	String code
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		code = '';

		//gibt Tausende Seiten im Netz zu der Thematik von doGenerate und alle nutzen diese Vorgehensweise !!
		//die aus der Vorlesung funktioniert einfach nicht -> TreeIterator akzeptiert unerklärlicherweise kein EObject...
		System.out.println("Transformation gestartet")		
		for (e : resource.allContents.toIterable.filter(typeof(PrologDsl))) { 
			e.transform
		}
		System.out.println("Code: \r\n" + code)
		fsa.generateFile("beleg_prolog.lsp", code)
		System.out.println(resource.resourceSet.URIConverter.normalize(resource.URI.trimFileExtension.appendFileExtension("gen")).toFileString);
		System.out.println("Schreibvorgang beendet")
	}
	
	def conc(String str) {
		code = code + str;
	}
	
	//Eingangspunkt für Transformation
	def transform(PrologDsl d) {
		conc("(prolog (quote ")
		d.program.transform
		conc(")")
		newline()
		conc("(quote ")
		d.exQuery.transform
		conc("))")
	}
	
	def transform(Program p) {
		conc("(")
		for (clause : p.clauses)
			clause.transform
		conc(")")
	}
	
	def transform(Query q) {
		conc("(")
		q.predicate.transform
		for (predicate : q.epredicates)
			predicate.transform
		conc(")")
	}
	
	def transform(Exquery e) {
		e.query.transform
	}
	
		
	def transform(Clause c) {
		conc("(")
		c.predicate.transform
		conc(")")
		
		if (c.fact != null) {
			c.fact.transform
		}
		else if (c.rule != null) {
			c.rule.transform
		}
	}
	
	def transform(Fact f) {
		newline()
	}

	def transform(Rule r) {
		conc("(")
		r.query.predicate.transform
		for (epredicate : r.query.epredicates){
			epredicate.transform
		}
			
		conc(")")
	}
	
	def space(){
		conc(" ")
	}
	
	def newline(){
		conc("\r\n")
	}
	
	def transform(Predicate p) {
		conc("(")
		p.functor.transform
		space()
		p.term.transform
		for (eterm : p.eterms){
			space()
			eterm.transform
		}
		conc(")")
	}
	
	def transform(EPredicate ep){
		ep.predicate.transform
	}
	
	def transform(Functor f){
		f.ident.transform
	}
	

	def transform(Term t) {
		if (t.atom != null) {
			t.atom.transform
		} else if (t.list != null) {
			t.list.transform
		}
	}
	
	def transform(ETerm et){
		et.term.transform
	}

	def transform(Atom a) {
		if(a.ident != null){
			a.ident.transform
		} 
		if(a.number != null) {
			conc(a.number)
		}
		if(a.evar != null) {
			a.evar.transform
		}
	}
	
	def transform(EAtom ea){
		ea.atom.transform
	}

	def transform(List l) {
		if (l.empty != null) {
			l.empty.transform	
		} else
			l.nonEmptyList.transform
	}
	
	def transform(EmptyList e){
		conc("()")
	}
	
	def transform(EList el){
		el.atom.transform
		el.term.transform
	}
	
	def transform(NonEmptyList n) {
		if (n.efolge != null) {
			n.efolge.transform			
		}
		else if (n.elist != null) {
			conc("(cons)")
			n.elist.transform
			conc(")")
		}
	}
	
	def transform(Folge f) {
		
		conc("cons ") 
		f.atom.transform
		
		for(ea : f.eatoms){
			conc("(")
			ea.transform
		}
		
		conc ("()")
		
		for(ea : f.eatoms){
			conc(")");
		}
	}
	
	def transform(EFolge ef){
		ef.folge.transform
	}
	
	def transform(EVar v) {
		conc(v.variable)
	}

	def transform(Ident i) {
		conc(i.ident)
	}	
}
