#!/bin/sh

aws cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket fifi-aws
aws cloudformation deploy --template-file output-sam.yaml --stack-name ServerlessFifi --capabilities CAPABILITY_IAM
aws cloudformation describe-stacks --stack-name ServerlessFifi
