#include <pspkernel.h>
#include <pspdebug.h>
#include <pspctrl.h>
#include <pspkernel.h>
#include <pspdisplay.h>
#include <pspgu.h>

PSP_MODULE_INFO("vfpu test", 0, 1, 1);

PSP_MAIN_THREAD_ATTR(THREAD_ATTR_USER | PSP_THREAD_ATTR_VFPU);

/* Define printf, just to make typing easier */
#define printf  pspDebugScreenPrintf

#define BUF_WIDTH	512
#define SCR_WIDTH	480
#define SCR_HEIGHT	272
#define FONT_HEIGHT	8

int done = 0;

void __attribute__((noinline)) vtfm4(ScePspFVector4 *v0, ScePspFMatrix4 *m0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, %2\n"

   "lv.q   C000, %0\n"

   "vtfm4.q C000, E100, C200\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*m0) ,"m" (*v1) );
}

void __attribute__((noinline)) vhtfm4(ScePspFVector4 *v0, ScePspFMatrix4 *m0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, %2\n"

   "lv.q   C000, %0\n"

   "vhtfm4.q C000, E100, C200\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*m0) ,"m" (*v1) );
}

void __attribute__((noinline)) vtfm3(ScePspFVector4 *v0, ScePspFMatrix4 *m0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, %2\n"

   "lv.q   C000, %0\n"

   "vtfm3.t C000, E100, C200\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*m0) ,"m" (*v1) );
}

void __attribute__((noinline)) vhtfm3(ScePspFVector4 *v0, ScePspFMatrix4 *m0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, %2\n"

   "lv.q   C000, %0\n"

   "vhtfm3.t C000, E100, C200\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*m0) ,"m" (*v1) );
}

void __attribute__((noinline)) vtfm2(ScePspFVector4 *v0, ScePspFMatrix4 *m0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, %2\n"

   "lv.q   C000, %0\n"

   "vtfm2.p C000, E100, C200\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*m0) ,"m" (*v1) );
}

void __attribute__((noinline)) vhtfm2(ScePspFVector4 *v0, ScePspFMatrix4 *m0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, %2\n"

   "lv.q   C000, %0\n"

   "vhtfm2.p C000, E100, C200\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*m0) ,"m" (*v1) );
}

void __attribute__((noinline)) vmmulq(ScePspFMatrix4 *m0, ScePspFMatrix4 *m1, ScePspFMatrix4 *m2)
{
	asm volatile (
   "lv.q   C000, 0x00+%0\n"
   "lv.q   C010, 0x10+%0\n"
   "lv.q   C020, 0x20+%0\n"
   "lv.q   C030, 0x30+%0\n"

   "lv.q   C100, 0x00+%1\n"
   "lv.q   C110, 0x10+%1\n"
   "lv.q   C120, 0x20+%1\n"
   "lv.q   C130, 0x30+%1\n"

   "lv.q   C200, 0x00+%2\n"
   "lv.q   C210, 0x10+%2\n"
   "lv.q   C220, 0x20+%2\n"
   "lv.q   C230, 0x30+%2\n"

   "vmmul.q E000.q, E100.q, E200.q\n"

   "sv.q   C000, 0x00+%0\n"
   "sv.q   C010, 0x10+%0\n"
   "sv.q   C020, 0x20+%0\n"
   "sv.q   C030, 0x30+%0\n"
   : "+m" (*m0) : "m" (*m1) ,"m" (*m2) );
}

