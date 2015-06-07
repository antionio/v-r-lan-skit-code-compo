@echo off

set kahvix=0

:master

cls

CALL:ECHORED "KAHVI ON HYVÄÄ!"

set /a @X=0
set y=0

IF @X==0 echo/ master

:kahvi

set /a @X=@X+1

#echo ll


#goto kahvi

#goto master

:ECHORED
%Windir%\System32\WindowsPowerShell\v1.0\Powershell.exe write-host -foregroundcolor Red %1
goto:eof