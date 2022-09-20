package com.example.webview_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.example.webview_task.databinding.ActivityMainBinding;
import com.example.webview_task.databinding.ActivityUserBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /** Reference variable for binding class */
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /** Put the assets and descriptions in their respective arrays */
        int[] imageId = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e, R.drawable.f,R.drawable.g,
                R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,
                R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.t,R.drawable.s};
        String[] vName = {"Android 1.0", "Android 1.1", "Cupcake", "Donut", "Eclair", "Froyo",
                "Gingerbread","Honeycomb","Ice Cream Sandwich","Jelly Bean","Kitkat","Lollipop","Marshmallow","Nougat",
                "Oreo","Pie","Android 10", "Android 11", "Android 12"};
        String[] vDescription = {
                "Android 1.0 is the very first version of...",
                "Android 1.1 had all the features that...",
                "Cupcake introduced numerous...",
                "Donut operate on a variety of different screen...",
                "Eclair was its successor...",
                "Froyo operating system is the...",
                "Gingerbread in 2010, Android's first...",
                "Honeycomb is unique in that it is...",
                "Ice Cream Sandwich improves...",
                "Jelly Bean improves on the speed...",
                "Android 4.4 KitKat is an Android version...",
                "With the introduction of Android 5.0...",
                "Android 6.0 Marshmallow was...",
                "Google released Android Nougat...",
                "It was also the first Android...",
                "In August of 2018, the aroma...",
                "Android environment has changed...",
                "Android 11, which was released...",
                "Android 12 is our most personal..."};
        String[] fullDescription = {
                "Android 1.0 was Google's first Android release. Web browser support, camera support, Gmail counts, Google maps, and a YouTube application were among the basic capabilities. Although it does not have an official name like the other introduced variations, it is known informally as Apple Pie. In Android 1.0, the API level is set to 1. It is no longer utilized in mobile devices. It was published on September 23, 2008.",
                "Google released Android 1.1, which is the second version of the operating system. It included all of the features seen in the previous version, including This version improved upon Android 1.0 by adding a few new features. Caller applications now have several new capabilities, such as the ability to hide and expose the numeric keyboard. This version also has a function for preserving MMS attachments. It also does not have an official version name like Android 1.0, although it is known as Banana Bread informally. It came out on February 9, 2009.",
                "The tradition of Android version names started with the release of Android 1.5 Cupcake in early 2009. Cupcake brought a slew of improvements to the Android interface, including the first on-screen keyboard, which would become increasingly important as phones moved away from the once-ubiquitous physical keyboard format. Cupcake also included the framework for third-party app widgets, which would fast become one of Android's most distinctive features, as well as the platform's first-ever video recording option.",
                "Donut, Android 1.6, was introduced in the fall of 2009. Donut fixed key important holes in Android's core, including the OS's ability to function on a wide range of screen sizes and resolutions, which was a crucial feature. in the years ahead It also introduced support for CDMA networks like as Verizon, which will be crucial in Android's rapid growth.",
                "Android 2.0 Eclair is an Android version based on the Linux kernel 2.6.29 that was released on October 26, 2009. Android 1.6 Donut was its predecessor, while Android 2.1 Eclair was its successor. It was first presented by Motorola's Droid. Android 2.0 was updated to Android 2.1.0 eclair on January 12, 2010. On June 30, 2017, Google stopped supporting Android 2.0 and older.",
                "Google's Android 2.2 Froyo operating system is the company's third major release. Google tried its best to update the OS with some much-needed updates as well as new features. In May 2010, Android 2.2 Froyo was released. Speed, APIs and services, browser, and Android Market are four areas from this release that you should be aware of. In terms of performance, Google launched the Dalvik JIT (Just In Time) compiler, which boosts CPU code performance by 2-5 times over Android 2.1.",
                "With the introduction of Gingerbread in 2010, Android's first genuine visual identity came into prominence. Bright green had long been the color of Android's robot mascot, and it became a fundamental aspect of the operating system's design with Gingerbread. As Android began its long march toward unique design, black and green slipped into the UI.",
                "Honeycomb is unique in that it is a tablet-only operating system that, according to Google, will not be coming to smartphones. One noteworthy distinction in Honeycomb is that physical buttons are no longer required because they are incorporated into the OS itself. There are three software buttons on the bottom left of the screen: back, home, and the multitasking app switcher (switching between running apps). Additional information and functionality may be found in the bottom right: power, internet connection status, and a notification bar.",
                "Android 4.0 improves on the features that users love about Android, such as simple multitasking, rich alerts, customized home screens, resizable widgets, and deep interaction, while also introducing strong new communication and sharing options.",
                "Android 4.3 improves on the speed enhancements introduced in JellyBean, such as vsync timing, triple buffering, decreased touch latency, CPU input boost, and hardware-accelerated 2D graphics, by adding new optimizations. The hardware-accelerated 2D renderer now optimizes the stream of drawing commands, putting it into a more efficient GPU format by reorganizing and combining draw operations for improved graphics performance.",
                "Android 4.4 KitKat is an Android version. Android 4.3 Jellybean is its predecessor, while Android 5.0 Lollipop is its successor. Kitkat aims to improve the overall user experience on the smartphone. Android 4.4 was released as Android 4.4.4 on July 7, 2014. KitKat 4.4 includes many new features to enhance the user experience and provide a polished feel across the Android device that it is running on. Android 4.4 was designed to require less ram than before, in order to help its performance on phones with less than 1 Gigabyte of RAM.",
                "With the introduction of Android 5.0 Lollipop in the autumn of 2014, Google fundamentally revamped Android once more. Lollipop introduced the still-in-use Material Design standard, which gave Android, its applications, and even other Google products a completely new appearance. The card-based notion that had been strewn across Android became a primary UI pattern, guiding the design of everything from alerts, which now appeared on the lock screen for at-a-glance access, to the Recent Apps list, which took on an outright card-based appearance.",
                "Android 6.0 Marshmallow was launched as Android M during Google I/O 2015, and it is the successor to Android 5.1 Lollipop. It is accessible to developers as a preview release as of May 2015, and will be fully launched in the third quarter of 2015. Beautiful Begging, Google's Vice President for Android, remarked at Google I/O that \"we've gone back to the basics\" with Android M. We've spent a lot of time polishing and improving quality; we've actually fixed hundreds of issues.",
                "In 2016, Google released Android Nougat, which included a native split-screen mode, a new bundled-by-app notification system, and a Data Saver feature. Nougat also included several minor but useful improvements, including as an Alt-Tab-like shortcut for switching apps.",
                "Oreo was also the first Android version to include Project Treble, an ambitious effort to provide a modular base for Android's code in the hopes of making it easier for device manufacturers to provide timely software updates. ",
                "In August of 2018, the aroma of freshly baked Android Pie, also known as Android 9, filled the Android ecosystem. The most significant change in Pie was its hybrid gesture/button navigation system, which replaced Android's traditional Back, Home, and Overview keys with a large, multifunctional Home button and a small Back button that appeared alongside it as needed.",
                "The Android environment has changed dramatically since Android 10. The rebranding marks the end of the age of dessert names, as Google has now fully embraced gesture controls. Despite these new approaches, Android remains the same OS that we are all familiar with. The main themes for Android 10 were gesture controls, increased security, and improved functionality. Overall, the upgrade feels like a continuation of Android Pie.",
                "Android 11, which was released in early September 2020, is a significant Android update both inside and outside. The most notable improvements in this version concern privacy: the update expands on the extended permissions system introduced in Android 10 by allowing users to provide applications specific rights — such as location access, camera access, and microphone access — only on a limited, one-time basis.",
                "Android 12 is our most personal operating system ever, with dynamic color capabilities that change depending on your wallpaper and responsive motion that responds to your touch. Android 12 is meant to be accessible for even more people, with a more roomy layout, color contrast enhancements, and new tools to assist individuals with low vision. From forms, light, and motion to changeable system colors that can be changed to match you, Android 12 rethinks the whole user interface."};

        /** This ArrayList will contain the objects of the User class */
        ArrayList<User> userArrayList = new ArrayList<>();

        /** For loop that will inflate the arraylist */
        for(int i = 0;i< imageId.length;i++){
            User user = new User(vName[i],vDescription[i],imageId[i]);
            userArrayList.add(user);
        }

        /** This adapter will pass the context and arraylist to the list view */
        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /** using putExtra() method, the elements of the array will be passed to the new activity */
                Intent i = new Intent(MainActivity.this,UserActivity.class);
                i.putExtra("name",vName[position]);
                i.putExtra("description",vDescription[position]);
                i.putExtra("full_desription",fullDescription[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });

    }
}