#include<stdio.h> int main( char pn[10][ 10]: int arr[10], bur[ 10)- .star[10]. finish[ 10].0 ,tat[10]." wt[10].i,n; int totwt-0,tottat-0; printf("Enter the number of processes:"); scanf("%od"., &n); for(i=0;i<n;i++) printf( Enter the Process Name, Arrival Time & Burst Time:"); scanf("%s%d%d",&pn[i].&arr[i].&bur[i]):
 for(i-0;i<n;i++)
ifli=0) star[i]-arr[i]; wt[i]-star[i]-arr[i]; finish[i]-star[i]+bur[i]; tat[i]-finish[i]-arr[i]; else
 star[i)]-finish[i-1]; wt[i]-star[i]-arr[i];
 finish[i]=star[i]+bur[i]; tat[i)-finish[i]-anr[i];
 print?("InPName Arrtime Burtime Start TAT Finish"); for(i=0;i<n;i++) printf(""n%s\%6d 1i%6d\1%6dt%6d1%6d",pn[i],ar[i].bur[i].star[i],tat[i].finish[i]): totwt+=wt[l]; tottat+-tat[i]; printf("InAverage Waiting time;%f", (float)totwt); printf"InAverage Turn Around Time:%f", (float)tottat);
