package com.cyo.ex2_1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//     由xml製作menu?
//        getMenuInflater().inflate(R.menu.options_menu, menu);

//      由程式碼動態加入目錄資料
        SubMenu subMenu = menu.addSubMenu(0, R.id.mu_wall, 0, R.string.mu_wall);
        subMenu.add(0, R.id.wall_a, 1, R.string.wall_a);
        subMenu.add(0, R.id.wall_b, 2, R.string.wall_b);
        subMenu.add(0, R.id.wall_c, 3, R.string.wall_c);
        SubMenu subMenu1 = menu.addSubMenu(1, R.id.mu_color, 1, R.string.mu_color);
        subMenu1.add(1, R.id.color_y, 2, R.string.color_y);
        subMenu1.add(1, R.id.color_b, 3, R.string.color_b);
        subMenu1.add(1, R.id.color_r, 4, R.string.color_r);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.wall_a:
                relativeLayout.setBackgroundResource(R.drawable.a);
                break;
            case R.id.wall_b:
                relativeLayout.setBackgroundResource(R.drawable.b);
                break;
            case R.id.wall_c:
                relativeLayout.setBackgroundResource(R.drawable.c);
                break;
//          setBackGroundResource傳入int(R.drawable.a物件為整數)
//          setBackGround傳入的應該是drawable物件?
//          menu類會常使用VO設計模式嗎?

            case R.id.color_y:
                relativeLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.color_b:
                relativeLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.color_r:
                relativeLayout.setBackgroundColor(Color.RED);
                break;


        }




        return super.onOptionsItemSelected(item);
    }
}
