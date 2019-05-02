package org.rapidpm.vaadin.nano;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AbstractAppRouterLayout;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.AppLayoutMenu;
import com.vaadin.flow.component.applayout.AppLayoutMenuItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.rapidpm.vaadin.nano.pages.DashboardView;
import org.rapidpm.vaadin.nano.pages.MainView;
import org.rapidpm.vaadin.nano.pages.ProfileView;
import org.rapidpm.vaadin.nano.pages.TrendsView;

import static com.vaadin.flow.component.icon.VaadinIcon.*;
import static com.vaadin.flow.component.notification.Notification.Position.BOTTOM_CENTER;

@Theme(Lumo.class)
public class MainLayout
    extends AbstractAppRouterLayout {

  private static final String LOGO_PNG = "logo.png";

  public static final String ITM_DASHBOARD = "mainview.menue.item.dashboard";
  public static final String ITM_PROFILE   = "mainview.menue.item.profile";
  public static final String ITM_TRENDS    = "mainview.menue.item.trends";
  public static final String ITM_LOGOUT    = "mainview.menue.item.logout";

  @Override
  protected void configure(AppLayout appLayout ,
                           AppLayoutMenu appLayoutMenu) {

    StreamResource res = new StreamResource(LOGO_PNG ,
                                            () -> MainView.class.getResourceAsStream("/" + LOGO_PNG));
    Image img = new Image(res , "Vaadin Logo");

    img.setHeight("44px");
    appLayout.setBranding(img);

    appLayoutMenu
        .addMenuItems(
            new AppLayoutMenuItem(DASHBOARD.create() ,
                                  appLayout.getTranslation(ITM_DASHBOARD) ,
                                  DashboardView.NAV) ,
            new AppLayoutMenuItem(USER.create() ,
                                  appLayout.getTranslation(ITM_PROFILE) ,
                                  ProfileView.NAV) ,
            new AppLayoutMenuItem(TRENDING_UP.create() ,
                                  appLayout.getTranslation(ITM_TRENDS) ,
                                  TrendsView.NAV) ,
            new AppLayoutMenuItem(SIGN_OUT.create() ,
                                  appLayout.getTranslation(ITM_LOGOUT) ,
                                  e -> {
                                    UI ui = UI.getCurrent();
                                    Notification.show(ui.getTranslation("notification.logout.info"),
                                                      2_000, BOTTOM_CENTER);
                                  }));
  }

}
