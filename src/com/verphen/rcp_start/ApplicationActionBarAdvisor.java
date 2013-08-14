package com.verphen.rcp_start;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import com.verphen.action.Action1;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction action1;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {

		action1 = new Action1(window);
		action1.setText("第一个菜单项 ");
		action1.setId("com.verphen.action.action1");
		register(action1);
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager newMenu = new MenuManager("第一个菜单", "com.verphen.firstmenu");
		menuBar.add(newMenu);
		newMenu.add(action1);
	}
}
