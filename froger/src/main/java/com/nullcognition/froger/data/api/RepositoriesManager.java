//package com.nullcognition.froger.data.api;
//// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.
//
//
//import com.nullcognition.froger.data.model.Repository;
//import com.nullcognition.froger.data.model.User;
//
//public class RepositoriesManager{
//
//	private User             user;
//	private GithubApiService githubApiService;
//
//	public RepositoriesManager(User user, GithubApiService githubApiService){
//		this.user = user;
//		this.githubApiService = githubApiService;
//	}
//
//	public Observable<ImmutableList<Repository>> getUsersRepositories(){
//		return githubApiService.getUsersRepositories(user.login)
//		                       .map(new Func1<List<RepositoryResponse>, ImmutableList<Repository>>(){
//			                       @Override
//			                       public ImmutableList<Repository> call(List<RepositoryResponse> repositoriesListResponse){
//				                       final ImmutableList.Builder<Repository> listBuilder = ImmutableList.builder();
//				                       for(RepositoryResponse repositoryResponse : repositoriesListResponse){
//					                       Repository repository = new Repository();
//					                       repository.id = repositoryResponse.id;
//					                       repository.name = repositoryResponse.name;
//					                       repository.url = repositoryResponse.url;
//					                       listBuilder.add(repository);
//				                       }
//				                       return listBuilder.build();
//			                       }
//		                       })
//		                       .subscribeOn(Schedulers.io())
//		                       .observeOn(AndroidSchedulers.mainThread());
//	}
//}
