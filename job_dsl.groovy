folder('/') {
 quietPeriod(0)
   scm {
     git {
       remote {
         url('https://github.com/$GITHUB_NAME.git')
       }
     }
   }
   wrappers {
     preBuildCleanup()
   }
   steps {
     job('$DISPLAY_NAME') {
       displayName('$DISPLAY_NAME')
       description('Job for $DISPLAY_NAME')
       quietPeriod(0)
       scm {
         git {
           remote {
             url('https://github.com/$DISPLAY_NAME.git')
           }
         }
       }
       wrappers {
         preBuildCleanup()
       }
       steps {
         shell('make fclean')
         shell('make')
         shell('make tests_run')
         shell('make clean')
       }
       disabled(true)
     }
   }
   disabled(true)
}