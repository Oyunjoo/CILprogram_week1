����   A +  
model/Team  java/lang/Object name Ljava/lang/String; players Ljava/util/List; 	Signature  Ljava/util/List<Lmodel/Player;>; <init> (Ljava/lang/String;)V Code
     ()V	      java/util/ArrayList
  	     LineNumberTable LocalVariableTable this Lmodel/Team; 	addPlayer (Lmodel/Player;)V  !   java/util/List " # add (Ljava/lang/Object;)Z player Lmodel/Player; 
getPlayers ()Ljava/util/List; "()Ljava/util/List<Lmodel/Player;>; 
SourceFile 	Team.java !               	    
         U     *� *+� *� Y� � �           
   	                             D     *� +�  W�       
                      $ %   & '  	    (    /     *� �                         )    *