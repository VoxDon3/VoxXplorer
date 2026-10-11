.class public final synthetic Lax/d3/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c0/I;


# instance fields
.field public final synthetic a:Lax/d3/x0;


# direct methods
.method public synthetic constructor <init>(Lax/d3/x0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d3/w0;->a:Lax/d3/x0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lax/c0/F0;)Lax/c0/F0;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/w0;->a:Lax/d3/x0;

    invoke-static {v0, p1, p2}, Lax/d3/x0;->a(Lax/d3/x0;Landroid/view/View;Lax/c0/F0;)Lax/c0/F0;

    move-result-object p1

    return-object p1
.end method
