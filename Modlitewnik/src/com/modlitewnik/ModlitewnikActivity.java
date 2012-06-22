package com.modlitewnik;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.darvds.ribbonmenu.RibbonMenuView;
import com.darvds.ribbonmenu.iRibbonMenuCallback;

public class ModlitewnikActivity extends SherlockFragmentActivity implements iRibbonMenuCallback {

	private RibbonMenuView rbmView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//        getSherlock().getActionBar().setDisplayShowHomeEnabled(true);
        
        rbmView = (RibbonMenuView) findViewById(R.id.ribbonMenu);
        rbmView.setMenuClickCallback(this);
        rbmView.setMenuItems(R.menu.ribbon_menu);
    }

	@Override
	public void RibbonMenuItemClick(int itemId) {
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		default:
			rbmView.toggleMenu();
			break;
		}
		return true;
	}
}