OpenShift test App  

project commands:  
docker build . -t kirillvelichko/app1:latest  
docker push kirillvelichko/app1  
oc login --token=\<token> --server=\<server>  
oc apply -f <file.yml>  
