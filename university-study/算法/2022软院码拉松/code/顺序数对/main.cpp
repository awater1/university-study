#include <bits/stdc++.h>

using namespace std;

int PO156(vector<int>& rating)

{
    int length = rating.size();
    int number = 0;
    for(int i=0;i<length;i++){
        for(int j=i+1;j<length;j++){
            if(rating[i] != rating[j]){
                for(int k=j+1;k<length;k++){
                    if((rating[i]<rating[j]&&rating[j]<rating[k]) || (rating[i]>rating[j]&&rating[j]>rating[k])){
                        number++;
                    }
                }
            }
        }
    }
    return number;
}

int main()

{

int n;

vector<int> array;

cin >> n;

while(n --)

{

int t;

cin >> t;

array.push_back(t);

}

cout << PO156(array) << endl;

return 0;

}
