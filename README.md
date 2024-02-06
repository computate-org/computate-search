
# Computate Search Tools

Tools for integrating with open source Search Engines like Apache Solr, Elasticsearch and Lucene. 

# Clone the computate, computate-search, and smartvillage-operator projects

```bash
install -d ~/.local/src/computate
git clone git@github.com:computate-org/computate.git ~/.local/src/computate
install -d ~/.local/src/computate-search
git clone git@github.com:computate-org/computate-search.git ~/.local/src/computate-search
install -d ~/.local/src/smartvillage-operator
git clone git@github.com:computate-org/smartvillage-operator.git ~/.local/src/smartvillage-operator
```

# Install Red Hat OpenShift Local

Follow the instructions at redhat.com to [install OpenShift Local](https://developers.redhat.com/products/openshift-local/overview). 

# Configure OpenShift Local

```bash
crc config set cpus 7
```

# Install computate base dependencies on OpenShift Local

```bash
oc apply -k ~/.local/src/computate/kustomize/overlays/openshift-local/base/
```

# Run the Ansible Playbook to install zookeeper on OpenShift Local

```bash
ansible-playbook ~/.local/src/smartvillage-operator/apply-edgezookeeper.yaml \
  -e crd_path=~/.local/src/computate/kustomize/overlays/openshift-local/ansible/zookeeper/default/edgezookeeper.yaml
```

# Run the Ansible Playbook to install solr on OpenShift Local

```bash
ansible-playbook ~/.local/src/smartvillage-operator/apply-edgesolr.yaml \
  -e crd_path=~/.local/src/computate/kustomize/overlays/openshift-local/ansible/solr/default/edgesolr.yaml
```

# Install computate-search locally with code generation

You can then run the project install automation again with the secrets in the vault, it will ask for the password. 

```bash
ansible-playbook ~/.ansible/roles/computate.computate_project/install.yml -e SITE_NAME=computate-search -e ENABLE_CODE_GENERATION_SERVICE=true
```
