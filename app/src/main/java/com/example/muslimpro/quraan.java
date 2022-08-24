package com.example.muslimpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class quraan extends AppCompatActivity {
    List<quranitem> sora ;
    Adapterforquranmenu adapter ;
    RecyclerView r ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quraan);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) findViewById(R.id.custom_title);
        title.setText("القرآن");
        setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        sora=new ArrayList<quranitem>();
        adapter = new Adapterforquranmenu(sora,this);
        r = findViewById(R.id.recycle);
        r.setAdapter(adapter);
        generatelist();
    }
    public void generatelist(){
        sora.add(new quranitem("سورة الفاتحة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة البقرة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة آل عمران",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النساء",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المائدة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأنعام",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأعراف",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأنفال",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة التوبة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة يونس",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة هود",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة يوسف",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الرعد",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة إبراهيم",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الحجر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النحل",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الإسراء",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الكهف",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة مريم",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة طه",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأنبياء",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الحج",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المؤمنون",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النور",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الفرقان",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الشعراء",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النمل",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة القصص",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة العنكبوت",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الروم",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة لقمان",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة السجدة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأحزاب",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة سبأ",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة فاطر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة يس",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الصافات",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة ص",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الزمر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة غافر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة فصلت",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الشوري",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الزخرف",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الدخان",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الجاثية",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأحقاف",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة محمد",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الفتح",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الحجرات",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة ق",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الذاريات",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الطور",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النجم",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة القمر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الرحمن",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الواقعة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الحديد",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المجادلة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الحشر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الممتحنة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الصف",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الجمعة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المنافقون",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة التغابن",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الطلاق",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة التحريم",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الملك",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة القلم",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الحاقة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المعارج",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة نوح",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الجن",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المزمل",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المدثر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة القيامة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الإنسان",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المرسلات",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النبأ",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النازعات",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة عبس",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة التكوير",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأنفطار",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المطففين",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأنشقاق",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة البروج",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الطارق",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الأعلي",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الغاشية",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الفجر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة البلد",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الشمس",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الليل",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الضحي",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الشرح",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة التين",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة العلق",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة القدر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة البينة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الزلزلة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة العاديات",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة القارعة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة التكاثر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة العصر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الهمزة",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الفيل",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة قريش",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الماعون",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الكوثر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الكافرون",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة النصر",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة المسد",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الإخلاص",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الفلق",R.drawable.ic_action_name));
        sora.add(new quranitem("سورة الناس",R.drawable.ic_action_name));

    }

}


