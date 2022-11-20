t=-0.5:0.00001:1.5; % time vector; unit: second
y_t = 2.*rectpuls(t); % function vector
f_1 = 1;
f_2 = 1;
f_3 = 1;
for n=1:2:5
    f_1 = f_1 + 4/(n*pi)*sin(0.5*n*pi)*cos(n*pi*t);
end;
for n=1:2:9
    f_2 = f_2 + 4/(n*pi)*sin(0.5*n*pi)*cos(n*pi*t);
end;
for n=1:2:39
    f_3 = f_3 + 4/(n*pi)*sin(0.5*n*pi)*cos(n*pi*t);
end;

figure; plot(t,y_t,t,f_1,t,f_2,t,f_3,'.-'),legend('原函数','三角级数1','三角级数2','三角级数3'); % show the figure
axis([min(t) max(t) 0 2.5]) % limit the axis
title('y(t) signal'); 
xlabel('t [s]');
ylabel('y(t)');