package com.nullcognition.practice07;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import rx.Observable;

// trying out a way to answer
// http://stackoverflow.com/questions/32738410/constructing-dependencies-graph-asynchronously-in-dagger-2
// my moving the asynchronousity off the compile graph construction and towards the first use

public class App extends Application{

	private AppComponent app;
	public AppComponent getAppComponent(){return app;}
	@Override public void onCreate(){
		super.onCreate();
		if(app == null){app = DaggerAppComponent.create();}
	}


	@Module public static class AppModule{

		@Provides @Singleton
		public Observable<A> provideA(){
			return Observable.defer(
					() -> Observable.just(new A()) // differs untill subscribed on
			);
		}

		@Provides @Singleton
		public int provideB(){
			return 1;
		}
//		@Provides @Singleton
//		public C provideC(){return new C();}
//
//		@Provides @Singleton
//		public D provideD(){return new D();}

	}


}


@Singleton @Component(modules = App.AppModule.class) interface AppComponent{

	void inject(MainActivity mainActivity);
}


class A{

	public String a = "a";
	public A(){
		try{ Thread.sleep(3000);}
		catch(InterruptedException e){ e.printStackTrace();}
	}
}


class B{

	public String b = "b";
	public B(){
		try{ Thread.sleep(3000);}
		catch(InterruptedException e){ e.printStackTrace();}
	}
}


class C{

	public String c = "c";
	public C(){
		try{ Thread.sleep(500);}
		catch(InterruptedException e){ e.printStackTrace();}
	}
}


class D{

	public String d = "d";
	public D(){
		try{ Thread.sleep(500);}
		catch(InterruptedException e){ e.printStackTrace();}
	}
}


class E{

	public String e = "e";
	public E(){
		try{ Thread.sleep(500);}
		catch(InterruptedException e){ e.printStackTrace();}
	}
}
