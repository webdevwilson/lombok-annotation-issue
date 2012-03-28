package lombok.issue;

public @interface Annotation {

  Class<? extends AbstractClass> value() default AnyClass.class;
  
}
