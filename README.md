# ![alt tag](https://github.com/cardenuto/FinancialFreedom/blob/master/app/src/main/res/mipmap-hdpi/ic_launcher.png) 7 Steps towards financial freedom

## Introduction 

The is an android application that teaches and reminds users of seven steps they can start taking today, that could lead to financial freedom. 

It is part of a Study Jam sponsored by the Hudson Valley Google Developer Group utilizing the Android Introductory Course at Udacity

## Getting Started

This project use the Gradle build system.

First download the project by cloning this repository or downloading an archived
snapshot. 

In Android Studio, use the "Import non-Android Studio project" or 
"Import Project" option. Next select the ApiDemos/ directory that you downloaded
from this repository.
If prompted for a gradle configuration accept the default settings. 

## Application Screen Shots

<img src="https://github.com/cardenuto/FinancialFreedom/blob/master/device-2016-04-04-113120.png" alt="Step Screen" width="40%">
<img src="https://github.com/cardenuto/FinancialFreedom/blob/master/device-2016-04-04-113240.png" alt="Step Screen" width="40%">

### Main Screen
The main activity (MainActiviy) provides the user 8 choices, what is financial freedom and the 7 steps. The main blocks are built using overlapping TextViews in a RelativeLayout. They are ordered using a combination of horizontal and vertical LinearLayouts. A header and footer are added. The entire screen is wrapped in a ScrollView. The application bar is generated from the activity and is not defined in the xml file. 

<img src="https://github.com/cardenuto/FinancialFreedom/blob/master/main-screen.png" alt="Main Screen" width="100%">

### Step Screens

By clicking one of the boxes on the main screen, the user initiates a new activity that shows the steps. The steps use the tabbed activity (Steps.java) available in Android Studio. The tabbed activity consists of fragments (the steps) managed by a FragmentPagerAdapter. By swiping left and right when looking at the steps, the user can navigate between them. Hitting the back button or the home arrow, the user is returned to the main screen. 

A simple fragment activity will contain two xml layout files. The primary one, activity_steps.xml, contains the activity's layout. This layout will be used when the activity is inflated, and can be viewed as the parent layout. Evey page (tab) in this activity will have the items in this layout on it, for example the toolbar and the floating action button. The second layout is the fragment layout, fragment_steps.xml. This is the layout that changes based on the page (tab).It gets inflated into a view of the parent layout, in this case the ViewPager. Fragments are a way of making your code reusable. 

<img src="https://github.com/cardenuto/FinancialFreedom/blob/master/step-screen.png" alt="Step Screen" width="100%">

## About Google Developer Group (GDG) Hudson Valley

We are software developers, designers, educators and students with an interest in learning about emergent technologies in areas including (but not limited to) mobile, web, wearables, cloud computing, education technology, data sciences and smart homes.

Our events will be a mixture of Tech talks (lecture-style) that explore concepts and best practices, and GDG Garage events (hack sessions) that involved coding and collaboration.

Our talks may feature Google-developed solutions (e.g., Chrome, Android, AngularJS, Google Glass, Android Wear, Polymer, Google Compute Engine ..) but will also extend to competitive technologies, products and platforms. 

Our primary goal is to create networking, collaboration and entrepreneurial connections for technology enthusiasts in the Hudson Valley.

http://www.meetup.com/gdg-hudson-valley/

## About Udacity

Udacity is an independent learning website offering free courses to boost your hire ability and skill sets. They also offer paid degree programs and credentials. 

https://www.udacity.com/

Android Development for Beginners - How to Make an Android App https://www.udacity.com/course/android-development-for-beginners--ud837
