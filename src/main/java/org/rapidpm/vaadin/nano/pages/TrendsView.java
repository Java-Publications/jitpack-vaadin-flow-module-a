package org.rapidpm.vaadin.nano.pages;


import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.vaadin.nano.MainLayout;


@Route(value= TrendsView.NAV, layout = MainLayout.class)
public class TrendsView extends Composite<Div> {
  public static final String NAV = "trends";


  public TrendsView() {
    getContent().add(new Span("Trends"));
  }
}
