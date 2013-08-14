/**
 * @author VerpHen
 * @date 2013年8月13日  下午5:13:26
 */

package com.verphen.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import com.verphen.dialog.FirstDialog;

public class Action1 extends Action implements IWorkbenchAction {

	private IWorkbenchWindow workbenchWindow;

	public Action1(IWorkbenchWindow window) {
		if (window == null) {
			throw new IllegalArgumentException();
		}

		this.workbenchWindow = window;
	}

	public void run() {
		// make sure action is not disposed
		if (workbenchWindow != null) {
			// 在这里添加功能
			FirstDialog dg = new FirstDialog(workbenchWindow.getShell());
			dg.open();

		}
	}

	@Override
	public void dispose() {
		workbenchWindow = null;
	}
}
