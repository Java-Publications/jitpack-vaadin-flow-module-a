package org.rapidpm.vaadin.nano.pages;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.vaadin.nano.MainLayout;


@Route(value = ProfileView.NAV, layout = MainLayout.class)
public class ProfileView
    extends Composite<Div> {
  public static final String NAV = "profile";

  public ProfileView() {
    getContent().add(new Span("Profile"));
  }
}
