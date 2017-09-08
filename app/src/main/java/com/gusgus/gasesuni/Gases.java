package com.gusgus.gasesuni;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class Gases extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.drawer_layout)DrawerLayout drawer;
    @BindView(R.id.nav_view)NavigationView navigationView;
    @BindView(R.id.monoxiinfo)ImageButton monoxiinfo;
    @BindView(R.id.dioxidoinfo)ImageButton dioxidoinfo;
    @BindView(R.id.metanoinfo)ImageButton metanoinfo;

    @OnClick(R.id.metanoinfo) public void clicMetano(){
        Toast toast = Toast.makeText(this, "Conectese a un Bluetooh", Toast.LENGTH_SHORT);
        toast.show();
    }
    @OnClick(R.id.dioxidoinfo) public void clicDioxido(){
        Toast toast = Toast.makeText(this, "Conectese a un Bluetooh", Toast.LENGTH_SHORT);
        toast.show();
    }
    @OnClick(R.id.monoxiinfo) public void clicMonoxi(){
        Toast toast = Toast.makeText(this, "Conectese a un Bluetooh", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void initView() {
        super.initView();
        initNavigationView();
    }

    public void initNavigationView(){
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, getToolbar(), R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_gases;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_manage) {
            Toast toast = Toast.makeText(this, "Te la creiste weee", Toast.LENGTH_SHORT);
            toast.show();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
