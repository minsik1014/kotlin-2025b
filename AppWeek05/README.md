\# Mobile Programming, Fall 2025 Semester



This repository contains the source code and documentation for Week 05 of the Kotlin learning project, developed in Android Studio using XML Views. The focus is on ListView and data handling with simple interactive Android apps.



\## Project Overview

\- \*\*Path\*\*: `D:\\kotlin-2025b\\AppWeek05`

\- \*\*Environment\*\*: Android Studio, Kotlin, XML Views (Empty Views Activity)

\- \*\*Purpose\*\*: Practice ListView, ArrayAdapter, and data manipulation with simple apps: Student List, Shopping Cart, and Task Manager.

\- \*\*Structure\*\*: Single Activity (`MainActivity.kt`) with ListView integration and data management.



\## Week 05: ListView and Data Handling



\### Objectives

\- Understand ListView implementation and ArrayAdapter usage in Android.

\- Apply data management techniques with ArrayList and user interaction.

\- Build interactive apps with dynamic list manipulation: Add, Remove, Update operations.



\### Content

\- \*\*Project\*\*: `AppWeek05` (XML Views with ListView).

\- \*\*Main Branch\*\*: Student List App (`MainActivity.kt`, `activity\_main.xml`).

&nbsp;   - Add student names via EditText, display in ListView.

&nbsp;   - Remove items by long-clicking on ListView items.

&nbsp;   - Logcat tag: `"KotlinWeek05App"`.

\- \*\*Branches\*\*:

&nbsp;   - `week05/shopping-cart`: Add shopping cart app (Add/Remove items, display total count).

&nbsp;   - `week05/task-manager`: Add simple task manager (Add tasks, mark as completed, remove).

\- \*\*Workflow\*\*:

&nbsp;   1. Start from `main` (Student List App).

&nbsp;   2. Create feature branches: `git checkout -b week05/shopping-cart`.

&nbsp;   3. Develop and commit changes to the project folder (e.g., `git add AppWeek05/`).

&nbsp;   4. Merge to `main`: `git merge week05/shopping-cart` (resolve conflicts if needed).

\- \*\*AndroidManifest.xml\*\*: Updated to launch `MainActivity` as the main entry point.



\### Key Components

\- \*\*ListView\*\*: Display dynamic list of items

\- \*\*ArrayAdapter\*\*: Manage data binding between ArrayList and ListView

\- \*\*EditText\*\*: Input field for adding new items

\- \*\*Button\*\*: Add/Clear/Reset operations

\- \*\*ArrayList<String>\*\*: Data storage for list items

\- \*\*OnItemLongClickListener\*\*: Handle item removal



\### How to Run

1\. Open the project in Android Studio (`D:\\kotlin-2025b\\AppWeek05`).

2\. Build and run on an emulator or device (API 24+ recommended).

3\. Open Logcat and filter by tag `"KotlinWeek05App"` to view outputs (e.g., item additions, removals, list operations).



\### Exercises

\- Add Toast messages for successful operations (add/remove items).

\- Implement item editing functionality (click to edit existing items).

\- Add data validation (prevent empty items from being added).

\- Extend the task manager: Add priority levels (High, Medium, Low) and sorting.

\- Implement data persistence using SharedPreferences.



\## Sample Code Structure



\### MainActivity.kt (Main Branch - Student List)

```kotlin

class MainActivity : AppCompatActivity() {

&nbsp;   private lateinit var studentList: ArrayList<String>

&nbsp;   private lateinit var adapter: ArrayAdapter<String>

&nbsp;   private lateinit var listView: ListView

&nbsp;   private lateinit var editTextStudent: EditText

&nbsp;   private lateinit var buttonAdd: Button

&nbsp;   

&nbsp;   override fun onCreate(savedInstanceState: Bundle?) {

&nbsp;       super.onCreate(savedInstanceState)

&nbsp;       setContentView(R.layout.activity\_main)

&nbsp;       

&nbsp;       // Initialize components

&nbsp;       setupViews()

&nbsp;       setupListView()

&nbsp;       setupListeners()

&nbsp;   }

}

```



\### activity\_main.xml Layout

```xml

<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"

&nbsp;   android:layout\_width="match\_parent"

&nbsp;   android:layout\_height="match\_parent"

&nbsp;   android:orientation="vertical"

&nbsp;   android:padding="16dp">

&nbsp;   

&nbsp;   <EditText

&nbsp;       android:id="@+id/editTextStudent"

&nbsp;       android:layout\_width="match\_parent"

&nbsp;       android:layout\_height="wrap\_content"

&nbsp;       android:hint="Enter student name" />

&nbsp;   

&nbsp;   <Button

&nbsp;       android:id="@+id/buttonAdd"

&nbsp;       android:layout\_width="match\_parent"

&nbsp;       android:layout\_height="wrap\_content"

&nbsp;       android:text="Add Student" />

&nbsp;   

&nbsp;   <ListView

&nbsp;       android:id="@+id/listViewStudents"

&nbsp;       android:layout\_width="match\_parent"

&nbsp;       android:layout\_height="0dp"

&nbsp;       android:layout\_weight="1" />

&nbsp;       

</LinearLayout>

```



\## Setup Instructions

1\. \*\*Create New Project\*\* in Android Studio:

&nbsp;   - Choose "Empty Views Activity"

&nbsp;   - Project name: `AppWeek05`

&nbsp;   - Package name: `com.appweek05`

&nbsp;   - Save location: `D:\\kotlin-2025b\\AppWeek05`



2\. \*\*Initial Setup\*\*:

&nbsp;  ```bash

&nbsp;  cd D:\\kotlin-2025b

&nbsp;  git add AppWeek05/

&nbsp;  git commit -m "week 05: ListView Apps initialization"

&nbsp;  ```



3\. Ensure Android SDK and emulator are configured.

4\. Sync project with Gradle files.



\## Git Workflow

\- Continue using the existing Git repository in `D:\\kotlin-2025b`.

\- To commit Week 05 changes:

&nbsp; ```bash

&nbsp; git add AppWeek05/

&nbsp; git commit -m "week 05: Student List App v0.1"

&nbsp; git push origin main

&nbsp; ```

\- Create feature branches:

&nbsp; ```bash

&nbsp; git checkout -b week05/shopping-cart

&nbsp; git checkout -b week05/task-manager

&nbsp; ```



\## Learning Outcomes

By completing Week 05, students will:

\- Master ListView implementation and data binding

\- Understand ArrayAdapter usage for dynamic lists

\- Practice user input validation and data manipulation

\- Learn item selection and removal techniques

\- Apply Git branching strategies for feature development

