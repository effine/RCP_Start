/**
 * @author VerpHen
 * @date 2013年8月13日  下午5:13:26
 */

package com.verphen.action;

import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

import com.verphen.dialog.FirstDialog;

public class Action1 implements IWorkbenchAction {

	private IWorkbenchWindow workbenchWindow;

	/**
	 * Constructor
	 * 
	 * @param window
	 */
	public Action1(IWorkbenchWindow window) {
		if (window == null) {
			throw new IllegalArgumentException();
		}
		this.workbenchWindow = window;
	}

	@Override
	public void addPropertyChangeListener(IPropertyChangeListener listener) {
	}

	@Override
	public int getAccelerator() {

		return 0;
	}

	@Override
	public String getActionDefinitionId() {

		return null;
	}

	@Override
	public String getDescription() {

		return null;
	}

	@Override
	public ImageDescriptor getDisabledImageDescriptor() {

		return null;
	}

	@Override
	public HelpListener getHelpListener() {

		return null;
	}

	@Override
	public ImageDescriptor getHoverImageDescriptor() {

		return null;
	}

	@Override
	public String getId() {

		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {

		return null;
	}

	@Override
	public IMenuCreator getMenuCreator() {

		return null;
	}

	@Override
	public int getStyle() {

		return 0;
	}

	@Override
	public String getText() {

		return null;
	}

	@Override
	public String getToolTipText() {

		return null;
	}

	@Override
	public boolean isChecked() {

		return false;
	}

	@Override
	public boolean isEnabled() {

		return false;
	}

	@Override
	public boolean isHandled() {

		return false;
	}

	@Override
	public void removePropertyChangeListener(IPropertyChangeListener listener) {
	}

	@Override
	public void run() {

		// make sure action is not dispose
		if (workbenchWindow != null) {

			// 在这里添加功能
			FirstDialog dialog = new FirstDialog(workbenchWindow.getShell());
			dialog.open();
		}
	}

	@Override
	public void runWithEvent(Event event) {
	}

	@Override
	public void setActionDefinitionId(String id) {
	}

	@Override
	public void setChecked(boolean checked) {
	}

	@Override
	public void setDescription(String text) {
	}

	@Override
	public void setDisabledImageDescriptor(ImageDescriptor newImage) {
	}

	@Override
	public void setEnabled(boolean enabled) {
	}

	@Override
	public void setHelpListener(HelpListener listener) {
	}

	@Override
	public void setHoverImageDescriptor(ImageDescriptor newImage) {
	}

	@Override
	public void setId(String id) {
	}

	@Override
	public void setImageDescriptor(ImageDescriptor newImage) {
	}

	@Override
	public void setMenuCreator(IMenuCreator creator) {
	}

	@Override
	public void setText(String text) {
	}

	@Override
	public void setToolTipText(String text) {
	}

	@Override
	public void setAccelerator(int keycode) {
	}

	@Override
	public void dispose() {
		workbenchWindow = null;
	}

}
