package com.example.mjj.followsearchhistorytab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * 类似搜索热门标签效果
 */
public class MainActivity extends AppCompatActivity {

    private EditText etSearch;
    private FlowLayout flKeyword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        etSearch = (EditText) findViewById(R.id.et_search);
        flKeyword = (FlowLayout) findViewById(R.id.fl_keyword);

        List<String> list = new ArrayList<>();
        list.add("压缩操作");
        list.add("EZ秀");
        list.add("世界第一瞎子");
        list.add("Android");
        list.add("php");

        flKeyword.setFlowLayout(list, new FlowLayout.OnItemClickListener() {
            @Override
            public void onItemClick(String content) {
                etSearch.setText("");
                etSearch.setText(content);
                Toast.makeText(MainActivity.this, content, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
