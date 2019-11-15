 package com.hp.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

 public class MainActivity extends AppCompatActivity {

    String API="https://opentdb.com/api.php?amount=50&category=9&difficulty=medium";
    AsyncHttpClient asyncHttpClient;
    RequestParams requestParams;
    JSONObject jsonObject;

    ArrayList<String> questions;
    ArrayList<String> crctAnswer;
    List<Model.ResultsBean>  resultsBeanList;
    ArrayList< ArrayList<String>> wronganslist;
     ArrayList<String> stringArray;


     ArrayList<String> colAns;



     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asyncHttpClient=new AsyncHttpClient();
        requestParams=new RequestParams();
questions=new ArrayList<>();
crctAnswer=new ArrayList<>();
wronganslist=new ArrayList<>();
         stringArray = new ArrayList<String>();
         colAns=new ArrayList<>();



        asyncHttpClient.get(API,requestParams,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Log.e("API CALL ","Successs");

                jsonObject=response;
try {


    JSONArray results = jsonObject.getJSONArray("results");
    for (int i = 0; i < results.length(); i++) {
        JSONObject singleResultObj = results.getJSONObject(i);


        String ques=singleResultObj.getString("question");
        Log.e("Ques ",ques);
        questions.add(ques);
        Log.e("size", String.valueOf(ques.length()));


        String corectanswer=singleResultObj.getString("correct_answer");
        Log.e("corectanswer ",corectanswer);
        crctAnswer.add(corectanswer);

        JSONArray jsonArray=singleResultObj.getJSONArray("incorrect_answers");

       // JSONArray jsonArray = new JSONArray();
        for(int p = 0, count = jsonArray.length(); p< count; p++)
        {
            try {
                String jsonObject = jsonArray.getString(p);
                stringArray.add(jsonObject.toString());
            }
            catch (JSONException e) {
                Log.e("JSONException", String.valueOf(e));
                e.printStackTrace();
            }
        }


        wronganslist.add(stringArray);

        for(int s=0;s<stringArray.size();s++)

        {
            Log.e("stringArray", stringArray.get(s));
        }
        for(int w=0;w<wronganslist.size();w++)
        {
            Log.e("qwert", String.valueOf(wronganslist.get(w)));
        }
        Log.e("wronganslist", String.valueOf(wronganslist.size()));



//        resultsBeanList.get(i).setIncorrect_answers(incrtAns);













    }


    }catch (Exception e)
{
    Log.e("Exception", String.valueOf(e));
    Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_SHORT).show();
}


            }
        });


    }
}
