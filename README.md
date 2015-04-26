# tracker

Applications
-------

### TEST

Should have working stable version all the time 

Real path 91.194.251.217:3000

For starting the server execute start.bat for windows or "sh start.sh" for linux.

Stop application 
-------
If you need to force the server to stop in the linux, there is a commands sequence:

1. Command to see all avision processes: 
   ps aux | grep tracker 
2. If we need to see working directory of the process by pid: 
   sudo pwdx &lt;pid&gt;
3. For the deletion of the process by id use this command: 
   sudo kill -9 &lt;pid&gt; 