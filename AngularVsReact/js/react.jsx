var data = [1, 2, 3, 4];
window.reactData = data;

var List = React.createClass({
    getInitialState: function() {
        return {"list": this.props.data};
    },
    update: function() {
        var list = this.state.list;
        list.push(list.length + 1);
        this.setState({"list": list});
    },
    render: function() {
        var nodes = this.props.data.map(function(val) {
            return (
                <li>{"list " + val}</li>
            );
        });
        return (
            <div>
                <button onClick={this.update}>Add</button>
                <ul>{nodes}</ul>
            </div>
        );
    }
});

var target = document.getElementById('target');

ReactDOM.render(
    <List data={data}></List >, target);
// target);
// target);
