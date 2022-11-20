t=-2:0.01:2; % time vector; unit: second
figure; plot(t,rectpuls(2*t),t,rectpuls(0.5*t),t,rectpuls(2-2*t),'.-'),legend('y(2t)','y(0.5t)','y(2-2t)'); % show the figure
axis([min(t) max(t) 0 1.5]) % limit the axis
title('y(t) signal'); 
xlabel('t [s]');
ylabel('y(t)');