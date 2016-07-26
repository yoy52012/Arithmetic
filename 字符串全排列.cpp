#include <iostream>
#include <string>
#include <cstdio>
using namespace std;
 
bool IsSwap(char* pBegin, char* pEnd)  
{  
    char* p;  
    for (p=pBegin; p<pEnd; p++)  
    {  
        if (*p == *pEnd)  
            return false;  
    }  
    return true;  
}  
  
void Permutation(char* pStr, char* pBegin)  
{  
    if (*pBegin == '\0')  
        cout << pStr <<endl;  
    else  
    {  
        for (char* pCh = pBegin; *pCh!='\0'; pCh++)  
        {  
            if( IsSwap(pBegin,pCh) )  
            {  
                char temp = *pCh;    
                *pCh = *pBegin;    
                *pBegin = temp;    
  
                Permutation(pStr, pBegin+1);    
  
                temp = *pCh;    
                *pCh = *pBegin;    
                *pBegin = temp;    
            }  
        }  
    }  
}  
  
void Permutation(char* pStr)  
{  
    if (pStr==NULL)  
        return;  
    Permutation(pStr,pStr);  
}  
  
int main()  
{  
    char str[10]="1223";   
    Permutation(str);  
    return 0;  
}  