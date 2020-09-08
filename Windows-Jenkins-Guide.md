# Jenkins Windows Guide

Contents
---
- [How to "Install" Windows Jenkins](#how-to-"install"-windows-jenkins)
- [How "Start" a Windows Jenkins Instance](#how-"start"-a-windows-jenkins-instance)
- [How to "Stop/Close" a Windows Jenkins Instance](#how-to-"stop/close"-a-windows-jenkins-instance)
- [How to "Uninstall" Windows Jenkins](#how-to-"uninstall"-windows-jenkins)

## How to "Install" Windows Jenkins:

Get your installer:
- Go to "https://www.jenkins.io/".
- Press `download`.
- Go to "Download Jenkins 2.222.4" for Windows.
    > *As good practice, run a virus scan on the downloaded file.*
- Unzip/Run the .msi installer.
    
Installer:
- Follow the install process, remember where you installed it. ( *We'll refer to it as* [`INSTALL PATH`])
- Follow the instructions Jenkins provides on your browser
    > *Remember the credential/login details!* :D

*This can paste your install path here for reference if you wish:
[`INSTALL PATH`] :* 

<p>&nbsp;</p>

## How "Start" a Windows Jenkins Instance:
<details><summary>Expand</summary>

### Find your install:
1. Go to your Windows "`start menu`" and type '`cmd`', right click the "`command prompt`" application.
2. Select "Run as administrator" for Command Prompt.
3. Navigate in Command Prompt to your [`INSTALL PATH`]
    > HINT: *if you installed on another drive, instead of cd, make sure you enter the drive name e.g '`Z:`' to access that drive)*

<p>&nbsp;</p>

### Begin Jenkins:
1. Run "`jenkins.exe start`" in Command Prompt.
    > *(Hint: make sure you are in the correct folder to find the exe with the command line interface.)*
2. Open your browser and navigate to "http://localhost:8080/".
3. Wait for the server to load the Jenkins Webpage!
4. You are done! :D
</details>

<p>&nbsp;</p>

## How to "Stop/Close" a Windows Jenkins Instance:
<details><summary>Expand</summary>

Referring to "[How to start Windows Jenkins](#find-your-install)", replace "`jenkins.exe start`" with "**`jenkins.exe stop`**".

> Verification: If you receive "`WMI Operation failure: ServiceCannotAcceptControl`", it is reasonable to suspect `your Jenkins instance is already closed` and you are calling for it to stop again.

Alternatively, enter the following:

- http://localhost:8080/exit (click button to send POST request)

</details>

<p>&nbsp;</p>

## How to "Uninstall" Windows Jenkins:

<details><summary>Expand</summary>

- Use your downloaded .msi installed
- Select the remove option and confirm.
- You have un-installed Jenkins!

- You may wish to investigate your [INSTALL PATH] just to observe if it has fully un-installed.

</details>

<p>&nbsp;</p>

## Confidence Tasks

<details><summary>Expand</summary>

Here are some sample directions you can take towards building confidence with Jenkins:

- Try to set up a new job that targets a git repository, performing a successful Maven goal(e.g test, package, validate) after a build. (Hint: you will want to start in the job config settings)

- Try to set up a job that polls a git repository using scm polling in the job configuration.

- If you can, use this build pipeline to forward your build generated jar to a nexus server, or use a text file to update an Apache2 Ubtuntu Webserver.

Completing any above example should give you a working understanding of Jenkins potential and familiarise you with how to work with a standard pipeline!

If not, don't worry; research anything that you're stuck on; knowing about builds and how they can moderate project builds will put you in good stead with the workflow.

Some considerations:
- A Windows version may require JDK setup:
    - `Jenkins/"Manage Jenkins"/"Global Tools"/"Global Tool Configuration"/"JDK setup"`.
- You may also need to associate Maven with Jenkins (setting up path variables).

- Don't forget to stop the Jenkins instance if you are no longer using it.
</details>
