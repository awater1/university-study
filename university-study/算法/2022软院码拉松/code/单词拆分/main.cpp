#include <bits/stdc++.h>

using namespace std;

bool PO157(string s, vector<string>& wordDict)

{
    auto wordDictSet = unordered_set <string> ();
        for (auto word: wordDict) {
            wordDictSet.insert(word);
        }

        int length = s.size();
        auto dp = vector <bool> (length + 1);
        dp[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.find(s.substr(j, i - j)) != wordDictSet.end()) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[length];

}

int main()

{

int n;

string a;

vector<string> words;

cin >> a;

cin >> n;

while(n --)

{

string word;

cin >> word;

words.push_back(word);

}

cout << (PO157(a, words)?"True":"False") << endl;

return 0;

}
