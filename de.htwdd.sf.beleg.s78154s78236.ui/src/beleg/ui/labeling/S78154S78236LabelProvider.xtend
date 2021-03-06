/*
 * generated by Xtext 2.13.0
 */
package beleg.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import beleg.s78154S78236.*

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class S78154S78236LabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}

	def text(PrologDsl e){ 
		return "PrologDsl" 
	}
	
	def text(Program e){ 
		return "Program"
	}
	
	def text(Exquery e){
		return "Exquery"
	}
	
	def text(Query e){
		return "Query"
	}
	
	def text(Clause e){
		return "Clause"
	}
	
	def text(Fact e){
		return "."
	}
	
	def text(Rule e){
		return "Rule"
	}
	
	def text(Predicate e){
		return "Predicate"
	}
	
	def text(EPredicate e){
		return "EPredicate"
	}
	
	def text(Functor e){
		return "Rule"
	}
	
	def text(Term e){
		return "Term"
	}
	
	def text(ETerm e){
		return "ETerm"
	}
	
	def text(Atom e){
		if(e.ident !== null)
		{
			return getText(e.ident)
		}
		else if(e.number !== null)
		{
			return getText(e.number)	
		}
		else if(e.evar !== null)
		{
			return getText(e.evar)
		}
	}
	
	def text(List e){
		if(e.empty !== null)
		{
			return getText(e.empty)
		}
		else if (e.nonEmptyList !== null)
		{
			return getText(e.nonEmptyList)
		}
	}
	
	def text(EmptyList e){
		return getText(e);
	}
	
	def text(NonEmptyList e){
		return "NonEmptyList"
	}
	
	def text(Folge e){
		return "Folge"
	}
	
	def text(EFolge e){
		return "EFolge"
	}
	
	def text(EList e)
	{
		return "EList"
	}
	
	def text(EAtom e){
		return "EAtom"
	}
	
	def text(Ident e){
		return  getText(e.ident)
	}
	
	def text(EVar e){
		return getText(e.variable)
	}
	
}
