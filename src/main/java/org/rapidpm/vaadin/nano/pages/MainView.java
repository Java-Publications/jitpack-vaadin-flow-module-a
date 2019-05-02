package org.rapidpm.vaadin.nano.pages;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.nano.MainLayout;

@Route(value = MainView.NAV_MAIN_VIEW, layout = MainLayout.class)
public class MainView
    extends Composite<Div> implements HasLogger {
  public static final String NAV_MAIN_VIEW = "";

  public MainView() {
    getContent().add(new Span("Page content"));
  }

}
