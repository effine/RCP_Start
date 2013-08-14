package com.verphen.rcp_start;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		layout.addView("com.verphen.view.FirstView", IPageLayout.RIGHT, 0.2f,
				editorArea);

	}
}