void __attribute__((noinline)) vsrt3s(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

// "vsrt3.s S000, S100\n"
   ".word 0xD0480400\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsrt3p(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

// "vsrt3.p S000, S100\n"
   ".word 0xD0480480\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsrt3t(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

// "vsrt3.t S000, S100\n"
   ".word 0xD0488400\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsrt3q(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

   "vsrt3.q C000, C100\n"
// ".word 0xD0488480\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsgns(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

   "vsgn.s S000, S100\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsgnp(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

   "vsgn.p C000, C100\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsgnt(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

   "vsgn.t C000, C100\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}

void __attribute__((noinline)) vsgnq(ScePspFVector4 *v0, ScePspFVector4 *v1)
{
	asm volatile (
   "lv.q   C000, %0\n"

   "lv.q   C100, %1\n"

   "vsgn.q C000, C100\n"

   "sv.q   C000, %0\n"
   : "+m" (*v0) : "m" (*v1));
}


ScePspFVector4 v0;
ScePspFVector4 v1;
ScePspFMatrix4 m0;
ScePspFMatrix4 m1;
ScePspFMatrix4 m2;

void initValues()
{
	// Reset output values
	v0.x = 123456;
	v0.y = 123456;
	v0.z = 123456;
	v0.w = 123456;

	m0.x.x = 0;
	m0.x.y = 0;
	m0.x.z = 0;
	m0.x.w = 0;

	m0.y.x = 0;
	m0.y.y = 0;
	m0.y.z = 0;
	m0.y.w = 0;

	m0.z.x = 0;
	m0.z.y = 0;
	m0.z.z = 0;
	m0.z.w = 0;

	m0.w.x = 0;
	m0.w.y = 0;
	m0.w.z = 0;
	m0.w.w = 0;

	// Some random input values...
	v1.x = 17;
	v1.y = 13;
	v1.z = -5;
	v1.w = 11;

	m1.x.x = -23;
	m1.x.y = -9;
	m1.x.z = 17;
	m1.x.w = -13;

	m1.y.x = 12;
	m1.y.y = 26;
	m1.y.z = -11;
	m1.y.w = -7;

	m1.z.x = 8;
	m1.z.y = -3;
	m1.z.z = 7;
	m1.z.w = 17;

	m1.w.x = 31;
	m1.w.y = -7;
	m1.w.z = 5;
	m1.w.w = 11;

	m2.x.x = 14;
	m2.x.y = -5;
	m2.x.z = -3;
	m2.x.w = 11;

	m2.y.x = 15;
	m2.y.y = -2;
	m2.y.z = -9;
	m2.y.w = 17;

	m2.z.x = 5;
	m2.z.y = -7;
	m2.z.z = 13;
	m2.z.w = -19;

	m2.w.x = -26;
	m2.w.y = 4;
	m2.w.z = -31;
	m2.w.w = 18;
}

int main(int argc, char *argv[])
{
    SceCtrlData pad;
    int oldButtons = 0;
#define SECOND       1000000
#define REPEAT_START (1 * SECOND)
#define REPEAT_DELAY (SECOND / 5)
    struct timeval repeatStart;
    struct timeval repeatDelay;

    repeatStart.tv_sec = 0;
    repeatStart.tv_usec = 0;
    repeatDelay.tv_sec = 0;
    repeatDelay.tv_usec = 0;

	pspDebugScreenInit();
	printf("Press Cross to start test\n");
	printf("Press Triangle to exit\n");

	while(!done)
	{
		sceCtrlReadBufferPositive(&pad, 1);
		int buttonDown = (oldButtons ^ pad.Buttons) & pad.Buttons;

		if (pad.Buttons == oldButtons)
		{
			struct timeval now;
			gettimeofday(&now, NULL);
			if (repeatStart.tv_sec == 0)
			{
				repeatStart.tv_sec = now.tv_sec;
				repeatStart.tv_usec = now.tv_usec;
				repeatDelay.tv_sec = 0;
				repeatDelay.tv_usec = 0;
			}
			else
			{
				long usec = (now.tv_sec - repeatStart.tv_sec) * SECOND;
				usec += (now.tv_usec - repeatStart.tv_usec);
				if (usec >= REPEAT_START)
				{
					if (repeatDelay.tv_sec != 0)
					{
						usec = (now.tv_sec - repeatDelay.tv_sec) * SECOND;
						usec += (now.tv_usec - repeatDelay.tv_usec);
						if (usec >= REPEAT_DELAY)
						{
							repeatDelay.tv_sec = 0;
						}
					}

					if (repeatDelay.tv_sec == 0)
					{
						buttonDown = pad.Buttons;
						repeatDelay.tv_sec = now.tv_sec;
						repeatDelay.tv_usec = now.tv_usec;
					}
				}
			}
		}
		else
		{
			repeatStart.tv_sec = 0;
		}

		if (buttonDown & PSP_CTRL_CROSS)
		{
			initValues();
			vtfm4(&v0, &m1, &v1);
			printf("vtfm4 : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vhtfm4(&v0, &m1, &v1);
			printf("vhtfm4: %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vtfm3(&v0, &m1, &v1);
			printf("vtfm3 : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vhtfm3(&v0, &m1, &v1);
			printf("vhtfm3: %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vtfm2(&v0, &m1, &v1);
			printf("vtfm2 : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vhtfm2(&v0, &m1, &v1);
			printf("vhtfm2: %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vmmulq(&m0, &m1, &m2);
			printf("vmmul.q: %f %f %f %f\n", m0.x.x, m0.x.y, m0.x.z, m0.x.w);
			printf("         %f %f %f %f\n", m0.y.x, m0.y.y, m0.y.z, m0.y.w);
			printf("         %f %f %f %f\n", m0.z.x, m0.z.y, m0.z.z, m0.z.w);
			printf("         %f %f %f %f\n", m0.w.x, m0.w.y, m0.w.z, m0.w.w);

			initValues();
			v1.x = -1;
			v1.y = 1;
			vsrt3s(&v0, &v1);
			printf("vsrt3.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = 0;
			v1.y = -1;
			vsrt3s(&v0, &v1);
			printf("vsrt3.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = 1;
			v1.y = -1;
			vsrt3s(&v0, &v1);
			printf("vsrt3.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = -100;
			v1.y = 1;
			vsrt3s(&v0, &v1);
			printf("vsrt3.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = -11.51;
			v1.y = 134.49;
			v1.z = 1.57;
			v1.w = 0.99;
			vsrt3s(&v0, &v1);
			printf("vsrt3.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = 1;
			v1.y = 2;
			vsrt3p(&v0, &v1);
			printf("vsrt3.p : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = 2;
			v1.y = 1;
			vsrt3p(&v0, &v1);
			printf("vsrt3.p : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = 1;
			v1.y = 2;
			v1.z = 3;
			vsrt3t(&v0, &v1);
			printf("vsrt3.t : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = 3;
			v1.y = 2;
			v1.z = 1;
			vsrt3t(&v0, &v1);
			printf("vsrt3.t : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = 3;
			v1.y = 1;
			v1.z = 2;
			vsrt3t(&v0, &v1);
			printf("vsrt3.t : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = -3;
			v1.y = -1;
			v1.z = -2;
			vsrt3t(&v0, &v1);
			printf("vsrt3.t : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vsrt3q(&v0, &v1);
			printf("vsrt3.q : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = -100;
			vsgns(&v0, &v1);
			printf("vsgn.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = 100;
			vsgns(&v0, &v1);
			printf("vsgn.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = 0;
			vsgns(&v0, &v1);
			printf("vsgn.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
			v1.x = 1/0.0f;
			vsgns(&v0, &v1);
			printf("vsgn.s : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = -100;
			v1.y = 100;
			vsgnp(&v0, &v1);
			printf("vsgn.p : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			v1.x = 100;
			v1.y = -100;
			v1.z = 100;
			vsgnt(&v0, &v1);
			printf("vsgn.t : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);

			initValues();
			vsgnq(&v0, &v1);
			printf("vsgn.q : %f %f %f %f\n", v0.x, v0.y, v0.z, v0.w);
		}

		if (buttonDown & PSP_CTRL_TRIANGLE)
		{
			done = 1;
		}

		if (buttonDown & PSP_CTRL_CIRCLE)
		{
			int dfd;
			dfd = sceIoDopen("ms0:/PSP/GAME150/__SCE__wolf3d");
			SceIoDirent dir;
			while(sceIoDread(dfd, &dir) > 0)
			{
				printf("%s\n", dir.d_name);
			}
			sceIoDclose(dfd);
		}

		oldButtons = pad.Buttons;
		sceDisplayWaitVblank();
	}

	sceKernelExitGame();
	return 0;
}

/* Exit callback */
int exit_callback(int arg1, int arg2, void *common)
{
    done = 1;
    return 0;
}

/* Callback thread */
int CallbackThread(SceSize args, void *argp)
{
    int cbid;

    cbid = sceKernelCreateCallback("Exit Callback", exit_callback, (void*)0);
    sceKernelRegisterExitCallback(cbid);

    sceKernelSleepThreadCB();

    return 0;
}

/* Sets up the callback thread and returns its thread id */
int SetupCallbacks(void)
{
    int thid = 0;

    thid = sceKernelCreateThread("CallbackThread", CallbackThread, 0x11, 0xFA0, 0, 0);
    if(thid >= 0)
    {
        sceKernelStartThread(thid, 0, 0);
    }

    return thid;
}