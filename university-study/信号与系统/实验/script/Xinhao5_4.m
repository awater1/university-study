t=-10:0.00001:10; % time vector; unit: second
y_t = square(pi*(t+0.5),50)+1; % function vector
f_1 = 0;
f_2 = 0;
f_3 = 0;
for n=1
    f_1 = f_1 + 8/(n*pi)*sin(0.5*n*pi)*exp(1i*n*pi*t);
end;
for n=1:2:3
    f_2 = f_2 + 8/(n*pi)*sin(0.5*n*pi)*exp(1i*n*pi*t);
end;
for n=1:2:10
    f_3 = f_3 + 8/(n*pi)*sin(0.5*n*pi)*exp(1i*n*pi*t);
end;

figure; plot(t,y_t,t,f_1,t,f_2,t,f_3,'.-'),legend('原函数','指数级数1','指数级数2','指数级数3'); % show the figure
axis([min(t) max(t) 0 3]) % limit the axis
title('y(t) signal'); 
xlabel('t [s]');
ylabel('y(t)');