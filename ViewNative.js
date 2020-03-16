import React, {Component} from 'react';
import {requireNativeComponent} from 'react-native';

const EmptyView = requireNativeComponent('ViewManager', EmptyViewClass);

export default class EmptyViewClass extends Component {
  render() {
    return <EmptyView {...this.props} />;
  }
}

