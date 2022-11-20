#include <bits/stdc++.h>

using namespace std;

int PO158(vector<vector<char>>& matrix)

{

}

int main()

{

int n, m;

vector<vector<char>> matrix;

cin >> n >> m;

for(int i = 0;i < n;i ++)

{

vector<char> mat;

for(int j = 0;j < m;j ++)

{

char ch;

cin >> ch;

mat.push_back(ch);

}

matrix.push_back(mat);

}

cout << PO158(matrix) << endl;

return 0;

}
