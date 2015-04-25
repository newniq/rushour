#include <iostream>
#include <string>
#include <queue>
#include <cstdio>
using namespace std;

class node{
public:
    int key; 
    int count;
    int p;
    friend bool operator < (const node &a, const node &b)
    {
        if(b.count < a.count)
            return true;
        else
            return false;
    }
};

int value(char c)
{
    if(c=='_')
        return 26;
    else
        return(c-'A');
}
int main()
{
    string str;
    cin >> str;
    while(str!="END")
    {
        node c[60];
        for(int i=0;i<60;i++)
        {
            c[i].key=i;
            c[i].count=0;
        }
        int length=str.length();
        priority_queue<node> q;
        for(int i=0;i<length;i++)
        {
            (c[value(str.at(i))]).count++;
        }
        for(int i=0;i<=26;i++)
        {
            if(c[i].count!=0)
                q.push(c[i]);
        }
        if(q.size()==1)
        {
            printf("%d\n",length);
        }
        else
        {
            int high=0;
            int n=27;
            while(q.size()>1)
            {
                node s1=q.top();
                q.pop();
                node s2=q.top();
                q.pop();
                c[n].count=s1.count+s2.count;
                c[s1.key].p=n;
                c[s2.key].p=n;
                high=high+c[n].count;
                q.push(c[n]);
                n++;
            }
            printf("%d\n",high,);
        }
        cin >> str;
    }
}#include <iostream>
#include <string>
#include <queue>
#include <cstdio>
using namespace std;

class node{
public:
    int key; 
    int count;
    int p;
    friend bool operator < (const node &a, const node &b)
    {
        if(b.count < a.count)
            return true;
        else
            return false;
    }
};

int value(char c)
{
    if(c=='_')
        return 26;
    else
        return(c-'A');
}
int main()
{
    string str;
    cin >> str;
    while(str!="END")
    {
        node c[60];
        for(int i=0;i<60;i++)
        {
            c[i].key=i;
            c[i].count=0;
        }
        int length=str.length();
        priority_queue<node> q;
        for(int i=0;i<length;i++)
        {
            (c[value(str.at(i))]).count++;
        }
        for(int i=0;i<=26;i++)
        {
            if(c[i].count!=0)
                q.push(c[i]);
        }
        if(q.size()==1)
        {
            printf("%d\n",length);
        }
        else
        {
            int high=0;
            int n=27;
            while(q.size()>1)
            {
                node s1=q.top();
                q.pop();
                node s2=q.top();
                q.pop();
                c[n].count=s1.count+s2.count;
                c[s1.key].p=n;
                c[s2.key].p=n;
                high=high+c[n].count;
                q.push(c[n]);
                n++;
            }
            printf("%d\n",high,);
        }
        cin >> str;
    }
}
