/**
 * @author VerpHen
 * @date 2013年8月14日  上午10:15:54
 */

package com.verphen.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import com.verphen.dialog.FirstDialog;

public class Action2 implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	@Override
	public void run(IAction action) {
		FirstDialog dialog = new FirstDialog(window.getShell());
		dialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

}
