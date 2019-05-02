package org.rapidpm.vaadin.nano.pages;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.vaadin.nano.MainLayout;
import org.rapidpm.vaadin.nano.component.DemoComponent;

@Route(value = MainView.NAV_MAIN_VIEW, layout = MainLayout.class)
public class MainView
    extends Composite<VerticalLayout>
    implements HasLogger {
  public static final String NAV_MAIN_VIEW = "";

  public MainView() {
    getContent().add(new Span("Page content"), new DemoComponent());
  }

}
